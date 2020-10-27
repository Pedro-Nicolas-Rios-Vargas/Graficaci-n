/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 10
Fecha: 25/Octubre/2020
 */

package graficos.cartesiano;

import java.awt.Graphics;

import static graficos.Linea.*;

/**
 * La clase <code>MapaCartesiano</code> es la clase base en el diseño y dibujo
 * del mapa cartesiano, esta solo contiene dos metodos, uno para dibujar el mapa cartesiano
 * y el segundo para ajustar el tamaño del mapa cartesiano cuando la ventana cambia de tamaño.
 *
 * @author Pedro Nicolas Rios Vargas
 */
public abstract class MapaCartesiano extends GraficosCartesianos{
    protected int width;
    protected int height;

    protected int zeroAxisX;
    protected int zeroAxisY;

    protected int escalarX;
    protected int EscalarY;


    /**
     * Dibuja un mapa cartesiano ajustable al tamaño de la ventana.
     *
     * @param g Objeto grafico del invocador.
     */
    public void mapaCartesiano(Graphics g){
        //EJE X
        dibujarLinea(0, height /2, width, height /2,g);
        //EJE Y
        dibujarLinea(width /2,0, width /2, height,g);


        for(int x = 0; x<= width; x+= escalarX){
            dibujarLinea(x, zeroAxisY - EscalarY /2,x, zeroAxisY + EscalarY /2,g);
        }

        for(int y = 0; y<= height; y+= EscalarY){
            dibujarLinea(zeroAxisX - escalarX /2, y, zeroAxisX + escalarX /2, y,g);
        }

    }

  /**
     * Metodo que actualiza las variables de dimension de la clase  MapaCartesiano.
     * @param width     Anchura del canvas.
     * @param height    Altura del canvas.
     */
    public void actualizarAxis(int width, int height) {
        this.width = width;
        this.height = height;
        zeroAxisX = this.width /2;
        zeroAxisY = this.height /2;

        escalarX = Math.round(10 * (this.width * 0.001f));
        if(escalarX <=1){
            escalarX++;
        }
        EscalarY = Math.round(10 * (this.height * 0.0016666f));
        if(EscalarY <=2){
            EscalarY +=2;
        }
    }

}
