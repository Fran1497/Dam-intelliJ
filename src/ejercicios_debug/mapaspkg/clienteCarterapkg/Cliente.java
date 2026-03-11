package ejercicios_debug.mapaspkg.clienteCarterapkg;

public class Cliente {
    private String nombre;
    private String direccion;
    private int DNI;

    public Cliente(String nombre, String direccion, int DNI) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
}
