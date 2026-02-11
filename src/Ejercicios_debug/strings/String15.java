package Ejercicios_debug.strings;

import java.util.Scanner;

public class String15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Text = scanner.nextLine();
        // anedac
        int[] size_for_rewrite = new int[Text.length() - 1];

        for (int i = 0; i < Text.length()-1 ; i++){
            size_for_rewrite[Text.length()-i] = Text.charAt(i);
        }
        for (int i = 0; i < Text.length()-1 ; i++){
            System.out.println(size_for_rewrite[i]);
        }
    }
}


// TODO Corregir este ejercicio de la scapturas tiaco