/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 12
Fecha: 3/Noviembre/2020
 */
package practicas.pract12;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;


import javax.swing.JFrame;



public class FuentePropia extends JFrame {
    private static Font f;

    public void fuente() {
        try{
            f = Font.createFont(Font.TRUETYPE_FONT,getClass().getResource("JeroglificosDePedro-Regular.ttf").openStream());
            GraphicsEnvironment genv = GraphicsEnvironment.getLocalGraphicsEnvironment();
            genv.registerFont(f);
            f = f.deriveFont(32f);
        }catch(IOException|FontFormatException ffE){}
    }

    public FuentePropia() {
        fuente();
        setVisible(true);
        setSize(800,400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void paint(Graphics g) {
        g.setFont(f);
        g.drawString("Al fin termine la tarea",200,200);
        g.drawString("Tengo sueño xd",200,300);
    }

    public static void main(String[] args) {
        new FuentePropia();
    }
}
