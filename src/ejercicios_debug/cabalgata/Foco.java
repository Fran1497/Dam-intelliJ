package ejercicios_debug.cabalgata;

public class Foco {
    private int bombillas; //Potencia


    public Foco(int bombillas, int rango) {
        this.bombillas = bombillas;
    }


    public int getBombillas() {
        return bombillas;
    }

    public void setBombillas(int bombillas) {
        this.bombillas = bombillas;
    }

    @Override
    public String toString() {
        return ""+bombillas;
    }
}
