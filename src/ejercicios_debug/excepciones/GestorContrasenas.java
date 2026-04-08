package ejercicios_debug.excepciones;

class ContrasenaDebilException extends Exception{
    public ContrasenaDebilException(){
        super("Contraseña corta");
    }
}

public class GestorContrasenas {

    public static void comprobar(String pass) throws ContrasenaDebilException{
        if (pass.length()< 6){
            throw new ContrasenaDebilException();
        } else {
            System.out.println("Contraseña valida");
        }
    }

    public static void main(String[] args) throws ContrasenaDebilException {
        //GestorContrasenas.comprobar("562");
        GestorContrasenas.comprobar("23423434");
    }
}
