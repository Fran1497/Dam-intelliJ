package sistemas;


import java.util.ArrayList;
import java.util.Scanner;

public class Ej1 {


        public static void recorredor(){
            Scanner scanner = new Scanner(System.in);
            int numelementos;
            int elementoprincipal;
            System.out.println("Dame el numero de elementos");
            numelementos = scanner.nextInt();
            System.out.println("Dame el valor del primer elemento");
            elementoprincipal = scanner.nextInt();

            ArrayList<Integer> numeros= new ArrayList<>();
            ArrayList<Integer> numerospares= new ArrayList<>();
            ArrayList<Integer> numerosimpares= new ArrayList<>();

            if (elementoprincipal%2 ==0){
                numeros.add(elementoprincipal);
                numerospares.add(elementoprincipal);
            }else {
                numeros.add(elementoprincipal);
                numerosimpares.add(elementoprincipal);
            }
            for (int i = 1; i < numelementos; i++) {
                elementoprincipal++;
                if (elementoprincipal%2==0){
                    numeros.add(elementoprincipal);
                    numerospares.add(elementoprincipal);
                }else{
                    numeros.add(elementoprincipal);
                    numerosimpares.add(elementoprincipal);
                }
            }
            System.out.println(numeros);
            System.out.println(numerospares);
            System.out.println(numerosimpares);

            scanner.close();
        }


    public static void main(String[] args) {
        Ej1.recorredor();
    }
}
