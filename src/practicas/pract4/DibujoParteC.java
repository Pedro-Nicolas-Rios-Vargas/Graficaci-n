/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 4
Fecha: 22/Septiembre/2020
 */

package practicas.pract4;

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

import static graficos.Linea.dibujarLinea;

public class DibujoParteC extends JFrame {

    public DibujoParteC(){
        setTitle("Parte c");
        setSize(800,700);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    /**
     * Se encarga de dibujar las lineas que conforman las siglas ITCG con los metodos de la clase Linea
     * @param g Objeto grafico del invocador.
     */
    private void itcgSiglas(Graphics g){
        int grosor = 3;
        //ESTRUCTURA DE I
        dibujarLinea(15,45,40,45,grosor,g);     //I SUPERIOR
        dibujarLinea(15,110,40,110,grosor,g);   //I INFERIOR
        dibujarLinea(28,45,28,110,grosor,g);    //I VERTICAL
        //ESTRUCTURA DE T
        dibujarLinea(50,45,75,45,grosor,g);     //T HORIZONTAL
        dibujarLinea(63,45,63,110,grosor,g);    //T VERTICAL
        //ESTRUCTURA DE C
        dibujarLinea(85,45,110,45,grosor,g);    //C SUPERIOR
        dibujarLinea(85,110,110,110,grosor,g);  //C INFERIOR
        dibujarLinea(85,45,85,110,grosor,g);    //C VERTICAL
        //ESTRUCTURA DE G
        dibujarLinea(120,45,145,45,grosor,g);   //G SUPERIOR
        dibujarLinea(120,110,145,110,grosor,g); //G INFERIOR
        dibujarLinea(138,77,145,77,grosor,g);   //G CORTO
        dibujarLinea(120,45,120,110,grosor,g);  //G VERTICAL LARGO
        dibujarLinea(145,78,145,110,grosor,g);  //G VERTICAL CORTO
    }

    /**
     * Se encarga de dibujar las lineas que conforman las siglas ITCG con el metodo drawLine de la clase Graphics
     * @param g Objeto grafico del invocador
     */
    private void itcgSiglasGraphics(Graphics g){
        g.setColor(Color.RED);
        //ESTRUCTURA DE I
        g.drawLine(15,45,40,45);     //I SUPERIOR
        g.drawLine(15,110,40,110);   //I INFERIOR
        g.drawLine(28,45,28,110);    //I VERTICAL
        //ESTRUCTURA DE T
        g.drawLine(50,45,75,45);     //T HORIZONTAL
        g.drawLine(63,45,63,110);    //T VERTICAL
        //ESTRUCTURA DE C
        g.drawLine(85,45,110,45);    //C SUPERIOR
        g.drawLine(85,110,110,110);  //C INFERIOR
        g.drawLine(85,45,85,110);    //C VERTICAL
        //ESTRUCTURA DE G
        g.drawLine(120,45,145,45);   //G SUPERIOR
        g.drawLine(120,110,145,110); //G INFERIOR
        g.drawLine(138,77,145,77);   //G CORTO
        g.drawLine(120,45,120,110);  //G VERTICAL LARGO
        g.drawLine(145,78,145,110);  //G VERTICAL CORTO
    }

    /**
     * Se encarga de dibujar las lineas que conforman a un cuadrado partido en 16 partes con los metodos de la clase Linea
     * @param g Objeto grafico del invocador
     */
    private void cuadradoRayado(Graphics g){
        //PERIMETRO
        dibujarLinea(220,45,285,45,g);      //HORIZONTAL SUPERIOR
        dibujarLinea(220,110,285,110,g);    //HORIZONTAL INFERIOR
        dibujarLinea(220,45,220,110,g);     //VERTICAL IZQUIERDA
        dibujarLinea(285,45,285,110,g);     //VERTICAL DERECHA

        //INTERIOR
        dibujarLinea(220,78,285,78,g);      //HORIZONTAL
        dibujarLinea(253,45,253,110,g);     //VERTICAL
        dibujarLinea(220,45,285,110,g);     //45° PENDIENTE NEGATIVA
        dibujarLinea(220,110,285,45,g);     //45° PENDIENTE POSITIVA
        dibujarLinea(236,45,269,110,g);     //22.5° PENDIENTE NEGATIVA
        dibujarLinea(236,110,269,45,g);
        dibujarLinea(220,61,285,94,g);      //
        dibujarLinea(220,94,285,61,g);

    }

    /**
     * Se encarga de dibujar las lineas que conforman a un cuadrado partido en 16 partes con el metodo drawLine de la clase Graphics
     * @param g Objeto grafico del invocador
     */
    private void cuadroRayadoGraphics(Graphics g){
        //PERIMETRO
        g.drawLine(220,45,285,45);      //HORIZONTAL SUPERIOR
        g.drawLine(220,110,285,110);    //HORIZONTAL INFERIOR
        g.drawLine(220,45,220,110);     //VERTICAL IZQUIERDA
        g.drawLine(285,45,285,110);     //VERTICAL DERECHA

        //INTERIOR
        g.drawLine(220,78,285,78);      //HORIZONTAL
        g.drawLine(253,45,253,110);     //VERTICAL
        g.drawLine(220,45,285,110);     //45° PENDIENTE NEGATIVA
        g.drawLine(220,110,285,45);     //45° PENDIENTE POSITIVA
        g.drawLine(236,45,269,110);     //22.5° PENDIENTE NEGATIVA
        g.drawLine(236,110,269,45);
        g.drawLine(220,61,285,94);      //
        g.drawLine(220,94,285,61);
    }

    /**
     * Se encarga de dibujar las lineas que conforman a la funcion escalonada con los metodos de la clase Linea
     * @param g Objeto grafico del invocador
     */
    private void funcionEscalonada(Graphics g){
        dibujarLinea(400,105,425,105,g);    //ESCALON 1 HORIZONTAL
        dibujarLinea(425,55,425,105,g);     //ESCALON 1 VERTICAL
        dibujarLinea(425,55,450,55,g);      //ESCALON 2 HORIZONTAL
        dibujarLinea(450,55,450,105,g);     //ESCALON 2 VERTICAL
        dibujarLinea(450,105,475,105,g);    //ESCALON 3 HORIZONTAL
        dibujarLinea(475,55,475,105,g);     //ESCALON 3 VERTICAL
        dibujarLinea(475,55,500,55,g);      //ESCALON 4 HORIZONTAL
    }

    /**
     * Se encarga de dibujar las lineas que conforman a la funcion escalonada con el metodo drawLine de la clase Graphics
     * @param g Objeto grafico del invocador
     */
    private void funcionEScalonadaGraphics(Graphics g){
        g.drawLine(400,105,425,105);    //ESCALON 1 HORIZONTAL
        g.drawLine(425,55,425,105);     //ESCALON 1 VERTICAL
        g.drawLine(425,55,450,55);      //ESCALON 2 HORIZONTAL
        g.drawLine(450,55,450,105);     //ESCALON 2 VERTICAL
        g.drawLine(450,105,475,105);    //ESCALON 3 HORIZONTAL
        g.drawLine(475,55,475,105);     //ESCALON 3 VERTICAL
        g.drawLine(475,55,500,55);      //ESCALON 4 HORIZONTAL
    }

    /**
     * Se encarga de dibujar las lineas que conforman a la casa con los metodos de la clase Linea
     * @param g Objeto grafico del invocador
     */
    private void casa(Graphics g){
        //TECHO
        int fillHeight = 0;

        while(fillHeight<=25){
            dibujarLinea(550,75,576,75-fillHeight,g);
            dibujarLinea(600,75,574,50+fillHeight,g);
            fillHeight++;
        }
        dibujarLinea(550,75,575,50,g);  //DIAGONAL ASCENDENTE
        dibujarLinea(575,50,600,75,g);  //DIAGONAL DESCENDIENTE

        //PARED-CUADRADO
        dibujarLinea(550,75,600,75,g);      //LINEA SUPERIOR
        dibujarLinea(550,140,600,140,g);    //LINEA INFERIOR
        dibujarLinea(550,75,550,140,g);     //LINEA IZQUIERDA
        dibujarLinea(600,75,600,140,g);     //LINEA DERECHA

        //VENTANA
        dibujarLinea(555,106,570,106,g);    //MARCO SUPERIOR
        dibujarLinea(555,116,571,116,g);    //MARCO INFERIOR
        dibujarLinea(555,106,555,116,g);    //MARCO IZQUIERDO
        dibujarLinea(570,106,570,116,g);    //MARCO DERECHO
        dibujarLinea(555,111,570,111,g);    //MARCO INTERIOR HORIZONTAL
        dibujarLinea(562,106,562,116,g);    //MARCO INTERIOR VERTICAL

        //PUERTA NEGRA
        dibujarLinea(580,106,595,106,g);    //MARCO SUPERIOR
        dibujarLinea(580,136,595,136,g);    //MARCO INFERIOR
        dibujarLinea(580,106,580,136,g);    //MARCO IZQUIERDO
        dibujarLinea(595,106,595,136,g);    //MARCO DERECHA

        //MANIJA
        dibujarLinea(589,121,592,121,g);    //MANIJA SUPERIOR
        dibujarLinea(589,124,592,124,g);    //MANIJA INFERIOR
        dibujarLinea(589,121,589,124,g);    //MANIJA IZQUIERDA
        dibujarLinea(592,121,592,124,g);    //MANIJA DERECHA

    }

    /**
     * Se encarga de dibujar las lineas que conforman a la casa con el metodo drawLine de la clase Graphics
     * @param g Objeto grafico del invocador
     */
    private void casaGraphics(Graphics g){
        //TECHO
        int fillHeight = 0;

        while(fillHeight<=25){
            g.drawLine(550,75,576,75-fillHeight);
            g.drawLine(600,75,574,50+fillHeight);
            fillHeight++;
        }
        g.drawLine(550,75,575,50);  //DIAGONAL ASCENDENTE
        g.drawLine(575,50,600,75);  //DIAGONAL DESCENDIENTE

        //PARED-CUADRADO
        g.drawLine(550,75,600,75);      //LINEA SUPERIOR
        g.drawLine(550,140,600,140);    //LINEA INFERIOR
        g.drawLine(550,75,550,140);     //LINEA IZQUIERDA
        g.drawLine(600,75,600,140);     //LINEA DERECHA

        //VENTANA
        g.drawLine(555,106,570,106);    //MARCO SUPERIOR
        g.drawLine(555,116,571,116);    //MARCO INFERIOR
        g.drawLine(555,106,555,116);    //MARCO IZQUIERDO
        g.drawLine(570,106,570,116);    //MARCO DERECHO
        g.drawLine(555,111,570,111);    //MARCO INTERIOR HORIZONTAL
        g.drawLine(562,106,562,116);    //MARCO INTERIOR VERTICAL

        //PUERTA NEGRA
        g.drawLine(580,106,595,106);    //MARCO SUPERIOR
        g.drawLine(580,136,595,136);    //MARCO INFERIOR
        g.drawLine(580,106,580,136);    //MARCO IZQUIERDO
        g.drawLine(595,106,595,136);    //MARCO DERECHA

        //MANIJA
        g.drawLine(589,121,592,121);    //MANIJA SUPERIOR
        g.drawLine(589,124,592,124);    //MANIJA INFERIOR
        g.drawLine(589,121,589,124);    //MANIJA IZQUIERDA
        g.drawLine(592,121,592,124);    //MANIJA DERECHA

    }

    /**
     * Carga en la ventana los dibujos realizados con los metodos de la clase Linea
     * @param g Objeto grafico del invocador
     */
    private void parte2(Graphics g){
        itcgSiglas(g);
        cuadradoRayado(g);
        funcionEscalonada(g);
        casa(g);
    }

    /**
     * Carga en la ventana los dibujos realizados con el metodo drawLine de la clase Graphics
     * @param g Objeto grafico del invocador
     */
    private void parte3(Graphics g){
        itcgSiglasGraphics(g);
        cuadroRayadoGraphics(g);
        funcionEScalonadaGraphics(g);
        casaGraphics(g);
    }

    @Override
    public void paint(Graphics g){
        //Parte 2
        parte2(g);
        //Parte 3
        parte3(g);
    }
}
