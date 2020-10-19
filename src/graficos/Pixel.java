/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 4
Fecha: 22/Septiembre/2020
 */

package graficos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
public class Pixel{

    /**
     * Dibuja un pixel en las coordenadas indicadas.
     * @param x coordenada x
     * @param y coordenada y
     * @param g Objeto grafico del invocador
     */
    public static void dibujarPixel(int x, int y, Graphics g){
        g.fillRect(x,y,1,1);
    }

    /**
     * Dibuja un pixel de un color especifico en las coordenadas indicadas.
     * @param x coordenada x
     * @param y coordenada y
     * @param c color del pixel
     * @param g Objeto grafico del invocador
     */
    public static void dibujarPixel(int x, int y, Color c, Graphics g){
        g.setColor(c);
        g.fillRect(x,y,1,1);
    }

    /**
     * Dibuja un pixel de un grosor especifico en las coordenadas indicadas.
     * @param x coordenada x
     * @param y coordenada y
     * @param grosor    grosor del pixel (x,y) = (grosor,grosor)
     * @param g Objeto grafico del invocador
     */
    public static void dibujarPixel(int x, int y, int grosor, Graphics g){
        g.fillRect(x,y,1*grosor,1*grosor);
    }

    /**
     * Dibuja un pixel de un grosor y color especifico en las coordenadas indicadas.
     * @param x coordenada x
     * @param y coordenada y
     * @param c color del pixel
     * @param grosor grosor del pixel (x,y) = (grosor, grosor)
     * @param g Objeto grafico del invocador
     */
    public static void dibujarPixel(int x, int y, Color c, int grosor, Graphics g){
        g.setColor(c);
        g.fillRect(x,y,1*grosor,1*grosor);
    }

}
