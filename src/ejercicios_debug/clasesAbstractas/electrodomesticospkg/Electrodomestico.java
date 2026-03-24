package ejercicios_debug.clasesAbstractas.electrodomesticospkg;

public abstract class Electrodomestico {
    int consumo;

    public Electrodomestico(int consumo) {
        this.consumo = consumo;
    }
    public int consumodiario(int vecesdiarias){
        return consumo*vecesdiarias;
    }
}
