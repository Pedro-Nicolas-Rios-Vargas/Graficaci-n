/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 8
Fecha: 12/Octubre/2020
 */

package practicas.pract8.partes;

import java.awt.Graphics;
import java.awt.Color;

import practicas.pract8.PanelBase;

public class Parte2_5 extends PanelBase{

    private final int[] X = {-4,4,0,-4,4,0};
    private final int[] Y = {4,4,0,-4,-4,0};

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
    public Parte2_5(boolean metodo) {
        super(metodo);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int[][] res;
        //BASE
        mapa.rellenarPoligonoEscalar(X,Y,Color.BLACK,Color.BLACK,g);

        g.setColor(Color.RED);
    //A
        res = mapa.escalar(X,Y,2f,2f);
        mapa.poligonoEscalar(res[0],res[1],g);
    //B
        res = mapa.rotar(res[0],res[1],45);
        mapa.poligonoEscalar(res[0],res[1],g);
    //C
        res = mapa.escalar(res[0],res[1],1f,0.5f);
        mapa.poligonoEscalar(res[0],res[1],g);
    //D
        res = mapa.transladar(res[0],res[1],5,-3);
        mapa.poligonoEscalar(res[0],res[1],g);
    //E
        res = mapa.rotar(res[0],res[1],90);
        mapa.poligonoEscalar(res[0],res[1],g);
    //F
        res = mapa.escalar(res[0],res[1],1.5f,1f);
        mapa.poligonoEscalar(res[0],res[1],g);

        g.setColor(Color.BLUE);
    //G
        res = mapa.transladar(res[0],res[1],2,4);
        mapa.poligonoEscalar(res[0],res[1],g);
    }
}
