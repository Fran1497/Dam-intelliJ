package ejercicios_debug.clasesAbstractas.examenpkg;

public class Proyecto {
    private double nota;
    private Boolean entregaTardia;

    public Proyecto(int nota) {
        this.nota = nota;
    }

    public double getNota(Boolean entregaTardia) {
        if (entregaTardia){
            return (nota*0.20);
        }else  {
            return nota;
        }

    }
}
