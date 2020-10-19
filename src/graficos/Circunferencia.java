/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 5
Fecha: 24/Septiembre/2020
 */

//last-update: 4/10/2020

package graficos;

import static graficos.Linea.dibujarLinea;

import static graficos.Pixel.dibujarPixel;
import java.awt.Graphics;

public class Circunferencia {
    /**
     * Dibuja el perimetro del circulo indicado con deficit de puntos cerca del eje x.
     * @param xC    centro del circulo en la coordenada x.
     * @param yC    centro del circulo en la coordenada y.
     * @param r     radio del circulo (pixeles).
     * @param g     Objeto grafico del invocador.
     */
    public static void circuloGeneral(int xC, int yC, int r, Graphics g){
        int x;
        double y1, y2;

        for(x=xC-r;x<=xC+r;x+=2){
            y1=yC + Math.sqrt(Math.pow(r,2) - Math.pow(x-xC,2));
            y2=yC - Math.sqrt(Math.pow(r,2) - Math.pow(x-xC,2));
            dibujarPixel(x,(int) y1,5,g);
            dibujarPixel(x, (int) y2,5,g);
        }
    }

    /**
     * Dibuja el perimetro del circulo indicado con buena calidad.
     * @param xC    centro del circulo en la coordenada x.
     * @param yC    centro del circulo en la coordenada y.
     * @param r     radio del circulo (pixeles).
     * @param g     Objeto grafico del invocador.
     */
    public static void circuloIncremental(int xC, int yC, int r, Graphics g){
        int tX, tY;
        double dt, cc, ss, x, y, aux;
        dt = 1d/r;
        cc = Math.cos(dt);
        ss = Math.sin(dt);
        x = 0;    y = r;
        while(y>=Math.abs(x)){
            tX = (int) x;
            tY = (int) y;
            dibujarPixel(xC + tX, yC + tY, g);  //P1
            dibujarPixel(xC - tX, yC + tY, g);  //P4
            dibujarPixel(xC + tX, yC - tY, g);  //P8
            dibujarPixel(xC - tX, yC - tY, g);  //P5
            dibujarPixel(xC + tY, yC + tX, g);  //P2
            dibujarPixel(xC + tY, yC - tX, g);  //P3
            dibujarPixel(xC - tY, yC + tX, g);  //P7
            dibujarPixel(xC - tY, yC - tX, g);  //P6
            aux = x;
            x = x * cc - y * ss;
            y = y * cc + aux * ss;
        }
    }

    /**
     * Dibuja el perimetro del circulo indicado de forma eficiente y de buena calidad.
     * @param xC    centro del circulo en la coordenada x.
     * @param yC    centro del circulo en la coordenada y.
     * @param r     radio del circulo (pixeles).
     * @param g     Objeto grafico del invocador.
     */
    public static void  circuloBresenham(int xC, int yC, int r, Graphics g){
        int p,x,y;
        x = 0;  y = r;  p = 3 - 2 * r;
        while(x <= y){


            dibujarPixel(xC + x, yC + y, g);  //P1
            dibujarPixel(xC - x, yC + y, g);  //P4
            dibujarPixel(xC + x, yC - y, g);  //P8
            dibujarPixel(xC - x, yC - y, g);  //P5

            dibujarPixel(xC + y, yC + x, g);  //P2
            dibujarPixel(xC + y, yC - x, g);  //P3
            dibujarPixel(xC - y, yC + x, g);  //P7
            dibujarPixel(xC - y, yC - x, g);  //P6


            /*
            * Dibujan lineas en angulo pero entre mas cerca esten del centro mas separadas las
            * lineas entre si.
            * */
            //dibujarLinea(xC+x,yC+y,xC+y,yC+x,g);    //P1-P2
            //dibujarLinea(xC-x,yC+y,xC+y,yC-x,g);    //P4-P3
            //dibujarLinea(xC+x,yC-y,xC-y,yC+x,g);    //P8-P7
            //dibujarLinea(xC-x,yC-y,xC-y,yC-x,g);    //P5-P6


            //Dibuja un contorno del circulo
            //dibujarLinea(xC + x, yC + y,xC + y, yC - x,g);    //P1-P3
            //dibujarLinea(xC + y, yC + x,xC - x, yC + y,g);    //P2-P4
            //dibujarLinea(xC - x, yC - y,xC - y, yC + x,g);    //P5-P7
            //dibujarLinea(xC - y, yC - x,xC + x, yC - y,g);    //P6-P8

            //dibujarLinea(xC + y, yC - x,xC - x, yC - y,g);   //P3-P5
            //dibujarLinea(xC - x, yC + y,xC - y, yC - x,g);   //P4-P6
            //dibujarLinea(xC + x, yC + y,xC - y, yC + x,g);   //P1-P7
            //dibujarLinea(xC + y, yC + x,xC + x, yC - y,g);   //P2-P8

            /*
            //Estas cuadro lineas permiten rellenar un circulo
            dibujarLinea(xC+x,yC+y,xC+x,yC-y,g);    //P1-P8
            dibujarLinea(xC+y,yC+x,xC-y,yC+x,g);    //P2-P7
            dibujarLinea(xC+y,yC-x,xC-y,yC-x,g);    //P3-P6
            dibujarLinea(xC-x,yC+y,xC-x,yC-y,g);    //P4-P5
            */
            if(p<0){
                p = p + 4 * x + 6;
            }else{
                p = p + 4 * (x - y) + 10;
                y = y - 1;
            }
            x = x + 1;
        }
    }

    /**
     * Dibuja el circulo relleno indicado de forma eficiente y de buena calidad. Utiliza el algoritmo de Bresenham.
     * <br><br>
     * El circulo es rellenado a base de lineas que parten de los puntos inversos por ejemplo P1-P8, P2-P7, etc.
     * @param xC    centro del circulo en la coordenada x.
     * @param yC    centro del circulo en la coordenada y.
     * @param r     radio del circulo (pixeles).
     * @param g     Objeto grafico del invocador.
     */
    public static void rellenarCirculo(int xC, int yC, int r, Graphics g){
        int p,x,y;
        x = 0;  y = r;  p = 3 - 2 * r;
        while(x <= y){

            //Estas cuatro lineas permiten rellenar un circulo
            dibujarLinea(xC+x,yC+y,xC+x,yC-y,g);    //P1-P8
            dibujarLinea(xC+y,yC+x,xC-y,yC+x,g);    //P2-P7
            dibujarLinea(xC+y,yC-x,xC-y,yC-x,g);    //P3-P6
            dibujarLinea(xC-x,yC+y,xC-x,yC-y,g);    //P4-P5

            if(p<0){
                p = p + 4 * x + 6;
            }else{
                p = p + 4 * (x - y) + 10;
                y = y - 1;
            }
            x = x + 1;
        }
    }
    /**
     * Dibuja un perimetro ancho del circulo indicado de forma eficiente y de buena calidad.
     * Utiliza el algoritmo de Bresenham.
     * <br><br>
     * El perimetro es dibujado a base de lineas que parten de los puntos impares-pares por ejemplo P1-P3, P2-P4, etc.
     * @param xC    centro del circulo en la coordenada x.
     * @param yC    centro del circulo en la coordenada y.
     * @param r     radio del circulo (pixeles).
     * @param g     Objeto grafico del invocador.
     */
    public static void circunferenciaRemarcada(int xC, int yC, int r, Graphics g){
        int p,x,y;
        x = 0;    y = r;  p = 3 - 2 * r;
        while(x<=y){
            //dibuja el perimetro del circulo remarcado
            dibujarLinea(xC + x, yC + y,xC + y, yC - x,g);    //P1-P3
            dibujarLinea(xC + y, yC + x,xC - x, yC + y,g);    //P2-P4
            dibujarLinea(xC - x, yC - y,xC - y, yC + x,g);    //P5-P7
            dibujarLinea(xC - y, yC - x,xC + x, yC - y,g);    //P6-P8

            dibujarLinea(xC + y, yC - x,xC - x, yC - y,g);   //P3-P5
            dibujarLinea(xC - x, yC + y,xC - y, yC - x,g);   //P4-P6
            dibujarLinea(xC + x, yC + y,xC - y, yC + x,g);   //P1-P7
            dibujarLinea(xC + y, yC + x,xC + x, yC - y,g);   //P2-P8

            if(p<0){
                p = p + 4 * x + 6;
            }else{
                p = p + 4 * (x - y) + 10;
                y = y - 1;
            }
            x = x + 1;
        }
    }

    /**
     * Dibuja un perimetro ancho del circulo indicado de forma eficiente y de buena calidad a cualquier escala
     * de las coordenadas indicadas.
     * Utiliza el algoritmo de Bresenham.
     * <br><br>
     * El perimetro es dibujado a base de lineas que parten de los puntos impares-pares por ejemplo P1-P3, P2-P4, etc.
     * @param xC    centro del circulo en la coordenada x.
     * @param yC    centro del circulo en la coordenada y.
     * @param r     radio del circulo (pixeles).
     * @param escalar escala del circulo indicado.
     * @param g     Objeto grafico del invocador.
     */
    public static void circunferenciaRemarcada(int xC, int yC, int r, int escalar, Graphics g){
        xC *= escalar;
        yC *= escalar;
        r *= escalar;

        int p,x,y;
        x = 0;    y = r;  p = 3 - 2 * r;
        while(x<=y){
            //dibuja el perimetro del circulo remarcado
            dibujarLinea(xC + x, yC + y,xC + y, yC - x,g);    //P1-P3
            dibujarLinea(xC + y, yC + x,xC - x, yC + y,g);    //P2-P4
            dibujarLinea(xC - x, yC - y,xC - y, yC + x,g);    //P5-P7
            dibujarLinea(xC - y, yC - x,xC + x, yC - y,g);    //P6-P8

            dibujarLinea(xC + y, yC - x,xC - x, yC - y,g);   //P3-P5
            dibujarLinea(xC - x, yC + y,xC - y, yC - x,g);   //P4-P6
            dibujarLinea(xC + x, yC + y,xC - y, yC + x,g);   //P1-P7
            dibujarLinea(xC + y, yC + x,xC + x, yC - y,g);   //P2-P8

            if(p<0){
                p = p + 4 * x + 6;
            }else{
                p = p + 4 * (x - y) + 10;
                y = y - 1;
            }
            x = x + 1;
        }
    }
}
