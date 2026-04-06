package ejercicios_debug.stream;

import java.util.*;
import java.util.stream.*;

public class ejemplo {

    public static void main(String[] args) {

        new Random().ints(20, 2, 100)
                .filter(n -> IntStream.rangeClosed(2, (int) Math.sqrt(n))
                        .noneMatch(i -> n % i == 0)) // primos
                .map(n -> n * n) // al cuadrado
                .mapToObj(String::valueOf) // a String
                .filter(s -> s.chars().noneMatch(c -> "02468".indexOf(c) >= 0)) // sin dígitos pares
                .forEach(System.out::println);

    }
}
