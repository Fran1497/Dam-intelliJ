package ejercicios_debug.iteradores.No_es_pais_viejospkg;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class No_es_país_para_viejos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Persona> empleados = new ArrayList<>();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String entrada = sc.nextLine();
        boolean continuar = !entrada.equals("FIN");

        // Lectura sin while(true)
        while (continuar) {
            String[] partes = entrada.split(",");
            String nombre = partes[0];
            String fecha = partes[1];

            empleados.add(new Persona(nombre, fecha));

            entrada = sc.nextLine();
            continuar = !entrada.equals("FIN");
        }

        // Lista inicial
        System.out.println("Lista inicial:");
        for (Persona p : empleados) {
            System.out.println(p);
        }

        // Leer fecha límite
        String fechaLimiteStr = sc.nextLine();
        LocalDate fechaLimite = LocalDate.parse(fechaLimiteStr, formato);

        // Purga
        List<Persona> filtrados = new ArrayList<>();
        for (Persona p : empleados) {
            if (!p.getFechaNacimiento().isBefore(fechaLimite)) {
                filtrados.add(p);
            }
        }

        int eliminados = empleados.size() - filtrados.size();

        // Resultados
        System.out.println("\nLista después de la purga:");
        for (Persona p : filtrados) {
            System.out.println(p);
        }

        System.out.println("\nNúmero de elementos eliminados: " + eliminados);
    }
}

