/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 9
Fecha: 16/Octubre/2020
 */

package graficos.cartesiano;

import java.awt.Graphics;

import java.awt.Color;

import static graficos.Linea.*;
import static graficos.Polilinea.*;
import static graficos.Circunferencia.*;

public class MapaCartesiano {
    private int WIDTH;
    private int HEIGHT;

    private int ZERO_AXIS_X;
    private int ZERO_AXIS_Y;

    private int ESCALAR_X;
    private int ESCALAR_Y;

    /**
     * Dibuja un mapa cartesiano ajustable al tamaño de la ventana.
     *
     * @param g Objeto grafico del invocador.
     */
    public void mapaCartesiano(Graphics g){
        //EJE X
        dibujarLinea(0,HEIGHT/2,WIDTH,HEIGHT/2,g);
        //EJE Y
        dibujarLinea(WIDTH/2,0,WIDTH/2,HEIGHT,g);


        for(int x=0;x<=WIDTH;x+=ESCALAR_X){
            dibujarLinea(x,ZERO_AXIS_Y-ESCALAR_Y/2,x,ZERO_AXIS_Y+ESCALAR_Y/2,g);
        }

        for(int y=0;y<=HEIGHT;y+=ESCALAR_Y){
            dibujarLinea(ZERO_AXIS_X-ESCALAR_X/2, y, ZERO_AXIS_X+ESCALAR_X/2, y,g);
        }

    }

    /**
     * Dibuja una linea simple adaptada al mapa cartesiano.
     * @param x1    Coordenada x del primer punto de la linea.
     * @param y1    Coordenada y del primer punto de la linea.
     * @param x2    Coordenada x del segundo punto de la linea.
     * @param y2    Coordenada y del segundo punto de la linea.
     * @param g Objeto grafico del invocador.
     */
    public void linea(int x1, int y1, int x2, int y2, Graphics g) {
        x1 = ZERO_AXIS_X + x1 * 10;
        y1 = ZERO_AXIS_Y - y1 * 10;
        x2 = ZERO_AXIS_X + x2 * 10;
        y2 = ZERO_AXIS_Y - y2 * 10;
        dibujarLinea(x1,y1,x2,y2,g);
    }

    /**
     * Dibuja una linea simple que se adapta al tamaño de la ventana.
     * @param x1    Coordenada x del primer punto de la linea.
     * @param y1    Coordenada y del primer punto de la linea.
     * @param x2    Coordenadas x del segundo punto de la linea.
     * @param y2    Coordenadas y del segundo punto de la linea.
     * @param g Objeto grafico del invocador.
     */
    public void lineaEscalar(int x1, int y1, int x2, int y2, Graphics g) {
        x1 = ZERO_AXIS_X + x1 * ESCALAR_X;
        y1 = ZERO_AXIS_Y - y1 * ESCALAR_Y;
        x2 = ZERO_AXIS_X + x2 * ESCALAR_X;
        y2 = ZERO_AXIS_Y - y2 * ESCALAR_Y;
        dibujarLinea(x1,y1,x2,y2,g);
    }

    /**
     * Dibuja una linea simple de un color especifico adaptada al mapa cartesiano
     * @param x1    Coordenada x del primer punto de la linea.
     * @param y1    Coordenada y del primer punto de la linea.
     * @param x2    Coordenada x del segundo punto de la linea.
     * @param y2    Coordenada y del segundo punto de la linea.
     * @param color Color de la linea.
     * @param g Objeto grafico del invocador.
     */
    public void linea(int x1, int y1, int x2, int y2, Color color,Graphics g){
        x1 = ZERO_AXIS_X + x1 * 10;
        y1 = ZERO_AXIS_Y - y1 * 10;
        x2 = ZERO_AXIS_X + x2 * 10;
        y2 = ZERO_AXIS_Y - y2 * 10;
        dibujarLinea(x1,y1,x2,y2,color,g);
    }

    /**
     * Dibuja una linea simple de un color especifico que se adapta al
     * tamaño de la ventana.
     * @param x1    Coordenada x del primer punto de la linea.
     * @param y1    Coordenada y del primer punto de la linea.
     * @param x2    Coordenadas x del segundo punto de la linea.
     * @param y2    Coordenadas y del segundo punto de la linea.
     * @param g Objeto grafico del invocador.
     */
    public void lineaEscalar(int x1, int y1, int x2, int y2, Color color, Graphics g) {
        x1 = ZERO_AXIS_X + x1 * ESCALAR_X;
        y1 = ZERO_AXIS_Y - y1 * ESCALAR_Y;
        x2 = ZERO_AXIS_X + x2 * ESCALAR_X;
        y2 = ZERO_AXIS_Y - y2 * ESCALAR_Y;
        dibujarLinea(x1,y1,x2,y2,color,g);
    }

    /**
     * Dibuja una linea de un grosor especifico adaptada al mapa cartesiano
     * @param x1    Coordenada x del primer punto de la linea.
     * @param y1    Coordenada y del primer punto de la linea.
     * @param x2    Coordenada x del segundo punto de la linea.
     * @param y2    Coordenada y del segundo punto de la linea.
     * @param grosor Grosor de la linea.
     * @param g Objeto grafico del invocador.
     */
    public void linea(int x1, int y1, int x2, int y2, int grosor, Graphics g){
        x1 = ZERO_AXIS_X + x1 * 10;
        y1 = ZERO_AXIS_Y - y1 * 10;
        x2 = ZERO_AXIS_X + x2 * 10;
        y2 = ZERO_AXIS_Y - y2 * 10;
        dibujarLinea(x1,y1,x2,y2,grosor,g);
    }

    /**
     * Dibuja una linea simple de un grosor especifico
     * que se adapta al tamaño de la ventana.
     * @param x1    Coordenada x del primer punto de la linea.
     * @param y1    Coordenada y del primer punto de la linea.
     * @param x2    Coordenadas x del segundo punto de la linea.
     * @param y2    Coordenadas y del segundo punto de la linea.
     * @param g Objeto grafico del invocador.
     */
    public void lineaEscalar(int x1, int y1, int x2, int y2, int grosor, Graphics g) {
        x1 = ZERO_AXIS_X + x1 * ESCALAR_X;
        y1 = ZERO_AXIS_Y - y1 * ESCALAR_Y;
        x2 = ZERO_AXIS_X + x2 * ESCALAR_X;
        y2 = ZERO_AXIS_Y - y2 * ESCALAR_Y;
        dibujarLinea(x1,y1,x2,y2,grosor,g);
    }

    /**
     * Dibuja una linea de un color y grosor especifico adaptada al mapa cartesiano
     * @param x1    Coordenada x del primer punto de la linea.
     * @param y1    Coordenada y del primer punto de la linea.
     * @param x2    Coordenada x del segundo punto de la linea.
     * @param y2    Coordenada y del segundo punto de la linea.
     * @param color Color de la linea.
     * @param grosor    Grosor de la linea.
     * @param g Objeto grafico del invocador.
     */
    public void linea(int x1, int y1, int x2, int y2, Color color, int grosor, Graphics g){
        x1 = ZERO_AXIS_X + x1 * 10;
        y1 = ZERO_AXIS_Y - y1 * 10;
        x2 = ZERO_AXIS_X + x2 * 10;
        y2 = ZERO_AXIS_Y - y2 * 10;
        dibujarLinea(x1,y1,x2,y2,color, grosor,g);
    }

    /**
     * Dibuja una linea simple de un color y grosor especifico que se adapta al
     * tamaño de la ventana.
     * @param x1    Coordenada x del primer punto de la linea.
     * @param y1    Coordenada y del primer punto de la linea.
     * @param x2    Coordenadas x del segundo punto de la linea.
     * @param y2    Coordenadas y del segundo punto de la linea.
     * @param color Color de la linea.
     * @param grosor    Grosor de la linea.
     * @param g Objeto grafico del invocador.
     */
    public void lineaEscalar(int x1, int y1, int x2, int y2, Color color, int grosor, Graphics g) {
        x1 = ZERO_AXIS_X + x1 * ESCALAR_X;
        y1 = ZERO_AXIS_Y - y1 * ESCALAR_Y;
        x2 = ZERO_AXIS_X + x2 * ESCALAR_X;
        y2 = ZERO_AXIS_Y - y2 * ESCALAR_Y;
        dibujarLinea(x1,y1,x2,y2,color,g);
    }

    /**
     * Dibuja un circulo adaptado al mapa cartesiano.
     * @param xC    Coordenada x del centro del circulo.
     * @param yC    Coordenada y del centro del circulo.
     * @param r Radio del circulo.
     * @param g Objeto grafico del invocador
     */
    public void circulo(int xC, int yC, int r, Graphics g) {
        xC = ZERO_AXIS_X + xC * 10;
        yC = ZERO_AXIS_Y - yC * 10;
        r = r * 10;
        circuloBresenham(xC, yC, r, g);
    }

    /**
     * Dibuja un circulo que ajusta su tamaño de acuerdo al tamaño de la
     * ventana
     * @param xC    Coordenada x del centro del circulo.
     * @param yC    Coordenada y del centro del circulo.
     * @param r Radio del circulo.
     * @param g Objeto grafico del invocador.
     */
    public void circuloEscalar(int xC, int yC, int r, Graphics g){
        xC = ZERO_AXIS_X + xC * ESCALAR_X;
        yC = ZERO_AXIS_Y - yC * ESCALAR_Y;
        r = r * ESCALAR_X;
        circuloBresenham(xC,yC,r,g);
    }

    /**
     * Dibuja un circulo relleno adaptado al mapa cartesiano.
     * @param xC    Coordenada x del centro del circulo.
     * @param yC    Coordenada y del centro del circulo.
     * @param r Radio del circulo.
     * @param g Objeto grafico del invocador.
     */
    public void circuloRelleno(int xC, int yC, int r, Graphics g){
        xC = ZERO_AXIS_X + xC * 10;
        yC = ZERO_AXIS_Y - yC * 10;
        r = r * 10;
        rellenarCirculo(xC, yC, r, g);
    }

    /**
     * Dibuja un circulo relleno que ajusta su tamaño segun el tamaño de la
     * ventana
     * @param xC    Coordenada x del centro del circulo.
     * @param yC    Coordenada y del centro del circulo.
     * @param r Radio del circulo.
     * @param g Objeto grafico del invocador.
     */
    public void circuloRellenoEscalar(int xC, int yC, int r, Graphics g){
        xC = ZERO_AXIS_X + xC * ESCALAR_X;
        yC = ZERO_AXIS_Y - yC * ESCALAR_Y;
        r = r * ESCALAR_X;
        rellenarCirculo(xC,yC,r,g);
    }

    /**
     * Dibuja una rueda adaptada al mapa cartesiano.
     * @param xC    Coordenada x del centro de la rueda.
     * @param yC    Coordenada y del centro de la rueda.
     * @param r Radio de la rueda.
     * @param g Objeto grafico del invocador.
     */
    public void rueda(int xC, int yC, int r, Graphics g){
        xC = ZERO_AXIS_X + xC * 10;
        yC = ZERO_AXIS_Y - yC * 10;
        r = r * 10;
        circunferenciaRemarcada(xC, yC, r, g);
    }

    /**
     * Dibuja una rueda que ajusta su tamaño segun el tamaño de la
     * ventana.
     * @param xC    Coordenada x del centro de la rueda.
     * @param yC    Coordenada y del centro de la rueda.
     * @param r Radio de la rueda.
     * @param g Objeto grafico del invocador.
     */
    public void ruedaEscalar(int xC, int yC, int r, Graphics g){
        xC = ZERO_AXIS_X + xC * ESCALAR_X;
        yC = ZERO_AXIS_Y - yC * ESCALAR_Y;
        r = r * ESCALAR_X;
        circunferenciaRemarcada(xC, yC, r, g);
    }


    /**
     * Metodo que permite dibujar una serie de lineas continuas por medio de sus vertices
     * adaptadas a un mapa cartesiano.
     * <br>
     * El final de una linea es el comienzo de otra. Asi la primera linea que esta formada por
     * los puntos P1 y P2 sera la base para la siguiente linea que iniciara en P2 y termina en
     * P3 y asi sucesivamente.
     *
     * @param x Conjunto de coordenadas x para los vertices.
     * @param y Conjunto de coordenadas y para los vertices.
     * @param g Objeto grafico del invocador.
     */
    public void polilinea(int[] x, int[] y, Graphics g){
        int[][] res = ajusteArreglos(x,y);
        dibujarPolilinea(res[0],res[1],g);
    }

    /**
     * Metodo que permite dibujar una serie de lineas continuas por medio de sus vertices
     * las cuales ajustan su tamaño de acuerdo al tamaño de la ventana.
     * <br>
     * El final de una linea es el comienzo de otra. Asi la primera linea que esta formada por
     * los puntos P1 y P2 sera la base para la siguiente linea que iniciara en P2 y termina en
     * P3 y asi sucesivamente.
     *
     * @param x Conjunto de coordenadas x para los vertices.
     * @param y Conjunto de coordenadas y para los vertices.
     * @param g Objeto grafico del invocador.
     */
    public void polilineaEscalar(int[] x, int[] y, Graphics g){
        int[][] res = ajusteArreglosEscalares(x,y);
        dibujarPolilinea(res[0], res[1],g);
    }

    /**
     * Metodo que permite dibujar un poligono en base a lineas continuas unidas por sus vertices
     * adaptadas a un mapa cartesiano.
     * <br>
     * El primer punto del poligono es el ultimo. Por lo tanto no se necesita ingresar todos los puntos
     * solo se debe ingresar el penultimo punto y el mismo metodo se encarga de conectar este
     * ultimo punto con el punto inicial.
     * @param x Conjunto de coordenadas x para los vertices.
     * @param y Conjunto de coordenadas y para los vertices.
     * @param g Objeto grafico del invocador.
     */
    public void poligono(int[] x, int[] y, Graphics g){
        int[][] res = ajusteArreglos(x,y);
        dibujarPoligono(res[0],res[1],g);
    }

    /**
     * Metodo que permite dibujar un poligono en base a lineas continuas unidas por sus vertices
     * las cuales ajustan su tamaño de acuerdo al tamaño de la ventana.
     * <br>
     * El primer punto del poligono es el ultimo. Por lo tanto no se necesita ingresar todos los puntos
     * solo se debe ingresar el penultimo punto y el mismo metodo se encarga de conectar este
     * ultimo punto con el punto inicial.
     * @param x Conjunto de coordenadas x para los vertices.
     * @param y Conjunto de coordenadas y para los vertices.
     * @param g Objeto grafico del invocador.
     */
    public void poligonoEscalar(int[] x, int[] y, Graphics g){
        int[][] res = ajusteArreglosEscalares(x,y);

        dibujarPoligono(res[0], res[1],g);
    }

    /**
     * Metodo que permite dibujar la escala de las coordenadas de un poligono dado.
     * @param x Conjunto de coordenadas x del poligono original.
     * @param y Conjunto de coordenadas y del poligono original.
     * @param sX    Escala de las coordenadas x.
     * @param sY    Escala de las coordenadas y.
     * @param g Objeto grafico del invocador.
     */
    public void poligonoEscalar(int[] x, int[] y, float sX, float sY, Graphics g){
        int[][] res = escalar(x,y,sX,sY);
        res = ajusteArreglosEscalares(res[0],res[1]);

        dibujarPoligono(res[0],res[1],g);
    }

    /**
     * Metodo que permite dibujar un poligono transladado x o y unidades en los ejes del mapa.
     * @param x Conjunto de coordenadas x del poligono original.
     * @param y Conjunto de coordenadas y del poligono original.
     * @param tX    Unidades de translacion en el eje x.
     * @param tY    Unidades de translacion en el eje y.
     * @param g Objeto grafico del invocador.
     */
    public void poligonoEscalar(int[] x, int[] y, int tX, int tY, Graphics g){
        int[][] res = transladar(x,y,tX,tY);
        res = ajusteArreglosEscalares(res[0],res[1]);

        dibujarPoligono(res[0], res[1],g);
    }

    /**
     * Metodo que permite dibujar un poligono transladado y escalado en base a un poligono original.
     * @param x Conjunto de coordenadas x del poligono original.
     * @param y Conjunto de coordenadas y del poligono original.
     * @param sX    Escala de la coordenadas x.
     * @param sY    Escala de la coordenada y.
     * @param tX    Unidades de translacion en el eje x.
     * @param tY    Unidades de translacion en el eje y.
     * @param g Objeto grafico del invocador.
     */
    public void poligonoEscalar(int[] x, int[] y, float sX, float sY, int tX, int tY, Graphics g){
        int[][] res = escalar(x,y,sX,sY);
        res = transladar(res[0],res[1],tX,tY);
        res = ajusteArreglosEscalares(res[0],res[1]);

        dibujarPoligono(res[0],res[1],g);
    }

    /**
     * Metodo que permite dibujar un poligono relleno en base a lineas continuas unidas por sus vertices
     * las cuales ajustan su tamaño de acuerdo al tamaño de la ventana.
     * @param x Conjunto de coordenadas x para los vertices.
     * @param y Conjunto de coordenadas y para los vertices.
     * @param relleno   Color del relleno del poligono.
     * @param borde Color del borde del poligono.
     * @param g Objeto grafico del invocador.
     */
    public void rellenarPoligonoEscalar(int[] x, int[] y, Color relleno, Color borde, Graphics g){
        int[][] res = ajusteArreglosEscalares(x,y);

        g.setColor(relleno);
        g.fillPolygon(res[0],res[1],res[0].length);
        g.setColor(borde);
        dibujarPoligono(res[0], res[1],g);
    }

    /**
     * Metodo que permite dibujar un poligono relleno en base a lineas continuas unidas por sus vertices
     * las cuales ajustan su tamaño de acuerdo al tamaño de la ventana.
     * @param x Conjunto de coordenadas x para los vertices.
     * @param y Conjunto de coordenadas y para los vertices.
     * @param sX    Escala de las coordenadas x.
     * @param sY    Escala de las coordenadas y.
     * @param relleno   Color del relleno del poligono.
     * @param borde Color del borde del poligono.
     * @param g Objeto grafico del invocador.
     */
    public void rellenarPoligonoEscalar(int[] x, int[] y, float sX, float sY,
                                        Color relleno, Color borde,Graphics g){
        int[][] res = escalar(x,y,sX,sY);
        res = ajusteArreglosEscalares(res[0],res[1]);

        g.setColor(relleno);
        g.fillPolygon(res[0],res[1],res[0].length);
        g.setColor(borde);
        dibujarPoligono(res[0],res[1],g);
    }

    /**
     * Metodo que permite dibujar un poligono relleno en base a lineas continuas unidas por sus vertices
     * las cuales ajustan su tamaño de acuerdo al tamaño de la ventana.
     * @param x Conjunto de coordenadas x para los vertices.
     * @param y Conjunto de coordenadas y para los vertices.
     * @param tX    Unidades de translacion en el eje x.
     * @param tY    Unidades de translacion en el eje y.
     * @param relleno   Color del relleno del poligono.
     * @param borde Color del borde del poligono.
     * @param g Objeto grafico del invocador.
     */
    public void rellenarPoligonoEscalar(int[] x, int[] y, int tX, int tY,
                                        Color relleno, Color borde, Graphics g){
        int[][] res = transladar(x,y,tX,tY);
        res = ajusteArreglosEscalares(res[0],res[1]);

        g.setColor(relleno);
        g.fillPolygon(res[0],res[1],res[0].length);
        g.setColor(borde);
        dibujarPoligono(res[0],res[1],g);
    }

    /**
     * Metodo que permite dibujar un poligono relleno en base a lineas continuas unidas por sus vertices
     * las cuales ajustan su tamaño de acuerdo al tamaño de la ventana.
     * @param x Conjunto de coordenadas x para los vertices.
     * @param y Conjunto de coordenadas y para los vertices.
     * @param sX    Escala de la coordenadas x.
     * @param sY    Escala de la coordenada y.
     * @param tX    Unidades de translacion en el eje x.
     * @param tY    Unidades de translacion en el eje y.
     * @param relleno   Color del relleno del poligono.
     * @param borde Color del borde del poligono.
     * @param g Objeto grafico del invocador.
     */
    public void rellenarPoligonoEscalar(int[] x, int[] y, float sX, float sY, int tX, int tY,
                                        Color relleno, Color borde, Graphics g){
        int[][] res = escalar(x,y,sX,sY);
        res = transladar(res[0],res[1],tX,tY);
        res = ajusteArreglosEscalares(res[0],res[1]);

        g.setColor(relleno);
        g.fillPolygon(res[0],res[1],res[0].length);
        g.setColor(borde);
        dibujarPoligono(res[0],res[1],g);
    }



//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬§ METODOS PARA ROTAR POLIGONOS §▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬


    /**
     * Metodo que permite dibujar la imagen de un poligono sin rotar y rotarlo en un angulo especifico
     * en base a lineas continuas unidas por sus vertices las cuales ajustan su tamaño de acuerdo al
     * tamaño de la ventana.
     * @param x Conjunto de coordenadas x del poligono original.
     * @param y Conjunto de coordenadas y del poligono original.
     * @param grados    Grados de inclinacion del poligono.
     * @param g Objeto grafico del invocador.
     */
    public void poligonoRotado(int[] x, int[] y, int grados, Graphics g){
        int[][] res = rotar(x,y,grados);
        res = ajusteArreglosEscalares(res[0],res[1]);

        dibujarPoligono(res[0],res[1],g);
    }

    /**
     * Metodo que permite dibujar la imagen de un poligono la cual se va a transladar en "x" y "y" y
     * rotarlo en un angulo especifico en base a lineas continuas unidas por sus vertices las cuales
     * ajustan su tamaño de acuerdo al tamaño de la ventana.
     * @param x Conjunto de coordenadas x del poligono original.
     * @param y Conjunto de coordenadas y del poligono original.
     * @param grados    Grados de inclinacion del poligono.
     * @param tX    Unidades de translacion en el eje x.
     * @param tY    Unidades de translacion en el eje y.
     * @param g Objeto grafico del invocador.
     */
    public void poligonoRotado(int[] x, int[] y, int grados, int tX, int tY, Graphics g){
        int[][] res = rotar(x,y,grados);
        res = transladar(res[0],res[1],tX,tY);
        res = ajusteArreglosEscalares(res[0],res[1]);

        dibujarPoligono(res[0],res[1],g);
    }

    /**
     * Metodo que permite dibujar la imagen de un poligono la cual se va a escalar y rotar en un angulo
     * especifico en base a lineas continuas unidas por sus vertices las cuales ajustan su tamaño de
     * acuerdo al tamaño de la ventana.
     * @param x Conjunto de coordenadas x del poligono original.
     * @param y Conjunto de coordenadas y del poligono original.
     * @param grados    Grados de inclinacion del poligono.
     * @param sX    Escala de las coordenadas x.
     * @param sY    Escala de las coordenadas y.
     * @param g Objeto grafico del invocador.
     */
    public void poligonoRotado(int[] x, int[] y, int grados, float sX, float sY, Graphics g){
        int[][] res = escalar(x,y,sX,sY);
        res = rotar(res[0],res[1],grados);
        res = ajusteArreglosEscalares(res[0],res[1]);

        g.fillPolygon(res[0],res[1],res[0].length);
        dibujarPoligono(res[0],res[1],g);
    }

    /**
     * Metodo que permite dibujar una iamgen de un poligono la cual se va a escalar, rotar y transladar
     * en base a lineas continuas unuidas por sus vertices las cuales ajustan su tamaño de acuerdo al
     * tamaño de la ventana.
     * @param x Conjunto de coordenadas x del poligono original.
     * @param y Conjunto de coordenadas y del poligono original.
     * @param grados    Grados de inclinacion del poligono
     * @param tX    Unidades de translacion en el eje x.
     * @param tY    Unidades de translacion en el eje y.
     * @param sX    Escala de las coordenadas x.
     * @param sY    Escala de las coordenadas y.
     * @param g Objeto grafico del invocador.
     */
    public void poligonoRotado(int[] x, int[] y, int grados, int tX, int tY, int sX, int sY, Graphics g){
        int[][] res = escalar(x,y,sX,sY);
        res = rotar(res[0],res[1],grados);
        res = transladar(res[0],res[1],tX,tY);
        res = ajusteArreglosEscalares(res[0],res[1]);

        dibujarPoligono(res[0],res[1],g);
    }

    /**
     * Metodo que permite dibujar la imagen de un poligono sin rotar y rotarlo en un angulo especifico,
     * relleno en base a lineas continuas unidas por sus vertices
     * las cuales ajustan su tamaño de acuerdo al tamaño de la ventana.
     * @param x Conjunto de coordenadas x para los vertices.
     * @param y Conjunto de coordenadas y para los vertices.
     * @param grados    Grados de inclinacion del poligono.
     * @param relleno   Color del relleno del poligono.
     * @param borde Color del borde del poligono.
     * @param g Objeto grafico del invocador.
     */
    public void rellenarPoligonoRotado(int[] x, int[] y, int grados, Color relleno, Color borde, Graphics g){
        int[][] res = rotar(x,y,grados);
        res = ajusteArreglosEscalares(res[0],res[1]);

        g.setColor(relleno);
        g.fillPolygon(res[0],res[1],res[0].length);
        g.setColor(borde);
        dibujarPoligono(res[0],res[1],g);
    }

    /**
     * Metodo que permite dibujar la imagen de un poligono sin rotar y rotarlo en un angulo especifico,
     * relleno en base a lineas continuas unidas por sus vertices
     * las cuales ajustan su tamaño de acuerdo al tamaño de la ventana.
     * @param x Conjunto de coordenadas x para los vertices.
     * @param y Conjunto de coordenadas y para los vertices.
     * @param grados    Grados de inclinacion del poligono.
     * @param tX    Unidades de translacion en el eje x.
     * @param tY    Unidades de translacion en el eje y.
     * @param relleno   Color del relleno del poligono.
     * @param borde Color del borde del poligono.
     * @param g Objeto grafico del invocador.
     */
    public void rellenarPoligonoRotado(int[] x, int[] y, int grados, int tX, int tY,
                                       Color relleno, Color borde, Graphics g){
        int[][] res = rotar(x,y,grados);
        res = transladar(res[0],res[1],tX,tY);
        res = ajusteArreglosEscalares(res[0],res[1]);

        g.setColor(relleno);
        g.fillPolygon(res[0],res[1],res[0].length);
        g.setColor(borde);
        dibujarPoligono(res[0],res[1],g);
    }

    /**
     * Metodo que permite dibujar la imagen de un poligono sin rotar y rotarlo en un angulo especifico,
     * relleno en base a lineas continuas unidas por sus vertices
     * las cuales ajustan su tamaño de acuerdo al tamaño de la ventana.
     * @param x Conjunto de coordenadas x para los vertices.
     * @param y Conjunto de coordenadas y para los vertices.
     * @param grados    Grados de inclinacion del poligono.
     * @param sX    Escala de las coordenadas x.
     * @param sY    Escala de las coordenadas y.
     * @param relleno   Color del relleno del poligono.
     * @param borde Color del borde del poligono.
     * @param g Objeto grafico del invocador.
     */
    public void rellenarPoligonoRotado(int[] x, int[] y, int grados, float sX, float sY,
                                       Color relleno, Color borde, Graphics g){
        int[][] res = escalar(x,y,sX,sY);
        res = rotar(res[0],res[1],grados);
        res = ajusteArreglosEscalares(res[0],res[1]);

        g.setColor(relleno);
        g.fillPolygon(res[0],res[1],res[0].length);
        g.setColor(borde);
        dibujarPoligono(res[0],res[1],g);
    }

    /**
     * Metodo que permite dibujar una iamgen de un poligono la cual se va a escalar, rotar y transladar
     * en base a lineas continuas unuidas por sus vertices las cuales ajustan su tamaño de acuerdo al
     * tamaño de la ventana.
     * @param x Conjunto de coordenadas x del poligono original.
     * @param y Conjunto de coordenadas y del poligono original.
     * @param grados    Grados de inclinacion del poligono
     * @param tX    Unidades de translacion en el eje x.
     * @param tY    Unidades de translacion en el eje y.
     * @param sX    Escala de las coordenadas x.
     * @param sY     Escala de las coordenadas y.
     * @param relleno Color del interior del poligono.
     * @param borde Color del borde del poligono
     * @param g Objeto grafico del invocador.
     */
    public void rellenarPoligonoRotado(int[] x, int[] y, int grados, int tX, int tY, int sX, int sY,
                                       Color relleno, Color borde, Graphics g){
        int[][] res = escalar(x,y,sX,sY);
        res = rotar(res[0],res[1],grados);
        res = transladar(res[0],res[1],tX,tY);
        res = ajusteArreglosEscalares(res[0],res[1]);

        g.setColor(relleno);
        g.fillPolygon(res[0],res[1],res[0].length);
        g.setColor(borde);
        dibujarPoligono(res[0],res[1],g);
    }


//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬§ METODOS PARA REFLEJAR POLIGONOS §▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬

    /**
     * Dibuja el reflejo del poligono respecto al eje x.
     * @param x Conjunto de coordenadas x.
     * @param y Conjunto de coordenadas y.
     * @param g Objeto grafico del invocador.
     */
    public void reflejarPoligonoSobreX(int[] x, int[] y,Graphics g){
        poligonoRotado(x,y,360,g);
    }

    /**
     * Dibuja el reflejo del poligono respecto al eje y.
     * @param x Conjunto de coordenadas x.
     * @param y Conjunto de coordenadas y.
     * @param g Objeto grafico del invocador.
     */
    public void reflejarPoligonoSobreY(int[] x, int[] y, Graphics g){
        poligonoRotado(x,y,180,g);
    }

    /**
     * Dibuja el reflejo de los planos opuestos.
     * @param x Conjunto de coordenadas x.
     * @param y Conjunto de coordenadas y.
     * @param g Objeto grafico del invocador.
     */
    public void reflejarPlanosOpuestos(int[] x, int[] y, Graphics g){
        poligonoRotado(x,y,270,g);
    }

    /**
     * Dibuja el reflejo de los ejes del poligono.
     * @param x Conjunto de coordenadas x.
     * @param y Conjunto de coordenadas y.
     * @param g Objeto grafico del invocador.
     */
    public void reflejarPoligonoXSobreY(int[] x, int[] y, Graphics g){
        poligonoEscalar(y,x,g);
    }

    /**
     * Dibuja el reflejo del los planos con los ejes reflejados del poligono.
     * @param x Conjunto de coordenadas x.
     * @param y Conjunto de coordenadas y.
     * @param g Objeto grafico del invocador.
     */
    public void reflejarPoligonoEntrePlanosOpuestos(int[] x, int[] y, Graphics g){
        poligonoRotado(y,x,270,g);
    }


//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬§ METODOS PARA REFLEJAR POLIGONOS §▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬

    /**
     * Metodo que se encarga de recortar la direccion de x en relacion con el eje de x.
     * @param x Conjunto de coordenadas x.
     * @param y Conjunto de coordenadas y.
     * @param shX    Parametro de recorte en relacion con el eje x.
     * @param g Objeto grafico del invocador.
     */
    public void recortarPoligonoDeXSobreX(int[] x, int[] y, float shX, Graphics g){
        int[] wX = x.clone();
        int[] wY = y.clone();
        for(int i = 0; i <= wX.length-1;i++){
            wX[i] = Math.round(wX[i] + shX * y[i]);
        }
        poligonoEscalar(wX,wY,g);  //Recorte de la direccion de x en relacion con el eje x
    }

    /**
     * Metodo que se encarga de recortar la direccion de x en relacion con el eje de y.
     * @param x Conjunto de coordenadas x.
     * @param y Conjunto de coordenadas y.
     * @param shX    Parametro de recorte en relacion con el eje x.
     * @param refY  Punto de referencia en el eje y.
     * @param g Objeto grafico del invocador.
     */
    public void recortarPoligonoDeXSobreY(int[] x, int[] y, float shX, int refY, Graphics g){
        int[] wX = x.clone();
        int[] wY = y.clone();
        for(int i = 0; i <= wX.length-1;i++){
            wX[i] = Math.round(wX[i] + shX * (y[i] - refY));
        }
        poligonoEscalar(wX,wY,g);  //Recorte de la direccion de x en relacion con otras lineas de referencia
    }

    /**
     * Metodo que se encarga de recortar la direccion de y en relacion con el eje y.
     * @param x Conjunto de coordenadas x.
     * @param y Conjunto de coordenadas y.
     * @param shY    Parametro de recorte en relacion con eje y.
     * @param g Objeto grafico del invocador.
     */
    public void recortarPoligonoDeYSobreY(int[] x, int[] y, float shY, Graphics g){
        int[] wX = x.clone();
        int[] wY = y.clone();
        for(int i = 0; i <= wY.length-1;i++){
            wY[i] = Math.round(wY[i] + shY * x[i]);
        }
        poligonoEscalar(wX,wY,g);  //Recorte de la direccion de y en relacion con el eje de y
    }

    /**
     * Metodo que se encarga de recortar la direccion de y en relacion con el eje x.
     * @param x Conjunto de coordenadas x.
     * @param y Conjunto de coordenadas y.
     * @param shY    Parametro de recorte en relacion con eje y.
     * @param refX  Punto de referencia en el eje x.
     * @param g Objeto grafico del invocador.
     */
    public void recortarPoligonoDeYSobreX(int[] x, int[] y, float shY, int refX, Graphics g){
        int[] wX = x.clone();
        int[] wY = y.clone();
        for(int i = 0; i <= wY.length-1;i++){
            wY[i] = Math.round(wY[i] + shY * (x[i] - refX));
        }
        poligonoEscalar(wX,wY,g);   //Recorte de la direccion de y en relacion con el eje de x
    }


//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬§ METODOS DE AJUSTE §▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬


    /**
     * Se encarga de ajustar las coordenadas contenidas en los arreglos x[] e y[]
     * para dibujar lineas a escala de un plano cartesiano.
     * @param x Arreglo de coordenadas x de una polilinea.
     * @param y Arreglo de coordenadas y de una polilinea.
     * @return  Retorna una matriz compuesta de dos arreglos de igual tamaño. En la
     *          posicion 0 se encuentra el arreglo ajustado de coordenadas x y en la
     *          posicion 1 se encuentra el arreglo ajustado de coordenadas y.
     */
    private int[][] ajusteArreglos(int[] x, int[] y){
        int[] x1 = x.clone();
        int[] y1 = y.clone();

        for(int i = 0; i <= x.length-1;i++){
            x1[i] = ZERO_AXIS_X + x1[i] * 10;
            y1[i] = ZERO_AXIS_Y - y1[i] * 10;
        }
        return new int[][]{x1, y1};
    }

    /**
     * Se encarga de ajustar las coordenadas contenidas en los arreglos x[] e y[]
     * para dibujar lineas a escala del tamaño de la ventana.
     * @param x Arreglo de coordenadas x de una polilinea.
     * @param y Arreglo de coordenadas y de una polilinea.
     * @return  Retorna una matriz compuesta de dos arreglos de igual tamaño. En la posicion
     *          0 se encuentra el arreglo ajustado de coordenadas x y en la posicion
     *          1 se encuentra el arreglo ajustado de coordenadas y.
     */
    private int[][] ajusteArreglosEscalares(int[] x, int[] y){
        int[] x1 = new int[x.length];
        System.arraycopy(x,0,x1,0,x.length);
        int[] y1 = new int[y.length];
        System.arraycopy(y,0,y1,0,y.length);

        for(int i = 0; i <= x.length-1;i++){
            x1[i] = ZERO_AXIS_X + x1[i] * ESCALAR_X;
            y1[i] = ZERO_AXIS_Y - y1[i] * ESCALAR_Y;
        }
        return new int[][]{x1, y1};
    }


    /**
     * Metodo que actualiza las variables de dimension de la clase  MapaCartesiano.
     * @param width     Anchura del canvas.
     * @param height    Altura del canvas.
     */
    public void actualizarAxis(int width, int height) {
        WIDTH = width;
        HEIGHT = height;
        ZERO_AXIS_X = WIDTH/2;
        ZERO_AXIS_Y = HEIGHT/2;

        ESCALAR_X = Math.round(10 * (WIDTH * 0.001f));
        if(ESCALAR_X<=1){
            ESCALAR_X++;
        }
        ESCALAR_Y = Math.round(10 * (HEIGHT * 0.0016666f));
        if(ESCALAR_Y<=2){
            ESCALAR_Y+=2;
        }
    }

    /**
     * Metodo que se encarga de transladar el conjunto de coordenadas x o y de una posicion a otra.
     * @param x Arreglo de coordenadas x.
     * @param y Arreglo de coordenadas y.
     * @param translacionX  Unidades de translacion en el eje x.
     * @param translacionY  Unidades de translacion en el eje y.
     * @return  Retorna una matriz con dos arreglos; la primera fila de la matriz contiene
     *          el arreglo transladado de las coordenadas x mientras que la segunda fila
     *          contiene el arreglo transladado de las coordenadas y.
     */
    public static int[][] transladar(int[] x, int[] y, int translacionX, int translacionY){
        int[] xR = x.clone();
        int[] yR = y.clone();

        for(int i = 0; i <= x.length-1;i++){
            xR[i] += translacionX;
            yR[i] += translacionY;
        }
        return new int[][]{xR,yR};
    }

    /**
     * Metodo que se encarga de escalar el conjunto de coordenadas x o y de un poligono.
     * @param x Arreglo de coordenadas x.
     * @param y Arreglo de coordenadas y.
     * @param escalarX  Escala de las coordenadas x.
     * @param escalarY  Escala de las coordenadas y.
     * @return Retorna una matriz con dos arreglos; la primera fila de la matriz contiene
     *         el arreglo escalado de las coordenadas x mientras que la segunda fila
     *         contiene el arreglo escalado de las coordenadas y.
     */
    public static int[][] escalar(int[] x, int[] y, float escalarX, float escalarY){
        int[] xR = new int[x.length];
        System.arraycopy(x,0,xR,0,x.length);
        int[] yR = new int[y.length];
        System.arraycopy(y,0,yR,0,y.length);

        for(int i = 0; i <= x.length-1;i++){
            xR[i] = Math.round(xR[i] * escalarX);
            yR[i] = Math.round(yR[i] * escalarY);
        }

        return new int[][]{xR,yR};
    }

    /**
     * Metodo que se encarga de rotar el conjunto de coordenadas x o y de un poligono <i>n</i> grados.
     * @param x Arreglo de coordenadas x.
     * @param y Arreglo de coordenadas y.
     * @param grados    Grados de rotacion del poligono.
     * @return  Retorna una matriz con dos arreglos; la primera fila de la matriz contiene
     *          el arreglo rotado de las coordenadas x mientras que la segunda fila
     *          contiene el arreglo rotado de las coordenadas y.
     */
    public static int[][] rotar(int[] x, int[] y, int grados){
        int[] xR = x.clone();
        int[] yR = y.clone();

        double rad = grados * (Math.PI/180);

        double cos = Math.cos(rad);
        double sin = Math.sin(rad);

        for(int i = 0;i <= x.length-1;i++){

            xR[i] = (int) Math.round(x[i] * cos + y[i] * sin);
            yR[i] = (int) -Math.round(y[i] * cos - x[i] * sin);

        }

        return new int[][]{xR,yR};
    }
}
