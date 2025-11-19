package Ejercicios_debug.objeto;

import java.util.Scanner;

public class Aula {
    static void main() {
        Alumno David = new Alumno("David",18, 7.45, false);
        Scanner scanner = new Scanner(System.in);
        Alumno maria = new Alumno("María", 18, 9.5, false);

        maria.changecastigado(true);
        System.out.println(David.getNombre());
        System.out.println(David.getEdad());
        System.out.println(David.getNota());
        System.out.println("Quieres que lo castigue(true/false): " );
        boolean castigado = scanner.nextBoolean();
        David.changecastigado(castigado);
    }
}
