package Ejercicios_debug.estructurascondicionales;

import java.util.Scanner;

public class estructurascondicionales30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int horassemanales = scanner.nextInt();
        int pagonormal = 12;
        int pagoextra = 16;
        int pago = 0;
        if (horassemanales<40){
            pago = horassemanales*pagonormal;
            System.out.println(pago);
        }
        else {
        pago = 40 *pagonormal;
        horassemanales = horassemanales-40;
        pago= pago + (horassemanales*16);
            System.out.println(pago);
        }

    }
}
