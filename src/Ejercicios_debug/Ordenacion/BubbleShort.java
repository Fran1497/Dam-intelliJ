package Ejercicios_debug.Ordenacion;

import java.util.Scanner;
import java.util.Random;

public class BubbleShort {
    public static void main(String[] args) {
        /*
        *Usamos metodo de var auxiliares como apoyo para poder reodenar
        * */

        Scanner scanner = new Scanner(System.in);
        Random generador = new Random();

        System.out.println("Cuantos numeros quieres: ");

        var cantnum = scanner.nextInt();
        int[] numarray = new int[cantnum-1];

        System.out.println("Quieres elegir los números: true/false ");
        var elect = scanner.nextBoolean();


        if (elect) { //Preguntapor los numeros uno a uno
            for (int i = 0; i-1 < cantnum; i++) {
                System.out.println("Dame un numero");
                numarray[i] = scanner.nextInt();
            }
        }else { // Vuelca numeros al azar
            for (int i = 0; i-1 < cantnum; i++) {
                numarray[i] = generador.nextInt(0,100);
            }
        }
        System.out.println("Numeros ya seleccionados: ");


        var contador=0;
        var count=0;
        var auxmovement=0;

        var orden = false;
        while (!orden){

            if (numarray[count]> numarray[count + 1] ) {
                auxmovement = numarray[count+1];
                numarray[count +1]= numarray[count];
                numarray[count]= auxmovement;
                contador++;
                if (count == numarray.length){
                    count = -1;
                }
                count++;
            }
            if (contador ==1){
                orden = false;
                contador--;
            } else {
                orden = true;
            }

        }
        scanner.close();
    }
}
