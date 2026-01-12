package Ejercicios_debug;

import java.util.Scanner;

public class SEjmio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantas hectares tienes");
        int hectareas = scanner.nextInt();
        int arbolestotales = hectareas * 2000;
        int arbolesN = 0;
        int arbolesP = 0;
        int arbolesO = 0;
        arbolesN = scanner.nextInt();
        if (arbolestotales < (arbolesN + (arbolesN * 0.5) + (arbolesN * 0.2)))
        {
            System.out.println("Te has pasado de arboles");
        }
            else{
            arbolesP = (int) (arbolesN * 0.5);
            arbolesO = (int) (arbolesN * 0.2);
            System.out.println("Tienes arboles Normales: " + arbolesN);
            System.out.println("Tienes arboles Premium: " + arbolesP);
            System.out.println("Tienes arboles Otros: " + arbolesO);
            }

    }
}