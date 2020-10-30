/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 10
Fecha: 25/Octubre/2020
 */
package graficos.cartesiano.Algoritmico;

import java.awt.Graphics;
import java.awt.Color;

import static graficos.Circunferencia.*;
import static graficos.Linea.dibujarLinea;
import static graficos.Polilinea.dibujarPoligono;
import static graficos.Polilinea.dibujarPolilinea;

/**
 * La clase <code>FigurasCartesianasAlgoritmos</code> contiene los metodos necesarios
 * para dibujar todos los elementos graficos que se han visto hasta la unidad 2 de Graficacion
 * adaptados para ser dibujados en un mapa cartesiano responsivo al marco de la aplicacion
 * utilizando algoritmos para realizar estas adaptaciones.
 *
 *
 * @author Pedro Nicolas Rios Vargas
 */
public class FigurasCartesianasAlgoritmos extends CartesianoAlgoritmos {

    @Override
    public void linea(int x1, int y1, int x2, int y2, Graphics g) {
        x1 = zeroAxisX + x1 * 10;
        y1 = zeroAxisY - y1 * 10;
        x2 = zeroAxisX + x2 * 10;
        y2 = zeroAxisY - y2 * 10;
        dibujarLinea(x1,y1,x2,y2,g);
    }

    @Override
    public void linea(int x1, int y1, int x2, int y2, Color color, Graphics g) {
        x1 = zeroAxisX + x1 * 10;
        y1 = zeroAxisY - y1 * 10;
        x2 = zeroAxisX + x2 * 10;
        y2 = zeroAxisY - y2 * 10;
        dibujarLinea(x1,y1,x2,y2,color,g);
    }

    @Override
    public void linea(int x1, int y1, int x2, int y2, int grosor, Graphics g) {
        x1 = zeroAxisX + x1 * 10;
        y1 = zeroAxisY - y1 * 10;
        x2 = zeroAxisX + x2 * 10;
        y2 = zeroAxisY - y2 * 10;
        dibujarLinea(x1,y1,x2,y2,grosor,g);
    }

    @Override
    public void linea(int x1, int y1, int x2, int y2, Color color, int grosor, Graphics g) {
        x1 = zeroAxisX + x1 * 10;
        y1 = zeroAxisY - y1 * 10;
        x2 = zeroAxisX + x2 * 10;
        y2 = zeroAxisY - y2 * 10;
        dibujarLinea(x1,y1,x2,y2,color, grosor,g);
    }

    @Override
    public void lineaEscalar(int x1, int y1, int x2, int y2, Graphics g) {
        x1 = zeroAxisX + x1 * escalarX;
        y1 = zeroAxisY - y1 * escalarY;
        x2 = zeroAxisX + x2 * escalarX;
        y2 = zeroAxisY - y2 * escalarY;
        dibujarLinea(x1,y1,x2,y2,g);
    }

    @Override
    public void lineaEscalar(int x1, int y1, int x2, int y2, Color color, Graphics g) {
        x1 = zeroAxisX + x1 * escalarX;
        y1 = zeroAxisY - y1 * escalarY;
        x2 = zeroAxisX + x2 * escalarX;
        y2 = zeroAxisY - y2 * escalarY;
        dibujarLinea(x1,y1,x2,y2,color,g);
    }

    @Override
    public void lineaEscalar(int x1, int y1, int x2, int y2, int grosor, Graphics g) {
        x1 = zeroAxisX + x1 * escalarX;
        y1 = zeroAxisY - y1 * escalarY;
        x2 = zeroAxisX + x2 * escalarX;
        y2 = zeroAxisY - y2 * escalarY;
        dibujarLinea(x1,y1,x2,y2,grosor,g);
    }

    @Override
    public void lineaEscalar(int x1, int y1, int x2, int y2, Color color, int grosor, Graphics g) {
        x1 = zeroAxisX + x1 * escalarX;
        y1 = zeroAxisY - y1 * escalarY;
        x2 = zeroAxisX + x2 * escalarX;
        y2 = zeroAxisY - y2 * escalarY;
        dibujarLinea(x1,y1,x2,y2,color,grosor,g);
    }

    @Override
    public void circulo(int xC, int yC, int r, Graphics g) {
        xC = zeroAxisX + xC * 10;
        yC = zeroAxisY - yC * 10;
        r = r * 10;
        circuloBresenham(xC, yC, r, g);
    }

    @Override
    public void circuloEscalar(int xC, int yC, int r, Graphics g) {
        xC = zeroAxisX + xC * escalarX;
        yC = zeroAxisY - yC * escalarY;
        r = r * escalarX;
        circuloBresenham(xC,yC,r,g);
    }

    @Override
    public void circuloRelleno(int xC, int yC, int r, Graphics g) {
        xC = zeroAxisX + xC * 10;
        yC = zeroAxisY - yC * 10;
        r = r * 10;
        rellenarCirculo(xC, yC, r, g);
    }

    @Override
    public void circuloRellenoEscalar(int xC, int yC, int r, Graphics g) {
        xC = zeroAxisX + xC * escalarX;
        yC = zeroAxisY - yC * escalarY;
        r = r * escalarX;
        rellenarCirculo(xC,yC,r,g);
    }

    @Override
    public void rueda(int xC, int yC, int r, Graphics g) {
        xC = zeroAxisX + xC * 10;
        yC = zeroAxisY - yC * 10;
        r = r * 10;
        circunferenciaRemarcada(xC, yC, r, g);
    }

    @Override
    public void ruedaEscalar(int xC, int yC, int r, Graphics g) {
        xC = zeroAxisX + xC * escalarX;
        yC = zeroAxisY - yC * escalarY;
        r = r * escalarX;
        circunferenciaRemarcada(xC, yC, r, g);
    }

    @Override
    public void polilinea(int[] x, int[] y, Graphics g) {
        int[][] res = ajusteArreglos(x,y);
        dibujarPolilinea(res[0],res[1],g);
    }

    @Override
    public void polilineaEscalar(int[] x, int[] y, Graphics g) {
        int[][] res = ajusteArreglosEscalares(x,y);
        dibujarPolilinea(res[0], res[1],g);
    }

    @Override
    public void poligono(int[] x, int[] y, Graphics g) {
        int[][] res = ajusteArreglos(x,y);
        dibujarPoligono(res[0],res[1],g);
    }

    @Override
    public void poligonoEscalar(int[] x, int[] y, Graphics g) {
        int[][] res = ajusteArreglosEscalares(x,y);

        dibujarPoligono(res[0], res[1],g);
    }

    @Override
    public void poligonoEscalar(int[] x, int[] y, float sX, float sY, Graphics g) {
        int[][] res = escalar(x,y,sX,sY);
        res = ajusteArreglosEscalares(res[0],res[1]);

        dibujarPoligono(res[0],res[1],g);
    }

    @Override
    public void poligonoEscalar(int[] x, int[] y, int tX, int tY, Graphics g) {
        int[][] res = transladar(x,y,tX,tY);
        res = ajusteArreglosEscalares(res[0],res[1]);

        dibujarPoligono(res[0], res[1],g);
    }

    @Override
    public void poligonoEscalar(int[] x, int[] y, float sX, float sY, int tX, int tY, Graphics g) {
        int[][] res = escalar(x,y,sX,sY);
        res = transladar(res[0],res[1],tX,tY);
        res = ajusteArreglosEscalares(res[0],res[1]);

        dibujarPoligono(res[0],res[1],g);
    }

    @Override
    public void rellenarPoligonoEscalar(int[] x, int[] y, Color relleno, Color borde, Graphics g) {
        int[][] res = ajusteArreglosEscalares(x,y);

        g.setColor(relleno);
        g.fillPolygon(res[0],res[1],res[0].length);
        g.setColor(borde);
        dibujarPoligono(res[0], res[1],g);
    }

    @Override
    public void rellenarPoligonoEscalar(int[] x, int[] y, float sX, float sY, Color relleno, Color borde, Graphics g) {
        int[][] res = escalar(x,y,sX,sY);
        res = ajusteArreglosEscalares(res[0],res[1]);

        g.setColor(relleno);
        g.fillPolygon(res[0],res[1],res[0].length);
        g.setColor(borde);
        dibujarPoligono(res[0],res[1],g);
    }

    @Override
    public void rellenarPoligonoEscalar(int[] x, int[] y, int tX, int tY, Color relleno, Color borde, Graphics g) {
        int[][] res = transladar(x,y,tX,tY);
        res = ajusteArreglosEscalares(res[0],res[1]);

        g.setColor(relleno);
        g.fillPolygon(res[0],res[1],res[0].length);
        g.setColor(borde);
        dibujarPoligono(res[0],res[1],g);
    }

    @Override
    public void rellenarPoligonoEscalar(int[] x, int[] y, float sX, float sY, int tX, int tY, Color relleno, Color borde, Graphics g) {
        int[][] res = escalar(x,y,sX,sY);
        res = transladar(res[0],res[1],tX,tY);
        res = ajusteArreglosEscalares(res[0],res[1]);

        g.setColor(relleno);
        g.fillPolygon(res[0],res[1],res[0].length);
        g.setColor(borde);
        dibujarPoligono(res[0],res[1],g);
    }

    @Override
    public void poligonoRotado(int[] x, int[] y, int grados, Graphics g) {
        int[][] res = rotar(x,y,grados);
        res = ajusteArreglosEscalares(res[0],res[1]);

        dibujarPoligono(res[0],res[1],g);
    }

    @Override
    public void poligonoRotado(int[] x, int[] y, int grados, int tX, int tY, Graphics g) {
        int[][] res = rotar(x,y,grados);
        res = transladar(res[0],res[1],tX,tY);
        res = ajusteArreglosEscalares(res[0],res[1]);

        dibujarPoligono(res[0],res[1],g);
    }

    @Override
    public void poligonoRotado(int[] x, int[] y, int grados, float sX, float sY, Graphics g) {
        int[][] res = escalar(x,y,sX,sY);
        res = rotar(res[0],res[1],grados);
        res = ajusteArreglosEscalares(res[0],res[1]);

        g.fillPolygon(res[0],res[1],res[0].length);
        dibujarPoligono(res[0],res[1],g);
    }

    @Override
    public void poligonoRotado(int[] x, int[] y, int grados, int tX, int tY, float sX, float sY, Graphics g) {
        int[][] res = escalar(x,y,sX,sY);
        res = rotar(res[0],res[1],grados);
        res = transladar(res[0],res[1],tX,tY);
        res = ajusteArreglosEscalares(res[0],res[1]);

        dibujarPoligono(res[0],res[1],g);
    }

    @Override
    public void rellenarPoligonoRotado(int[] x, int[] y, int grados, Color relleno, Color borde, Graphics g) {
        int[][] res = rotar(x,y,grados);
        res = ajusteArreglosEscalares(res[0],res[1]);

        g.setColor(relleno);
        g.fillPolygon(res[0],res[1],res[0].length);
        g.setColor(borde);
        dibujarPoligono(res[0],res[1],g);
    }

    @Override
    public void rellenarPoligonoRotado(int[] x, int[] y, int grados, int tX, int tY, Color relleno, Color borde, Graphics g) {
        int[][] res = rotar(x,y,grados);
        res = transladar(res[0],res[1],tX,tY);
        res = ajusteArreglosEscalares(res[0],res[1]);

        g.setColor(relleno);
        g.fillPolygon(res[0],res[1],res[0].length);
        g.setColor(borde);
        dibujarPoligono(res[0],res[1],g);
    }

    @Override
    public void rellenarPoligonoRotado(int[] x, int[] y, int grados, float sX, float sY, Color relleno, Color borde, Graphics g) {
        int[][] res = escalar(x,y,sX,sY);
        res = rotar(res[0],res[1],grados);
        res = ajusteArreglosEscalares(res[0],res[1]);

        g.setColor(relleno);
        g.fillPolygon(res[0],res[1],res[0].length);
        g.setColor(borde);
        dibujarPoligono(res[0],res[1],g);
    }

    @Override
    public void rellenarPoligonoRotado(int[] x, int[] y, int grados, int tX, int tY, float sX, float sY, Color relleno, Color borde, Graphics g) {
        int[][] res = escalar(x,y,sX,sY);
        res = rotar(res[0],res[1],grados);
        res = transladar(res[0],res[1],tX,tY);
        res = ajusteArreglosEscalares(res[0],res[1]);

        g.setColor(relleno);
        g.fillPolygon(res[0],res[1],res[0].length);
        g.setColor(borde);
        dibujarPoligono(res[0],res[1],g);
    }

    @Override
    public void reflejarPoligonoSobreX(int[] x, int[] y, Graphics g) {
        poligonoRotado(x,y,360,g);
    }

    @Override
    public void reflejarPoligonoSobreY(int[] x, int[] y, Graphics g) {
        poligonoRotado(x,y,180,g);
    }

    @Override
    public void reflejarPoligonoSobreOrigen(int[] x, int[] y, Graphics g) {
        poligonoRotado(y,x,270,g);
    }

    @Override
    public void reflejarPoligonoYigualX(int[] x, int[] y, Graphics g) {
        poligonoEscalar(y,x,g);
    }

    @Override
    public void reflejarPoligonoYigualMenosX(int[] x, int[] y, Graphics g) {
        poligonoRotado(x,y,270,g);
    }

    @Override
    public void recortarPoligonoDeXSobreX(int[] x, int[] y, float shX, Graphics g) {
        int[] wX = x.clone();
        int[] wY = y.clone();
        for(int i = 0; i <= wX.length-1;i++){
            wX[i] = Math.round(wX[i] + shX * y[i]);
        }
        poligonoEscalar(wX,wY,g);  //Recorte de la direccion de x en relacion con el eje x
    }

    @Override
    public void recortarPoligonoDeXSobreY(int[] x, int[] y, float shX, int refY, Graphics g) {
        int[] wX = x.clone();
        int[] wY = y.clone();
        for(int i = 0; i <= wX.length-1;i++){
            wX[i] = Math.round(wX[i] + shX * (y[i] - refY));
        }
        poligonoEscalar(wX,wY,g);  //Recorte de la direccion de x en relacion con otras lineas de referencia
    }

    @Override
    public void recortarPoligonoDeYSobreY(int[] x, int[] y, float shY, Graphics g) {
        int[] wX = x.clone();
        int[] wY = y.clone();
        for(int i = 0; i <= wY.length-1;i++){
            wY[i] = Math.round(wY[i] + shY * x[i]);
        }
        poligonoEscalar(wX,wY,g);  //Recorte de la direccion de y en relacion con el eje de y
    }

    @Override
    public void recortarPoligonoDeYSobreX(int[] x, int[] y, float shY, int refX, Graphics g) {
        int[] wX = x.clone();
        int[] wY = y.clone();
        for(int i = 0; i <= wY.length-1;i++){
            wY[i] = Math.round(wY[i] + shY * (x[i] - refX));
        }
        poligonoEscalar(wX,wY,g);   //Recorte de la direccion de y en relacion con el eje de x
    }
}
