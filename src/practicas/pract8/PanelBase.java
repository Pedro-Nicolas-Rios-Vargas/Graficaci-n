/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 8
Fecha: 12/Octubre/2020
 */

package practicas.pract8;

import java.awt.Graphics;

import javax.swing.JPanel;

import graficos.cartesiano.Algoritmico.FigurasCartesianasAlgoritmos;
import graficos.cartesiano.MapaCartesiano;

public class PanelBase extends JPanel{

    private int panelWidth;
    private int panelHeight;

    protected MapaCartesiano mapa;

    public PanelBase(){
        mapa = new FigurasCartesianasAlgoritmos();
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
