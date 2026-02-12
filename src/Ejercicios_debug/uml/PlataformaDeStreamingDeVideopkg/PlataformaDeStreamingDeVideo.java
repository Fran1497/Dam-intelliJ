package Ejercicios_debug.uml.PlataformaDeStreamingDeVideopkg;

public class PlataformaDeStreamingDeVideo {

    public class Pelicula{
        private final String nombre;
        private final int duracion;
        private boolean Favorito;

        public Pelicula(String nombre, int duracion, boolean favorito) {
            this.nombre = nombre;
            this.duracion = duracion;
            Favorito = favorito;
        }
        public boolean makeFavorito(Pelicula pelicula){
            return this.Favorito=true;
        }
        public boolean makeNoFavorito(Pelicula pelicula){
            return this.Favorito=false;
        }
    }
    public class Serie{
        private final String nombre;
        private final int Numero_de_temporadas;
        private boolean Favorito;

        public Serie(String nombre, int numeroDeTemporadas, boolean favorito) {
            this.nombre = nombre;
            Numero_de_temporadas = numeroDeTemporadas;
            Favorito = favorito;
        }
        public String getNombre(Serie serie){
            return this.nombre;
        }
        public boolean makeFavorito(Serie serie){
            return this.Favorito=true;
        }
        public boolean makeNoFavorito(Serie serie){
            return this.Favorito=false;
        }
    }
    public class Episodios{
        private final String nombre;
        private final String Perteneciente_a_serie;


        public Episodios(String nombre, int numeroDeTemporadas, Serie serie) {
            this.nombre = nombre;
            Perteneciente_a_serie =serie.getNombre(serie) ;

        }

        }
}

