/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 9
Fecha: 16/Octubre/2020
 */
package practicas.pract9;

import java.awt.Graphics;
import java.awt.Color;

import practicas.pract8.PanelBase;

public class Parte1 extends PanelBase{

    private final int[] X = {2,3,1,1,12,12,5};
    private final int[] Y = {1,2,2,8,8,2,2};

    /**
     * Metodo que se encarga de dibujar los 5 tipos de reflexiones en un plano.
     * @param g Objeto grafico del invocador.
     */
    public void parte1(Graphics g){
        g.setColor(Color.BLACK);
        mapa.poligonoEscalar(X, Y,g);  //ORIGINAL
        g.setColor(Color.RED);
        mapa.reflejarPoligonoSobreX(X, Y,g);   //REFLEXION SOBRE EJE X
        g.setColor(Color.BLUE);
        mapa.reflejarPoligonoSobreY(X, Y,g);   //REFLEXION SOBRE EJE Y
        g.setColor(Color.GREEN);
        mapa.reflejarPlanosOpuestos(X, Y,g);   //REFLEXION DE PLANOS OPUESTOS
        g.setColor(Color.MAGENTA);
        mapa.reflejarPoligonoXSobreY(X, Y,g);  //REFLEXION ENTRE EJES
        g.setColor(Color.ORANGE);
        mapa.reflejarPoligonoEntrePlanosOpuestos(X, Y,g);  //REFLEXION DE POLIGONOS ENTRE PLANOS
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        parte1(g);

    }
}
