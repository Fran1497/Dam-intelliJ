package ejercicios_debug.excepciones;

public class ExcepcionAritmetica {

    public static void main(String[] args) {
        try {
          int suma = 10/0;
          System.out.println("A");
        } catch (ArithmeticException e) {
            System.out.println("B");
        } finally {
            System.out.println("C");
        }
        System.out.println("D");
    }

}
