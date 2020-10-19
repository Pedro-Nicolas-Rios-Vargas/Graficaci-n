/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 8
Fecha: 8/Octubre/2020
 */
package practicas.pract8;

import java.awt.event.ComponentListener;
import java.awt.event.ComponentEvent;
import javax.swing.JFrame;

public class FramePractica8 extends JFrame implements ComponentListener{

    public static int WIDTH = 1015;
    public static int HEIGHT = 639;

    private PanelBase mapaCartesiano;

    public FramePractica8(PanelBase panel, String title) {
        setTitle(title);
        mapaCartesiano = panel;

        setSize(WIDTH,HEIGHT);
        add(mapaCartesiano);
        addComponentListener(this);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void componentResized(ComponentEvent e) {
        int width = this.getWidth();
        int height = this.getHeight();

        this.WIDTH = width;
        this.HEIGHT = height;
        mapaCartesiano.actualizarTamanhos();
        repaint();
    }

    @Override
    public void componentMoved(ComponentEvent e) {

    }

    @Override
    public void componentShown(ComponentEvent e) {

    }

    @Override
    public void componentHidden(ComponentEvent e) {

    }
}
