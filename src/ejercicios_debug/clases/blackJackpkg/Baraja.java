package ejercicios_debug.clases.blackJackpkg;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja {
    private List<Carta> cartas = new ArrayList<>();
    private Boolean lleno = false;

    public Baraja() {
        for (int x = 0; x < 13; x++) {
            cartas.add(new Carta(x + 1, "Diamantes", "Carta numero " + (x+1) + " del palo Diamantes"));
        }
        for (int y = 0; y < 13; y++) {
            cartas.add(new Carta(y + 1, "Treboles", "Carta numero " + (y+1) + " del palo Treboles"));
        }
        for (int z = 0; z < 13; z++) {
            cartas.add(new Carta(z + 1, "Corazones", "Carta numero " + (z+1) + " del palo Corazones"));
        }
        for (int j = 0; j < 13; j++) {
            cartas.add(new Carta(j + 1, "Picas", "Carta numero " + (j+1) + " del palo Picas"));
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public Carta robarCarta() {
        // 1. Guardar la carta de arriba (posición 0)
        Carta cartaRobada = cartas.get(0);

        // 2. Eliminar esa carta de la baraja
        cartas.remove(0);

        // 3. Mostrar cuántas quedan
        System.out.println("Quedan estas cartas en la baraja: " + cartas.size());

        // 4. Devolver la carta robada
        return cartaRobada;
    }


}
