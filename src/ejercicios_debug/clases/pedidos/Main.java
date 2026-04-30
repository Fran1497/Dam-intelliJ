package ejercicios_debug.clases.pedidos;

import java.util.*;

public class Main {

    // Lee productos desde teclado
    public static List<Producto> leerProductos(Scanner sc) {
        List<Producto> productos = new ArrayList<>();

        System.out.println("Cuántos productos quieres crear:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Nombre del producto:");
            String nombre = sc.next();

            System.out.println("Precio del producto:");
            double precio = sc.nextDouble();

            productos.add(new Producto(nombre, precio));
        }

        return productos;
    }

    // Crea pedidos y añade líneas
    public static List<Pedido> leerPedidos(Scanner sc, List<Producto> productos) {
        List<Pedido> pedidos = new ArrayList<>();

        System.out.println("Cuántos pedidos quieres crear:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Pedido p = new Pedido();

            System.out.println("Cuántas líneas tendrá este pedido:");
            int lineas = sc.nextInt();

            for (int j = 0; j < lineas; j++) {
                System.out.println("Elige producto por índice (0 a " + (productos.size() - 1) + "):");
                int idx = sc.nextInt();

                System.out.println("Cantidad:");
                int cantidad = sc.nextInt();

                try {
                    p.agregarLinea(new LineaPedido(productos.get(idx), cantidad));
                } catch (ProductoDuplicadoException e) {
                    System.out.println("ERROR: " + e.getMessage());
                    j--; // repetir esta línea
                }
            }

            pedidos.add(p);
        }

        return pedidos;
    }

    // Imprime los pedidos ordenados por precio total descendente
    public static void imprimirResultados(List<Pedido> pedidos) {

        // Orden descendente por total
        pedidos.sort((a, b) -> Double.compare(b.total(), a.total()));

        System.out.println("\n=== RESULTADOS ===");
        for (Pedido p : pedidos) {
            System.out.println("Pedido total: " + p.total());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Producto> productos = leerProductos(sc);
        List<Pedido> pedidos = leerPedidos(sc, productos);

        imprimirResultados(pedidos);
    }
}
