package ejercicios_debug.clasesAbstractas.electrodomesticospkg;

public class Lavadora extends Electrodomestico{

    public Lavadora(int consumo) {
        super(consumo);
        this.consumo=600;
    }

    @Override
    public int consumodiario(int vecesdiarias){
        int count = 0;
        var total=0;
        for (int i = 0; i < vecesdiarias; i++) {
            count++;
            if (vecesdiarias==1){
                return consumo;
            }else {
                total=+(consumo*2);
            }

        }
        return total;
    }
}
