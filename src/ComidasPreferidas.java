/*Debemos de primero aceptar el numero de potitos que queremos incluir dentro de la evaluacion y luego debemos de
 * darle si ha querido tomarselo o no seguido de los ingredientes que hay
 *
 * Sabiendo esto hay que analizar tdos los productos que salen el la parte mala y si esos productos solo aparece hay
 * y no en otro lado pueden ser malos en cambio si aparecen hay y en otro lado no pueden ser productos no deseados.
 * PRUEBA:
3
SI: patata maíz tomate FIN
NO: patata puerro guisantes pollo FIN
SI: tomate zanahoria puerro pollo calabacín arroz FIN
2
SI: tomate zanahoria pollo calabacín arroz FIN
NO: tomate ternera puerro FIN
0
 * */

import java.util.*;

public class ComidasPreferidas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = Integer.parseInt(sc.nextLine());
            if (n == 0) break;

            Set<String> malos = new HashSet<>();
            Set<String> buenos = new HashSet<>();

            for (int i = 0; i < n; i++) {
                String linea = sc.nextLine();
                String[] partes = linea.split(" ");

                boolean Comido = partes[0].equals("SI:");

                for (int j = 1; j < partes.length; j++) {
                    if (partes[j].equals("FIN")){
                        break;
                    }
                    if (Comido) {
                        buenos.add(partes[j]);
                    } else {
                        malos.add(partes[j]);
                    }
                }
            }

            // Ingredientes malos = malos - buenos
            malos.removeAll(buenos);

            // Ordenar alfabéticamente
            List<String> resultado = new ArrayList<>(malos);
            Collections.sort(resultado);

            // Imprimir
            if (resultado.isEmpty()) {
                System.out.println();
            } else {
                System.out.println(String.join(" ", resultado));
            }
        }

        sc.close();
    }
}


