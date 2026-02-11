package Ejercicios_debug.array;

import java.util.Scanner;
    public class Array7Int {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double num;
            int contadorneg = 0;
            int contadorpos = 0;
            double sumaneg = 0;
            double sumapos = 0;
            double[] cantidadnum = new double[10];
            System.out.println("Vas a darme 10 numeros (el cero es positivo)");
            num = scanner.nextDouble();
            for (int i = 0; i <9; i++) {
                if (num >= 0) {
                    sumapos = sumapos + num;
                    contadorpos++;
                } else {
                    sumaneg = sumaneg + num;
                    contadorneg++;
                }
                num = scanner.nextDouble();
            }
            double Mediapos = sumapos/contadorpos;
            double Medianeg = sumaneg/contadorneg;
            System.out.println("La media positiva es: " + Mediapos);
            System.out.println("La media negativa es: " + Medianeg);
        }
    }