/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 10
Fecha: 30/Octubre/2020
 */
package graficos.cartesiano.Vectorial;

import java.awt.*;

import static graficos.Linea.*;
import static graficos.Circunferencia.circuloBresenham;
import static graficos.Circunferencia.circunferenciaRemarcada;
import static graficos.Circunferencia.rellenarCirculo;

import static graficos.Polilinea.*;

/**
 * La clase <code>FigurasCartesianasVectores</code> contiene los metodos necesarios
 * para dibujar todos los elementos graficos que se han visto hasta la unidad 2 de Graficacion
 * adaptados para ser dibujados en un mapa cartesiano responsivo al marco de la aplicacion
 * utilizando matrices para realizar estas adaptaciones.
 *
 *
 * @author Pedro Nicolas Rios Vargas
 */
public class FigurasCartesianasVectores extends CartesianoVectores {

//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬§ METODOS PARA DIBUJAR LINEAS §▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬

    @Override
    public void linea(int x1, int y1, int x2, int y2, Graphics g) {
        double[][] matrizP = new double[][]{
                { x1, x2},
                {-y1,-y2},
                { 1, 1}
        };

        double[][] t = t(zeroAxisX,zeroAxisY);
        double[][] s = s(10,10);
        double[][] m1 = multiplicacion(t,s);
        double[][] res = multiplicacion(m1,matrizP);

        int[] x = actualizaPuntos(res,0);
        int[] y = actualizaPuntos(res,1);
        dibujarLinea(x[0],y[0],x[1],y[1],g);
    }

    @Override
    public void linea(int x1, int y1, int x2, int y2, Color color, Graphics g) {
        double[][] matrizP = new double[][]{
                { x1, x2},
                {-y1,-y2},
                { 1, 1}
        };

        double[][] t = t(zeroAxisX,zeroAxisY);
        double[][] s = s(10,10);
        double[][] m1 = multiplicacion(t,s);
        double[][] res = multiplicacion(m1,matrizP);

        int[] x = actualizaPuntos(res,0);
        int[] y = actualizaPuntos(res,1);
        dibujarLinea(x[0],y[0],x[1],y[1],color,g);
    }

    @Override
    public void linea(int x1, int y1, int x2, int y2, int grosor, Graphics g) {
        double[][] matrizP = new double[][]{
                { x1, x2},
                {-y1,-y2},
                { 1, 1}
        };

        double[][] t = t(zeroAxisX,zeroAxisY);
        double[][] s = s(10,10);
        double[][] m1 = multiplicacion(t,s);
        double[][] res = multiplicacion(m1,matrizP);

        int[] x = actualizaPuntos(res,0);
        int[] y = actualizaPuntos(res,1);
        dibujarLinea(x[0],y[0],x[1],y[1],grosor,g);
    }

    @Override
    public void linea(int x1, int y1, int x2, int y2, Color color, int grosor, Graphics g) {
        double[][] matrizP = new double[][]{
                { x1, x2},
                {-y1,-y2},
                { 1, 1}
        };

        double[][] t = t(zeroAxisX,zeroAxisY);
        double[][] s = s(10,10);
        double[][] m1 = multiplicacion(t,s);
        double[][] res = multiplicacion(m1,matrizP);

        int[] x = actualizaPuntos(res,0);
        int[] y = actualizaPuntos(res,1);
        dibujarLinea(x[0],y[0],x[1],y[1],color,grosor,g);
    }

//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬§ METODOS PARA DIBUJAR LINEAS A ESCALA §▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬

    @Override
    public void lineaEscalar(int x1, int y1, int x2, int y2, Graphics g) {
        double[][] matrizP = new double[][]{
                { x1, x2},
                {-y1,-y2},
                { 1, 1}
        };

        double[][] t = t(zeroAxisX,zeroAxisY);
        double[][] s = s(escalarX,escalarY);
        double[][] m1 = multiplicacion(t,s);
        double[][] res = multiplicacion(m1,matrizP);

        int[] x = actualizaPuntos(res,0);
        int[] y = actualizaPuntos(res,1);
        dibujarLinea(x[0],y[0],x[1],y[1],g);
    }

    @Override
    public void lineaEscalar(int x1, int y1, int x2, int y2, Color color, Graphics g) {
        double[][] matrizP = new double[][]{
                { x1, x2},
                {-y1,-y2},
                { 1, 1}
        };

        double[][] t = t(zeroAxisX,zeroAxisY);
        double[][] s = s(escalarX,escalarY);
        double[][] m1 = multiplicacion(t,s);
        double[][] res = multiplicacion(m1,matrizP);

        int[] x = actualizaPuntos(res,0);
        int[] y = actualizaPuntos(res,1);
        dibujarLinea(x[0],y[0],x[1],y[1],color,g);
    }

    @Override
    public void lineaEscalar(int x1, int y1, int x2, int y2, int grosor, Graphics g) {
        double[][] matrizP = new double[][]{
                { x1, x2},
                {-y1,-y2},
                { 1, 1}
        };

        double[][] t = t(zeroAxisX,zeroAxisY);
        double[][] s = s(escalarX,escalarY);
        double[][] m1 = multiplicacion(t,s);
        double[][] res = multiplicacion(m1,matrizP);

        int[] x = actualizaPuntos(res,0);
        int[] y = actualizaPuntos(res,1);
        dibujarLinea(x[0],y[0],x[1],y[1],grosor,g);
    }

    @Override
    public void lineaEscalar(int x1, int y1, int x2, int y2, Color color, int grosor, Graphics g) {
        double[][] matrizP = new double[][]{
                { x1, x2},
                {-y1,-y2},
                { 1, 1}
        };

        double[][] t = t(zeroAxisX,zeroAxisY);
        double[][] s = s(escalarX,escalarY);
        double[][] m1 = multiplicacion(t,s);
        double[][] res = multiplicacion(m1,matrizP);

        int[] x = actualizaPuntos(res,0);
        int[] y = actualizaPuntos(res,1);
        dibujarLinea(x[0],y[0],x[1],y[1],color,grosor,g);
    }

//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬§ METODOS PARA DIBUJAR CIRCULOS §▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬

    @Override
    public void circulo(int xC, int yC, int r, Graphics g) {
        double[][] matrizP = new double[][]{
                { xC},
                {-yC},
                {  1}
        };

        double[][] t = t(zeroAxisX,zeroAxisY);
        double[][] s = s(10,10);
        double[][] m1 = multiplicacion(t,s);
        double[][] res = multiplicacion(m1,matrizP);

        int[] x = actualizaPuntos(res,0);
        int[] y = actualizaPuntos(res,1);
        circuloBresenham(x[0], y[0], r * 10, g);
    }

    @Override
    public void circuloEscalar(int xC, int yC, int r, Graphics g) {
        double[][] matrizP = new double[][]{
                { xC},
                {-yC},
                {  1}
        };

        double[][] t = t(zeroAxisX,zeroAxisY);
        double[][] s = s(escalarX,escalarY);
        double[][] m1 = multiplicacion(t,s);
        double[][] res = multiplicacion(m1,matrizP);

        int[] x = actualizaPuntos(res,0);
        int[] y = actualizaPuntos(res,1);
        circuloBresenham(x[0], y[0], r * escalarX, g);
    }

//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬§ METODOS DIBUJAR CIRCULOS RELLENOS §▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬

    @Override
    public void circuloRelleno(int xC, int yC, int r, Graphics g) {
        double[][] matrizP = new double[][]{
                { xC},
                {-yC},
                {  1}
        };

        double[][] t = t(zeroAxisX,zeroAxisY);
        double[][] s = s(10,10);
        double[][] m1 = multiplicacion(t,s);
        double[][] res = multiplicacion(m1,matrizP);

        int[] x = actualizaPuntos(res,0);
        int[] y = actualizaPuntos(res,1);
        rellenarCirculo(x[0], y[0], r * 10, g);
    }

    @Override
    public void circuloRellenoEscalar(int xC, int yC, int r, Graphics g) {
        double[][] matrizP = new double[][]{
                { xC},
                {-yC},
                {  1}
        };

        double[][] t = t(zeroAxisX,zeroAxisY);
        double[][] s = s(escalarX,escalarY);
        double[][] m1 = multiplicacion(t,s);
        double[][] res = multiplicacion(m1,matrizP);

        int[] x = actualizaPuntos(res,0);
        int[] y = actualizaPuntos(res,1);
        rellenarCirculo(x[0], y[0], r * escalarX, g);
    }

//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬§ METODOS PARA DIBUJAR RUEDA §▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬

    @Override
    public void rueda(int xC, int yC, int r, Graphics g) {
        double[][] matrizP = new double[][]{
                { xC},
                {-yC},
                {  1}
        };

        double[][] t = t(zeroAxisX,zeroAxisY);
        double[][] s = s(10,10);
        double[][] m1 = multiplicacion(t,s);
        double[][] res = multiplicacion(m1,matrizP);

        int[] x = actualizaPuntos(res,0);
        int[] y = actualizaPuntos(res,1);
        circunferenciaRemarcada(x[0], y[0], r * 10, g);
    }

    @Override
    public void ruedaEscalar(int xC, int yC, int r, Graphics g) {
        double[][] matrizP = new double[][]{
                { xC},
                {-yC},
                {  1}
        };

        double[][] t = t(zeroAxisX,zeroAxisY);
        double[][] s = s(escalarX,escalarY);
        double[][] m1 = multiplicacion(t,s);
        double[][] res = multiplicacion(m1,matrizP);

        int[] x = actualizaPuntos(res,0);
        int[] y = actualizaPuntos(res,1);
        circunferenciaRemarcada(x[0], y[0], r * escalarX, g);
    }

//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬§ METODOS PARA DIBUJAR POLILINEA §▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬

    @Override
    public void polilinea(int[] x, int[] y, Graphics g) {
        int[][] res = ajusteArreglos(x,y);
        dibujarPolilinea(res[0],res[1],g);
    }

    @Override
    public void polilineaEscalar(int[] x, int[] y, Graphics g) {
        int[][] res = ajusteArreglosEscalares(x,y);
        dibujarPolilinea(res[0],res[1],g);
    }

//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬§ METODOS PARA DIBUJAR POLIGONO §▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬

    @Override
    public void poligono(int[] x, int[] y, Graphics g) {
        int[][] res = ajusteArreglos(x,y);
        dibujarPoligono(res[0],res[1],g);
    }

    @Override
    public void poligonoEscalar(int[] x, int[] y, Graphics g) {
        int[][] res = ajusteArreglosEscalares(x,y);

        dibujarPoligono(res[0],res[1],g);
    }

    @Override
    public void poligonoEscalar(int[] x, int[] y, float sX, float sY, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] s = s(sX,sY);
        double[][] primeraEscalacion = multiplicacion(s,matrizPts);

        double[][] res = ajusteArreglosEscalares(primeraEscalacion);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        dibujarPoligono(resX,resY,g);
    }

    @Override
    public void poligonoEscalarInv(int[] x, int[] y, float sX, float sY, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] s = sInv(sX,sY);
        double[][] primeraEscalacion = multiplicacion(s,matrizPts);

        double[][] res = ajusteArreglosEscalares(primeraEscalacion);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        dibujarPoligono(resX,resY,g);
    }

    @Override
    public void poligonoEscalar(int[] x, int[] y, int tX, int tY, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] t = t(tX,tY);
        double[][] traslacion = multiplicacion(t,matrizPts);

        double[][] res = ajusteArreglosEscalares(traslacion);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        dibujarPoligono(resX,resY,g);
    }

    @Override
    public void poligonoEscalarInv(int[] x, int[] y, int tX, int tY, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] t = tInv(tX,tY);
        double[][] traslacion = multiplicacion(t,matrizPts);

        double[][] res = ajusteArreglosEscalares(traslacion);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        dibujarPoligono(resX,resY,g);
    }

    @Override
    public void poligonoEscalar(int[] x, int[] y, float sX, float sY, int tX, int tY, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] s = s(tX,tY,sX,sY);
        double[][] resCoord = multiplicacion(s,matrizPts);

        double[][] res = ajusteArreglosEscalares(resCoord);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        dibujarPoligono(resX,resY,g);
    }

    @Override
    public void poligonoEscalarInv(int[] x, int[] y, float sX, float sY, int tX, int tY, Graphics g) {
        poligonoEscalar(x,y,1/sX,1/sY,-tX,-tY,g);
    }

    @Override
    public void rellenarPoligonoEscalar(int[] x, int[] y, Color relleno, Color borde, Graphics g) {
        int[][] res = ajusteArreglosEscalares(x,y);

        g.setColor(relleno);
        g.fillPolygon(res[0],res[1],res[0].length);
        g.setColor(borde);
        dibujarPoligono(res[0],res[1],g);
    }

    @Override
    public void rellenarPoligonoEscalar(int[] x, int[] y, float sX, float sY, Color relleno, Color borde, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] s = s(sX,sY);
        double[][] primeraEscalacion = multiplicacion(s,matrizPts);

        double[][] res = ajusteArreglosEscalares(primeraEscalacion);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        g.setColor(relleno);
        g.fillPolygon(resX,resY,resX.length);
        g.setColor(borde);
        dibujarPoligono(resX,resY,g);
    }

    @Override
    public void rellenarPoligonoEscalarInv(int[] x, int[] y, float sX, float sY, Color relleno, Color borde, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] s = sInv(sX,sY);
        double[][] primeraEscalacion = multiplicacion(s,matrizPts);

        double[][] res = ajusteArreglosEscalares(primeraEscalacion);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        g.setColor(relleno);
        g.fillPolygon(resX,resY,resX.length);
        g.setColor(borde);
        dibujarPoligono(resX,resY,g);
    }

    @Override
    public void rellenarPoligonoEscalar(int[] x, int[] y, int tX, int tY, Color relleno, Color borde, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] t = t(tX,-tY);
        double[][] traslacion = multiplicacion(t,matrizPts);

        double[][] res = ajusteArreglosEscalares(traslacion);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        g.setColor(relleno);
        g.fillPolygon(resX,resY,resX.length);
        g.setColor(borde);
        dibujarPoligono(resX,resY,g);
    }

    @Override
    public void rellenarPoligonoEscalarInv(int[] x, int[] y, int tX, int tY, Color relleno, Color borde, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] t = tInv(tX,-tY);
        double[][] traslacion = multiplicacion(t,matrizPts);

        double[][] res = ajusteArreglosEscalares(traslacion);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        g.setColor(relleno);
        g.fillPolygon(resX,resY,resX.length);
        g.setColor(borde);
        dibujarPoligono(resX,resY,g);
    }

    @Override
    public void rellenarPoligonoEscalar(int[] x, int[] y, float sX, float sY, int tX, int tY, Color relleno, Color borde, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] s = s(tX,tY,sX,sY);
        double[][] resCoord = multiplicacion(s,matrizPts);

        double[][] res = ajusteArreglosEscalares(resCoord);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        g.setColor(relleno);
        g.fillPolygon(resX,resY,resX.length);
        g.setColor(borde);
        dibujarPoligono(resX,resY,g);
    }

    @Override
    public void rellenarPoligonoEscalarInv(int[] x, int[] y, float sX, float sY, int tX, int tY, Color relleno, Color borde, Graphics g) {
        rellenarPoligonoEscalar(x,y,1/sX,1/sY,-tX,-tY,relleno,borde,g);
    }

//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬§ METODOS PARA ROTAR POLIGONOS §▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬

    @Override
    public void poligonoRotado(int[] x, int[] y, int grados, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] matrizRot = r(grados);
        double[][] rotacion = multiplicacion(matrizRot,matrizPts);

        double[][] res = ajusteArreglosEscalares(rotacion);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        dibujarPoligono(resX,resY,g);
    }

    @Override
    public void poligonoRotadoInv(int[] x, int[] y, int grados, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] matrizRot = rInv(grados);
        double[][] rotacion = multiplicacion(matrizRot,matrizPts);

        double[][] res = ajusteArreglosEscalares(rotacion);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        dibujarPoligono(resX,resY,g);
    }

    @Override
    public void poligonoRotado(int[] x, int[] y, int grados, int tX, int tY, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] mtzTrans = r(tX,tY,grados);

        double[][] rotacion = multiplicacion(mtzTrans,matrizPts);

        double[][] res = ajusteArreglosEscalares(rotacion);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        dibujarPoligono(resX,resY,g);
    }

    @Override
    public void poligonoRotadoInv(int[] x, int[] y, int grados, int tX, int tY, Graphics g) {
        poligonoRotado(x,y,-grados,tX,tY,g);
    }

    @Override
    public void poligonoRotado(int[] x, int[] y, int grados, float sX, float sY, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] matrizEsc = s(sX,sY);
        double[][] matrizRot = r(grados);
        double[][] mtzTrans = multiplicacion(matrizEsc,matrizRot);

        double[][] rotacion = multiplicacion(mtzTrans,matrizPts);

        double[][] res = ajusteArreglosEscalares(rotacion);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        dibujarPoligono(resX,resY,g);
    }

    @Override
    public void poligonoRotadoInv(int[] x, int[] y, int grados, float sX, float sY, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] matrizEsc = s(sX,sY);
        double[][] matrizRot = rInv(grados);
        double[][] mtzTrans = multiplicacion(matrizEsc,matrizRot);

        double[][] rotacion = multiplicacion(mtzTrans,matrizPts);

        double[][] res = ajusteArreglosEscalares(rotacion);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        dibujarPoligono(resX,resY,g);
    }

    @Override
    public void poligonoRotado(int[] x, int[] y, int grados, int tX, int tY, float sX, float sY, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] matrizEsc = s(sX,sY);
        double[][] matrizTras = r(tX,tY,grados);
        double[][] mtzTrans = multiplicacion(matrizEsc,matrizTras);

        double[][] rotacion = multiplicacion(mtzTrans,matrizPts);

        double[][] res = ajusteArreglosEscalares(rotacion);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        dibujarPoligono(resX,resY,g);
    }

    @Override
    public void poligonoRotadoInv(int[] x, int[] y, int grados, int tX, int tY, float sX, float sY, Graphics g) {
        poligonoRotado(x,y,-grados,tX,tY,sX,sY,g);
    }

    @Override
    public void rellenarPoligonoRotado(int[] x, int[] y, int grados, Color relleno, Color borde, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] matrizRot = r(grados);
        double[][] rotacion = multiplicacion(matrizRot,matrizPts);

        double[][] res = ajusteArreglosEscalares(rotacion);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        g.setColor(relleno);
        g.fillPolygon(resX,resY,resX.length);
        g.setColor(borde);
        dibujarPoligono(resX,resY,g);
    }

    @Override
    public void rellenarPoligonoRotadoInv(int[] x, int[] y, int grados, Color relleno, Color borde, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] matrizRot = rInv(grados);
        double[][] rotacion = multiplicacion(matrizRot,matrizPts);

        double[][] res = ajusteArreglosEscalares(rotacion);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        g.setColor(relleno);
        g.fillPolygon(resX,resY,resX.length);
        g.setColor(borde);
        dibujarPoligono(resX,resY,g);
    }

    @Override
    public void rellenarPoligonoRotado(int[] x, int[] y, int grados, int tX, int tY, Color relleno, Color borde, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] mtzTrans = r(tX,tY,grados);

        double[][] rotacion = multiplicacion(mtzTrans,matrizPts);

        double[][] res = ajusteArreglosEscalares(rotacion);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        g.setColor(relleno);
        g.fillPolygon(resX,resY,resX.length);
        g.setColor(borde);
        dibujarPoligono(resX,resY,g);
    }

    @Override
    public void rellenarPoligonoRotadoInv(int[] x, int[] y, int grados, int tX, int tY, Color relleno, Color borde, Graphics g) {
        rellenarPoligonoRotado(x,y,-grados,tX,tY,relleno,borde,g);
    }

    @Override
    public void rellenarPoligonoRotado(int[] x, int[] y, int grados, float sX, float sY, Color relleno, Color borde, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] matrizEsc = s(sX,sY);
        double[][] matrizRot = r(grados);
        double[][] mtzTrans = multiplicacion(matrizEsc,matrizRot);

        double[][] rotacion = multiplicacion(mtzTrans,matrizPts);

        double[][] res = ajusteArreglosEscalares(rotacion);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        g.setColor(relleno);
        g.fillPolygon(resX,resY,resX.length);
        g.setColor(borde);
        dibujarPoligono(resX,resY,g);
    }

    @Override
    public void rellenarPoligonoRotadoInv(int[] x, int[] y, int grados, float sX, float sY, Color relleno, Color borde, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] matrizEsc = s(sX,sY);
        double[][] matrizRot = rInv(grados);
        double[][] mtzTrans = multiplicacion(matrizEsc,matrizRot);

        double[][] rotacion = multiplicacion(mtzTrans,matrizPts);

        double[][] res = ajusteArreglosEscalares(rotacion);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        g.setColor(relleno);
        g.fillPolygon(resX,resY,resX.length);
        g.setColor(borde);
        dibujarPoligono(resX,resY,g);
    }

    @Override
    public void rellenarPoligonoRotado(int[] x, int[] y, int grados, int tX, int tY, float sX, float sY, Color relleno, Color borde, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] matrizEsc = s(sX,sY);
        double[][] matrizTras = r(tX,tY,grados);
        double[][] mtzTrans = multiplicacion(matrizEsc,matrizTras);

        double[][] rotacion = multiplicacion(mtzTrans,matrizPts);

        double[][] res = ajusteArreglosEscalares(rotacion);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        g.setColor(relleno);
        g.fillPolygon(resX,resY,resX.length);
        g.setColor(borde);
        dibujarPoligono(resX,resY,g);
    }

    @Override
    public void rellenarPoligonoRotadoInv(int[] x, int[] y, int grados, int tX, int tY, float sX, float sY, Color relleno, Color borde, Graphics g) {
        rellenarPoligonoRotado(x,y,-grados,tX,tY,sX,sY,relleno,borde,g);
    }

//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬§ METODOS PARA REFLEJAR POLIGONOS §▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬

    @Override
    public void reflejarPoligonoSobreX(int[] x, int[] y, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] res = multiplicacion(refX(),matrizPts);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        poligonoEscalar(resX,resY,g);
    }

    @Override
    public void reflejarPoligonoSobreY(int[] x, int[] y, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] res = multiplicacion(refY(),matrizPts);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        poligonoEscalar(resX,resY,g);
    }

    @Override
    public void reflejarPoligonoSobreOrigen(int[] x, int[] y, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] res = multiplicacion(refOrigen(),matrizPts);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        poligonoEscalar(resX,resY,g);
    }

    @Override
    public void reflejarPoligonoYigualX(int[] x, int[] y, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] res = multiplicacion(refYigualX(),matrizPts);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        poligonoEscalar(resX,resY,g);
    }

    @Override
    public void reflejarPoligonoYigualMenosX(int[] x, int[] y, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] res = multiplicacion(refYigualMenosX(),matrizPts);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        poligonoEscalar(resX,resY,g);
    }

    @Override
    public void rellenarReflejoPoligonoSobreX(int[] x, int[] y, Color relleno, Color borde, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] res = multiplicacion(refX(),matrizPts);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        rellenarPoligonoEscalar(resX,resY,relleno,borde,g);
    }

    @Override
    public void rellenarReflejoPoligonoSobreY(int[] x, int[] y, Color relleno, Color borde, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] res = multiplicacion(refY(),matrizPts);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        rellenarPoligonoEscalar(resX,resY,relleno,borde,g);
    }

    @Override
    public void rellenarReflejoPoligonoSobreOrigen(int[] x, int[] y, Color relleno, Color borde, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] res = multiplicacion(refOrigen(),matrizPts);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        rellenarPoligonoEscalar(resX,resY,relleno,borde,g);

    }

    @Override
    public void rellenarReflejoPoligonoYigualX(int[] x, int[] y, Color relleno, Color borde, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] res = multiplicacion(refYigualX(),matrizPts);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        rellenarPoligonoEscalar(resX,resY,relleno,borde,g);

    }

    @Override
    public void rellenarReflejoPoligonoYigualMenosX(int[] x, int[] y, Color relleno, Color borde, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] res = multiplicacion(refYigualMenosX(),matrizPts);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        rellenarPoligonoEscalar(resX,resY,relleno,borde,g);
    }

//▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬§ METODOS PARA RECORTAR POLIGONOS §▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬

    @Override
    public void recortarPoligonoDeXSobreX(int[] x, int[] y, float shX, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] res = multiplicacion(cX(shX),matrizPts);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        poligonoEscalar(resX,resY,g);
    }

    @Override
    public void recortarPoligonoDeXSobreY(int[] x, int[] y, float shX, int refY, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] res = multiplicacion(cXLinea(refY,shX),matrizPts);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        poligonoEscalar(resX,resY,g);
    }

    @Override
    public void recortarPoligonoDeYSobreY(int[] x, int[] y, float shY, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] res = multiplicacion(cY(shY),matrizPts);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        poligonoEscalar(resX,resY,g);
    }

    @Override
    public void recortarPoligonoDeYSobreX(int[] x, int[] y, float shY, int refX, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] res = multiplicacion(cYLinea(refX,shY),matrizPts);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        poligonoEscalar(resX,resY,g);
    }

    @Override
    public void rellenarRecortePoligonoDeXSobreX(int[] x, int[] y, float shX, Color relleno, Color borde, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] res = multiplicacion(cX(shX),matrizPts);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        rellenarPoligonoEscalar(resX,resY,relleno,borde,g);
    }

    @Override
    public void rellenarRecortePoligonoDeXSobreY(int[] x, int[] y, float shX, int refY, Color relleno, Color borde, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] res = multiplicacion(cXLinea(refY,shX),matrizPts);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        rellenarPoligonoEscalar(resX,resY,relleno,borde,g);
    }

    @Override
    public void rellenarRecortePoligonoDeYSobreY(int[] x, int[] y, float shY, Color relleno, Color borde, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] res = multiplicacion(cY(shY),matrizPts);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        rellenarPoligonoEscalar(resX,resY,relleno,borde,g);
    }

    @Override
    public void rellenarRecortePoligonoDeYSobreX(int[] x, int[] y, float shY, int refX, Color relleno, Color borde, Graphics g) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] res = multiplicacion(cYLinea(refX,shY),matrizPts);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        rellenarPoligonoEscalar(resX,resY,relleno,borde,g);
    }

    @Override
    public int[][] transladar(int[] x, int[] y, int tX, int tY) {
        return super.transladar(x, y, tX, tY);
    }

    @Override
    public int[][] escalar(int[] x, int[] y, float sX, float sY) {
        return super.escalar(x, y, sX, sY);
    }

    @Override
    public int[][] rotar(int[] x, int[] y, int grados) {
        return super.rotar(x, y, grados);
    }
}
