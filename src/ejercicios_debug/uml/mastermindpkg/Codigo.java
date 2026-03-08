package ejercicios_debug.uml.mastermindpkg;

public class Codigo {
    private int longitud;
    private String numeros;

    public Codigo(int longitud) {
        this.longitud = longitud;
        generarCodigo();
    }

    private void generarCodigo() {
        numeros = "";  // cadena vacía

        for (int i = 0; i < longitud; i++) {
            int digito = (int)(Math.random() * 10);
            numeros += digito;  // concatenación simple
        }
    }

    public String getNumeros() {
        return numeros;
    }
}

