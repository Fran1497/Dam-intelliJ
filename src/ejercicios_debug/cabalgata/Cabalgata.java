package ejercicios_debug.cabalgata;

import java.util.ArrayList;
import java.util.Scanner;

public class Cabalgata {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el numero de focos , su rango y cuantas bombillas puedes añadir");
        int numfocos=sc.nextInt();
        int rango=sc.nextInt();
        int bombillas_extras=sc.nextInt();

        ArrayList<Foco> focoList = new ArrayList<>();

        for (int i = 0; i < numfocos; i++) {
            int bombillas = sc.nextInt();
            focoList.add(new Foco(bombillas, rango));
        }

        System.out.println(numfocos);
        System.out.println(rango);
        System.out.println(bombillas_extras);

        for (Foco k : focoList) {
            System.out.println(k);
        }

        ArrayList<Integer> luminosidad = new ArrayList<>();

        for (int i = 0; i < numfocos; i++) {
            try {
                for (int j = -(rango); j < i+rango; j++) {
                    luminosidad.set(i, focoList.get(j).getBombillas());
                }
            }catch (IndexOutOfBoundsException e){
                System.out.println("Tope");
            }
        }


        System.out.println(luminosidad);


        sc.close();
    }




}

