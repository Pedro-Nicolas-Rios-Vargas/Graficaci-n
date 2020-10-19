/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 7
Fecha: 4/Octubre/2020
 */
package practicas.pract7;

import java.io.File;
import java.io.IOException;

import java.awt.*;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import static graficos.Linea.*;
import static graficos.Polilinea.*;
import static graficos.Circunferencia.circunferenciaRemarcada;

public class Dibujo extends JPanel{

    private static final int ESCALAR = 2;

    public static final int WIDTH = 279 * ESCALAR;
    public static final int HEIGHT = 181 * ESCALAR;



    public Dibujo(){
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
    }

    /***
     * Metodo encargado de llamar a dibujar cada seccion del dibujo.
     * @param g Objeto grafico del invocador.
     */
    public void drawQuetzalcoatl(Graphics g){

        g.setColor(Color.WHITE);
        cara(g);
        dientes(g);
        plumas(g);
        escamas(g);
    }

    /***
     * Metodo encargado de dibujar el contorno y ojo del dibujo.
     * @param g Objeto grafico del invocador.
     */
    public void cara(Graphics g){
        //CONTORNO DE LA CARA
        int[] cabezaX = {0,0,8,161,186,192,168,98,84,18,15,0,0,6,95,132,159,166,159,8};

        int[] cabezaY = {139,162,166,166,122,66,20,26,32,45,64,77,91,94,94,108,108,121,135,135};

        dibujarPoligono(cabezaX,cabezaY,3, ESCALAR,g);

        circunferenciaRemarcada(99, 58, 20, ESCALAR, g);
    }

    /***
     * Metodo encargado de dibujar los dientes del dibujo.
     * @param g Objeto grafico del invocador.
     */
    public void dientes(Graphics g){
        int[] dientesX = {11,29,46,64,82,99,117,135,153,162};

        int[] dientesY = {135,96,136,96,136,97,136,110,136,115};

        dibujarPolilinea(dientesX,dientesY, 2, ESCALAR,g);

        dibujarLinea(8,94,8,133,3, ESCALAR,g);

    }

    /***
     * Metodo encargado de dibujar las "plumas" de la cabeza del dibujo.
     * @param g Objeto grafico del invocador.
     */
    public void plumas(Graphics g){
        int[] plumasX =  {162,188,232,215,191,224,274,232,195,228,245,194,170};

        int[] plumasY = {166,178,178,145,123,123,97,69,66,39,1,3,19};

        int grosor = 2;

        dibujarPolilinea(plumasX,plumasY,3,ESCALAR,g);

        //PLIEGUES
        int[] plieguesP1P3X = {215,189,188,191,188,194,194,230,227};
        int[] plieguesP1P3Y = {146,178,123,123,123,66,4,38,3};

        int[] plieguesP2X = {194,206,233,250};
        int[] plieguesP2Y = {66,124,72,111};

        dibujarPolilinea(plieguesP1P3X,plieguesP1P3Y,grosor,ESCALAR, g);
        dibujarPolilinea(plieguesP2X,plieguesP2Y,grosor,ESCALAR,g);
    }

    /***
     * Metodo encargado de dibujar las "escamas" de la cara del dibujo.
     * @param g Objeto grafico del invocador.
     */
    public void escamas(Graphics g){

        int grosor = 2;
        //MANDIBULA
        dibujarLinea(3,139,19,166,grosor,ESCALAR,g);

        dibujarLinea(17,159,35,138,grosor,ESCALAR,g);
        dibujarLinea(35,138,58,154,grosor,ESCALAR,g);
        dibujarLinea(58,154,17,159,grosor,ESCALAR,g);

        dibujarLinea(43,165,88,136,grosor,ESCALAR,g);
        dibujarLinea(88,136,102,166,grosor,ESCALAR,g);

        dibujarLinea(97,154,126,147,grosor,ESCALAR,g);

        dibujarLinea(125,136,130,167,grosor,ESCALAR,g);
        dibujarLinea(130,167,150,138,grosor,ESCALAR,g);
        dibujarLinea(150,138,161,163,grosor,ESCALAR,g);

        dibujarLinea(163,115,185,123,grosor,ESCALAR,g);

        dibujarLinea(189,94,116,64,grosor,ESCALAR,g);

        dibujarLinea(192,67,155,80,grosor,ESCALAR,g);
        dibujarLinea(155,80,164,22,grosor,ESCALAR,g);
        dibujarLinea(155,80,133,34,grosor,ESCALAR,g);

        dibujarLinea(146,24,115,46,grosor,ESCALAR,g);

        dibujarLinea(171,88,116,102,grosor,ESCALAR,g);
        dibujarLinea(116,102,111,73,grosor,ESCALAR,g);

        dibujarLinea(73,94,87,74,grosor,ESCALAR,g);

        dibujarLinea(85,33,88,39,grosor,ESCALAR,g);

        dibujarLinea(48,94,78,60,grosor,ESCALAR,g);
        dibujarLinea(16,66,79,60,grosor,ESCALAR,g);

        dibujarLinea(3,92,62,77,grosor,ESCALAR,g);

        dibujarLinea(10,72,22,87,grosor,ESCALAR,g);
        dibujarLinea(40,82,46,63,grosor,ESCALAR,g);

        dibujarLinea(21,46,60,61,grosor,ESCALAR,g);
        dibujarLinea(62,61,64,38,grosor,ESCALAR,g);
        dibujarLinea(63,51,82,46,grosor,ESCALAR,g);

    }

    @Override
    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0,0,WIDTH,HEIGHT);
        drawQuetzalcoatl(g);
    }

    /***
     * Metodo encargado de la generacion y guardado de la imagen en formato jpg
     * @throws IOException Lanzara un error de tipo IO si la imagen no puede generarse.
     */
    public void generarImagen() throws IOException {
        BufferedImage bI = new BufferedImage(WIDTH,HEIGHT, BufferedImage.TYPE_INT_RGB);
        Graphics g = bI.createGraphics();
        drawQuetzalcoatl(g);
        g.dispose();
        ImageIO.write(bI, "jpg",new File("..//Quetzalcoatl.jpg"));
    }
}
