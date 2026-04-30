package ejercicios_debug.clases.pedidos;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    // Lista de líneas que forman el pedido
    private List<LineaPedido> lineas = new ArrayList<>();

    // Añade una línea al pedido, pero NO permite productos repetidos
    public void agregarLinea(LineaPedido lp) throws ProductoDuplicadoException {

        // Comprobación de producto repetido
        for (LineaPedido l : lineas) {
            if (l.getProducto().getNombre().equals(lp.getProducto().getNombre())) {
                throw new ProductoDuplicadoException("Producto repetido: " + lp.getProducto().getNombre());
            }
        }

        lineas.add(lp);
    }

    // Calcula el total del pedido sumando los subtotales
    public double total() {
        double suma = 0;
        for (LineaPedido lp : lineas) {
            suma += lp.subtotal();
        }
        return suma;
    }

    public List<LineaPedido> getLineas() {
        return lineas;
    }
}

