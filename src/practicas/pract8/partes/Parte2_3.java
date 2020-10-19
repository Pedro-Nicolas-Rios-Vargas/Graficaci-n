/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 8
Fecha: 12/Octubre/2020
 */


package practicas.pract8.partes;

import practicas.pract8.PanelBase;

import java.awt.*;

public class Parte2_3 extends PanelBase {

    private final int[] X = {-8,-2,0,2,8,2,0,-2};
    private final int[] Y = {0,2,8,2,0,-2,-8,-2};

    /**
     * Dibuja la estrella de 4 picos original (color negro) junto con las estrellas modificadas
     * a), b), c) y d) ubicando el punto fijo en el origen de las coordenadas.
     * @param g Objeto grafico del invocador.
     */
    private void parte3a(Graphics g){
        //BASE
        mapa.rellenarPoligonoEscalar(X, Y,Color.BLACK,Color.BLACK,g);

        //INCISO A
        g.setColor(Color.RED);
        mapa.poligonoEscalar(X,Y,2f,2f,g);

        //INCISO B
        mapa.poligonoEscalar(X,Y,0.5f,0.5f,g);

        //INCISO C
        mapa.poligonoEscalar(X,Y,1.5f,0.5f,g);

        //INCISO D
        mapa.poligonoEscalar(X,Y,0.5f,1.5f,g);

    }

    /**
     * Dibuja las estrellas de 4 picos modificadas a), b), c) y d) ubicando el punto fijo
     * en el centro de la figura.
     * @param g Objeto grafico del invocador.
     */
    private void parte3b(Graphics g){

        //INCISO A
        g.setColor(Color.RED);
        mapa.poligonoEscalar(X,Y,2f,2f,g);

        //INCISO B
        g.setColor(Color.BLUE);
        mapa.poligonoEscalar(X,Y,0.5f,0.5f,g);

        //INCISO C
        g.setColor(Color.GREEN);
        mapa.poligonoEscalar(X,Y,1.5f,0.5f,g);

        //INCISO D
        g.setColor(Color.MAGENTA);
        mapa.poligonoEscalar(X,Y,0.5f,1.5f,g);
    }

    /**
     * Dibuja las estrellas de 4 picos modificadas a), b), c) y d) ubicando el punto fijo
     * en un vertice (o punto) de la figura.
     * @param g Objeto grafico del invocador.
     */
    private void parte3c(Graphics g){

        //INCISO A
        g.setColor(Color.RED);
        mapa.poligonoEscalar(X,Y,2,2,8,0,g);

        //INCISO B
        g.setColor(Color.BLUE);
        mapa.poligonoEscalar(X,Y,0.5f,0.5f,8,0,g);

        //INCISO C
        g.setColor(Color.GREEN);
        mapa.poligonoEscalar(X,Y,1.5f,0.5f,8,0,g);

        //INCISO D
        g.setColor(Color.MAGENTA);
        mapa.poligonoEscalar(X,Y,0.5f,1.5f,8,0,g);
    }

    /**
     * Dibuja las estrellas de 4 picos modificadas a), b), c) y d) ubicando el punto fijo
     * en un punto fuera de la figura.
     * @param g Objeto grafico del invocador.
     */
    public void parte3d(Graphics g){
        int translacionX = -25;
        int translacionY = 10;
        //INCISO A
        g.setColor(Color.RED);
        mapa.poligonoEscalar(X,Y,2,2,translacionX,translacionY,g);

        //INCISO B
        g.setColor(Color.BLUE);
        mapa.poligonoEscalar(X,Y,0.5f,0.5f,translacionX,translacionY,g);

        //INCISO C
        g.setColor(Color.GREEN);
        mapa.poligonoEscalar(X,Y,1.5f,0.5f,translacionX,translacionY,g);

        //INCISO D
        g.setColor(Color.MAGENTA);
        mapa.poligonoEscalar(X,Y,0.5f,1.5f,translacionX,translacionY,g);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        parte3a(g);
        parte3b(g);
        parte3c(g);
        parte3d(g);
    }
}
