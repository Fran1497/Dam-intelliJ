package ejercicios_debug.archivos.alumno;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LeerDatos {
    public static void main(String[] args) {
        try (BufferedReader br = Files.newBufferedReader(Paths.get("/home/usuario/Programacion/src/ejercicios_debug/archivos/alumno/DatosAlumnos"))) {
            String linea;
            // Leer línea por línea
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
