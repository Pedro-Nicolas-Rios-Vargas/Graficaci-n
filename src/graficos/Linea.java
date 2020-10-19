/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 4
Fecha: 22/Septiembre/2020
 */

//last-update: 4/10/2020

package graficos;

import java.awt.Graphics;
import java.awt.Color;

public class Linea extends Pixel {
    /**
     * Dibuja una linea desde el punto (x1,y1) hasta el punto (x2,y2).
     * @param x1    coordenada x del punto 1
     * @param y1    coordenada y del punto 1
     * @param x2    coordenada x del punto 2
     * @param y2    coordenada y del punto 2
     * @param g Objeto grafico del invocador
     */
    public static void dibujarLinea(int x1, int y1, int x2, int y2, Graphics g){
        int x,y,dY, dX, incYi, incXi, incYr, incXr,k,avR,av,avI;

        dY = (y2-y1);
        dX = (x2-x1);

        if(dY>=0){
            incYi = 1;
        }else{
            dY=-dY;
            incYi = -1;
        }

        if(dX >= 0){
            incXi = 1;
        }else{
            dX = -dX;
            incXi = -1;
        }

        if(dX >= dY){
            incYr = 0;
            incXr = incXi;
        }else{
            incXr = 0;
            incYr = incYi;

            k = dX; dX = dY; dY = k;
        }

        x = x1; y = y1;
        avR = 2 * dY;   //c1
        av = avR - dX;  //p
        avI = av - dX;  //c2

        do{
            dibujarPixel(x,y,g);
            if(av >= 0){
                x = x + incXi;
                y = y + incYi;
                av = av + avI;
            }else{
                x = x + incXr;
                y = y + incYr;
                av = av + avR;
            }
        }while(x!=x2 || y!=y2);
    }

    /**
     * Dibuja una linea de un color especifico desde el punto (x1,y1) hasta el punto (x2,y2).
     * @param x1    coordenada x del punto 1
     * @param y1    coordenada y del punto 1
     * @param x2    coordenada x del punto 2
     * @param y2    coordenada y del punto 2
     * @param color Color de la linea
     * @param g Objeto grafico del invocador
     */
    public static void dibujarLinea(int x1,int y1, int x2, int y2, Color color, Graphics g){
        int x,y,dY, dX, incYi, incXi, incYr, incXr,k,avR,av,avI;

        dY = (y2-y1);
        dX = (x2-x1);

        if(dY>=0){
            incYi = 1;
        }else{
            dY=-dY;
            incYi = -1;
        }

        if(dX >= 0){
            incXi = 1;
        }else{
            dX = -dX;
            incXi = -1;
        }

        if(dX >= dY){
            incYr = 0;
            incXr = incXi;
        }else{
            incXr = 0;
            incYr = incYi;

            k = dX; dX = dY; dY = k;
        }

        x = x1; y = y1;
        avR = 2 * dY;   //c1
        av = avR - dX;  //p
        avI = av - dX;  //c2

        do{
            dibujarPixel(x,y,color,g);
            if(av >= 0){
                x = x + incXi;
                y = y + incYi;
                av = av + avI;
            }else{
                x = x + incXr;
                y = y + incYr;
                av = av + avR;
            }
        }while(x!=x2 || y!=y2);
    }

    /**
     * Dibuja una linea de un grosor especifico desde el punto (x1,y1) hasta el punto (x2,y2)
     * @param x1    coordenada x del punto 1
     * @param y1    coordenada y del punto 1
     * @param x2    coordenada x del punto 2
     * @param y2    coordenada y del punto 2
     * @param grosor    grosor del pixel (x,y) = (grosor,grosor)
     * @param g Objeto grafico del invocador
     */
    public static void dibujarLinea(int x1, int y1, int x2, int y2, int grosor, Graphics g){
        int x,y,dY, dX, incYi, incXi, incYr, incXr,k,avR,av,avI;

        dY = (y2-y1);
        dX = (x2-x1);

        if(dY>=0){
            incYi = 1;
        }else{
            dY=-dY;
            incYi = -1;
        }

        if(dX >= 0){
            incXi = 1;
        }else{
            dX = -dX;
            incXi = -1;
        }

        if(dX >= dY){
            incYr = 0;
            incXr = incXi;
        }else{
            incXr = 0;
            incYr = incYi;

            k = dX; dX = dY; dY = k;
        }

        x = x1; y = y1;
        avR = 2 * dY;   //c1
        av = avR - dX;  //p
        avI = av - dX;  //c2

        do{
            dibujarPixel(x,y,grosor,g);
            if(av >= 0){
                x = x + incXi;
                y = y + incYi;
                av = av + avI;
            }else{
                x = x + incXr;
                y = y + incYr;
                av = av + avR;
            }
        }while(x!=x2 || y!=y2);
    }

    /**
     * Dibuja una linea de un grosor especifico desde el punto (x1,y1) hasta el punto (x2,y2)
     * @param x1    coordenada x del punto 1
     * @param y1    coordenada y del punto 1
     * @param x2    coordenada x del punto 2
     * @param y2    coordenada y del punto 2
     * @param grosor    grosor del pixel (x,y) = (grosor,grosor)
     * @param escalar   escala de la linea indicada
     * @param g Objeto grafico del invocador
     */
    public static void dibujarLinea(int x1, int y1, int x2, int y2, int grosor, int escalar, Graphics g){
        x1 *= escalar;
        y1 *= escalar;
        x2 *= escalar;
        y2 *= escalar;
        grosor *= escalar;

        int x,y,dY, dX, incYi, incXi, incYr, incXr,k,avR,av,avI;

        dY = (y2-y1);
        dX = (x2-x1);

        if(dY>=0){
            incYi = 1;
        }else{
            dY=-dY;
            incYi = -1;
        }

        if(dX >= 0){
            incXi = 1;
        }else{
            dX = -dX;
            incXi = -1;
        }

        if(dX >= dY){
            incYr = 0;
            incXr = incXi;
        }else{
            incXr = 0;
            incYr = incYi;

            k = dX; dX = dY; dY = k;
        }

        x = x1; y = y1;
        avR = 2 * dY;   //c1
        av = avR - dX;  //p
        avI = av - dX;  //c2

        do{
            dibujarPixel(x,y,grosor,g);
            if(av >= 0){
                x = x + incXi;
                y = y + incYi;
                av = av + avI;
            }else{
                x = x + incXr;
                y = y + incYr;
                av = av + avR;
            }
        }while(x!=x2 || y!=y2);
    }

    /**
     * Dibuja una linea de un color y grosor especifico desde el punto (x1,y1) hasta el punto (x2,y2)
     * @param x1    coordenada x del punto 1
     * @param y1    coordenada y del punto 1
     * @param x2    coordenada x del punto 2
     * @param y2    coordenada y del punto 2
     * @param color Color de la linea
     * @param grosor    grosor del pixel (x,y) = (grosor,grosor)
     * @param g Objeto grafico del invocador
     */
    public static void dibujarLinea(int x1, int y1, int x2, int y2, Color color, int grosor, Graphics g){
        int x,y,dY, dX, incYi, incXi, incYr, incXr,k,avR,av,avI;

        dY = (y2-y1);
        dX = (x2-x1);

        if(dY>=0){
            incYi = 1;
        }else{
            dY=-dY;
            incYi = -1;
        }

        if(dX >= 0){
            incXi = 1;
        }else{
            dX = -dX;
            incXi = -1;
        }

        if(dX >= dY){
            incYr = 0;
            incXr = incXi;
        }else{
            incXr = 0;
            incYr = incYi;

            k = dX; dX = dY; dY = k;
        }

        x = x1; y = y1;
        avR = 2 * dY;   //c1
        av = avR - dX;  //p
        avI = av - dX;  //c2

        do{
            dibujarPixel(x,y,color,grosor,g);
            if(av >= 0){
                x = x + incXi;
                y = y + incYi;
                av = av + avI;
            }else{
                x = x + incXr;
                y = y + incYr;
                av = av + avR;
            }
        }while(x!=x2 || y!=y2);
    }
}
