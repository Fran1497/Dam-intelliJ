package ejercicios_debug.clases.buscaminaspkg;

public class Celda {
    private boolean mina;
    private boolean marcada;
    private boolean destapada;
    private int minasAlrededor;

    public Celda() {
        mina = destapada = marcada = false;
        minasAlrededor = 0;
    }

    public boolean isMina() {
        return mina;
    }

    public void setMina(boolean mina) {
        this.mina = mina;
    }

    public boolean isMarcada() {
        return marcada;
    }

    public void setMarcada(boolean marcada) {
        this.marcada = marcada;
    }

    public boolean isDestapada() {
        return destapada;
    }

    public void destapar() {
        this.destapada = true;
    }

    public int getMinasAlrededor() {
        return minasAlrededor;
    }

    public void setMinasAlrededor(int minasAlrededor) {
        this.minasAlrededor = minasAlrededor;
    }

    @Override
    public String toString() {
        if (destapada) {
            if (mina) return "\uD83D\uDCA3";
            return minasAlrededor+" ";
        }
        else return "\uD83C\uDF9B\uFE0F";
    }
}
