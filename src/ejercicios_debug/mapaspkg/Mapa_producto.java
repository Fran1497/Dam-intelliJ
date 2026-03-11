package ejercicios_debug.mapaspkg;

import java.util.HashMap;

public class Mapa_producto {
    public static void main(String[] args) {
        HashMap<String,Double> almacen = new HashMap<>();

        almacen.put("Manzana", 1.5);
        almacen.put("Pera", 2.3);
        almacen.put("Papaya",20000.7);

        System.out.println(almacen.get("Manzana"));
        System.out.println(almacen.get("Pera"));
        System.out.println(almacen.get("Papaya"));
    }
}
