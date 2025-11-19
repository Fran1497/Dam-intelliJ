package Ejercicios_debug.objeto;

import java.util.Scanner;

public class Alumno {
    private final String nombre;
    private int edad;
    private double nota;
    private Boolean castigado;

    public Alumno(String nombre, int edad, double nota, Boolean castigado) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
        this.castigado = castigado;
    }

    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public double getNota(){
        return nota;
    }
    public void changecastigado(boolean castigado) {

        this.castigado = castigado;

    }

}



