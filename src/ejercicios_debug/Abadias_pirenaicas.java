package ejercicios_debug;

import java.util.ArrayList;
import java.util.Scanner;

public class Abadias_pirenaicas {

    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int cantabadias = 0;
        ArrayList alturamontanas = new ArrayList<>();
        Scanner scanner =new Scanner(System.in);
        int cantidadMontanas = scanner.nextInt();
        for (int i = 0; i < cantidadMontanas; i++) {
            alturamontanas.add(scanner.nextInt()) ;
        }
        for (int i = 0; i < cantidadMontanas; i++) {
                int actual = (int) alturamontanas.getLast();
                alturamontanas.removeLast();
                if (actual > max){
                    cantabadias++;
                    max = actual;
                }
        }
        System.out.println(cantabadias);
    }
}
