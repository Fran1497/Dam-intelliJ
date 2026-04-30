package ejercicios_debug.clases.pedidos;

// Excepción personalizada para productos repetidos en un pedido
public class ProductoDuplicadoException extends Exception {
    public ProductoDuplicadoException(String mensaje) {
        super(mensaje);
    }
}

