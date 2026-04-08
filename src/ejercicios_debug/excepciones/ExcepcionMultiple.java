package ejercicios_debug.excepciones;

public class ExcepcionMultiple {
    public static void main(String[] args) {
        int [] nums = {0,1,3};
        try {
            int suma = 10/0;
        } catch (ArithmeticException e) {
            System.out.println(nums[5]);
        } finally {
            System.out.println("Finally ejecutado");
        }
    }

}
