/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 8
Fecha: 12/Octubre/2020
 */

package practicas.pract8.partes;

import java.awt.Graphics;
import java.awt.Color;

import practicas.pract8.PanelBase;

public class Parte2_6 extends PanelBase {

    private final int[] X = {-4,4,4,-4};
    private final int[] Y = {4,4,-4,-4};

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        int[][] res;

        //BASE
        mapa.rellenarPoligonoEscalar(X,Y,Color.WHITE,new Color(0x00A000),g);

        //IMAGENES
        res = mapa.transladar(X,Y,-2,-2);
        mapa.rellenarPoligonoEscalar(res[0],res[1],Color.WHITE,new Color(0x00A000),g);

        for(int i = 0;i < 2;i++){
            res = mapa.transladar(res[0],res[1],-2,-2);
            mapa.rellenarPoligonoEscalar(res[0],res[1],Color.WHITE,new Color(0x00A000),g);
        }
    }
}
