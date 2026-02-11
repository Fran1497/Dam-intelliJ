package Ejercicios_debug.strings;

import java.util.Scanner;

public class Strings11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        for (int i=0; i<texto.length();i++){
            System.out.println(texto.charAt(i));
        }
    }
}
