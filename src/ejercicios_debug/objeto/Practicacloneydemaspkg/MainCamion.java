package ejercicios_debug.objeto.Practicacloneydemaspkg;

import java.util.Scanner;

public class MainCamion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CamionHelados model1 = new CamionHelados("model1", 4000);
        CamionHelados model2 = new CamionHelados("model2", 4000);
        CamionHelados model3 = (CamionHelados) model1.clone();


        System.out.println(model1.toString());
        System.out.println(model2.toString());
        System.out.println("\n");

        System.out.println(model1.equals(model2));
        System.out.println("\n");

        System.out.println(model1.modelo + " - " + model1.kilometros);
        System.out.println(model3.modelo + " - " + model3.kilometros +"\n");

        System.out.println(model1.getinfo());


        System.out.println("Cuantas personas atiendes: " + "\n");

        int personas = scanner.nextInt();
        model1.atenderpersonas(personas);
        System.out.println(model1.getinfo());

    }

}

