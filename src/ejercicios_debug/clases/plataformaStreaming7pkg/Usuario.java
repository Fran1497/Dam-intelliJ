package ejercicios_debug.clases.plataformaStreaming7pkg;

public class Usuario {
    private String email;
    private String name;

    public Usuario(String email,String name, Suscripcion suscripcion) {
        this.email = email;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void main(String[] args) {
        Suscripcion suscripcion1 = new Suscripcion("Enterprise");
        Suscripcion suscripcion2 = new Suscripcion("Premiun");
        Suscripcion suscripcion3 = new Suscripcion("Basica");

        Usuario usuarioejemplo = new Usuario("fcarcas0806@g.educannd.es","Fran",suscripcion1);
    }
}
