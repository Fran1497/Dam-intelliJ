package Ejercicios_debug.bucles;

import java.util.Scanner;

public class bucle13 {
    public static void main(String[] args) {
        System.out.println("Dame el numero de numeros que quieres: ");
        int i;
        Scanner sc = new Scanner(System.in);
        int cont = sc.nextInt();
        for (i = 1; i <= cont; i++) {
            System.out.println(i);
        }
    }
}
