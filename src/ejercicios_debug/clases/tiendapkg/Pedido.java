package ejercicios_debug.clases.tiendapkg;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Instant fecha;
    private Cliente cliente;
    private String direccion;
    private BigDecimal total;
    private List<PedidoLinea> pedidoLineaList = new ArrayList<>();


    public Pedido(Cliente cliente,String direccion, BigDecimal total,ArrayList<PedidoLinea> pedidoLineaList){
        fecha = Instant.now();
    }

    public void addLinea(Producto producto, int cantidad){
        new PedidoLinea(producto, cantidad);
    }
    public PedidoLinea buscarLineaMasCara(List<PedidoLinea> pedidoLineaList){
        PedidoLinea Lineamascara = null;
        BigDecimal precioLocal;
        int cantidadLocal;
            for (int i=0; pedidoLineaList.size() >i ;i++){
                precioLocal = pedidoLineaList.get(i).getProducto().getPrecio();
                cantidadLocal = pedidoLineaList.get(i).getCantidad();

                //int suma = precioLocal*cantidadLocal; (Revisar TODO)
            }


        return Lineamascara;
    }
}
