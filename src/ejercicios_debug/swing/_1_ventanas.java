package ejercicios_debug.swing;

import javax.swing.*;
import java.awt.*;

public class _1_ventanas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Nueva Ventana");
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(new JLabel("No hagas caso"));
        frame.add(new JButton("Holaaaaa"));
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}
