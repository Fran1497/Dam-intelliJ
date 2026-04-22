package ejercicios_debug.swing;

import javax.swing.*;
import java.awt.*;

public class _5_Gridlayout extends JFrame {

    public _5_Gridlayout() {
        super("Diseño 3x3");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5,5,5,5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("Label arriba"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(new JTextField(""), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 2;
        panel.add(new JLabel("Label grande"), gbc);

        gbc.gridheight = 1;

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(new JTextField(""), gbc);

        JButton btn = new JButton("Boton");
        gbc.gridx = 2;
        gbc.gridy = 1;
        panel.add(btn, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(new JLabel("Label"), gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        panel.add(new JTextField(""), gbc);

        btn.addActionListener(e -> JOptionPane.showMessageDialog(this, "Hola Paco"));

        this.add(panel);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new _5_Gridlayout();
    }
}
