package ejercicios_debug.clasesAbstractas.electrodomesticospkg;

public class Microondas extends Electrodomestico{

    public Microondas(int consumo) {
        super(consumo);
        this.consumo=300;
    }

    @Override
    public int consumodiario(int vecesdiarias){
        int count = 0;
        var total=0;
        for (int i = 0; i < vecesdiarias; i++) {
            count++;
            if (count>3){
                total=+consumo;
            } else {
                total=+800;
            }

        }
        return total;
    }
}