package Ejercicios_debug.Array;

import java.util.Scanner;

public class Array11Int {
    public static void main(String[] args) {
        int averagesupp = 0;
        int averageinf = 0;
        double average = 0;
        System.out.println("Cuantas alturas quieres");
        Scanner scanner = new Scanner(System.in);
        double[] height_size = new double[scanner.nextInt()];
        for (int i=0; i < height_size.length; i++ ){
            System.out.println("Dame una altura");
            height_size[i] = scanner.nextDouble();
            average = height_size[i] + average;
        }
        average = average/ height_size.length;

        System.out.println("La media es: " + average);
        for (int i = 0;i < height_size.length; i++ ){
            if (height_size[i] <= average){
                averagesupp ++;
            } else{
                averageinf ++;
            }
        }
        System.out.println("Superiores a la media: " + averagesupp);
        System.out.println("Inferiores a la media: " + averageinf);
    }
}

/* Entrada
1,70
1,80
1,60
 */
/* Salida
Media = 1,60
Superiores = 2
Inferiores = 1
 */
