package ejercicios_debug.clases.tiendapkg;

import java.math.BigDecimal;

public class Ropa extends Producto{
    private String talla;

    public Ropa( String nombre, BigDecimal precio,String talla) {
        super( nombre, precio);
        this.talla=talla;
    }
}
