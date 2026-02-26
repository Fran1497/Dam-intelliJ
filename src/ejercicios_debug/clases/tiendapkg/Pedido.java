package ejercicios_debug.clases.tiendapkg;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pedido {
    private Instant fecha;
    private Cliente cliente;
    private String direccion;
    private BigDecimal total;
    private List<PedidoLinea> pedidoLineaList = new ArrayList<>();


    public Pedido(Cliente cliente, String direccion, BigDecimal total, List<PedidoLinea> pedidoLineaList) {
        this.fecha = Instant.now();
        this.cliente = cliente;
        this.direccion = direccion;
        this.total = total;
        this.pedidoLineaList = pedidoLineaList;
    }


    public PedidoLinea buscarLineaMasCara() {
        PedidoLinea lineaMasCara = null;
        BigDecimal maxImporte = BigDecimal.ZERO;

        for (PedidoLinea linea : pedidoLineaList) {
            BigDecimal precio = linea.getProducto().getPrecio();
            BigDecimal cantidad = BigDecimal.valueOf(linea.getCantidad());
            BigDecimal importe = precio.multiply(cantidad);

            if (lineaMasCara == null || importe.compareTo(maxImporte) > 0) {
                lineaMasCara = linea;
                maxImporte = importe;
            }
        }

        return lineaMasCara;
    }
    public void eliminarLineas(Producto producto) {
        Iterator<PedidoLinea> it = pedidoLineaList.iterator();

        while (it.hasNext()) {
            PedidoLinea linea = it.next();
            if (linea.getProducto().equals(producto)) {
                it.remove();
            }
        }
    }



}
