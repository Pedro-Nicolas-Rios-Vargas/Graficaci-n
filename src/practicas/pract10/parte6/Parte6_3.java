/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 10
Fecha: 30/Octubre/2020
 */
package practicas.pract10.parte6;

import java.awt.Graphics;
import java.awt.Color;

import practicas.pract8.PanelBase;

public class Parte6_3 extends PanelBase {

    private final int[] X = {1,0,1,4,5,4};
    private final int[] Y = {1,4,7,7,4,1};

    /**
     * Unico constructor de la clase PanelBase el cual solicita un valor booleano para
     * elegir la metodologia a utilzar para realizar los dibujos graficos.
     * <br><br>
     * Si es <b>true</b> se utilizara el metodo de vectores, de lo contrario
     * si es <b>false</b> se utilizara el metodo de algoritmos.
     *
     * @param metodo Valor booleano que permite seleccionar que tipo de metodo utilizar:
     *               si <b>true</b> vectorial de lo contrario si <b>false</b> algoritmos.
     */
    public Parte6_3(boolean metodo) {
        super(metodo);
    }

    public void tercerFrame(Graphics g) {
        int[][] transform;
        int[] resX;
        int[] resY;

        //ORIGINAL
        mapa.rellenarPoligonoEscalar(X,Y,Color.BLACK,Color.BLACK,g);

        transform = mapa.escalarPuntoFijo(X,Y,-10,-2,2,2);
        transform = mapa.reflejoY(transform[0],transform[1]);
        transform = mapa.recorteDeXsobreY(transform[0],transform[1],1.5f,-5);
        transform = mapa.rotarInv(transform[0],transform[1],300);
        transform = mapa.escalarInv(transform[0],transform[1],4f,1);
        transform = mapa.reflejoOrigen(transform[0],transform[1]);

        resX = transform[0];
        resY = transform[1];

        mapa.rellenarPoligonoEscalar(resX,resY,new Color(52,186,132),new Color(0,99,50),g);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        tercerFrame(g);
    }
}
