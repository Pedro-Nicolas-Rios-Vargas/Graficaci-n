/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 7
Fecha: 4/Octubre/2020
 */
package practicas.pract7;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.io.IOException;

import javax.swing.JFrame;


public class DibujoPractica7 extends JFrame{

    private final Dibujo dib;

    public DibujoPractica7(){
        setTitle("Quetzalcoatl");

        final int WIDTH = Dibujo.WIDTH + 15;
        final int HEIGHT = Dibujo.HEIGHT + 39;

        setSize(WIDTH, HEIGHT);

        dib = new Dibujo();
        add(dib);
        addWindowListener(new Listener());

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);

    }

    public class Listener extends WindowAdapter{
        @Override
        public void windowClosing(WindowEvent e) {
            super.windowClosing(e);
            try {
                dib.generarImagen();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }

}
