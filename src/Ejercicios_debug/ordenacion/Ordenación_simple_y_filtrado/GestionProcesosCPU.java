package Ejercicios_debug.ordenacion.Ordenación_simple_y_filtrado;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Caracteristicas de cada proceso
class Proceso {
    int identificador;     // Cada proceso tiene uno
    int prioridad;         // Orden ascendente a descendente
    String estado;         // listo, ejecutando, bloque zombie

    public Proceso(int identificador, int prioridad, String estado) {
        this.identificador = identificador;
        this.prioridad = prioridad;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "id: " + identificador +
                "  Prioridad: " + prioridad +
                "  Estado: " + estado;
    }
}

public class GestionProcesosCPU {

    public static void main(String[] args) {

        // Cola de procesos
        List<Proceso> colaProcesos = new ArrayList<>();

        // Procesos de ejemplo
        colaProcesos.add(new Proceso(1, 3, "listo"));
        colaProcesos.add(new Proceso(2, 1, "bloqueado"));
        colaProcesos.add(new Proceso(3, 5, "listo"));
        colaProcesos.add(new Proceso(4, 2, "zombie"));
        colaProcesos.add(new Proceso(5, 4, "listo"));

        System.out.println("Cola inicial de procesos");
        colaProcesos.forEach(System.out::println);

        // Intento de burbuja para la prioridad con el doble bucle (mayor prioridad primero)
        for (int i = 0; i < colaProcesos.size() - 1; i++) {
            for (int j = 0; j < colaProcesos.size() - i - 1; j++) {
                if (colaProcesos.get(j).prioridad < colaProcesos.get(j + 1).prioridad) {
                    // Intercambio
                    Proceso temporal = colaProcesos.get(j);
                    colaProcesos.set(j, colaProcesos.get(j + 1));
                    colaProcesos.set(j + 1, temporal);
                }
            }
        }

        System.out.println("\nCola ordenada por prioridad");
        colaProcesos.forEach(System.out::println);

        // Usando iterador para comprobar si los procesos son zombie
        Iterator<Proceso> iterador = colaProcesos.iterator();
        while (iterador.hasNext()) {
            Proceso p = iterador.next();
            if (p.estado.equals("bloqueado") || p.estado.equals("zombie")) {
                iterador.remove(); // Eliminación segura
            }
        }

        System.out.println("\n Cola depurada (solo procesos ya validos) ");
        colaProcesos.forEach(System.out::println);

        // "Ejecucion"
        System.out.println("\n Enviando procesos a ejecución ");
        for (Proceso p : colaProcesos) {
            System.out.println("Ejecutando proceso con id " + p.identificador);
        }
    }
}

