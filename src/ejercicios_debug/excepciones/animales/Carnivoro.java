package ejercicios_debug.excepciones.animales;

public class Carnivoro extends Animal{


    public Carnivoro(int alimento) {
        super(alimento);
    }
    @Override
    public void alimentar(int comida ,boolean tipo) throws ComidaIncorrectaException{
        if (tipo){
            this.alimento =+ comida;
        }else {
            throw new ComidaIncorrectaException();
        }
    }
}
