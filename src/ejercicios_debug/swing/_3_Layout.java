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
        panelCentral = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        panelCentral.setLayout(new GridLayout(4,4));
        panelCentral.add(new JLabel("Usuario: "));
        textfieldNombre = new JTextField();
        textfieldNombre.setColumns(10);
        textfieldNombre.addActionListener(e -> calcular());
        panelCentral.add(textfieldNombre);
        panelCentral.add(new JLabel("Contraseña "));
        textfieldPass = new JTextField(10);
        panelCentral.add(textfieldPass);
        textfieldPass.addActionListener(e -> calcular());
        panelPrincipal.add(panelCentral, BorderLayout.CENTER);
        panelPrincipal.add(botonAceptar, BorderLayout.SOUTH);
        this.pack();
        this.setVisible(true);
    }

    public void calcular(){
        JOptionPane.showMessageDialog(
                this, (
                        textfieldNombre.getText().equals(textfieldPass.getText().equals("1234"))
                        ?"Correcto"
                                :"Incorrecto"
                        )
        );

    }
    public static void main(String[] args) {
        new _3_Layout();
    }

}
