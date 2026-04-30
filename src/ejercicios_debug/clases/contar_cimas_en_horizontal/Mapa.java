package ejercicios_debug.clases.contar_cimas_en_horizontal;

import java.util.ArrayList;

public class Mapa {
    private ArrayList<AccidenteGeografico> vector;

    public Mapa(ArrayList<AccidenteGeografico> vector) {
        this.vector = vector;
    }

    public ArrayList<AccidenteGeografico> getVector() {
        return vector;
    }

    public void setVector(ArrayList<AccidenteGeografico> vector) {
        this.vector = vector;
    }

    // ============================
    // MÉTOD QUE CUENTA LAS CIMAS
    // ============================
    public int contarCimas() {
        int cimas = 0;

        for (int i = 0; i < vector.size(); i++) {
            int actual = vector.get(i).getAltura();

            boolean esCima = true;

            // Comparar con izquierda
            if (i > 0 && vector.get(i - 1).getAltura() >= actual) {
                esCima = false;
            }

            // Comparar con derecha
            if (i < vector.size() - 1 && vector.get(i + 1).getAltura() >= actual) {
                esCima = false;
            }

            if (esCima) {
                cimas++;
            }
        }

        return cimas;
    }
}
