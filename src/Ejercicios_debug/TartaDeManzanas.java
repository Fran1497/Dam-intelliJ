package Ejercicios_debug;

import java.util.Scanner;

public class TartaDeManzanas {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Dame el número de manzanas que tienes: ");
        int manzanas = scanner.nextInt();

        int moras = manzanas * 2;
        float tazas = (manzanas + moras) / 2f;

        System.out.println(moras + " " + tazas);

        scanner.close(); // liberar un recurso.


    }
}
