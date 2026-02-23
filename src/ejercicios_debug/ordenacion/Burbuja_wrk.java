package ejercicios_debug.ordenacion;

import java.util.Arrays;
import java.util.Random;

public class Burbuja_wrk {
    public static void main(String[] args) {
        Random r = new Random();
        var vector =new int[100];
        for(int i = 0; i < vector.length; i++){
            vector[i] = r.nextInt(0,101);
        }

        System.out.println(Arrays.toString(vector));

        int contador = 0;
        boolean hayCambios = true;
        for (int i = 0; i < vector.length && hayCambios; i++){
            hayCambios = false;

        }
    }
}
