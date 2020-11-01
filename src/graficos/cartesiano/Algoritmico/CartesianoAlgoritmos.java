/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 10
Fecha: 25/Octubre/2020
 */
package graficos.cartesiano.Algoritmico;

import graficos.cartesiano.MapaCartesiano;

/**
 * La clase <code>CartesianoAlgoritmos</code> contiene los metodos necesarios para realizar
 * los ajustes de las figuras en el plano carteasiano basandose en algoritmos.
 *
 * @author Pedro Nicolas Rios Vargas
 */
public class CartesianoAlgoritmos extends MapaCartesiano {


    /**
     * Se encarga de ajustar las coordenadas contenidas en los arreglos x[] e y[]
     * para dibujar lineas a escala de un plano cartesiano.
     * @param x Arreglo de coordenadas x de una polilinea.
     * @param y Arreglo de coordenadas y de una polilinea.
     * @return  Retorna una matriz compuesta de dos arreglos de igual tamaño. En la
     *          posicion 0 se encuentra el arreglo ajustado de coordenadas x y en la
     *          posicion 1 se encuentra el arreglo ajustado de coordenadas y.
     */
    protected int[][] ajusteArreglos(int[] x, int[] y){
        int[] x1 = x.clone();
        int[] y1 = y.clone();

        for(int i = 0; i <= x.length-1;i++){
            x1[i] = zeroAxisX + x1[i] * 10;
            y1[i] = zeroAxisY - y1[i] * 10;
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
    protected int[][] ajusteArreglosEscalares(int[] x, int[] y){
        int[] x1 = new int[x.length];
        System.arraycopy(x,0,x1,0,x.length);
        int[] y1 = new int[y.length];
        System.arraycopy(y,0,y1,0,y.length);

        for(int i = 0; i <= x.length-1;i++){
            x1[i] = zeroAxisX + x1[i] * escalarX;
            y1[i] = zeroAxisY - y1[i] * escalarY;
        }
        return new int[][]{x1, y1};
    }

    @Override
    public int[][] transladar(int[] x, int[] y, int tX, int tY){
        int[] xR = x.clone();
        int[] yR = y.clone();

        for(int i = 0; i <= x.length-1;i++){
            xR[i] += tX;
            yR[i] += tY;
        }
        return new int[][]{xR,yR};
    }

    @Override
    public int[][] escalar(int[] x, int[] y, float sX, float sY){
        int[] xR = new int[x.length];
        System.arraycopy(x,0,xR,0,x.length);
        int[] yR = new int[y.length];
        System.arraycopy(y,0,yR,0,y.length);

        for(int i = 0; i <= x.length-1;i++){
            xR[i] = Math.round(xR[i] * sX);
            yR[i] = Math.round(yR[i] * sY);
        }

        return new int[][]{xR,yR};
    }

    @Override
    public int[][] rotar(int[] x, int[] y, double grados){
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
