package ejercicios_debug.clases.contar_cimas_en_horizontal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int montanas_altas =0;
        System.out.println("Dame las columnas y todos las alturas");
            int columas = sc.nextInt();
        ArrayList<AccidenteGeografico> ej= new ArrayList<>();
        for (int i = 0; i < columas; i++) {
            ej.add(new AccidenteGeografico(sc.nextInt()));
        }
        Mapa vector = new Mapa(ej);

        int MAX = Integer.MIN_VALUE;
        for (int i = 0; i < vector.getVector().size(); i++) {
            int actual = ej.get(i).getAltura();

            for (int j = 0; j < columas; j++) {
                int actualcomp = ej.get(j).getAltura();
                if (actual > MAX){
                    if (actual> actualcomp){
                        MAX = actual;
                        ++montanas_altas;
                    }
                }
            }
        }
        System.out.println(montanas_altas);
    }

}
