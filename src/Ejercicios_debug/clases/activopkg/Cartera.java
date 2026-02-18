package Ejercicios_debug.clases.activopkg;

import java.util.ArrayList;
import java.util.List;

public class Cartera{
    private  List<Operacion> operaciones = new ArrayList<>();





    public void comprar(Activo activo, double cantidad, double precio){
        operaciones.add(new Operacion("C",cantidad,precio,activo));
    }
    public void vender(Activo activo, double cantidad, double precio){
        operaciones.add(new Operacion("V",cantidad,precio,activo));
    }
    public void  traspasar(FondoInversion FondoInversion1, double precioorig,double cantidadorig, FondoInversion FondoInversion2, double preciofin,double cantidadfin ){
        operaciones.add(new Operacion("T",preciofin,cantidadorig,FondoInversion2,preciofin,cantidadfin));
    }




}
