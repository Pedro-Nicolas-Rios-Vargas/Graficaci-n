/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 8
Fecha: 12/Octubre/2020
 */

package practicas.pract8.partes;

import java.awt.Graphics;
import java.awt.Color;

import practicas.pract8.PanelBase;

public class Parte2_7 extends PanelBase {

    private final int[] X = {-8,8,8,-8};
    private final int[] Y = {8,8,-8,-8};

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        mapa.rellenarPoligonoEscalar(X,Y,Color.WHITE,new Color(0x00A000),g);
        mapa.rellenarPoligonoRotado(X,Y,40,Color.WHITE,new Color(0x00A000),g);
        mapa.rellenarPoligonoRotado(X,Y,75,Color.WHITE,new Color(0x00A000),g);
        mapa.rellenarPoligonoRotado(X,Y,15,Color.WHITE,new Color(0x00A000),g);
    }
}
