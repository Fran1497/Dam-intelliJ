package ejercicios_debug.clases.jerarquiaPasswordpkg;

import java.util.ArrayList;
import java.util.List;

public class Sistema{
    private List<Usuario> usuarios = new ArrayList<>();


    public void listarUsuario(){
        System.out.println(usuarios);
    }
}
