package Ejercicios_debug.array;

import java.util.Arrays;
import java.util.Scanner;

public class Array15Int {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Tabla de multiplicar");
        System.out.println("Modo complejo true/false");
        Boolean complex = Boolean.FALSE;
        boolean var = scanner.nextBoolean();

        if (var == true) {
            complex = true;
        } else {
            complex = false;
        }
        if (complex == false) {
            for (int i = 0; i < 5; i++) {
                int[] sizeBaseNumber = new int[5];
                int[] sizeDoubleNumber = new int[5];
                System.out.println("Dame un numero");
                sizeBaseNumber[i] = scanner.nextInt();
                sizeDoubleNumber[i] = sizeBaseNumber[i] * 2;
                System.out.println(Arrays.toString(sizeDoubleNumber) + " = " + Arrays.toString(sizeBaseNumber) + "* 2 ");
            }
        } else if (complex == true) {

            System.out.println("De que tamaño quieres que sea tu tabla: ");
            int sizeTable = scanner.nextInt();
            int[] sizeBaseNumber = new int[sizeTable];
            int[] sizeDoubleNumber = new int[sizeTable];
            for (int i = 0; i < sizeTable; i++) {
                System.out.println("Cual es tu tabla de multiplicar");
                int multTable = scanner.nextInt();
                System.out.println("Dame un numero");
                sizeBaseNumber[i] = scanner.nextInt();
                sizeDoubleNumber[i] = sizeBaseNumber[i] * multTable;
                System.out.println(Arrays.toString(sizeDoubleNumber) + " = " + Arrays.toString(sizeBaseNumber) + "* " + multTable);
            }

        }
    }
}
/* Entrada
Un numero detras de otro hasta llegar a 5 [20, 40, 60, 80, 100]
 */
/* Salida
Tabla ejemplo al modo de multiplicacion [20, 40, 60, 80, 100] = [10, 20, 30, 40, 50]* 2
 */

/* Entrada compex
Un numero detras de otro hasta llegar a 5 [20, 40, 60, 80, 100]
 */
/* Salida complex
Tabla ejemplo al modo de multiplicacion [20, 40, 60, 80, 100] = [10, 20, 30, 40, 50]* multTable
 */