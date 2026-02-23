package ejercicios_debug.strings;

import java.util.Scanner;

public class Strings13 {
    public static void main(String[] args) {
        int contador = 0;
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        for (int i=0; i<texto.length();i++){
            System.out.println(texto.charAt(i));
            if (texto.charAt(i) == 'a'){
                contador ++;
            } else if (texto.charAt(i) == 'A'){
                contador ++;
            } else if (texto.charAt(i) == 'e'){
                contador ++;
            } else if (texto.charAt(i) == 'E'){
                contador ++;
            } else if (texto.charAt(i) == 'i'){
                contador ++;
            } else if (texto.charAt(i) == 'I'){
                contador ++;
            } else if (texto.charAt(i) == 'o'){
                contador ++;
            } else if (texto.charAt(i) == 'O'){
                contador ++;
            } else if (texto.charAt(i) == 'u'){
                contador ++;
            } else if (texto.charAt(i) == 'U'){
                contador ++;
            }
        }
        System.out.println(contador);
    }
}
