package ejercicios_debug.bucles;

import java.util.Scanner;

public class bucles47 {
    public static void main(String[] args) {
        int suspenso = 0;
        int condicional = 0;
        int aprobado = 0;
        Scanner sc = new Scanner(System.in);
        int Nnotas = sc.nextInt();
        for (int i = 1; i == Nnotas; i++){
            System.out.println("Dame nota: ");
            int nota = sc.nextInt();
            if (nota <4 && nota >0) {
                suspenso = suspenso + 1;
            }
            else if (nota == 4){
                condicional = condicional + 1;
            }
            else if (nota > 4&& nota <10){
                aprobado = aprobado + 1;
            }
            else{
                System.out.println("Valor incorrecto repitelo: ");
            }
        }
    }
}
