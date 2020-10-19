/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 9
Fecha: 16/Octubre/2020
 */
package practicas.pract9;

import java.awt.Graphics;
import java.awt.Color;

import practicas.pract8.PanelBase;

public class Parte2 extends PanelBase{

    private final int[] X = {3,1,3,6,8,6};
    private final int[] Y = {1,4,7,7,4,1};

    /**
     * Metodo que se encarga de dibujar los 4 tipos de recortes en una figura.
     * @param g Objeto grafico del invocador.
     */
    public void parte2(Graphics g){
        float shX = 0.5f;
        float shY = 0.5f;
        int refX = -1;
        int refY = -2;

        g.setColor(Color.BLACK);
        mapa.poligonoEscalar(X,Y,g);    //POLIGONO BASE
        g.setColor(Color.RED);
        mapa.recortarPoligonoDeXSobreX(X,Y,shX,g); //Recorte de x en relacion con el eje x.
        g.setColor(Color.BLUE);
        mapa.recortarPoligonoDeXSobreY(X,Y,shX,refY,g); //Recorte de x en relacion con el eje y.
        g.setColor(new Color(232,0,77));
        mapa.recortarPoligonoDeYSobreY(X,Y,shY,g);  //Recorte de y en relacion al eje y.
        g.setColor(new Color(255,213,0));
        mapa.recortarPoligonoDeYSobreX(X,Y,shY,refX,g); //Recorte de y en relacion al eje x.
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        parte2(g);
    }
}
