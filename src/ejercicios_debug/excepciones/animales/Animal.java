package ejercicios_debug.excepciones.animales;

public class Animal {
    protected int alimento;

    public Animal(int alimento) {
        this.alimento = alimento;
    }
        //truecarne
        //falsePlantas
    public void alimentar(int comida ,boolean tipo) throws ComidaIncorrectaException {
        this.alimento =+ comida;
    }



}
