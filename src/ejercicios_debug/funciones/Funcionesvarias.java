package ejercicios_debug.funciones;

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

    public static void main(String[] args) {
        int[] data = {23,26,87,56,2};
        System.out.println(Funcionesvarias.NumMaximo(data));
        System.out.println(Funcionesvarias.NumMinimo(data));
    }

    public static int NumMinimo(int[] numeros) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }

        return min;
    }

}
