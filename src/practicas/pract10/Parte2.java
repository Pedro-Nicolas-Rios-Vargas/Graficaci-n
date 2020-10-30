/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 10
Fecha: 30/Octubre/2020
 */
package practicas.pract10;

import java.awt.Graphics;
import java.awt.Color;

import practicas.pract8.PanelBase;

public class Parte2 extends PanelBase {

    private final int[] X = {4,8,12};
    private final int[] Y = {4,12,4};

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
    public Parte2(boolean metodo) {
        super(metodo);
    }

    public void retardar(){
        try{
            Thread.sleep(500);
        }catch(Exception e) { e.printStackTrace(); }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        retardar();
        mapa.rellenarPoligonoEscalar(X,Y,Color.BLACK,Color.BLACK,g);    //FIGURA ORIGINAL
        retardar();
        mapa.rellenarPoligonoEscalar(X,Y,10,5,Color.WHITE,Color.GREEN,g);               //TRASLACION
        retardar();
        mapa.rellenarPoligonoEscalarInv(X,Y,10,5,Color.GRAY,Color.BLACK,g);             //TRASLACION INVERSA
        retardar();
        mapa.rellenarPoligonoEscalar(X,Y,2f,2f,5,30,Color.RED,Color.BLUE,g);     //ESCALACIONES
        retardar();
        mapa.rellenarPoligonoEscalar(X,Y,2f,2f,30,5,Color.ORANGE,Color.BLUE,g);  //ESCALACION EN BASE A UN PUNTO
        retardar();
        mapa.rellenarPoligonoEscalarInv(X,Y,4f,4f,Color.BLUE,Color.PINK,g);             //ESCALACION INVERSA
        retardar();
        mapa.rellenarPoligonoRotado(X,Y,45,Color.GREEN,Color.MAGENTA,g);                 //ROTACION
        retardar();
        mapa.rellenarPoligonoRotado(X,Y,120,-10,-10,Color.YELLOW,Color.RED,g);    //ROTACION BASADA EN UN PUNTO DE ROTACION
        retardar();
        mapa.rellenarPoligonoRotadoInv(X,Y,45,Color.MAGENTA,Color.CYAN,g);               //ROTACION INVERSA

    }
}
