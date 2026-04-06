package ejercicios_debug;

import java.util.List;

public class ejclase {
    public static void main(String[] args) {
        List<String> palabras = List.of("arriba", "abajo", "izq", "por alli mu lejos");

        palabras.stream()
                .filter(p -> p.length() <= 3)
                .map(p -> p + p + p.length())
                .forEach(System.out::println);
    }
}
