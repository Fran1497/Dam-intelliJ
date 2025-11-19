package Ejercicios_debug.Funciones.comprobacionFunciones;

import java.util.Scanner;

public class Maximos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuántos números vas a introducir?");
        int cantidad = scanner.nextInt();

        int[] numeros = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int maximo = Funcionesvarias.NumMaximo(numeros);
        System.out.println("El número máximo es: " + maximo);
    }
}

