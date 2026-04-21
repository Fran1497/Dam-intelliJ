package ejercicios_debug.swing;

import javax.swing.*;
import java.awt.*;

public class _5_GridBagLayout extends JFrame {
    JTextField textFieldNombre;
    JTextField textFieldPass;
    JButton botonAceptar;
    JPanel panel;
    public _5_GridBagLayout() {
        super("Nueva Ventana");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        panel = new JPanel();
        panel.setLayout(new GridLayout());

        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.EAST;

        panel.add(new JLabel("Usuario "),c);

        c.gridx = 1;
        textFieldNombre = new JTextField();
        textFieldNombre.setColumns(10);
        textFieldNombre.addActionListener(e -> calcular());
        panel.add(textFieldNombre, c);

        c.gridx = 0;
        c.gridy = 1;
        panel.add(new JLabel("Contraseña"), c);
        c.gridx = 1;
        textFieldPass = new JTextField(10);
        panel.add(textFieldPass, c);
        textFieldPass.addActionListener(e -> calcular2());

        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 2;

        botonAceptar = new JButton("Comprobar");
        botonAceptar.addActionListener(e -> calcular2());
        this.setContentPane(panel);
        this.pack();
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
        if (textFieldPass.getText().equals("1234") && (textFieldNombre.getText().equals("Paco")))  {
            JOptionPane.showMessageDialog(this , "Contraseña correcta " + textFieldNombre.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Contraseña o Usuario incorrectos");
        }
    }

    public static void main(String[] args) {
        new _5_GridBagLayout();
    }
}
