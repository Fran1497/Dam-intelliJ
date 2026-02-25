package ejercicios_debug.clases.tiendapkg;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Alimento extends Producto{
        private LocalDate fechaCaducidad;
    public Alimento( String nombre, BigDecimal precio,LocalDate fechaCaducidad){
        super(nombre,precio);
        this.fechaCaducidad=fechaCaducidad;
    }
}
