package ejercicios_debug.archivos.ejemplo;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.BufferedReader;
import java.util.Scanner;

public class EjemploFiles {
    public static void main(String[] args) {
        Path path = Path.of("archivo.txt");
        try(BufferedWriter bwr =Files.newBufferedWriter(path)){
            Scanner sc = new Scanner(System.in);
            Boolean opcion =true;
            while (opcion){
                System.out.println("Dime true o false");
                if (sc.nextBoolean()){
                    String a = sc.nextLine();
                    System.out.println("Dime");
                    String escrito = sc.nextLine();
                    bwr.write(escrito);
                    bwr.write("\n");
                } else {
                    opcion = false;
                }
            }


        } catch (IOException e) {
            System.out.println("Archivo no creado");
        }
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String Linealeida;
            while ((Linealeida = br.readLine()) != null) {
                System.out.println(Linealeida);
            }
        } catch (Exception e) {
            System.out.println("Archivo no leido");
        }

        try (BufferedReader brall = Files.newBufferedReader(path)){
            System.out.println(Files.readAllLines(path));
        } catch (IOException e) {
            System.out.println("Excepcion");
        }

    }
}