package ejercicios_debug.swing;

import ejercicios_debug.clases.jerarquiaPasswordpkg.Usuario;

import javax.swing.*;

public class _2_ventana_bien extends JFrame {
        JPanel panelpricipal;
        JTextField textFieldNombre;
        JButton botonAceptar;
        JButton botonAceptar2;
        JTextField textFieldContraseña;

        public _2_ventana_bien() {
            super("Nueva ventana");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(500,300);
            this.setLocationRelativeTo(null);
            panelpricipal = new JPanel();
            this.setContentPane(panelpricipal);
            panelpricipal.add(new JLabel("Escribe tu nombre"));
            textFieldNombre = new JTextField();
            textFieldNombre.setColumns(10);
            textFieldNombre.addActionListener(e -> calcular());
            panelpricipal.add(textFieldNombre);
            botonAceptar = new JButton("Comprobador");
            botonAceptar.addActionListener(e -> calcular2());
            botonAceptar.addActionListener(e -> calcular());



            panelpricipal.add(new JLabel("Contraseña"));
            textFieldContraseña = new JTextField();
            textFieldContraseña.setColumns(10);
            textFieldContraseña.addActionListener(e -> calcular2());
            panelpricipal.add(textFieldContraseña);
            panelpricipal.add(botonAceptar);
            this.setVisible(true);
        }

    public void calcular() {

            if (textFieldNombre.getText().equals("Paco")) {
                JOptionPane.showMessageDialog(this , "Hola, " + textFieldNombre.getText());

            } else {
                JOptionPane.showMessageDialog(this, "Usuario incorrecto");
            }
    }
    public void calcular2 (){
        if (textFieldContraseña.getText().equals("1234") && (textFieldNombre.getText().equals("Paco")))  {
            JOptionPane.showMessageDialog(this , "Contraseña correcta " + textFieldNombre.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Contraseña o Usuario incorrectos");
        }
    }

    public static void main(String[] args) {
        new _2_ventana_bien();
    }
}
