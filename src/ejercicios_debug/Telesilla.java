package ejercicios_debug;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Telesilla {
    private int[][] espacio;
    private int limitador;
    private int personas;

    public int getLimitador() {
        return limitador;
    }

    public void setLimitador(int limitador) {
        this.limitador = limitador;
    }

    public int[][] getEspacio() {
        return espacio;
    }

    public void setEspacio(int[][] espacio) {
        this.espacio = espacio;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }


    public Telesilla(int personas, int limitador) {
        this.personas = personas;
        this.limitador = limitador;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame Limite de peso y numero de personas a entrar");
        Telesilla telesilla = new Telesilla(sc.nextInt(), sc.nextInt());
        sc.nextLine();
        System.out.println("Dame los pesos de personas");
        ArrayList<Integer> Listapesos = new ArrayList<>();
        for (int i = 1; i <= telesilla.getPersonas(); i++) {
            Listapesos.add(sc.nextInt());
            System.out.println(Listapesos);
        }
        Collections.sort(Listapesos);
        System.out.println(Listapesos);




    }
}
