package ejercicios_debug.clases.pedidos;

public class Producto {
    // Nombre del producto
    private String nombre;

    // Precio unitario del producto
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}

