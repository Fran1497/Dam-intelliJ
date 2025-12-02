package Ejercicios_debug.objeto.ejlibroelectronico9;





public class libroelectronico {
    private final String titulo;
    private String autor;
    private double tamañoArchivo;

    public libroelectronico(String titulo,String autor, double tamañoArchivo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamañoArchivo = tamañoArchivo;
    }

    public double getTamañoArchivo() {
        return tamañoArchivo;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTamañoArchivo(double tamañoArchivo) {
        this.tamañoArchivo = tamañoArchivo;
    }
    public int comparacion(double tamañoArchivo) {
        if (this.tamañoArchivo > tamañoArchivo) {
            return 0;
        } else if (this.tamañoArchivo < tamañoArchivo) {
            return 1;
        } else {
            return 2;
        }
    }
}




