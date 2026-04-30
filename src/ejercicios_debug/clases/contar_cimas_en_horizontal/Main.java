package ejercicios_debug.clases.contar_cimas_en_horizontal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame las columnas y todas las alturas:");
        int columnas = sc.nextInt();

        ArrayList<AccidenteGeografico> lista = new ArrayList<>();

        for (int i = 0; i < columnas; i++) {
            lista.add(new AccidenteGeografico(sc.nextInt()));
        }

        Mapa mapa = new Mapa(lista);

        int totalCimas = mapa.contarCimas();
        System.out.println(totalCimas);
    }
}
