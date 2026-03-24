package ejercicios_debug.clasesAbstractas.examenpkg;

import java.util.ArrayList;

public class Examen {
    ArrayList<Ejercicio> ejercicios = new ArrayList<>();


    public Examen(ArrayList<Ejercicio> ejercicios) {
        this.ejercicios = ejercicios;
    }

    public int media() {
        var total = 0;
        var numex = 0;
        for (Ejercicio ejercicio : this.ejercicios) {
            total += ejercicio.getNota();
            numex++;
        }
        return total / numex;
    }
}
