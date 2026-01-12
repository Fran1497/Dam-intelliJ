package Ejercicios_debug.dibujar;

import javax.swing.*;

public class MainWindows {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        MiCanvas panel = new MiCanvas();
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
