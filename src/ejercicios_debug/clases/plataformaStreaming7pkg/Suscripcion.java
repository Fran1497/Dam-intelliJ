package ejercicios_debug.clases.plataformaStreaming7pkg;

public class Suscripcion {
    private String tipo;
    private double precio;

    public Suscripcion(String tipo) {
        this.tipo = tipo;
    }

        //Tipos pueden ser basica, premiun o enterprise
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
