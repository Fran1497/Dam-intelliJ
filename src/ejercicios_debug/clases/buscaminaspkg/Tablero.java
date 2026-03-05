package ejercicios_debug.clases.buscaminaspkg;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class Tablero {
    public static final int DIFICULTAD_MEDIA = 8;
    private int casillasDestapadas=0;
    private Point[] bordes = {
            new Point(-1,-1),
            new Point(-1,0),
            new Point(-1,1),
            new Point(0, -1),
            new Point(0,1),
            new Point(1,-1),
            new Point(1,0),
            new Point(1,1),
    };

    private int dificultad;

    private Celda[][] celdas;
    public Tablero() {
        dificultad = DIFICULTAD_MEDIA;
        init();
    }
    private void init() {
        crearTablero();
        colocarMinas();
        asignarNumeros();
    }

    private boolean coordenadasValidas(int x, int y) {
        return x<dificultad && y<dificultad && x>=0 && y>=0;
    }
    private boolean coordenadasValidas(Point p) {
        return coordenadasValidas(p.x,p.y);
    }

    private boolean esMina(int x, int y) {
        if (!coordenadasValidas(x,y)) 
            return false;
        return celdas[x][y].isMina();
    }

    private void asignarNumeros() {
        for (int i = 0; i < celdas.length; i++) {
            for (int j = 0; j < celdas[i].length; j++) {
                // TODO OJO OJO OJO
                if (celdas[i][j].isMina())
                    continue;
                int contador = 0;
                for(Point p : bordes) {
                    if (esMina(i+p.x,j+p.y))
                        contador++;
                }
                celdas[i][j].setMinasAlrededor(contador);
            }
        }
    }

    private void colocarMinas() {
        int minasPorColocar = DIFICULTAD_MEDIA;
        Random r = new Random();
        while (minasPorColocar>0) {
            int x = r.nextInt(dificultad);
            int y = r.nextInt(dificultad);
            if (!celdas[x][y].isMina()) {
                celdas[x][y].setMina(true);
                minasPorColocar--;
            }
        }
    }

    private void crearTablero() {
        // Creo el tablero
        celdas = new Celda[dificultad][dificultad];
        // Creo las minas
        for (int i = 0; i < celdas.length; i++) {
            for (int j = 0; j < celdas[i].length; j++) {
                celdas[i][j] = new Celda();
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Celda[] fila : celdas) {
            result.append(Arrays.toString(fila)).append("\n");
        }
        return result.toString();
    }

    public boolean destapar(int x, int y) {
        Celda celda = celdas[x][y];
        celda.destapar();
        casillasDestapadas++;
        if (celda.isMina()) {
            return false;
        } else if (celda.getMinasAlrededor()==0) {
            // destapar alrededor
            for(Point p : bordes) {
                Point coordenadas = new Point (x+p.x, y+p.y);
                if (coordenadasValidas(coordenadas) && !celdas[coordenadas.x][coordenadas.y].isDestapada()) {
                    destapar(x + p.x, y + p.y);
                }
            }
        }
        return true;
    }

    public boolean isMina(int x, int y) {
        return celdas[x][y].isMina();
    }

    public void destaparMinas() {
        for (Celda[] fila : celdas) {
            for (Celda celda : fila) {
                if (celda.isMina()) {
                    celda.destapar();
                }
            }
        }
    }

    public boolean victoria() {
        return casillasDestapadas == (dificultad*dificultad) - dificultad;
    }

    public void destaparTodo() {
        for (Celda[] fila : celdas) {
            for (Celda celda : fila) {
                celda.destapar();
            }
        }
    }
}
