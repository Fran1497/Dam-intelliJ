package ejercicios_debug.clases;

public class LibroElectronico {
    private final String titulo;
    private String autor;
    private double tamañoArchivo;

    public LibroElectronico(String titulo, String autor, double tamañoArchivo) {
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

    @Override
    public String toString() {
        return ("El autor es " +autor+ " el titulo es "+titulo+ " y el tamaño es "+ tamañoArchivo);
    }

    public int comparacion(LibroElectronico otro) {
        if (this.tamañoArchivo == otro.tamañoArchivo) {
            return 0;
        } else if (this.tamañoArchivo > otro.tamañoArchivo) {
            return 1;
        } else {
            return -1;
        }
    }


    public static void main(String[] args) {
        LibroElectronico libro1 = new LibroElectronico("A101","Paco el muros",100);
        LibroElectronico libro2 = new LibroElectronico("A102","Se colega",200  );

        switch (libro1.comparacion(libro2)){
            case 0 -> System.out.println("Son iguales");
            case 1 -> System.out.println("El primero es mayor");
            case -1 -> System.out.println("El primero es menor");
        }


        System.out.println(libro1);
        System.out.println(libro2);


    }
}




