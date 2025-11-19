package Ejercicios_debug.Funciones;

public class Funcionesvarias {
    public static int NumMaximo(int[] numeros) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }

        return max;
    }

}
