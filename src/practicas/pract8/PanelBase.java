/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 10
Fecha: 30/Octubre/2020
 */

package practicas.pract8;

import java.awt.Graphics;

import java.awt.Panel;

import graficos.cartesiano.Algoritmico.FigurasCartesianasAlgoritmos;
import graficos.cartesiano.Vectorial.FigurasCartesianasVectores;

import graficos.cartesiano.MapaCartesiano;

/**
 * La clase <code>PanelBase</code> es la clase padre de todos los paneles de actividades
 * a efectuar en base a mapa cartesianos.
 *
 * @author Pedro Nicolas Rios Vargas
 */
public class PanelBase extends Panel {

    private int panelWidth;
    private int panelHeight;

    protected MapaCartesiano mapa;

    /**
     * Unico constructor de la clase PanelBase el cual solicita un valor booleano para
     * elegir la metodologia a utilzar para realizar los dibujos graficos.
     * <br><br>
     * Si es <b>true</b> se utilizara el metodo de vectores, de lo contrario
     * si es <b>false</b> se utilizara el metodo de algoritmos.
     * @param metodo    Valor booleano que permite seleccionar que tipo de metodo utilizar:
     *                  si <b>true</b> vectorial de lo contrario si <b>false</b> algoritmos.
     */
    public PanelBase(boolean metodo){
        if(metodo) {
            mapa = new FigurasCartesianasVectores();
        }else{
            mapa = new FigurasCartesianasAlgoritmos();
        }
        actualizarTamanhos();
    }

    /**
     * Este metodo actualiza los tamaños de todos los componentes que forman parte de este
     * panel.
     */
    public void actualizarTamanhos() {
        actualizarDimensiones();
        mapa.actualizarAxis(panelWidth, panelHeight);
        //setPreferredSize(new Dimension(WIDTH, HEIGHT));
        repaint();
    }

    /**
     * Actualiza las variables que definen el tamaño del panel con respecto al frame principal.
     */
    private void actualizarDimensiones() {
        panelWidth = FramePractica8.frameWidth - 15;
        panelHeight = FramePractica8.frameHeight - 39;
    }

    public void paint(Graphics g){
        super.paint(g);
        mapa.mapaCartesiano(g);
    }
}
