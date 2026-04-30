package ejercicios_debug.clases.pedidos;

public class LineaPedido {
    // Cada línea tiene un producto
    private Producto producto;

    // Y una cantidad de ese producto
    private int cantidad;

    public LineaPedido(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    // Calcula el subtotal de esta línea
    public double subtotal() {
        return producto.getPrecio() * cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }
}

