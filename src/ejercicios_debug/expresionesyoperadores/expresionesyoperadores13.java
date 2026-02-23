package ejercicios_debug.expresionesyoperadores;

public class expresionesyoperadores13 {
    public static void main(String[] args) {
        float lado3 = 20;
        float lado2 = 15;
        float lado1 = 15;
        float base = lado3 ;
        float alto = 10;
        String perimetro = "este es el perimetro ";
        String area = "este es la area ";
        System.out.println(perimetro + (lado1+lado2+lado3));
        System.out.println(area+(base*alto)/2);
    }
}
