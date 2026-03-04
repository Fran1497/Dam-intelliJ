package ejercicios_debug.clases.blackJackpkg;

public class Crupier extends Jugador {


    // Este tio va en automatico la mano se la crea sola el jugador y
    // El nombre es siempre el mismo es un cachondo.
    public Crupier() {
        super("Crupier");
    }

    @Override
    public String decidir() {
        if (mano.calcularValor() < 17) {
            return "pedir";
        } else {
            return "plantarse";
        }
    }


}
