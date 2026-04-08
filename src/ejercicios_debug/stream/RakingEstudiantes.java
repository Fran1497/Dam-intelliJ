package ejercicios_debug.stream;

import java.util.ArrayList;
import java.util.List;

public class RakingEstudiantes {
    private final String nombre;
    private ArrayList<Integer> notas = new ArrayList<>();

    public RakingEstudiantes(String nombre) {
        this.nombre = nombre;
    }

    public double CalculoMedia(ArrayList<Integer> notas){
        double media;
        int suma = 0;
        int contador = 0 ;
        for (int i = 0; i < notas.size(); i++) {
            suma = notas.get(i) + suma;
            contador++;
        }
        media= suma/contador;
        return media;
    }

    public static void main(String[] args) {
        List<RakingEstudiantes> estudiantesList = List.of(
                new RakingEstudiantes("Paco"),
                new RakingEstudiantes("Manolo"),
                new RakingEstudiantes("Maria"),
                new RakingEstudiantes("Juan")
        );


        estudiantesList.stream()
                //.filter(RakingEstudiantes::CalculoMedia)
                .forEach(System.out::println);




    }
}
