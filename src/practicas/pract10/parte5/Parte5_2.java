/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 10
Fecha: 30/Octubre/2020
 */
package practicas.pract10.parte5;

import java.awt.Graphics;
import java.awt.Color;

import practicas.pract8.PanelBase;

public class Parte5_2 extends PanelBase{

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
    public Parte5_2(boolean metodo) {
        super(metodo);
    }

    public void segundoFrame(Graphics g) {
        int[][] transform;
        int[] resX;
        int[] resY;

        //ORIGINAL
        retardar();
        mapa.rellenarPoligonoEscalar(X,Y,Color.BLACK,Color.BLACK,g);

        //RECORTE DE X SOBRE Y
        transform = mapa.recorteDeXsobreY(X,Y,-2.5f,5);
        resX = transform[0];
        resY = transform[1];
        retardar();
        mapa.rellenarPoligonoEscalar(resX,resY,Color.YELLOW,Color.RED,g);

        //REFLEJO ORIGEN
        transform = mapa.reflejoOrigen(resX,resY);
        resX = transform[0];
        resY= transform[1];
        retardar();
        mapa.rellenarPoligonoEscalar(resX,resY,Color.PINK,Color.BLACK,g);

        //REFLEJO SOBRE X
        transform = mapa.reflejoX(resX,resY);
        resX = transform[0];
        resY = transform[1];
        retardar();
        mapa.rellenarPoligonoEscalar(resX,resY,Color.GREEN,Color.DARK_GRAY,g);

        //ROTACION 180
        transform = mapa.rotar(resX,resY,180);
        resX = transform[0];
        resY = transform[1];
        retardar();
        mapa.rellenarPoligonoEscalar(resX,resY,Color.RED,Color.CYAN,g);

        //ROTAR EN BASE A PUNTO FIJO
        transform = mapa.rotarPuntoFijo(resX,resY,10,-5,160);
        resX = transform[0];
        resY = transform[1];
        retardar();
        mapa.rellenarPoligonoEscalar(resX,resY,Color.ORANGE,Color.BLUE,g);

        //TRASLACION INVERSA
        transform = mapa.transladarInv(resX,resY,0,-22);
        resX = transform[0];
        resY = transform[1];
        retardar();
        mapa.rellenarPoligonoEscalar(resX,resY,Color.CYAN,Color.MAGENTA,g);

        //RECORTE Y SOBRE X
        transform = mapa.recorteDeYsobreX(resX,resY,-0.5f,10);
        resX = transform[0];
        resY = transform[1];
        retardar();
        mapa.rellenarPoligonoEscalar(resX,resY,new Color(255, 71, 71),new Color(78, 182, 0),g);

        //ESCALACION EN BASE A UN PUNTO
        transform = mapa.escalarPuntoFijo(resX,resY,1,1,2,2);
        resX = transform[0];
        resY = transform[1];
        retardar();
        mapa.rellenarPoligonoEscalar(resX,resY,new Color(0, 125, 180), new Color(120, 0, 0),g);

        //REFLEJO SOBRE Y
        transform = mapa.reflejoY(resX,resY);
        resX = transform[0];
        resY = transform[1];
        retardar();
        mapa.rellenarPoligonoEscalar(resX,resY,new Color(255, 88, 0),new Color(48, 175, 0),g);
        retardar();
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        segundoFrame(g);

    }
}
