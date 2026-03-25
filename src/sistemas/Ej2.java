package sistemas;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej2 {
    public static void tabla(ArrayList<Integer> numeros){
        System.out.println(numeros);

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("Tabla de multiplicar del " + numeros.get(i));

            for (int j = 1; j < 11; j++) {
                System.out.println(j +" * "+ numeros.get(i)+ " = "+ j*numeros.get(i));
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Cuantos numeros quieres");

        int numvueltas = scanner.nextInt();

        System.out.println("Ahora dame los numeros elegidos");

        for (int i = 0; i < numvueltas; i++) {
            numeros.add(scanner.nextInt());
        }

        tabla(numeros);

        scanner.close();

    }

}
