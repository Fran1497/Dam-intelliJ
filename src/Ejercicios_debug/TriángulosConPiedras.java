package Ejercicios_debug;

import java.util.Scanner;

public class TriángulosConPiedras {


    /*
n=1
(n+1)=n2
(n2+1)=n3
...............................................................................................................................................................................
n
n+n2
n+n2+n3
n+n2+n3+n4
...............................................................................................................................................................................
En definitiva cada piso que baje o en su defecto que el lado aumente en 1, sera necesario
to_do lo anterior (de piedras en los pisos) y un piso con una piedra mas.
    */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Byte aviso = 1;
        int piso = 1;
        int suma = 0;
        System.out.println("Cuantas piedras eliges: ");

        int piedra = sc.nextInt();

        while (aviso == 1){

            int unidad_de_piedra = 1;

            for (int i=0 ; piso > i ; i++){
              suma = (unidad_de_piedra)*i + suma;
            }
            int suma_aux = suma;
            if (suma == piedra){
                System.out.println("tenemos esta cantidad de pisos: " + piso);
                System.out.println("Esta es la cantidad de piedras usadas: " + suma_aux);
                aviso = 0;
            } else if (suma > piedra) {
                suma = 0 ;
            } else /*if (suma < piedra)*/ {
                System.out.println("tenemos esta cantidad de pisos: " + (piso-1));
                System.out.println("Esta es la cantidad de piedras usadas: " + suma_aux);
                System.out.println("Esta es la cantidad de piedras sobrantes: " + (piedra-suma_aux));

            }
            piso ++;
        }

        sc.close();
    }
}
