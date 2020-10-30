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

    //private final int[] X = {1,3,5};
    //private final int[] Y = {1,6,1};
    private final int[] X = {2,3,1,1,12,12,5};
    private final int[] Y = {1,2,2,8,8,2,2};

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
    public Parte1(boolean metodo) {
        super(metodo);
    }

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
        mapa.reflejarPoligonoSobreOrigen(X, Y,g);   //REFLEXION DE PLANOS OPUESTOS
        g.setColor(Color.MAGENTA);
        mapa.reflejarPoligonoYigualX(X, Y,g);  //REFLEXION ENTRE EJES
        g.setColor(Color.ORANGE);
        mapa.reflejarPoligonoYigualMenosX(X, Y,g);  //REFLEXION DE POLIGONOS ENTRE PLANOS
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        parte1(g);

    }
}
