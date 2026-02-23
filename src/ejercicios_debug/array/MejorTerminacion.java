package ejercicios_debug.array;

import java.util.Scanner;

public class MejorTerminacion {
    public static void main(String[] args) {
        int[] cont = new int[9];
        int max = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("De cuántos sorteos anteriores conocemos el premio principal: ");
        int lotery = scanner.nextInt();
        int[] Box = new int[lotery*5];
        System.out.println("Dame los digitos: ");

        // LEO DATOS
        for (int i = 0;i < lotery; i++) {
            Box[i] = scanner.nextInt();
        }



        /*
         TODO debo para la correcion recojer un numero luego guardar el ultimo digito y asi no pillar como malito y guardar completamente el numero tambien arreglar la cadena de if`s tambien es necesario que parezco cipote que se olvido el varias ( y aparte Emilio dice que esta mal otra cosa que asaber que es asique mejor borron y cuenta nueva con eso.
        */
        //    HAGO CÁLCULOS


        for (int i = 0; i < lotery; i++) {
            int tempvalue = 10;
            Box[i] = tempvalue;
            tempvalue = tempvalue%10;
            int contcase = switch (tempvalue) {
                case 1-> cont[0]= cont[0]+1;
                case 2-> cont[1]= cont[1]+1;
                case 3-> cont[2]= cont[2]+1;
                case 4-> cont[3]= cont[3]+1;
                case 5-> cont[4]= cont[4]+1;
                case 6-> cont[5]= cont[5]+1;
                case 7-> cont[6]= cont[6]+1;
                case 8-> cont[7]= cont[7]+1;
                case 9-> cont[8]= cont[8]+1;
                case 0-> cont[9]= cont[9]+1;
                default -> -1;
            };
        }
        if (cont[0]>0){
            max = 1;
        }else if (cont[1]>0 || cont[1]>cont[0]){
            max= 2;
        }else if (cont[2]>0 || cont[2]>cont[1]){
            max= 3;
        }else if (cont[3]>0 || cont[3]>cont[2]){
            max= 4;
        }else if (cont[4]>0 || cont[4]>cont[3]){
            max= 5;
        }else if (cont[5]>0 || cont[5]>cont[4]){
            max= 6;
        }else if (cont[6]>0 || cont[6]>cont[5]){
            max= 7;
        }else if (cont[7]>0 || cont[7]>cont[6]){
            max= 8;
        }else if (cont[8]>0 || cont[8]>cont[7]){
            max= 9;
        }else if (cont[9]>0 || cont[9]>cont[8]){
            max= 0;
        }
        System.out.println("La cantidad mas alta de terminaciones es: " + max);
    }
}
