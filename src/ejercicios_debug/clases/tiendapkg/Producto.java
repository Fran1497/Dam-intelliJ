package ejercicios_debug.clases.tiendapkg;

import java.math.BigDecimal;

public class Producto {
    private String nombre;
    private BigDecimal precio;

    public Producto (String nombre, BigDecimal precio){
        this.nombre=nombre;
        this.precio=precio;
    }

    public String getNombre() {
        return nombre;
    }

    public BigDecimal getPrecio() {
        return precio;
    }
}
