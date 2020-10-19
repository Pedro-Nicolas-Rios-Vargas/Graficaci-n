/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 6
Fecha: 26/Septiembre/2020
 */

//last-update: 4/10/2020

package graficos;

import java.awt.Graphics;

import static graficos.Linea.*;

public class Polilinea {
    /**
     * Metodo que permite dibujar una serie de lineas continuas por medio de sus vertices.
     * <br>
     * El final de una linea es el comienzo de otra. Asi la primera linea que esta formada por
     * los puntos P1 y P2 sera la base para la siguiente linea que iniciara en P2 y termina en
     * P3 y asi sucesivamente.
     *
     * @param x Conjunto de coordenadas x para los vertices.
     * @param y Conjunto de coordenadas y para los vertices.
     * @param g Objeto grafico del invocador.
     */
    public static void dibujarPolilinea(int x[], int y[], Graphics g){
        for(int i=0;i < x.length-1;i++){
            dibujarLinea(x[i],y[i],x[i+1],y[i+1],g);
        }
    }

    /**
     * Metodo que permite dibujar una serie de lineas continuas de un cierto grosor
     * por medio de sus vertices.
     * <br>
     * El final de una linea es el comienzo de otra. Asi la primera linea que esta formada por
     * los puntos P1 y P2 sera la base para la siguiente linea que iniciara en P2 y termina en
     * P3 y asi sucesivamente.
     *
     * @param x Conjunto de coordenadas x para los vertices.
     * @param y Conjunto de coordenadas y para los vertices.
     * @param grosor    grosor del pixel (x,y) = (grosor,grosor)
     * @param g Objeto grafico del invocador.
     */
    public static void dibujarPolilinea(int x[], int y[], int grosor, Graphics g){
        for(int i=0;i < x.length-1;i++){
            dibujarLinea(x[i],y[i],x[i+1],y[i+1],grosor,g);
        }
    }

    /**
     * Metodo que permite dibujar una serie de lineas continuas de un cierto grosor
     * por medio de sus vertices.
     * <br>
     * El final de una linea es el comienzo de otra. Asi la primera linea que esta formada por
     * los puntos P1 y P2 sera la base para la siguiente linea que iniciara en P2 y termina en
     * P3 y asi sucesivamente.
     *
     * @param x Conjunto de coordenadas x para los vertices.
     * @param y Conjunto de coordenadas y para los vertices.
     * @param grosor    grosor del pixel (x,y) = (grosor,grosor)
     * @param escalar escala deseada a generar de las lineas de la polilinea.
     * @param g Objeto grafico del invocador.
     */
    public static void dibujarPolilinea(int x[], int y[], int grosor, int escalar, Graphics g){
        for(int i=0;i < x.length-1;i++){
            dibujarLinea(x[i],y[i],x[i+1],y[i+1],grosor,escalar,g);
        }
    }

    /**
     * Metodo que permite dibujar un poligono en base a lineas continuas unidas por sus vertices.
     * <br>
     * El primer punto del poligono es el ultimo. Por lo tanto no se necesita ingresar todos los puntos
     * solo se debe ingresar el penultimo punto y el mismo metodo se encarga de conectar este
     * ultimo punto con el punto inicial.
     * @param x Conjunto de coordenadas x para los vertices.
     * @param y Conjunto de coordenadas y para los vertices.
     * @param g Objeto grafico del invocador.
     */
    public static void dibujarPoligono(int x[], int y[], Graphics g){
        for(int i=0;i < x.length-1;i++){
            dibujarLinea(x[i],y[i],x[i+1],y[i+1],g);
        }
        dibujarLinea(x[x.length-1], y[y.length-1],x[0], y[0],g);
    }

    /**
     * Metodo que permite dibujar un poligono en base a lineas continuas unidas de un cierto grosor
     * por sus vertices.
     * <br>
     * El primer punto del poligono es el ultimo. Por lo tanto no se necesita ingresar todos los puntos
     * solo se debe ingresar el penultimo punto y el mismo metodo se encarga de conectar este
     * ultimo punto con el punto inicial.
     * @param x Conjunto de coordenadas x para los vertices.
     * @param y Conjunto de coordenadas y para los vertices.
     * @param grosor    grosor del pixel (x,y) = (grosor,grosor)
     * @param g Objeto grafico del invocador.
     */
    public static void dibujarPoligono(int x[], int y[], int grosor, Graphics g){
        for(int i=0;i < x.length-1;i++){
            dibujarLinea(x[i],y[i],x[i+1],y[i+1],grosor,g);
        }
        dibujarLinea(x[x.length-1], y[y.length-1],x[0], y[0],grosor,g);
    }

    /**
     * Metodo que permite dibujar un poligono en base a lineas continuas unidas de un cierto grosor
     * por sus vertices.
     * <br>
     * El primer punto del poligono es el ultimo. Por lo tanto no se necesita ingresar todos los puntos
     * solo se debe ingresar el penultimo punto y el mismo metodo se encarga de conectar este
     * ultimo punto con el punto inicial.
     * @param x Conjunto de coordenadas x para los vertices.
     * @param y Conjunto de coordenadas y para los vertices.
     * @param grosor    grosor del pixel (x,y) = (grosor,grosor)
     * @param escalar escala deseada a generar de las lineas de la polilinea.
     * @param g Objeto grafico del invocador.
     */
    public static void dibujarPoligono(int x[], int y[], int grosor, int escalar, Graphics g){
        for(int i=0;i < x.length-1;i++){
            dibujarLinea(x[i],y[i],x[i+1],y[i+1],grosor,escalar,g);
        }
        dibujarLinea(x[x.length-1], y[y.length-1],x[0], y[0],grosor,escalar,g);
    }


}
