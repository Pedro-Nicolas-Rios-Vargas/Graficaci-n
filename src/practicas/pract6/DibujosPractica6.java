/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 6
Fecha: 26/Septiembre/2020
 */
package practicas.pract6;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import static graficos.Polilinea.*;

public class DibujosPractica6 extends JFrame{

    public DibujosPractica6(){
        setTitle("Practica 6.");
        setSize(1000,700);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    /**
     * Metodo que dibuja un octagono utilizando el metodo dibujarPoligono de
     * la clase Polilinea.
     * @param g Objeto grafico del invocador.
     */
    public void octagono(Graphics g){
        int[] x = {100,150,200,200,150,100,50,50};
        int[] y = {50,50,100,150,200,200,150,100};
        dibujarPoligono(x,y,g);
    }

    /**
     * Metodo que dibuja un octagono utilizando el metodo drawPolygon de la clase Graphics
     * de java.
     * @param g Objeto grafico del invocador.
     */
    public void octagonoGraphics(Graphics g){
        int[] x = {100,150,200,200,150,100,50,50};
        int[] y = {50,50,100,150,200,200,150,100};
        g.drawPolygon(x,y,x.length);
    }

    /**
     * Metodo que dibuja una estrella utilizando el metodo dibujarPoligono de
     * la clase Polilinea.
     * @param g Objeto grafico del invocador.
     */
    public void estrella(Graphics g){
        int[] x = {250,300,325,350,400,360,375,325,275,290};
        int[] y = {100,100,50,100,100,145,200,175,200,145};
        dibujarPoligono(x,y,g);
    }

    /**
     * Metodo que dibuja una estrella utilizando el metodo drawPolygon de la clase Graphics
     * de java.
     * @param g Objeto grafico del invocador.
     */
    public void estrellaGraphics(Graphics g){
        int[] x = {250,300,325,350,400,360,375,325,275,290};
        int[] y = {100,100,50,100,100,145,200,175,200,145};
        g.drawPolygon(x,y,x.length);
    }

    /**
     * Metodo que dibuja un poligono de 16 lados utilizando el metodo dibujarPoligono de
     * la clase Polilinea.
     * @param g Objeto grafico del invocador.
     */
    public void poligono16(Graphics g){
        int[] x = {450,500,525,550,600,600,625,600,600,550,525,500,450,450,425,450};
        int[] y = {75,75,50,75,75,125,150,175,225,225,250,225,225,175,150,125};
        dibujarPoligono(x,y,g);
    }

    /**
     * Metodo que dibuja un poligono de 16 lados utilizando el metodo drawPolygon de la clase
     * Graphics de java.
     * @param g Objeto grafico del invocador.
     */
    public void poligono16Graphics(Graphics g){
        int[] x = {450,500,525,550,600,600,625,600,600,550,525,500,450,450,425,450};
        int[] y = {75,75,50,75,75,125,150,175,225,225,250,225,225,175,150,125};
        g.drawPolygon(x,y,x.length);
    }

    /**
     * Metodo que dibuja una flecha apuntando a la derecha utilizando el metodo dibujarPoligono
     * de la clase Polilinea.
     * @param g Objeto grafico del invocador.
     */
    public void flechaDerecha(Graphics g){
        int[] x = {675,775,775,825,775,775,675,685};
        int[] y = {75,75,50,100,150,125,125,100};
        dibujarPoligono(x,y,g);
    }

    /**
     * Metodo que dibuja una flecha apuntando a la derecha utilizando el metodo drawPolygon de la
     * clase Graphics de java.
     * @param g Objeto grafico del invocador.
     */
    public void flechaDerechaGraphics(Graphics g){
        int[] x = {675,775,775,825,775,775,675,685};
        int[] y = {75,75,50,100,150,125,125,100};
        g.drawPolygon(x,y,x.length);
    }

    /**
     * Metodo que dibuja una funcion escalonada utilizando el metodo dibujarPolilinea de la clase
     * Polilinea.
     * @param g Objeto grafico del invocador.
     */
    public void funcionEscalon(Graphics g){
        int[] x = {25,50,50,100,100,150,150,200,200,225};
        int[] y = {250,250,350,350,250,250,350,350,250,250};
        dibujarPolilinea(x,y,g);
    }

    /**
     * Metodo que dibuja una funcion escalonada utilizando el metodo drawPolyLine de la clase
     * Graphics de java.
     * @param g Objeto grafico del invocador.
     */
    public void funcionEscalonGraphics(Graphics g){
        int[] x = {25,50,50,100,100,150,150,200,200,225};
        int[] y = {250,250,350,350,250,250,350,350,250,250};
        g.drawPolyline(x,y,x.length);
    }

    /**
     * Metodo que dibuja un zig zag utilizando el metodo dibujarPolilinea de la clase
     * Polilinea.
     * @param g Objeto grafico del invocador.
     */
    public void zigZag(Graphics g){
        int[] x = {275,300,275,300,270,300};
        int[] y = {250,275,300,325,355,385};
        dibujarPolilinea(x,y,g);
    }

    /**
     * Metodo que dibuja un zig zag utilizando el metodo drawPolyline de la clase Graphics
     * de java.
     * @param g Objeto grafico del invocador.
     */
    public void zigZagGraphics(Graphics g){
        int[] x = {275,300,275,300,270,300};
        int[] y = {250,275,300,325,355,385};
        g.drawPolyline(x,y,x.length);
    }

    /**
     * Metodo que dibuja una cara utilizando el metodo dibujarPolilinea de la clase
     * Polilinea.
     * @param g Objeto grafico del invocador.
     */
    public void cara(Graphics g){
        //CARA
        int[] caraX = {350,325,350,400,425,400};
        int[] caraY = {250,300,350,350,300,250};
        dibujarPolilinea(caraX,caraY,g);

        //OJOS
        int[] ojoIzqX = {355,360,365};
        int[] ojoIzqY = {290,270,290};
        dibujarPolilinea(ojoIzqX, ojoIzqY,g);

        int[] ojoDerX = {385,390,395};
        int[] ojoDerY = {290,270,290};
        dibujarPolilinea(ojoDerX, ojoDerY, g);

        //NARIZ
        int[] narizX = {365,375,385};
        int[] narizY = {293,308,293};
        dibujarPolilinea(narizX, narizY, g);

        //BOCA
        int[] bocaX = {365,380,390};
        int[] bocaY = {338,328,338};
        dibujarPolilinea(bocaX, bocaY, g);
    }

    /**
     * Metodo que dibuja una cara utilizando el metodo drawPolyline de la clase Graphics
     * de java.
     * @param g Objeto grafico del invocador.
     */
    public void caraGraphics(Graphics g){
        //CARA
        int[] caraX = {350,325,350,400,425,400};
        int[] caraY = {250,300,350,350,300,250};
        g.drawPolyline(caraX, caraY, caraX.length);

        //OJOS
        int[] ojoIzqX = {355,360,365};
        int[] ojoIzqY = {290,270,290};
        g.drawPolyline(ojoIzqX, ojoIzqY,ojoIzqX.length);

        int[] ojoDerX = {385,390,395};
        int[] ojoDerY = {290,270,290};
        g.drawPolyline(ojoDerX, ojoDerY, ojoDerX.length);

        //NARIZ
        int[] narizX = {365,375,385};
        int[] narizY = {293,308,293};
        g.drawPolyline(narizX, narizY, narizX.length);

        //BOCA
        int[] bocaX = {365,380,390};
        int[] bocaY = {338,328,338};
        g.drawPolyline(bocaX, bocaY, bocaX.length);
    }

    @Override
    public void paint(Graphics g){
        octagono(g);
        estrella(g);
        poligono16(g);
        flechaDerecha(g);
        funcionEscalon(g);
        zigZag(g);
        cara(g);

        //UTILIZANDO GRAPHICS
        g.setColor(Color.RED);
        octagonoGraphics(g);
        estrellaGraphics(g);
        poligono16Graphics(g);
        flechaDerechaGraphics(g);
        funcionEscalonGraphics(g);
        zigZagGraphics(g);
        caraGraphics(g);
    }

}
