package Ejercicios_debug.Ordenacion.Ordenación_simple_y_filtrado;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Almacen {

    public static void ordenarSeleccion(List<Medicamento> lista) {
        for (int i = 0; i < lista.size() - 1; i++) {
            int indiceMin = i;
            for (int j = i + 1; j < lista.size(); j++) {
                if (lista.get(j).getFechaCaducidad().isBefore(lista.get(indiceMin).getFechaCaducidad())) {
                    indiceMin = j;
                }
            }
            Medicamento temp = lista.get(i);
            lista.set(i, lista.get(indiceMin));
            lista.set(indiceMin, temp);
        }
    }

    public static void main(String[] args) {
        List<Medicamento> meds = new ArrayList<>();
        meds.add(new Medicamento("Ibuprofeno", LocalDate.of(2024, 5, 10)));
        meds.add(new Medicamento("Paracetamol", LocalDate.of(2026, 1, 1)));
        meds.add(new Medicamento("Omeprazol", LocalDate.of(2023, 12, 1)));

        ordenarSeleccion(meds);

        LocalDate hoy = LocalDate.now();
        Iterator<Medicamento> it = meds.iterator();

        while (it.hasNext()) {
            if (it.next().getFechaCaducidad().isBefore(hoy)) {
                it.remove();
            }
        }

        System.out.println("Medicamentos válidos:");
        for (Medicamento m : meds) {
            System.out.println(m);
        }
    }
}

class Medicamento {
    private String nombre;
    private LocalDate fechaCaducidad;

    public Medicamento(String nombre, LocalDate fechaCaducidad) {
        this.nombre = nombre;
        this.fechaCaducidad = fechaCaducidad;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    @Override
    public String toString() {
        return nombre + " - Caduca: " + fechaCaducidad;
    }
}
