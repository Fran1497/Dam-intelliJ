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
        Scanner sc = new Scanner(System.in); //va el scanner

        while (true) {
            int n = Integer.parseInt(sc.nextLine()); // Con esto pillas el numero de potitos (ignora caracteres)
            if (n == 0) break;//Joder si das 0 potitos pues ya tiene que terminar

            Set<String> malos = new HashSet<>(); //Uso esto ya que evito repeticiones
            Set<String> buenos = new HashSet<>(); //Uso esto ya que evito repeticiones

            for (int i = 0; i < n; i++) {
                String linea = sc.nextLine();//recoge los ingredientes de potito y si se lo ha comido
                String[] partes = linea.split(" ");//Ya teniendo el string lo divide desde los espacios

                boolean Comido = partes[0].equals("SI:");//Si esta igual a SI: devuelve true

                for (int j = 1; j < partes.length; j++) {
                    if (partes[j].equals("FIN")) { //Se sale de analizar este paquete de potitos y pasa a preguntar la cantidad de potitos
                        break;
                    }
                    if (Comido) {//Si esta comido=true añade a bueno
                        buenos.add(partes[j]);
                    } else {
                        malos.add(partes[j]);//Si esta comido=false añade a malo
                    }
                }
            }

            // Ingredientes malos = malos - buenos Literalmente probabilidad de 2BACH
            malos.removeAll(buenos);

            // Ordenar
            List<String> resultado = new ArrayList<>(malos); //(esto en realidad nose si podria dejarlo en la otra tabla (todo PREGUNTAR))
            Collections.sort(resultado); //Esto es el ordenar

            // Imprimir
            if (resultado.isEmpty()) {
                System.out.println();// Si no tiene nada pues no hace nada
            } else {
                System.out.println(String.join(" ", resultado)); // Te mezcla el espacio con el string
            }
        }

        sc.close();//va cierra el scanner
    }
}


