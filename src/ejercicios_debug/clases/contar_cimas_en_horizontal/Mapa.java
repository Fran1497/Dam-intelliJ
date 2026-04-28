package ejercicios_debug.clases.contar_cimas_en_horizontal;

import java.util.ArrayList;

public class Mapa {
    private ArrayList<AccidenteGeografico> vector = new ArrayList<>();

    public Mapa(ArrayList<AccidenteGeografico> vector) {
        this.vector = vector;
    }

    public ArrayList<AccidenteGeografico> getVector() {
        return vector;
    }

    public void setVector(ArrayList<AccidenteGeografico> vector) {
        this.vector = vector;
    }
}
