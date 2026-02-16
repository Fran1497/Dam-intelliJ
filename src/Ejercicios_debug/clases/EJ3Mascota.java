package Ejercicios_debug.clases;

public class EJ3Mascota {
    private String nombre;
    private String especie;
    private int edad;


    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return ("El nombre de la mascota es " + getNombre() + " su especie es " + getEspecie() + " y su edad es " + getEdad());
    }


    public EJ3Mascota(String nombre, String especie, int edad){
        this.nombre=nombre;
        this.edad=edad;
        this.especie=especie;

    }
    public void incrementaredad(){
        this.edad++;
    }

    public static void main(String[] args) {
        EJ3Mascota mascota = new EJ3Mascota("Ale","Perro",19);

        System.out.println(mascota);
        mascota.incrementaredad();
        System.out.println(mascota);
    }
}
