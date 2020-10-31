/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 10
Fecha: 30/Octubre/2020
 */
package practicas.pract10;

import java.awt.Graphics;
import java.awt.Color;

import practicas.pract8.PanelBase;

public class Parte4 extends PanelBase {

    private final int[] X_REFLEX = {1,3,5};
    private final int[] Y_REFLEX = {1,6,1};
    /*
    private final int[] X_RECORTE = {3,1,3,6,8,6};
    private final int[] Y_RECORTE = {1,4,7,7,4,1};
    */
    private final int[] X_RECORTE = {6,6,10,10};
    private final int[] Y_RECORTE = {1,5,5,1};
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
    public Parte4(boolean metodo) {
        super(metodo);
    }

    /**
     * Metodo que dibuja los diferentes tipos de reflexion
     * @param g Objeto grafico del invocador
     */
    public void parte4Reflex(Graphics g) {
        retardar();
        mapa.rellenarPoligonoEscalar(X_REFLEX, Y_REFLEX,Color.BLACK,Color.BLACK,g);  //ORIGINAL
        retardar();
        mapa.rellenarReflejoPoligonoSobreX(X_REFLEX, Y_REFLEX,Color.RED,Color.BLUE,g);   //REFLEXION SOBRE EJE X
        retardar();
        mapa.rellenarReflejoPoligonoSobreY(X_REFLEX, Y_REFLEX,Color.BLUE,Color.BLUE,g);   //REFLEXION SOBRE EJE Y
        retardar();
        mapa.rellenarReflejoPoligonoSobreOrigen(X_REFLEX, Y_REFLEX,Color.GREEN,Color.GREEN,g);   //REFLEXION DE PLANOS OPUESTOS
        retardar();
        mapa.rellenarReflejoPoligonoYigualX(X_REFLEX, Y_REFLEX,Color.MAGENTA,Color.MAGENTA,g);  //REFLEXION ENTRE EJES
        retardar();
        mapa.rellenarReflejoPoligonoYigualMenosX(X_REFLEX, Y_REFLEX,Color.ORANGE,Color.ORANGE,g);  //REFLEXION DE POLIGONOS ENTRE PLANOS
        retardar();

    }

    public void parte4Corte(Graphics g) {
        float shX = 0.5f;
        float shY = 0.5f;
        int refX = -1;
        int refY = -2;

        retardar();
        mapa.rellenarPoligonoEscalar(X_RECORTE,Y_RECORTE,Color.BLACK,Color.BLACK,g);    //POLIGONO BASE
        retardar();
        mapa.rellenarRecortePoligonoDeXSobreX(X_RECORTE,Y_RECORTE,shX,Color.RED,Color.RED,g); //Recorte de x en relacion con el eje x.
        retardar();
        mapa.rellenarRecortePoligonoDeXSobreY(X_RECORTE,Y_RECORTE,shX,refY,Color.BLUE,Color.BLUE,g); //Recorte de x en relacion con el eje y.
        retardar();
        mapa.rellenarRecortePoligonoDeYSobreY(X_RECORTE,Y_RECORTE,shY,new Color(24,118,0),new Color(24,118,0),g);  //Recorte de y en relacion al eje y.
        retardar();
        mapa.rellenarRecortePoligonoDeYSobreX(X_RECORTE,Y_RECORTE,shY,refX,new Color(255,132,0), new Color(255,132,0),g); //Recorte de y en relacion al eje x.
        retardar();

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        parte4Reflex(g);
        parte4Corte(g);
    }
}
