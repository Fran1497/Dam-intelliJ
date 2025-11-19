package Ejercicios_debug.estructurascondicionales;

import java.util.Scanner;

public class estructurascondicionales1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int B = scanner.nextInt();
        int A = scanner.nextInt();
        if (B >= 0) System.out.println(" Es positivo");
        else System.out.println("Es negativo");
        scanner.close();
    }
}
