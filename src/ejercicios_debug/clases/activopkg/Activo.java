package ejercicios_debug.clases.activopkg;

public class Activo {
    private String isin;
    private String nombre;
    private double precioactual;


    public double getPrecioactual() {
        return precioactual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioactual(double precioactual) {
        this.precioactual = precioactual;
    }

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }
}

