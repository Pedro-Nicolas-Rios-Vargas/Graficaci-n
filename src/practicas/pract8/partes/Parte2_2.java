package practicas.pract8.partes;

import practicas.pract8.PanelBase;

import java.awt.Color;
import java.awt.Graphics;

public class Parte2_2 extends PanelBase{

    private final int[] X = {-4,0,4,0};
    private final int[] Y = {0,4,0,-4};

    /**
     * Dibuja 3 rombos y el original (de color negro) los cuales presentan distintas translaciones
     * con respecto al original.
     * @param g Objeto grafico del invocador.
     */
    private void parte2(Graphics g){

        mapa.rellenarPoligonoEscalar(X,Y,Color.BLACK,Color.BLACK,g);

        //TRANSLACIÓN A
        mapa.rellenarPoligonoEscalar(X,Y,0,2,Color.RED,Color.BLACK,g);

        //TRANSLACIÓN B
        mapa.rellenarPoligonoEscalar(X,Y,2,-5,Color.BLUE,Color.BLACK,g);

        //TRANSLACIÓN C
        mapa.rellenarPoligonoEscalar(X,Y,3,8,Color.GREEN,Color.BLACK,g);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        parte2(g);
    }
}
