package ejercicios_debug.archivos.alumno;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Alumno {
    private String nombre;
    private int nota;

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", nota=" + nota +
                '}';
    }

    public static void main(String[] args) {
        Path ruta = Path.of("/home/usuario/Programacion/src/ejercicios_debug/archivos/alumno/DatosAlumnos");

        String alumStr = "";

        List alumnos = List.of(
                new Alumno("Paco1",10),
                new Alumno("Paco2",10),
                new Alumno("Paco3",10),
                new Alumno("Paco4",10),
                new Alumno("Paco5",10)
        );
        try {
            for (int i = 0; i < alumnos.size(); i++) {
                alumStr = alumStr +"\n"+ alumnos.get(i).toString();
            }
            Files.writeString(ruta, alumStr);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Terminado");
        }



///home/usuario/Programacion/src/ejercicios_debug/archivos/alumno/DatosAlumnos

    }


}
