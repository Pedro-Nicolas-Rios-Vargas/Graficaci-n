/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 10
Fecha: 30/Octubre/2020
 */
package practicas.pract10.parte6;

import java.awt.Graphics;
import java.awt.Color;

import practicas.pract8.PanelBase;

public class Parte6_2 extends PanelBase {

    private final int[] X = {1,3,5};
    private final int[] Y = {1,6,1};

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
    public Parte6_2(boolean metodo) {
        super(metodo);
    }

    public void segundoFrame(Graphics g) {
        int[][] transform;
        int[] resX;
        int[] resY;

        //ORIGINAL
        mapa.rellenarPoligonoEscalar(X,Y,Color.BLACK,Color.BLACK,g);

        transform = mapa.recorteDeXsobreY(X,Y,-2.5f,5);
        transform = mapa.reflejoOrigen(transform[0], transform[1]);
        transform = mapa.reflejoX(transform[0], transform[1]);
        transform = mapa.rotar(transform[0],transform[1],180);
        transform = mapa.rotarPuntoFijo(transform[0],transform[1],10,-5,160);
        transform = mapa.transladarInv(transform[0], transform[1], 0,-22);
        transform = mapa.recorteDeYsobreX(transform[0],transform[1],-0.5f,10);
        transform = mapa.escalarPuntoFijo(transform[0],transform[1],1,1,2,2);
        transform = mapa.reflejoY(transform[0],transform[1]);

        resX = transform[0];
        resY = transform[1];
        mapa.rellenarPoligonoEscalar(resX,resY,new Color(255,88,0),new Color(48,175,0),g);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        segundoFrame(g);
    }
}
