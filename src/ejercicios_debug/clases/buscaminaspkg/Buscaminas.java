package ejercicios_debug.clases.buscaminaspkg;

import java.util.Scanner;

public class Buscaminas {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Tablero tablero = new Tablero();
        System.out.println(tablero);
        System.out.println("Coordenadas a destapar: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        while(tablero.destapar(x,y)) {
            System.out.println(tablero);
            if (tablero.victoria()) {
                break;
            }
            System.out.println("Coordenadas a destapar: ");
            x = sc.nextInt();
            y = sc.nextInt();
        }
        if (tablero.isMina(x,y)) {
            tablero.destaparMinas();
        } else {
            tablero.destaparTodo();
            System.out.println("¡¡¡VICTORIA!!!");
        }
        System.out.println(tablero);
    }
}
