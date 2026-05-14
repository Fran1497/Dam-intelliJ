package testing;

import java.util.*;

import java.util.*;

public class revisor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Primer array dinámico
        List<String> array1 = new ArrayList<>();
        System.out.println("Introduce seguidores antiguos (escribe 'fin' para terminar):");

        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("fin")) break;
            array1.add(input);
        }

        // 2. Segundo array dinámico
        List<String> array2 = new ArrayList<>();
        System.out.println("Introduce seguidores actuales (escribe 'fin' para terminar):");

        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("fin")) break;
            array2.add(input);
        }

        // 3. Convertimos array2 en un HashSet para búsqueda rápida
        Set<String> set2 = new HashSet<>(array2);

        // 4. Tercer array: los que ya no están
        List<String> array3 = new ArrayList<>();

        for (String nombre : array1) {
            if (!set2.contains(nombre)) {
                array3.add(nombre);
            }
        }

        // 5. Mostrar resultado
        System.out.println("\nUsuarios que ya NO te siguen:");
        for (String nombre : array3) {
            System.out.println(nombre);
        }

        sc.close();
    }
}


