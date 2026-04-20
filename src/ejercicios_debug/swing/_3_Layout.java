package ejercicios_debug.swing;

import javax.swing.*;
import java.awt.*;

public class _3_Layout extends JFrame {
    JPanel panelPrincipal;
    JPanel panelCentral;

    JTextField textfieldNombre;
    JTextField textfieldPass;
    JButton botonAceptar;

    public _3_Layout() {
        super("Nueva ventana");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());

        // arriba 1 button
        JButton botonArriba = new JButton("Arriba");
        panelPrincipal.add(botonArriba, BorderLayout.NORTH);

        // Centro 4 buttons
        panelCentral = new JPanel();
        panelCentral.setLayout(new GridLayout(2,2));
        panelCentral.add(new JButton("C1"));
        panelCentral.add(new JButton("C2"));
        panelCentral.add(new JButton("C3"));
        panelCentral.add(new JButton("C4"));
        panelPrincipal.add(panelCentral, BorderLayout.CENTER);

        // abajo 1 button
        botonAceptar = new JButton("Abajo");
        panelPrincipal.add(botonAceptar, BorderLayout.SOUTH);

        this.add(panelPrincipal);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new _3_Layout();
    }
}

