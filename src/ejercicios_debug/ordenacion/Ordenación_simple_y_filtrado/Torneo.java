package ejercicios_debug.ordenacion.Ordenación_simple_y_filtrado;

import java.util.ArrayList;
import java.util.List;

public class Torneo {

    public static void ordenarBurbuja(List<Jugador> jugadores) {
        boolean cambiado;
        do {
            cambiado = false;
            for (int i = 0; i < jugadores.size() - 1; i++) {
                if (jugadores.get(i).getPuntos() > jugadores.get(i + 1).getPuntos()) {
                    Jugador temp = jugadores.get(i);
                    jugadores.set(i, jugadores.get(i + 1));
                    jugadores.set(i + 1, temp);
                    cambiado = true;
                }
            }
        } while (cambiado);
    }

    public static void main(String[] args) {
        List<Jugador> jugadores = new ArrayList<>();
        jugadores.add(new Jugador("Ana", 50));
        jugadores.add(new Jugador("Luis", 10));
        jugadores.add(new Jugador("Marta", 80));
        jugadores.add(new Jugador("Pedro", 20));
        jugadores.add(new Jugador("Sara", 90));
        jugadores.add(new Jugador("Juan", 40));

        ordenarBurbuja(jugadores);

        // Eliminar 2 menores y 2 mayores
        jugadores.remove(0);
        jugadores.remove(0);
        jugadores.remove(jugadores.size() - 1);
        jugadores.remove(jugadores.size() - 1);

        System.out.println("Jugadores restantes:");
        for (Jugador j : jugadores) {
            System.out.println(j);
        }
    }
}

class Jugador {
    private String nombre;
    private int puntos;

    public Jugador(String nombre, int puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
    }

    public int getPuntos() {
        return puntos;
    }

    @Override
    public String toString() {
        return nombre + " - " + puntos + " puntos";
    }
}
