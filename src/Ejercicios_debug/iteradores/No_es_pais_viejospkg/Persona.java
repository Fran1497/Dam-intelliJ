package Ejercicios_debug.iteradores.No_es_pais_viejospkg;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Persona {
    private String nombre;
    private LocalDate fechaNacimiento;

    private static final DateTimeFormatter FORMATO = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Persona(String nombre, String fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, FORMATO);
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public String toString() {
        return nombre + " (" + fechaNacimiento.format(FORMATO) + ")";
    }
}



