package ejercicios_debug.clases.BlackJackpkg;

import java.util.Scanner;

public class Jugador {
    protected String nombre;
    protected Mano mano;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.mano = new Mano();
    }

    public String getNombre() {
        return nombre;
    }

    public Mano getMano() {
        return mano;
    }
    public void recibirCarta(Carta carta){
        mano.agregarCarta(carta);
    }
    public String decidir(){
        String decision;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Que vas a hacer pedir o plantarse");
        decision=scanner.nextLine();
        if (decision.equals("pedir")){
            return "pedir";
        } else {
            return "plantarse";
        }
    }
}
