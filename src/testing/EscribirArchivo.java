package testing;

import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivo {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("src/Testing/salidas/resultado.txt")) {
            writer.write("Hola Francisco, este es el resultado.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //
    }
}

