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

    /**
     * Unico constructor de la clase PanelBase el cual solicita un valor booleano para
     * elegir la metodologia a utilzar para realizar los dibujos graficos.
     * <br><br>
     * Si es <b>true</b> se utilizara el metodo de vectores, de lo contrario
     * si es <b>false</b> se utilizara el metodo de algoritmos.
     *
     * @param metodo Valor booleano que permite seleccionar que tipo de metodo utilizar:
     *               si <b>true</b> vectorial de lo contrario si <b>false</b> algoritmos.
     */
    public Parte2_6(boolean metodo) {
        super(metodo);
    }

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
