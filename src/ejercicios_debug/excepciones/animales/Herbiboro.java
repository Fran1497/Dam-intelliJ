package ejercicios_debug.excepciones.animales;

public class Herbiboro extends Animal {


    public Herbiboro(int alimento) {
        super(alimento);
    }
    @Override
    public void alimentar(int comida ,boolean tipo) throws ComidaIncorrectaException{
        if (!tipo){
            this.alimento =+ comida;
        }else {
            throw new ComidaIncorrectaException();
        }
    }
}
