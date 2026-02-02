/*
Control de Aforo

Un sistema registra las edades de los asistentes en una lista. Tras una inspección, se deben eliminar de la lista todos los registros de menores de una edad especificada.

Entrada

Se irán introduciendo valores de edades hasta que se introduzca un 0 que indicará que ya no vienen más edades. Posteriormente se leerá un único entero indicando la edad límite permitida.

Salida

Se debe devolver la lista final y el número total de eliminaciones.
*/

package Ejercicios_debug.Iteradores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Control_de_Aforo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> PersonasEdad = new ArrayList<>();

        var NumeroDePersonas = sc.nextInt();
        int aux =0;
        boolean auxB= true;

        while (auxB){
            if (auxB){
                aux = sc.nextInt();
            }
            if (aux < 0){
                aux = 0;
                 auxB = false;
            } else if (aux != 0 ){
                PersonasEdad.add(aux);
            }


        }




    }
}



