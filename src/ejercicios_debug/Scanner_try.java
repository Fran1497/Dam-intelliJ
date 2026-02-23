package ejercicios_debug;

import java.util.Scanner;

public class Scanner_try {
    public static void main(String[] args) {
        System.out.println("Dame tu nombre: ");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        System.out.println("Tu nombre es: " + nombre);

    }
}
