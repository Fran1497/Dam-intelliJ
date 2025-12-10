package Ejercicios_debug.excepciones;

import java.util.Scanner;

public class Gotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gotas;
        boolean condicion = true;

        while (condicion) {
            System.out.println("cuantas gotas");

            try {
            gotas = scanner.nextInt();
            } catch (InvalidaException e) {
                System.out.println("Error: ");

            if (gotas > 0) {
                int horas = gotas / 3600;
                int minutos = (gotas % 3600) / 60;
                int segundos = gotas % 60;

                System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos);
                System.out.println("\n Quieres mas 1= si 2 = no");
                if (scanner.nextInt() == 1){
                    condicion = true;
                }else {
                    condicion = false;
                }
            } else if (gotas < 0) {
                
            }



        }
    }


    
}

