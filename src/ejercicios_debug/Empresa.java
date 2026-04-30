package ejercicios_debug;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> empleados; // Lista de objetos

    public Empresa(String nombre, ArrayList<Empleado> empleados) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public void addEmpleado(Empleado e) {
        empleados.add(e);
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + "', empleados=" + empleados +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        Empresa empr = new Empresa("Paco",empleados);
        Empleado e1 = new Empleado("paco",500);
        empr.addEmpleado(e1);


        System.out.println(empr);
    }
}







