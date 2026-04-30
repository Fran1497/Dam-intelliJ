package ejercicios_debug;


public class Empleado {
    private String nombre;
    private double sueldo;

    public Empleado (String nombre , double sueldo){
        this.nombre=nombre;
        this.sueldo=sueldo;
    }

    public double getsueldo(){
        return this.sueldo;
    }
    public void setSueldo(double sueldo1){
        this.sueldo=sueldo1;
    }
    public String getNombre(){
        return nombre;
    }
    @Override
    public String toString(){
        return "Sueldo: " + sueldo + " y " +"Nombre: "+nombre;
    }
}
