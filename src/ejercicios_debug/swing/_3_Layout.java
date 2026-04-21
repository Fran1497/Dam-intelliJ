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
        JTextField textFieldNumeros = new JTextField();
        panelPrincipal.add(textFieldNumeros, BorderLayout.NORTH);

        // Centro 4 buttons
        panelCentral = new JPanel();
        panelCentral.setLayout(new GridLayout(4,4));
        panelCentral.add(new JButton("1"));
        panelCentral.add(new JButton("2"));
        panelCentral.add(new JButton("3"));
        panelCentral.add(new JButton("+"));
        panelCentral.add(new JButton("4"));
        panelCentral.add(new JButton("5"));
        panelCentral.add(new JButton("6"));
        panelCentral.add(new JButton("-"));
        panelCentral.add(new JButton("7"));
        panelCentral.add(new JButton("8"));
        panelCentral.add(new JButton("9"));
        panelCentral.add(new JButton("x"));
        panelCentral.add(new JButton("0"));
        panelCentral.add(new JButton("."));
        panelCentral.add(new JButton("C"));
        panelCentral.add(new JButton("/"));

        panelPrincipal.add(panelCentral, BorderLayout.CENTER);

        // abajo 1 button
        botonAceptar = new JButton("=");
        panelPrincipal.add(botonAceptar, BorderLayout.SOUTH);

        this.add(panelPrincipal);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new _3_Layout();
    }
}

