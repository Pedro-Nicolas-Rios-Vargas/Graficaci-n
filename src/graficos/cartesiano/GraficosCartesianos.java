/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 10
Fecha: 25/Octubre/2020
 */
package graficos.cartesiano;

import java.awt.Graphics;
import java.awt.Color;

/**
 * La clase abstracta <code>GraficosCartesianos</code> contiene los diferentes metodos
 * abstractos para dibujar los elementos graficos en un plano cartesiano.
 * <br>
 * La finalidad de esta clase es mantener un molde abstracto de los diferentes metodos
 * que pueden utilizarse para diseñar la forma de dibujar elementos graficos en un mapa
 * cartesiano, para que de esta forma, las diferentes clases descendientes de la clase
 * <code>MapaCartesiano</code> puedan utilizar un mismo estandar para el diseño e implementacion
 * de los elementos graficos.
 *
 * @author Pedro Nicolas Rios Vargas
 */
public abstract class GraficosCartesianos{

//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬§ METODOS PARA DIBUJAR LINEAS §▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬

    /**
     * Dibuja una linea simple adaptada al mapa cartesiano.
     * @param x1    Coordenada x del primer punto de la linea.
     * @param y1    Coordenada y del primer punto de la linea.
     * @param x2    Coordenada x del segundo punto de la linea.
     * @param y2    Coordenada y del segundo punto de la linea.
     * @param g Objeto grafico del invocador.
     */
    public void linea(int x1, int y1, int x2, int y2, Graphics g) {}

    /**
     * Dibuja una linea simple de un color especifico adaptada al mapa cartesiano
     * @param x1    Coordenada x del primer punto de la linea.
     * @param y1    Coordenada y del primer punto de la linea.
     * @param x2    Coordenada x del segundo punto de la linea.
     * @param y2    Coordenada y del segundo punto de la linea.
     * @param color Color de la linea.
     * @param g Objeto grafico del invocador.
     */
    public void linea(int x1, int y1, int x2, int y2, Color color, Graphics g) {}

    /**
     * Dibuja una linea de un grosor especifico adaptada al mapa cartesiano
     * @param x1    Coordenada x del primer punto de la linea.
     * @param y1    Coordenada y del primer punto de la linea.
     * @param x2    Coordenada x del segundo punto de la linea.
     * @param y2    Coordenada y del segundo punto de la linea.
     * @param grosor Grosor de la linea.
     * @param g Objeto grafico del invocador.
     */
    public void linea(int x1, int y1, int x2, int y2, int grosor, Graphics g) {}

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
    public void linea(int x1, int y1, int x2, int y2, Color color, int grosor, Graphics g) {}

//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬§ METODOS PARA DIBUJAR LINEAS A ESCALA §▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬

    /**
     * Dibuja una linea simple que se adapta al tamaño de la ventana.
     * @param x1    Coordenada x del primer punto de la linea.
     * @param y1    Coordenada y del primer punto de la linea.
     * @param x2    Coordenadas x del segundo punto de la linea.
     * @param y2    Coordenadas y del segundo punto de la linea.
     * @param g Objeto grafico del invocador.
     */
    public void lineaEscalar(int x1, int y1, int x2, int y2, Graphics g) {}

    /**
     * Dibuja una linea simple de un color especifico que se adapta al
     * tamaño de la ventana.
     * @param x1    Coordenada x del primer punto de la linea.
     * @param y1    Coordenada y del primer punto de la linea.
     * @param x2    Coordenadas x del segundo punto de la linea.
     * @param y2    Coordenadas y del segundo punto de la linea.
     * @param g Objeto grafico del invocador.
     */
    public void lineaEscalar(int x1, int y1, int x2, int y2, Color color, Graphics g) {}

    /**
     * Dibuja una linea simple de un grosor especifico
     * que se adapta al tamaño de la ventana.
     * @param x1    Coordenada x del primer punto de la linea.
     * @param y1    Coordenada y del primer punto de la linea.
     * @param x2    Coordenadas x del segundo punto de la linea.
     * @param y2    Coordenadas y del segundo punto de la linea.
     * @param g Objeto grafico del invocador.
     */
    public void lineaEscalar(int x1, int y1, int x2, int y2, int grosor, Graphics g) {}

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
    public void lineaEscalar(int x1, int y1, int x2, int y2, Color color, int grosor, Graphics g) {}

//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬§ METODOS PARA DIBUJAR CIRCULOS §▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬

    /**
     * Dibuja un circulo adaptado al mapa cartesiano.
     * @param xC    Coordenada x del centro del circulo.
     * @param yC    Coordenada y del centro del circulo.
     * @param r Radio del circulo.
     * @param g Objeto grafico del invocador
     */
    public void circulo(int xC, int yC, int r, Graphics g) {}

    /**
     * Dibuja un circulo que ajusta su tamaño de acuerdo al tamaño de la
     * ventana
     * @param xC    Coordenada x del centro del circulo.
     * @param yC    Coordenada y del centro del circulo.
     * @param r Radio del circulo.
     * @param g Objeto grafico del invocador.
     */
    public void circuloEscalar(int xC, int yC, int r, Graphics g) {}

//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬§ METODOS DIBUJAR CIRCULOS RELLENOS §▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬

    /**
     * Dibuja un circulo relleno adaptado al mapa cartesiano.
     * @param xC    Coordenada x del centro del circulo.
     * @param yC    Coordenada y del centro del circulo.
     * @param r Radio del circulo.
     * @param g Objeto grafico del invocador.
     */
    public void circuloRelleno(int xC, int yC, int r, Graphics g) {}

    /**
     * Dibuja un circulo relleno que ajusta su tamaño segun el tamaño de la
     * ventana.
     * @param xC    Coordenada x del centro del circulo.
     * @param yC    Coordenada y del centro del circulo.
     * @param r Radio del circulo.
     * @param g Objeto grafico del invocador.
     */
    public void circuloRellenoEscalar(int xC, int yC, int r, Graphics g) {}

//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬§ METODOS PARA DIBUJAR RUEDA §▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬

    /**
     * Dibuja una rueda adaptada al mapa cartesiano.
     * @param xC    Coordenada x del centro de la rueda.
     * @param yC    Coordenada y del centro de la rueda.
     * @param r Radio de la rueda.
     * @param g Objeto grafico del invocador.
     */
    public void rueda(int xC, int yC, int r, Graphics g) {}

    /**
     * Dibuja una rueda que ajusta su tamaño segun el tamaño de la
     * ventana.
     * @param xC    Coordenada x del centro de la rueda.
     * @param yC    Coordenada y del centro de la rueda.
     * @param r Radio de la rueda.
     * @param g Objeto grafico del invocador.
     */
    public void ruedaEscalar(int xC, int yC, int r, Graphics g) {}

//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬§ METODOS PARA DIBUJAR POLILINEA §▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬

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
    public void polilinea(int[] x, int[] y, Graphics g) {}

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
    public void polilineaEscalar(int[] x, int[] y, Graphics g) {}

//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬§ METODOS PARA DIBUJAR POLIGONO §▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬

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
    public void poligono(int[] x, int[] y, Graphics g) {}

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
    public void poligonoEscalar(int[] x, int[] y, Graphics g) {}

    /**
     * Metodo que permite dibujar la escala de las coordenadas de un poligono dado.
     * @param x Conjunto de coordenadas x del poligono original.
     * @param y Conjunto de coordenadas y del poligono original.
     * @param sX    Escala de las coordenadas x.
     * @param sY    Escala de las coordenadas y.
     * @param g Objeto grafico del invocador.
     */
    public void poligonoEscalar(int[] x, int[] y, float sX, float sY, Graphics g) {}

    /**
     * Metodo que permite dibujar la escala inversa de las coordenadas de un poligono dado.
     * @param x Conjunto de coordenadas x del poligono original.
     * @param y Conjunto de coordenadas y del poligono original.
     * @param sX    Escala de las coordenadas x.
     * @param sY    Escala de las coordenadas y.
     * @param g Objeto grafico del invocador.
     */
    public void poligonoEscalarInv(int[] x, int[] y, float sX, float sY, Graphics g) {}
    /**
     * Metodo que permite dibujar un poligono transladado x o y unidades en los ejes del mapa.
     * @param x Conjunto de coordenadas x del poligono original.
     * @param y Conjunto de coordenadas y del poligono original.
     * @param tX    Unidades de translacion en el eje x.
     * @param tY    Unidades de translacion en el eje y.
     * @param g Objeto grafico del invocador.
     */
    public void poligonoEscalar(int[] x, int[] y, int tX, int tY, Graphics g) {}

    /**
     * Metodo que permite dibujar un poligono transladado x o y unidades a la inversa en los
     * ejes del mapa.
     * @param x Conjunto de coordenadas x del poligono original.
     * @param y Conjunto de coordenadas y del poligono original.
     * @param tX    Unidades de translacion en el eje x.
     * @param tY    Unidades de translacion en el eje y.
     * @param g Objeto grafico del invocador.
     */
    public void poligonoEscalarInv(int[] x, int[] y, int tX, int tY, Graphics g) {}
    /**
     * Metodo que permite dibujar un poligono transladado y escalado en base a un poligono original.
     * @param x Conjunto de coordenadas x del poligono original.
     * @param y Conjunto de coordenadas y del poligono original.
     * @param sX    Escala de las coordenadas x.
     * @param sY    Escala de las coordenada y.
     * @param tX    Unidades de translacion en el eje x.
     * @param tY    Unidades de translacion en el eje y.
     * @param g Objeto grafico del invocador.
     */
    public void poligonoEscalar(int[] x, int[] y, float sX, float sY,int tX, int tY, Graphics g) {}

    /**
     * Metodo que permite dibujar un poligono escalado y trasladado a la inversa en base a un poligono
     * original.
     * @param x Conjunto de coordenadas x del poligono original.
     * @param y Conjunto de coordenadas y del poligono original.
     * @param sX    Escala de las coordenadas x.
     * @param sY    Escala de las coordenadas y.
     * @param tX    Unidades de traslacion en el eje x.
     * @param tY    Unidades de traslacion en el eje y.
     * @param g Objeto grafico del invocador.
     */
    public void poligonoEscalarInv(int[] x, int[] y, float sX, float sY, int tX, int tY, Graphics g) {}
    /**
     * Metodo que permite dibujar un poligono relleno en base a lineas continuas unidas por sus vertices
     * las cuales ajustan su tamaño de acuerdo al tamaño de la ventana.
     * @param x Conjunto de coordenadas x para los vertices.
     * @param y Conjunto de coordenadas y para los vertices.
     * @param relleno   Color del relleno del poligono.
     * @param borde Color del borde del poligono.
     * @param g Objeto grafico del invocador.
     */
    public void rellenarPoligonoEscalar(int[] x, int[] y, Color relleno, Color borde, Graphics g) {}

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
    public void rellenarPoligonoEscalar(int[] x, int[] y, float sX, float sY, Color relleno, Color borde, Graphics g) {}

    /**
     * Metodo que permite dibujar un poligono relleno invertido en base a lineas continuas unidas por
     * sus vertices las cuales ajustan su tamaño de acuerdo al tamaño de la ventana.
     * @param x Conjunto de coordenadas x para los vertices.
     * @param y Conjunto de coordenadas y para los vertices.
     * @param sX    Escala de las coordenadas x.
     * @param sY    Escala de las coordenadas y.
     * @param relleno   Color del relleno del poligono.
     * @param borde Color del borde del poligono.
     * @param g Objeto grafico del invocador.
     */
    public void rellenarPoligonoEscalarInv(int[] x, int[] y, float sX, float sY, Color relleno, Color borde, Graphics g) {}

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
    public void rellenarPoligonoEscalar(int[] x, int[] y, int tX, int tY, Color relleno, Color borde, Graphics g) {}

    /**
     * Metodo que permite dibujar un poligono relleno invertido en base a lineas continuas unidas
     * por sus vertices las cuales ajustan su tamaño de acuerdo al tamaño de la ventana.
     * @param x Conjunto de coordenadas x para los vertices.
     * @param y Conjunto de coordenadas y para los vertices.
     * @param tX    Unidades de translacion en el eje x.
     * @param tY    Unidades de translacion en el eje y.
     * @param relleno   Color del relleno del poligono.
     * @param borde Color del borde del poligono.
     * @param g Objeto grafico del invocador.
     */
    public void rellenarPoligonoEscalarInv(int[] x, int[] y, int tX, int tY, Color relleno, Color borde, Graphics g) {}

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
    public void rellenarPoligonoEscalar(int[] x, int[] y, float sX, float sY, int tX, int tY, Color relleno, Color borde, Graphics g) {}

    /**
     * Metodo que permite dibujar un poligono relleno inverso en base a lineas continuas unidas
     * por sus vertices las cuales ajustan su tamaño de acuerdo al tamaño de la ventana.
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
    public void rellenarPoligonoEscalarInv(int[] x, int[] y, float sX, float sY, int tX, int tY, Color relleno, Color borde, Graphics g) {}


//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬§ METODOS PARA ROTAR POLIGONOS §▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬

    /**
     * Metodo que permite dibujar la imagen de un poligono sin rotar y rotarlo en un angulo especifico
     * en sentido de las manesillas del reloj y enbase a lineas continuas unidas por sus
     * vertices las cuales ajustan su tamaño de acuerdo al tamaño de la ventana.
     * @param x Conjunto de coordenadas x del poligono original.
     * @param y Conjunto de coordenadas y del poligono original.
     * @param grados    Grados de inclinacion del poligono.
     * @param g Objeto grafico del invocador.
     */
    public void poligonoRotado(int[] x, int[] y, int grados, Graphics g) {}

    /**
     * Metodo que permite dibujar la imagen de un poligono sin rotar y rotarlo en un angulo especifico
     * en sentido contrario a las manesillas del reloj y en base a lineas continuas unidas por sus
     * vertices las cuales ajustan su tamaño de acuerdo al tamaño de la ventana.
     * @param x Conjunto de coordenadas x del poligono original.
     * @param y Conjunto de coordenadas y del poligono original.
     * @param grados    Grados de inclinacion del poligono.
     * @param g Objeto grafico del invocador.
     */
    public void poligonoRotadoInv(int[] x, int[] y, int grados, Graphics g) {}

    /**
     * Metodo que permite dibujar la imagen de un poligono la cual se va a transladar en "x" y "y" y
     * rotarlo en un angulo especifico en sentido de las manesillas del reloj y en base a
     * lineas continuas unidas por sus vertices las cuales ajustan su tamaño de acuerdo al tamaño
     * de la ventana.
     * @param x Conjunto de coordenadas x del poligono original.
     * @param y Conjunto de coordenadas y del poligono original.
     * @param grados    Grados de inclinacion del poligono.
     * @param tX    Unidades de translacion en el eje x.
     * @param tY    Unidades de translacion en el eje y.
     * @param g Objeto grafico del invocador.
     */
    public void poligonoRotado(int[] x, int[] y, int grados, int tX, int tY, Graphics g) {}

    /**
     * Metodo que permite dibujar la imagen de un poligono la cual se va a transladar de forma inversa
     * en "x" y "y" y rotarlo en un angulo especifico en sentido contrario a las manesillas del reloj
     * y en base a lineas continuas unidas por sus vertices las cuales ajustan su tamaño de acuerdo
     * al tamaño de la ventana.
     * @param x Conjunto de coordenadas x del poligono original.
     * @param y Conjunto de coordenadas y del poligono original.
     * @param grados    Grados de inclinacion del poligono.
     * @param tX    Unidades de translacion en el eje x.
     * @param tY    Unidades de translacion en el eje y.
     * @param g Objeto grafico del invocador.
     */
    public void poligonoRotadoInv(int[] x, int[] y, int grados, int tX, int tY, Graphics g) {}

    /**
     * Metodo que permite dibujar la imagen de un poligono la cual se va a escalar y rotar en un angulo
     * especifico en sentido de las manesillas del reloj y en base a lineas continuas unidas por
     * sus vertices las cuales ajustan su tamaño de acuerdo al tamaño de la ventana.
     * @param x Conjunto de coordenadas x del poligono original.
     * @param y Conjunto de coordenadas y del poligono original.
     * @param grados    Grados de inclinacion del poligono.
     * @param sX    Escala de las coordenadas x.
     * @param sY    Escala de las coordenadas y.
     * @param g Objeto grafico del invocador.
     */
    public void poligonoRotado(int[] x, int[] y, int grados, float sX, float sY, Graphics g) {}

    /**
     * Metodo que permite dibujar la imagen de un poligono la cual se va a escalar y rotar en un angulo
     * especifico en sentido contrario de las manesillas del reloj y en base a lineas continuas unidas
     * por sus vertices las cuales ajustan su tamaño de acuerdo al tamaño de la ventana.
     * @param x Conjunto de coordenadas x del poligono original.
     * @param y Conjunto de coordenadas y del poligono original.
     * @param grados    Grados de inclinacion del poligono.
     * @param sX    Escala de las coordenadas x.
     * @param sY    Escala de las coordenadas y.
     * @param g Objeto grafico del invocador.
     */
    public void poligonoRotadoInv(int[] x, int[] y, int grados, float sX, float sY, Graphics g) {}

    /**
     * Metodo que permite dibujar una imagen de un poligono la cual se va a escalar, rotar en sentido
     * de las manesillas del reloj y transladar en base a lineas continuas unuidas por sus
     * vertices las cuales ajustan su tamaño de acuerdo al tamaño de la ventana.
     * @param x Conjunto de coordenadas x del poligono original.
     * @param y Conjunto de coordenadas y del poligono original.
     * @param grados    Grados de inclinacion del poligono
     * @param tX    Unidades de translacion en el eje x.
     * @param tY    Unidades de translacion en el eje y.
     * @param sX    Escala de las coordenadas x.
     * @param sY    Escala de las coordenadas y.
     * @param g Objeto grafico del invocador.
     */
    public void poligonoRotado(int[] x, int[] y, int grados, int tX, int tY, float sX, float sY, Graphics g) {}

    /**
     * Metodo que permite dibujar una imagen de un poligono la cual se va a escalar, rotar en sentido
     * contrario a las manesillas del reloj y transladar en base a lineas continuas unuidas por sus
     * vertices las cuales ajustan su tamaño de acuerdo al tamaño de la ventana.
     * @param x Conjunto de coordenadas x del poligono original.
     * @param y Conjunto de coordenadas y del poligono original.
     * @param grados    Grados de inclinacion del poligono
     * @param tX    Unidades de translacion en el eje x.
     * @param tY    Unidades de translacion en el eje y.
     * @param sX    Escala de las coordenadas x.
     * @param sY    Escala de las coordenadas y.
     * @param g Objeto grafico del invocador.
     */
    public void poligonoRotadoInv(int[] x, int[] y, int grados, int tX, int tY, float sX, float sY, Graphics g) {}

    /**
     * Metodo que permite dibujar la imagen de un poligono sin rotar y rotarlo en un angulo especifico
     * en sentido de las manesillas del reloj, relleno en base a lineas continuas unidas por sus vertices
     * las cuales ajustan su tamaño de acuerdo al tamaño de la ventana.
     * @param x Conjunto de coordenadas x para los vertices.
     * @param y Conjunto de coordenadas y para los vertices.
     * @param grados    Grados de inclinacion del poligono.
     * @param relleno   Color del relleno del poligono.
     * @param borde Color del borde del poligono.
     * @param g Objeto grafico del invocador.
     */
    public void rellenarPoligonoRotado(int[] x, int[] y, int grados, Color relleno, Color borde, Graphics g) {}

    /**
     * Metodo que permite dibujar la imagen de un poligono sin rotar y rotarlo en un angulo especifico
     * en sentido contrario a las manesillas del reloj, relleno en base a lineas continuas unidas por
     * sus vertices las cuales ajustan su tamaño de acuerdo al tamaño de la ventana.
     * @param x Conjunto de coordenadas x para los vertices.
     * @param y Conjunto de coordenadas y para los vertices.
     * @param grados    Grados de inclinacion del poligono.
     * @param relleno   Color del relleno del poligono.
     * @param borde Color del borde del poligono.
     * @param g Objeto grafico del invocador.
     */
    public void rellenarPoligonoRotadoInv(int[] x, int[] y, int grados, Color relleno, Color borde, Graphics g) {}

    /**
     * Metodo que permite dibujar la imagen de un poligono sin rotar y rotarlo en un angulo especifico
     * en sentido de las manesillas del reloj, relleno en base a lineas continuas unidas por
     * sus vertices las cuales ajustan su tamaño de acuerdo al tamaño de la ventana.
     * @param x Conjunto de coordenadas x para los vertices.
     * @param y Conjunto de coordenadas y para los vertices.
     * @param grados    Grados de inclinacion del poligono.
     * @param tX    Unidades de translacion en el eje x.
     * @param tY    Unidades de translacion en el eje y.
     * @param relleno   Color del relleno del poligono.
     * @param borde Color del borde del poligono.
     * @param g Objeto grafico del invocador.
     */
    public void rellenarPoligonoRotado(int[] x, int[] y, int grados, int tX, int tY, Color relleno, Color borde, Graphics g) {}

    /**
     * Metodo que permite dibujar la imagen de un poligono sin rotar y rotarlo en un angulo especifico
     * en sentido contrario de las manesillas del reloj, relleno en base a lineas continuas unidas por
     * sus vertices las cuales ajustan su tamaño de acuerdo al tamaño de la ventana.
     * @param x Conjunto de coordenadas x para los vertices.
     * @param y Conjunto de coordenadas y para los vertices.
     * @param grados    Grados de inclinacion del poligono.
     * @param tX    Unidades de translacion en el eje x.
     * @param tY    Unidades de translacion en el eje y.
     * @param relleno   Color del relleno del poligono.
     * @param borde Color del borde del poligono.
     * @param g Objeto grafico del invocador.
     */
    public void rellenarPoligonoRotadoInv(int[] x, int[] y, int grados, int tX, int tY, Color relleno, Color borde, Graphics g) {}

    /**
     * Metodo que permite dibujar la imagen de un poligono sin rotar y rotarlo en un angulo especifico
     * en sentido de las manesillas del reloj, relleno en base a lineas continuas unidas por sus vertices
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
    public void rellenarPoligonoRotado(int[] x, int[] y, int grados, float sX, float sY, Color relleno, Color borde, Graphics g) {}

    /**
     * Metodo que permite dibujar la imagen de un poligono sin rotar y rotarlo en un angulo especifico
     * en sentido contrario a las manesillas del reloj, relleno en base a lineas continuas unidas por
     * sus vertices las cuales ajustan su tamaño de acuerdo al tamaño de la ventana.
     * @param x Conjunto de coordenadas x para los vertices.
     * @param y Conjunto de coordenadas y para los vertices.
     * @param grados    Grados de inclinacion del poligono.
     * @param sX    Escala de las coordenadas x.
     * @param sY    Escala de las coordenadas y.
     * @param relleno   Color del relleno del poligono.
     * @param borde Color del borde del poligono.
     * @param g Objeto grafico del invocador.
     */
    public void rellenarPoligonoRotadoInv(int[] x, int[] y, int grados, float sX, float sY, Color relleno, Color borde, Graphics g) {}
    /**
     * Metodo que permite dibujar una iamgen de un poligono la cual se va a escalar, rotar en sentido
     * de las manesillas del reloj y transladar en base a lineas continuas unuidas por sus
     * vertices las cuales ajustan su tamaño de acuerdo al tamaño de la ventana.
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
    public void rellenarPoligonoRotado(int[] x, int[] y, int grados, int tX, int tY, float sX, float sY, Color relleno, Color borde, Graphics g) {}

    /**
     * Metodo que permite dibujar una iamgen de un poligono la cual se va a escalar, rotar en sentido
     * contrario de las manesillas del reloj y transladar en base a lineas continuas unuidas por sus
     * vertices las cuales ajustan su tamaño de acuerdo al tamaño de la ventana.
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
    public void rellenarPoligonoRotadoInv(int[] x, int[] y, int grados, int tX, int tY, float sX, float sY, Color relleno, Color borde, Graphics g) {}

//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬§ METODOS PARA REFLEJAR POLIGONOS §▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬

    /**
     * Dibuja el reflejo del poligono respecto al eje x.
     * @param x Conjunto de coordenadas x.
     * @param y Conjunto de coordenadas y.
     * @param g Objeto grafico del invocador.
     */
    public void reflejarPoligonoSobreX(int[] x, int[] y, Graphics g) {}

    /**
     * Dibuja el reflejo del poligono respecto al eje y.
     * @param x Conjunto de coordenadas x.
     * @param y Conjunto de coordenadas y.
     * @param g Objeto grafico del invocador.
     */
    public void reflejarPoligonoSobreY(int[] x, int[] y, Graphics g) {}

    /**
     * Dibuja el reflejo de los planos opuestos.
     * @param x Conjunto de coordenadas x.
     * @param y Conjunto de coordenadas y.
     * @param g Objeto grafico del invocador.
     */
    public void reflejarPoligonoSobreOrigen(int[] x, int[] y, Graphics g) {}

    /**
     * Dibuja el reflejo de los ejes del poligono.
     * @param x Conjunto de coordenadas x.
     * @param y Conjunto de coordenadas y.
     * @param g Objeto grafico del invocador.
     */
    public void reflejarPoligonoYigualX(int[] x, int[] y, Graphics g) {}

    /**
     * Dibuja el reflejo del los planos con los ejes reflejados del poligono.
     * @param x Conjunto de coordenadas x.
     * @param y Conjunto de coordenadas y.
     * @param g Objeto grafico del invocador.
     */
    public void reflejarPoligonoYigualMenosX(int[] x, int[] y, Graphics g) {}

    /**
     * Dibuja el reflejo del poligono relleno respecto al eje x.
     * @param x Conjunto de coordenadas x.
     * @param y Conjunto de coordenadas y.
     * @param relleno   Color del relleno del poligono.
     * @param borde Color del borde del poligono.
     * @param g Objeto grafico del invocador.
     */
    public void rellenarReflejoPoligonoSobreX(int[] x, int[] y, Color relleno, Color borde, Graphics g) {}

    /**
     * Dibuja el reflejo del poligono relleno respecto al eje y.
     * @param x Conjunto de coordendas x.
     * @param y Conjunto de coordendas y.
     * @param relleno   Color del relleno del poligono.
     * @param borde Color del borde del poligono.
     * @param g Objeto grafico del invocador.
     */
    public void rellenarReflejoPoligonoSobreY(int[] x, int[] y, Color relleno, Color borde, Graphics g) {}

    /**
     * Dibuja el reflejo del poligono relleno en el plano opuesto.
     * @param x Conjutno de coordenadas x.
     * @param y Conjunto de coordenadas y.
     * @param relleno   Color del relleno del poligono.
     * @param borde Color del borde del poligono.
     * @param g Objeto grafico del invocador.
     */
    public void rellenarReflejoPoligonoSobreOrigen(int[] x, int[] y, Color relleno, Color borde, Graphics g) {}

    /**
     * Dibuja el reflejo del poligono relleno en base a los ejes del poligono.
     * @param x Conjunto de coordenadas x.
     * @param y Conjunto de coordendas y.
     * @param relleno   Color del relleno del poligono.
     * @param borde Color del borde del poligono.
     * @param g Objeto grafico del invocador.
     */
    public void rellenarReflejoPoligonoYigualX(int[] x, int[] y, Color relleno, Color borde, Graphics g) {}

    /**
     * Dibuja el reflejo del poligono relleno en base a los ejes del plano.
     * @param x Conjunto de coordendas x.
     * @param y Conjunto de coordenadas y.
     * @param relleno   Color del relleno del poligono.
     * @param borde Color del borde del poligono.
     * @param g Objeto grafico del invocador.
     */
    public void rellenarReflejoPoligonoYigualMenosX(int[] x, int[] y, Color relleno, Color borde, Graphics g) {}

//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬§ METODOS PARA RECORTAR POLIGONOS §▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬

    /**
     * Metodo que se encarga de recortar la direccion de x en relacion con el eje de x.
     * @param x Conjunto de coordenadas x.
     * @param y Conjunto de coordenadas y.
     * @param shX    Parametro de recorte en relacion con el eje x.
     * @param g Objeto grafico del invocador.
     */
    public void recortarPoligonoDeXSobreX(int[] x, int[] y, float shX, Graphics g) {}

    /**
     * Metodo que se encarga de recortar la direccion de x en relacion con el eje de y.
     * @param x Conjunto de coordenadas x.
     * @param y Conjunto de coordenadas y.
     * @param shX    Parametro de recorte en relacion con el eje x.
     * @param refY  Punto de referencia en el eje y.
     * @param g Objeto grafico del invocador.
     */
    public void recortarPoligonoDeXSobreY(int[] x, int[] y, float shX, int refY, Graphics g) {}

    /**
     * Metodo que se encarga de recortar la direccion de y en relacion con el eje y.
     * @param x Conjunto de coordenadas x.
     * @param y Conjunto de coordenadas y.
     * @param shY    Parametro de recorte en relacion con eje y.
     * @param g Objeto grafico del invocador.
     */
    public void recortarPoligonoDeYSobreY(int[] x, int[] y, float shY, Graphics g) {}

    /**
     * Metodo que se encarga de recortar la direccion de y en relacion con el eje x.
     * @param x Conjunto de coordenadas x.
     * @param y Conjunto de coordenadas y.
     * @param shY    Parametro de recorte en relacion con eje y.
     * @param refX  Punto de referencia en el eje x.
     * @param g Objeto grafico del invocador.
     */
    public void recortarPoligonoDeYSobreX(int[] x, int[] y, float shY, int refX, Graphics g) {}

    /**
     * Metodo que se encarga de recortar la direccion de x en relacion con el eje de x para
     * dibujar un poligono relleno.
     * @param x Conjunto de coordendas x.
     * @param y Conjunto de coordenadas y.
     * @param shX   Parametro de recorte en relacion con el eje x.
     * @param relleno   Color del relleno del poligono.
     * @param borde Color del borde del poligono.
     * @param g Objeto grafico del invocador.
     */
    public void rellenarRecortePoligonoDeXSobreX(int[] x, int[] y, float shX, Color relleno, Color borde, Graphics g) {}

    /**
     * Metodo que se encarga de recortar la direccion de y en relacion con el eje y para dibujar
     * un poligono relleno.
     * @param x Conjunto de coordenadas x.
     * @param y Conjunto de coordenadas y.
     * @param shX   Parametro de recorte en relacion con el eje x.
     * @param refY  Punto de referencia en el eje y.
     * @param relleno   Color de relleno del poligono.
     * @param borde Color del borde del poligono.
     * @param g Objeto grafico del invocador.
     */
    public void rellenarRecortePoligonoDeXSobreY(int[] x, int[] y, float shX, int refY, Color relleno, Color borde, Graphics g) {}

    /**
     * Metodo que se encarga de recortar la direccion de y en la relacion con el eje y para
     * dibujar un poligono relleno.
     * @param x Conjunto de coordenadas x.
     * @param y Conjunto de coordenadas y.
     * @param shY   Parametro de recorte en relacion con eje y.
     * @param relleno   Color de relleno del poligono.
     * @param borde Color de borde del poligono.
     * @param g Objeto grafico del invocador.
     */
    public void rellenarRecortePoligonoDeYSobreY(int[] x, int[] y, float shY, Color relleno, Color borde, Graphics g) {}

    /**
     * Metodo que se encarga de recortar la direccion de y en relacion con el eje x para
     * dibujar un poligono relleno.
     * @param x Conjunto de coordenadas x.
     * @param y Conjunto de coordenadas y.
     * @param shY   Parametro de recorte en relacion con eje y.
     * @param refX  Punto de referencia en el eje x.
     * @param relleno   Color de relleno del poligono.
     * @param borde Color de borde del poligono.
     * @param g Objeto grafico del invocador.
     */
    public void rellenarRecortePoligonoDeYSobreX(int[] x, int[] y, float shY, int refX, Color relleno, Color borde, Graphics g) {}

    /**
     * Metodo que se encarga de transladar el conjunto de coordenadas x o y de una posicion a otra.
     * @param x Arreglo de coordenadas x.
     * @param y Arreglo de coordenadas y.
     * @param tX  Unidades de translacion en el eje x.
     * @param tY  Unidades de translacion en el eje y.
     * @return  Retorna una matriz con dos arreglos; la primera fila de la matriz contiene
     *          el arreglo transladado de las coordenadas x mientras que la segunda fila
     *          contiene el arreglo transladado de las coordenadas y.
     */
    public int[][] transladar(int[] x, int[] y, int tX, int tY) {return null;}

    /**
     * Metodo que se encarga de escalar el conjunto de coordenadas x o y de un poligono.
     * @param x Arreglo de coordenadas x.
     * @param y Arreglo de coordenadas y.
     * @param sX  Escala de las coordenadas x.
     * @param sY  Escala de las coordenadas y.
     * @return Retorna una matriz con dos arreglos; la primera fila de la matriz contiene
     *         el arreglo escalado de las coordenadas x mientras que la segunda fila
     *         contiene el arreglo escalado de las coordenadas y.
     */
    public int[][] escalar(int[] x, int[] y, float sX, float sY) {return null;}

    /**
     * Metodo que se encarga de rotar el conjunto de coordenadas x o y de un poligono <i>n</i> grados.
     * @param x Arreglo de coordenadas x.
     * @param y Arreglo de coordenadas y.
     * @param grados    Grados de rotacion del poligono.
     * @return  Retorna una matriz con dos arreglos; la primera fila de la matriz contiene
     *          el arreglo rotado de las coordenadas x mientras que la segunda fila
     *          contiene el arreglo rotado de las coordenadas y.
     */
    public int[][] rotar(int[] x, int[] y, int grados) {return null;}
}
