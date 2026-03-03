package ejercicios_debug.clases.BlackJackpkg;


import java.util.Scanner;

public class JuegoBlackjack {
    private Baraja baraja;
    private Jugador jugador;
    private Crupier crupier;


    public JuegoBlackjack(Jugador jugador) {
        this.jugador = jugador;
        this.crupier = new Crupier();
        this.baraja = new Baraja();
    }


    public void iniciar() {
        baraja.barajar();


        for (int i = 0; i < 2; i++) {
            jugador.recibirCarta(baraja.robarCarta());
            crupier.recibirCarta(baraja.robarCarta());
        }
        System.out.println("info del jugador");
        System.out.println("Valor de mano: " + jugador.getMano().calcularValor());
        System.out.println("Esta en blackjack: " + jugador.getMano().estaEnBlackjack());
        System.out.println("Esta pasado: " + jugador.getMano().estaPasado());
        System.out.println("info del crupier");
        System.out.println("Valor de mano: " + crupier.getMano().calcularValor());
        System.out.println("Esta en blackjack: " + crupier.getMano().estaEnBlackjack());
        System.out.println("Esta pasado: " + crupier.getMano().estaPasado());
    }

    public void turnoJugador() {
        Scanner sc = new Scanner(System.in);
        boolean plantado = false;

        while (!plantado && !jugador.getMano().estaPasado()) {

            System.out.println("Tu mano vale: " + jugador.getMano().calcularValor());
            System.out.println("¿Quieres pedir carta (1) o plantarte (2)?");
            int opcion = sc.nextInt();

            if (opcion == 1) {
                jugador.recibirCarta(baraja.robarCarta());
                System.out.println("Has recibido una carta.");
            } else if (opcion == 2) {
                plantado = true;
                System.out.println("Te plantas.");
            }
        }

        if (jugador.getMano().estaPasado()) {
            System.out.println("Te has pasado. Fin de tu turno.");
        }
    }

    public void turnoCrupier() {

        while (crupier.getMano().calcularValor() < 17) {
            System.out.println("El crupier pide carta...");
            crupier.recibirCarta(baraja.robarCarta());
        }

        System.out.println("El crupier se planta con: " + crupier.getMano().calcularValor());

        if (crupier.getMano().estaPasado()) {
            System.out.println("El crupier se ha pasado.");
        }
    }

    public void determinarGanador() {
        int valorJugador = jugador.getMano().calcularValor();
        int valorCrupier = crupier.getMano().calcularValor();

        System.out.println("Valor final jugador: " + valorJugador);
        System.out.println("Valor final crupier: " + valorCrupier);

        if (jugador.getMano().estaPasado()) {
            System.out.println("Has perdido, te pasaste.");
        } else if (crupier.getMano().estaPasado()) {
            System.out.println("Has ganado, el crupier se pasó.");
        } else if (valorJugador > valorCrupier) {
            System.out.println("Has ganado, tu mano es mayor.");
        } else if (valorCrupier > valorJugador) {
            System.out.println("Has perdido, la mano del crupier es mayor.");
        } else {
            System.out.println("Empate.");
        }
    }


    public static void main(String[] args) {

        Jugador jugador = new Jugador("Francisco");
        JuegoBlackjack juego = new JuegoBlackjack(jugador);

        juego.iniciar();
        juego.turnoJugador();
        juego.turnoCrupier();
        juego.determinarGanador();
    }


}
