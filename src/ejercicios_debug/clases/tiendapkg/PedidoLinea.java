package ejercicios_debug.clases.tiendapkg;

public class PedidoLinea {
    private Producto producto;
    private int cantidad;

    public PedidoLinea(Producto producto, int cantidad){
        this.producto=producto;
        this.cantidad=cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Producto getProducto() {
        return producto;
    }
}
