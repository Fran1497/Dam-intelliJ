package ejercicios_debug.estructurascondicionales;

import java.util.Scanner;

public class Aceptaelretozapping1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Dime tu canal");
        int canalactual = scanner.nextInt();
        System.out.println("Dime a cual vas");
        int canalir = scanner.nextInt();
        int diff;
        int diffabs = (99 + canalir) - canalactual ;

        diff = canalir - canalactual;
        if (diff< 0) {
            diff = Math.abs(diff);
            if(diffabs< diff){
                System.out.println( "Tienes que subir estos canales: " + diffabs);
            }else{
                System.out.println("Tienes que bajar estos canales: " + diff);
            }

        } else {
            System.out.println( "Tienes que subir estos canales: " + diff);
        }

    }
}

