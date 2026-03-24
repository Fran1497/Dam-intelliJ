package ejercicios_debug.clasesAbstractas.examenpkg;

import java.util.ArrayList;

public class Practica {
    ArrayList<Test> Tests = new ArrayList<>();


    public Practica(ArrayList<Test> Tests) {
        this.Tests = Tests;
    }

    public int notaextra() {
        var total = 0;
        for (Test Test : this.Tests) {
            if (Test.getSuperado()) {
                total++;
            }
        }
        return total;
    }
}
