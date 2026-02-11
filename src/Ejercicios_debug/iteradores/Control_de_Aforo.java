/*
Control de Aforo

Un sistema registra las edades de los asistentes en una lista. Tras una inspección, se deben eliminar de la lista todos los registros de menores de una edad especificada.

Entrada

Se irán introduciendo valores de edades hasta que se introduzca un 0 que indicará que ya no vienen más edades. Posteriormente se leerá un único entero indicando la edad límite permitida.

Salida

Se debe devolver la lista final y el número total de eliminaciones.
*/

package Ejercicios_debug.iteradores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Control_de_Aforo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> personasEdad = new ArrayList<>();

        // Lectura de edades hasta que llegue un 0
        System.out.println("Dame la edad; ");
        int edad = sc.nextInt();
        while (edad != 0) {
            personasEdad.add(edad);
            System.out.println("Dame la edad; ");
            edad = sc.nextInt();
        }

        // Lectura de la edad límite
        System.out.println("Edad limite; ");
        int edadLimite = sc.nextInt();

        // Eliminación de menores
        int eliminados = 0;
        Iterator<Integer> it = personasEdad.iterator();

        while (it.hasNext()) {
            if (it.next() < edadLimite) {
                it.remove();
                eliminados++;
            }
        }

        // Salida
        System.out.println(personasEdad);
        System.out.println(eliminados);
    }
}




