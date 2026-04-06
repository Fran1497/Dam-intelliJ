package ejercicios_debug.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class enteros {

    public static void main(String[] args) {
        ArrayList <Integer> source = new ArrayList<>();
        for (int i=0 ; i < 20 ;i++ ){
            Random generador = new Random();
            source.add(generador.nextInt(1000) + 1);
        }
        System.out.println(source);
        List<Integer> resultadoStream = source.stream()
                .filter(n -> n <100)
                .toList();

        System.out.println(resultadoStream);
    }

    // Caja -> cinta -> operaciones -> caja
}
