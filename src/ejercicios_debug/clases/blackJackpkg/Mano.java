package ejercicios_debug.clases.blackJackpkg;

import java.util.ArrayList;
import java.util.List;

public class Mano {
    private List<Carta> cartas = new ArrayList<>();

    public void agregarCarta(Carta carta){
        cartas.add(carta);
    }
    public List<Carta> getCartas(List<Carta> cartas){
        return cartas;
    }
    public int calcularValor() {
        int suma = 0;
        int ases = 0;

        // 1. Recorrer todas las cartas
        for (Carta carta : cartas) {
            suma += carta.getValor();

            // Contar Ases (suponiendo que el As vale 11 en tu clase Carta)
            if (carta.getValor() == 11) {
                ases++;
            }
        }

        // 2. Ajustar Ases si la suma se pasa
        while (suma > 21 && ases > 0) {
            suma -= 10;   // Convertir un As de 11 a 1
            ases--;       // Ya no queda ese As para ajustar
        }

        return suma;
    }
    public boolean estaEnBlackjack() {
        return cartas.size() == 2 && calcularValor() == 21;
    }

    public boolean estaPasado() {
        return calcularValor() > 21;
    }


}
