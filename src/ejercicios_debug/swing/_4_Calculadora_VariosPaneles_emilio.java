package ejercicios_debug.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class _4_Calculadora_VariosPaneles_emilio extends JFrame{
        JPanel panelPrincipal, panelBotones;
        JTextField textFieldNumeros = new JTextField();
        JButton botonIgual = new JButton("=");

        String[] textoBotones = {"1","2","3","4","5","6","7","8","9","0","+","-","*","/"};
        JButton[] botonesCalculadora = new JButton[textoBotones.length];

        String operacion= null;
        double operandoActual=0;

        public _4_Calculadora_VariosPaneles_emilio() {
            super("Calculadora");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            textFieldNumeros.setEditable(false);
            panelBotones = new JPanel();
            panelPrincipal = new JPanel();
            panelPrincipal.setLayout(new BorderLayout());
            this.setContentPane(panelPrincipal);
            panelPrincipal.add(textFieldNumeros, BorderLayout.NORTH);
            panelPrincipal.add(panelBotones, BorderLayout.SOUTH);
            panelPrincipal.add(panelBotones, BorderLayout.CENTER);
            panelBotones.setLayout(new GridLayout(4,4));

            for (int i = 0; i < textoBotones.length; i++) {
                botonesCalculadora[i] =new JButton(textoBotones[i]);
                panelBotones.add(botonesCalculadora[i]);
                try {
                    int numero = Integer.parseInt(botonesCalculadora[i].getText());
                    botonesCalculadora[i].addActionListener(this::accionBotonNumerico);

                }catch (NumberFormatException e){
                    botonesCalculadora[i].addActionListener(this::accionBotonOperacion);
                }
                botonesCalculadora[i].addActionListener(this::accionBotonNumerico);
            }

            this.setSize(400,400);
            this.setLocationRelativeTo(null);
            this.setVisible(true);
        }
        private void accionBotonOperacion(ActionEvent e){
            if (e.getSource() instanceof JButton b) {
               if (b.getText().equals(".")){

               }else {
                   if (operacion == null){
                       operandoActual = Double.parseDouble(textFieldNumeros.getText());
                       textFieldNumeros.setText("");
                       operacion = b.getText();
                   } else {
                       double NuevoOperando = Double.parseDouble(textFieldNumeros.getText());
                       operandoActual = switch (operacion){
                           case "+" -> operandoActual + NuevoOperando;
                           case "-" -> operandoActual + NuevoOperando;
                           case "*" -> operandoActual + NuevoOperando;
                           default -> operandoActual / NuevoOperando;
                       };
                       textFieldNumeros.setText(Double.toString(operandoActual));
                   }
               }
            }
        }


        private void accionBotonNumerico(ActionEvent e) {
            if (e.getSource() instanceof JButton b){
                textFieldNumeros.setText(textFieldNumeros.getText()+b.getText());
            }
        }

    public static void main(String[] args) {
        new _4_Calculadora_VariosPaneles_emilio();
    }


}
