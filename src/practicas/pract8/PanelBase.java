/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 8
Fecha: 12/Octubre/2020
 */

package practicas.pract8;

import java.awt.Graphics;

import javax.swing.JPanel;

import graficos.cartesiano.MapaCartesiano;

public class PanelBase extends JPanel{

    private int WIDTH;
    private int HEIGHT;

    protected MapaCartesiano mapa;

    public PanelBase(){
        mapa = new MapaCartesiano();
        actualizarTamanhos();
    }

    /**
     * Este metodo actualiza los tamaños de todos los componentes que forman parte de este
     * panel.
     */
    public void actualizarTamanhos() {
        actualizarDimensiones();
        mapa.actualizarAxis(WIDTH,HEIGHT);
        //setPreferredSize(new Dimension(WIDTH, HEIGHT));
        repaint();
    }

    /**
     * Actualiza las variables que definen el tamaño del panel con respecto al frame principal.
     */
    private void actualizarDimensiones() {
        WIDTH = FramePractica8.WIDTH - 15;
        HEIGHT = FramePractica8.HEIGHT - 39;
    }

    public void paint(Graphics g){
        super.paint(g);
        mapa.mapaCartesiano(g);


    }

}
