package ejercicios_debug.clases.BlackJackpkg;

public class Carta {
    private final int valor;
    private final String palo;
    private final String nombre;

    public Carta (int valor, String palo,String nombre){
        this.valor=valor;
        this.palo=palo;
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPalo() {
        return palo;
    }

    public int getValor() {
        return valor;
    }
}
