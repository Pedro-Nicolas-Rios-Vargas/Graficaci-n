/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 8
Fecha: 12/Octubre/2020
 */

package practicas.pract8.partes;

import practicas.pract8.PanelBase;
import java.awt.Graphics;
import java.awt.Color;

public class Parte2_4 extends PanelBase{

    private final int[] X = {-5,5,5,9,5,5,-5,-3};
    private final int[] Y = {2,2,4,0,-4,-2,-2,0};

    /**
     * Dibuja la flecha original (color negro) y las flechas a), b) y c)
     * ubicada en el origen de las coordenadas.
     * @param g Objeto grafico del invocador.
     */
    public void parte4a(Graphics g){
        //ORIGINAL
        mapa.rellenarPoligonoEscalar(X,Y,Color.BLACK,Color.BLACK,g);
        //INCISO A
        g.setColor(Color.RED);
        mapa.poligonoRotado(X,Y,45,g);
        //INCISO B
        g.setColor(Color.BLUE);
        mapa.poligonoRotado(X,Y,90,g);
        //INCISO C
        g.setColor(Color.GREEN);
        mapa.poligonoRotado(X,Y,135,g);
        //INCISO D
        g.setColor(new Color(255,139,0));
        mapa.poligonoRotado(X,Y,180,g);
    }

    /**
     * Dibuja las flechas a), b) y c) ubicando su centro en el centro de la figura.
     * @param g Objeto grafico del invocador.
     */
    public void parte4b(Graphics g){
        //INCISO A
        g.setColor(Color.RED);
        mapa.poligonoRotado(X,Y,45,g);
        //INCISO B
        g.setColor(Color.BLUE);
        mapa.poligonoRotado(X,Y,90,g);
        //INCISO C
        g.setColor(Color.GREEN);
        mapa.poligonoRotado(X,Y,135,g);
        //INCISO D
        g.setColor(new Color(255,139,0));
        mapa.poligonoRotado(X,Y,180,g);
    }

    /**
     * Dibuja las flechas a), b) y c) ubicando su centro en el vértice (o punto) de la figura.
     * @param g Objeto grafico del invocador.
     */
    public void parte4c(Graphics g){
        //INCISO A
        g.setColor(Color.RED);
        mapa.poligonoRotado(X,Y,45,9,0,g);
        //INCISO B
        g.setColor(Color.BLUE);
        mapa.poligonoRotado(X,Y,90,9,0,g);
        //INCISO C
        g.setColor(Color.GREEN);
        mapa.poligonoRotado(X,Y,135,9,0,g);
        //INCISO D
        g.setColor(new Color(255,139,0));
        mapa.poligonoRotado(X,Y,180,9,0,g);
    }

    /**
     * Dibuja las flechas a), b) y c) ubicandolas en un punto fuera de la figura.
     * @param g Objeto grafico del invocador.
     */
    public void parte4d(Graphics g){
        //INCISO A
        g.setColor(Color.RED);
        mapa.poligonoRotado(X,Y,45,-15,10,g);
        //INCISO B
        g.setColor(Color.BLUE);
        mapa.poligonoRotado(X,Y,90,-15,10,g);
        //INCISO C
        g.setColor(Color.GREEN);
        mapa.poligonoRotado(X,Y,135,-15,10,g);
        //INCISO D
        g.setColor(new Color(255,139,0));
        mapa.poligonoRotado(X,Y,180,-15,10,g);
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        parte4a(g);
        parte4b(g);
        parte4c(g);
        parte4d(g);
    }
}
