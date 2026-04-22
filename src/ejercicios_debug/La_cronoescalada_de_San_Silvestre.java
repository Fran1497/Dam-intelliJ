package ejercicios_debug;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class La_cronoescalada_de_San_Silvestre {


    public static void main(String[] args) {
        int secciones;
        int tiempo;

        String Buffer;
        int respuesta =0;
        System.out.println("1.Dame el num de secciones");
        System.out.println("2.Cuanto tarda constantino por seccion");
        System.out.println("3.Dame los tiempos de cansino");
        Scanner sc = new Scanner(System.in);
        secciones = sc.nextInt();

do {

    tiempo = sc.nextInt();

    int[] tramos = new int[secciones];


    for (int i = 0; i < secciones; i++) {
        tramos[i] = sc.nextInt();

    }
    System.out.println(secciones);
    System.out.println(tiempo);
    System.out.println(Arrays.toString(tramos));

    secciones = sc.nextInt();


}while (secciones !=0);
        sc.close();
        System.out.println("Terminado");

    }
}


