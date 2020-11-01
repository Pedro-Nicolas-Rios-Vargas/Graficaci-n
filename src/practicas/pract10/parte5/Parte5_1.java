/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 10
Fecha: 30/Octubre/2020
 */
package practicas.pract10.parte5;

import java.awt.Graphics;
import java.awt.Color;

import practicas.pract8.PanelBase;

public class Parte5_1 extends PanelBase {

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
    public Parte5_1(boolean metodo) {
        super(metodo);
    }

    public void primerFrame(Graphics g) {

        /*
        *                                           RECORDATORIO
        * Debes solucionar el problema de escalar-transladar, escalar-rotar, transladar-rotar.
        *
        * */
        double[][] matrizPts;
        int[][] transform;
        double[][] aux;
        double[][] aux2;
        double[][] res;


        int[] resX;
        int[] resY;

        retardar();
        mapa.rellenarPoligonoEscalar(X,Y,Color.BLACK,Color.BLACK,g);    //ORIGINAL

        //TRASLACION SIMPLE
        transform = mapa.transladar(X,Y,10,0);  //1
        resX = transform[0];
        resY = transform[1];
        retardar();
        mapa.rellenarPoligonoEscalar(resX,resY,Color.RED,Color.RED,g);

        //TRASLACION INVERSA
        transform = mapa.transladarInv(resX,resY,20,5); //2
        resX = transform[0];
        resY = transform[1];
        retardar();
        mapa.rellenarPoligonoEscalar(resX,resY,Color.BLUE,Color.BLUE,g);

        //TRASLACION Y ESCALACION
        transform = mapa.escalarPuntoFijo(resX,resY,-7,5,2,2);
        resX = transform[0];
        resY = transform[1];
        retardar();
        mapa.rellenarPoligonoEscalar(resX,resY,Color.GREEN,Color.GREEN,g);  //TRASLACION Y ESCALACION EN BASE AL ORIGEN

        //ESCALACION INVERSA
        transform = mapa.escalarInv(resX,resY,2f,2f);   //5 ESCALO EN LAS MISMAS COORDENADAS QUE EL ANTERIOR
        resX = transform[0];
        resY = transform[1];
        retardar();
        mapa.rellenarPoligonoEscalar(resX,resY,Color.ORANGE,Color.ORANGE,g);    //ESCALACION INVERSA

        //ESCALACION PUNTO FIJO
        transform = mapa.escalarPuntoFijo(resX,resY,0,-5,3,3); //6
        resX = transform[0];
        resY = transform[1];
        retardar();
        mapa.rellenarPoligonoEscalar(resX,resY,Color.MAGENTA,Color.MAGENTA,g);  //ESCALACION PUNTO FIJO

        //ROTACION SIMPLE
        transform = mapa.rotar(resX,resY,70);   //7
        resX = transform[0];
        resY = transform[1];
        retardar();
        mapa.rellenarPoligonoEscalar(resX,resY,Color.GRAY,Color.GRAY,g);

        //ROTACION INVERSA
        transform = mapa.rotarInv(resX,resY,10);
        resX = transform[0];
        resY = transform[1];
        retardar();
        mapa.rellenarPoligonoEscalar(resX,resY,Color.YELLOW,Color.RED,g);

        //ROTACION EN BASE A UN PUNTO FIJO
        transform = mapa.rotarPuntoFijo(resX,resY,5,7,180);
        resX = transform[0];
        resY = transform[1];
        retardar();
        mapa.rellenarPoligonoEscalar(resX,resY,Color.PINK,Color.MAGENTA,g);

        //REFLEJO EN X
        transform = mapa.reflejoX(resX,resY);
        resX = transform[0];
        resY = transform[1];
        retardar();
        mapa.rellenarPoligonoEscalar(resX,resY,new Color(255, 176, 106),new Color(255, 65, 65),g);

        //REFLEJO EN Y
        transform = mapa.reflejoY(resX,resY);
        resX = transform[0];
        resY = transform[1];
        retardar();
        mapa.rellenarPoligonoEscalar(resX,resY,new Color(170, 199, 3),new Color(17, 142, 59),g);

        //RECORTE X ref Y
        transform = mapa.recorteDeXsobreY(resX,resY,-2f,-8);
        resX = transform[0];
        resY = transform[1];
        retardar();
        mapa.rellenarPoligonoEscalar(resX,resY,new Color(10, 255, 149), new Color(0, 70, 106, 255),g);

        retardar();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        primerFrame(g);
    }
}
