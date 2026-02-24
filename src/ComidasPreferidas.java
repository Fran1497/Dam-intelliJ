import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ComidasPreferidas {

    /*Debemos de primero aceptar el numero de potitos que queremos incluir dentro de la evaluacion y luego debemos de
     * darle si ha querido tomarselo o no seguido de los ingredientes que hay
     *
     * Sabiendo esto hay que analizar tdos los productos que salen el la parte mala y si esos productos solo aparece hay
     * y no en otro lado pueden ser malos en cambio si aparecen hay y en otro lado no pueden ser productos no deseados.*/

    public static void main(String[] args) {
        //Numeros de potitos

        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuantos potitos?");
        var cantidad = scanner.nextInt();
        class Verduras {
            private String tipo;

            public String getTipo() {
                return tipo;
            }

            public Verduras(String tipo) {
                this.tipo = tipo;
            }

        }
        List<Verduras> malas = new ArrayList<>();
        List<Verduras> buenas = new ArrayList<>();

        for (int i = 0; i == cantidad - 1; i++) {
            var cond = scanner.nextLine();
            String condiciondesalida = null;
            if (cond == "YES") {
                while (condiciondesalida != "FIN") {
                    buenas.add(new Verduras(scanner.nextLine()));
                    if (buenas.getLast().getTipo() == "FIN") {
                        buenas.removeLast();
                        break;
                    }
                }
            } else {
                malas.add(new Verduras(scanner.nextLine()));
                if (malas.getLast().getTipo() == "FIN") {
                    malas.removeLast();
                    break;
                }
            }

            scanner.close();

        }
    }
}
