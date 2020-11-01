/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 10
Fecha: 30/Octubre/2020
 */
package practicas.pract10.parte6;

import java.awt.Graphics;
import java.awt.Color;

import practicas.pract8.PanelBase;

import static graficos.cartesiano.vectorial.CartesianoVectores.*;

public class Parte6_1 extends PanelBase {

    private final int[] X = {1,1,5,5};
    private final int[] Y = {1,5,5,1};

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
    public Parte6_1(boolean metodo) {
        super(metodo);
    }

    public void primerFrame(Graphics g) {
        double[][] matrizPtz = matrizPuntos(X,Y);
        double[][] aux;
        double[][] aux2;
        double[][] mult;
        int[][] transform;

        int[] resX;
        int[] resY;

        //ORIGINAL
        mapa.rellenarPoligonoEscalar(X,Y,Color.BLACK,Color.BLACK,g);

        //mult = multiplicacion(mult,matrizPtz);

        transform = mapa.transladar(X,Y,10,0);
        transform = mapa.transladarInv(transform[0],transform[1],20,5);
        transform = mapa.escalarPuntoFijo(transform[0],transform[1],-7,5,2,2);
        transform = mapa.escalarInv(transform[0],transform[1],2f,2f);
        transform = mapa.escalarPuntoFijo(transform[0],transform[1],0,-5,3,3);
        transform = mapa.rotar(transform[0],transform[1],70);
        transform = mapa.rotarInv(transform[0],transform[1],10);
        transform = mapa.rotarPuntoFijo(transform[0],transform[1],5,7,180);
        transform = mapa.reflejoX(transform[0],transform[1]);
        transform = mapa.reflejoY(transform[0],transform[1]);
        transform = mapa.recorteDeXsobreY(transform[0],transform[1],-2f,-8);

        resX = transform[0];
        resY = transform[1];


        //resX = actualizaPuntos(mult,0);
        //resY = actualizaPuntos(mult,1);
        //transform = ajusteMatriz(resX,resY);
        //resX = transform[0];
        //resY = transform[1];
        mapa.rellenarPoligonoEscalar(resX,resY,new Color(10,255,149),new Color(0,70,106,255),g);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        primerFrame(g);
    }
}
