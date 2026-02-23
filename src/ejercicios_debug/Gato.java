package ejercicios_debug;

import java.util.Scanner;

public class Gato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int GR_SACO_CALIDAD = 250 ;
        final int GR_SACO_NORMAL = 8000;

        int porcentajeDiarioCalidad = scanner.nextInt();
        int grTotalPiensoDiario = scanner.nextInt();
        int grDiarioCalidad = grTotalPiensoDiario * porcentajeDiarioCalidad / 100;
        int grDiarioNOrmal = grTotalPiensoDiario - grDiarioCalidad;

        int grTotalesCalidad = grDiarioCalidad * 7;
        int grTotalesNormal = grDiarioNOrmal * 7;

        double sacosNormales =  grTotalesNormal / (float) GR_SACO_NORMAL ;
        sacosNormales= Math.ceil(sacosNormales);

        int sacosCalidad = (int) Math.ceil(grTotalesCalidad / (double)GR_SACO_NORMAL);

        int normalSobrante = (int) ((sacosNormales * GR_SACO_NORMAL) - grTotalesNormal);

        // grDiarioCalidad + calidadSobrante
        int calidadSobrante = (sacosCalidad*GR_SACO_CALIDAD) - grTotalesCalidad;
        int grDomingo = grDiarioCalidad + calidadSobrante;

        System.out.println(grDomingo + " " + normalSobrante + " " + sacosCalidad + " " + sacosNormales);
        scanner.close();
    }
}