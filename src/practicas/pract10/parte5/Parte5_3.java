/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 10
Fecha: 30/Octubre/2020
 */
package practicas.pract10.parte5;

import java.awt.Graphics;
import java.awt.Color;

import practicas.pract8.PanelBase;

public class Parte5_3 extends PanelBase {

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
    public Parte5_3(boolean metodo) {
        super(metodo);
    }

    public void tercerFrame(Graphics g) {
        int[][] transform;
        int[] resX;
        int[] resY;

        //POLIGONO ORIGINAL
        retardar();
        mapa.rellenarPoligonoEscalar(X,Y,Color.BLACK,Color.BLACK,g);

        //ESCALAR EN BASE A UN PUNTO
        transform = mapa.escalarPuntoFijo(X,Y,-10,-2,2,2);
        resX = transform[0];
        resY = transform[1];
        retardar();
        mapa.rellenarPoligonoEscalar(resX,resY,Color.CYAN,Color.RED,g);

        //REFLEJAR SOBRE Y
        transform = mapa.reflejoY(resX,resY);
        resX = transform[0];
        resY = transform[1];
        retardar();
        mapa.rellenarPoligonoEscalar(resX,resY,Color.YELLOW,Color.BLACK,g);

        //RECORTAR
        transform = mapa.recorteDeXsobreY(resX,resY,1.5f,-5);
        resX = transform[0];
        resY = transform[1];
        retardar();
        mapa.rellenarPoligonoEscalar(resX,resY,Color.GREEN,Color.BLUE,g);

        //ROTAR
        transform = mapa.rotarInv(resX,resY,300);
        resX = transform[0];
        resY = transform[1];
        retardar();
        mapa.rellenarPoligonoEscalar(resX,resY,Color.RED,Color.BLUE,g);

        //ESCALACION INVERSA
        transform = mapa.escalarInv(resX,resY,4f,1);
        resX = transform[0];
        resY = transform[1];
        retardar();
        mapa.rellenarPoligonoEscalar(resX,resY,new Color(215, 86, 0),new Color(0, 21, 149),g);

        //REFLEJO EN EL ORIGEN
        transform = mapa.reflejoOrigen(resX,resY);
        resX = transform[0];
        resY = transform[1];
        retardar();
        mapa.rellenarPoligonoEscalar(resX,resY,new Color(52, 186, 132),new Color(0, 99, 50),g);

        retardar();
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        tercerFrame(g);
    }
}
