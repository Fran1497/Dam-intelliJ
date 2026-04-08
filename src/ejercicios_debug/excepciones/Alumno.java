package ejercicios_debug.excepciones;

class NotaFueraDeRangoException extends Exception{
    public NotaFueraDeRangoException(){
        super("Nota incorrecta");
    }
}

public class Alumno{

    public String nombre;
    public int nota;

    public int getNota() {
        return nota;
    }

    public Alumno(String nombre) {
        this.nombre = nombre;

    }

    public void setNota(int nota) throws NotaFueraDeRangoException {
        if (nota >= 0 && nota <= 10){
            this.nota=nota;
        }else {
            throw new NotaFueraDeRangoException();
        }
    }

    public static void main(String[] args) throws NotaFueraDeRangoException {
        Alumno alumno1 = new Alumno("maria");

        Alumno alumno2 = new Alumno("paco");



        alumno1.setNota(7);
        System.out.println(alumno1.getNota());
        alumno2.setNota(50);
        System.out.println(alumno2.getNota());




    }
}

