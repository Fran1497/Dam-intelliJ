package Ejercicios_debug.objeto.ejlibroelectronico9;

public class libreria {
    public static void main() {

        libroelectronico libro1 = new libroelectronico("A101","Paco el muros",100);
        libroelectronico libro2 = new libroelectronico("A102","Se colega",200  );

        if (libro1.comparacion(libro2.getTamañoArchivo()) == 0 ){
            System.out.println("Es mayor");
        } else if (libro1.comparacion(libro2.getTamañoArchivo()) == 1) {
            System.out.println("Es es menor");
        } else if (libro1.comparacion(libro2.getTamañoArchivo()) == 2) {
            System.out.println("Es igual");
        }


    }
}
