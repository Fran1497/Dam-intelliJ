package Ejercicios_debug.dibujar;

import javax.swing.*;
import java.awt.*;

public class MiCanvas extends JPanel {

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setBackground(new Color(0,0,0));
        g2d.setBackground(Color.white);
        g2d.clearRect(0,0,this.getWidth(),getHeight());
        g2d.fillOval(50,50,35,75);
        g2d.fillRect(100,100,30,67);
        Polygon triangulo = new Polygon();
        triangulo.addPoint(0,0);
        triangulo.addPoint(this.getWidth(),getHeight());
        triangulo.addPoint(130,130);
        g2d.fillPolygon(triangulo);

    }
}
