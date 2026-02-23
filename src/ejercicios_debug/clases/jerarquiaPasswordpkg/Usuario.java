package ejercicios_debug.clases.jerarquiaPasswordpkg;

public class Usuario {
    private String nameuser;
    private Password password;

    public Usuario(String nameuser, Password password) {
        this.nameuser = nameuser;
        this.password = password;
    }

    public String getNombre() {
        return nameuser;
    }

    public static void main(String[] args) {
        String miNombre = "Pedro";
        Usuario usuario = new Usuario(miNombre, new Password("1234"));
        miNombre = "Patata";
        System.out.println(usuario.getNombre());
    }
}

