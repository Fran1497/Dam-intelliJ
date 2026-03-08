package ejercicios_debug.uml.mastermindpkg;

import java.util.Scanner;

public class Mastermind {
    private Codificador codificador;

    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        codificador = new Codificador();

        System.out.println("Bienvenido a Mastermind");
        codificador.crearCodigo(4);

        boolean victoria = false;

        while (!victoria) {
            System.out.print("Introduce un código de 4 dígitos: ");
            String intento = sc.nextLine();

            // Comprobar intento (ya NO mostramos el código secreto)
            String resultado = codificador.comprobar(intento);
            System.out.println(resultado);

            if (intento.equals(codificador.getCodigo().getNumeros())) {
                victoria = true;
            }
        }

        System.out.println("¡Has ganado!");
        sc.close();
    }

    public static void main(String[] args) {
        new Mastermind().ejecutar();
    }
}
