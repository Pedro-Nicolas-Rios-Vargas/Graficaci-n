/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 10
Fecha: 30/Octubre/2020
 */
package graficos.cartesiano.vectorial;

import graficos.cartesiano.MapaCartesiano;

/**
 * La clase <code>CartesianoVectores</code> contiene los metodos necesarios para realizar
 * los ajustes de las figuras en el plano cartesiano basandose en el uso de vectores.
 *
 * @author Pedro Nicolas Rios Vargas
 */
public class CartesianoVectores extends MapaCartesiano {

    public static void imprimirMatriz(double[][] matriz){
        System.out.println("\n[");
        for(int i = 0; i < matriz.length;i++){
            System.out.print("{");
            for(int j = 0; j < matriz[0].length;j++){
                System.out.printf("\t%.2f",matriz[i][j]);
                if(j != matriz[0].length-1){
                    System.out.print(",\t");
                }else{
                    System.out.print("}");
                }
            }
            if(i != matriz.length-1){
                System.out.println(",");
            }else{
                System.out.println("]\n");
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz){
        System.out.println("\n[");
        for(int i = 0; i < matriz.length;i++){
            System.out.print("{");
            for(int j = 0; j < matriz[0].length;j++){
                System.out.printf("\t%d",matriz[i][j]);
                if(j != matriz[0].length-1){
                    System.out.print(",\t");
                }else{
                    System.out.print("}");
                }
            }
            if(i != matriz.length-1){
                System.out.println(",");
            }else{
                System.out.println("]\n");
            }
        }
    }

    public static void imprimirArreglo(int[] a){
        System.out.print("{\t");
        for(int i = 0; i < a.length;i++){
            System.out.print(a[i]);
            if(i != a.length-1){
                System.out.print(",\t");
            }else{
                System.out.println("}\n");
            }
        }
    }

    /**
     * Metodo que invierte los valores de un arreglo. Si son positivos se vuelven negativos y viceversa.
     * @param y Arreglo a invertir.
     * @return  Arreglo invertido (y').
     */
    public static int[] invertirArreglo(int[] y) {
        int[] res = new int[y.length];

        for(int i = 0; i < y.length;i++){
            res[i] -= y[i];
        }
        return res;
    }
    /**
     * Se encarga de ajustar las coordenadas contenidas en los arreglos x[] e y[]
     * para dibujar lineas a escala de un plano cartesiano.
     * @param x Arreglo de coordenadas x de una polilinea.
     * @param y Arreglo de coordenadas y de una polilinea.
     * @return  Retorna una matriz compuesta de dos arreglos de igual tamaño. En la
     *          posicion 0 se encuentra el arreglo ajustado de coordenadas x y en la
     *          posicion 1 se encuentra el arreglo ajustado de coordenadas y.
     */
    protected int[][] ajusteArreglos(int[] x, int[] y) {
        int[] x1 = x.clone();
        int[] y1 = invertirArreglo(y);

        double[][] t = t(zeroAxisX,zeroAxisY);
        double[][] s = s(10,10);
        double[][] m1 = multiplicacion(t,s);

        double[][] matrizPts = matrizPuntos(x1,y1);

        double[][] res = multiplicacion(m1, matrizPts);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        return new int[][]{resX,resY};
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
    protected int[][] ajusteArreglosEscalares(int[] x, int[] y) {
        int[] x1 = x.clone();
        int[] y1 = invertirArreglo(y);

        double[][] t = t(zeroAxisX,zeroAxisY);
        double[][] s = s(escalarX,escalarY);
        double[][] m1 = multiplicacion(t,s);


        double[][] matrizPts = matrizPuntos(x1,y1);


        double[][] res = multiplicacion(m1, matrizPts);


        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        return new int[][]{resX,resY};
    }

    protected double[][] ajusteArreglosEscalares(double[][] matrizPts) {
        int[] resX = actualizaPuntos(matrizPts,0);
        int[] resY = actualizaPuntos(matrizPts,1);
        resY = invertirArreglo(resY);

        double[][] matrizPtsRes = matrizPuntos(resX,resY);

        double[][] t = t(zeroAxisX,zeroAxisY);
        double[][] s = s(escalarX,escalarY);
        double[][] mult = multiplicacion(t,s);

        double[][] res = multiplicacion(mult,matrizPtsRes);

        /*
        resX = actualizaPuntos(res,0);
        resY = actualizaPuntos(res,1);

        return matrizPuntos(resX,resY);
        */
        return res;
    }

    /**
     * Metodo que convierte los grados en radianes.
     * @param g Grados a convertir.
     * @return  Radianes.
     */
    public static double radianes(double g) {
        return g * (Math.PI/180);
    }

    public static double[][] matrizPuntos(int[] x, int[] y){
        int[] x1 = x.clone();
        int[] y1 = y.clone();

        double[][] mtz = new double[3][x.length];

        for(int i = 0; i < x.length;i++) {
            mtz[0][i] = x1[i];
            mtz[1][i] = y1[i];
            mtz[2][i] = 1;
        }
        return mtz;
    }

    /**
     * Metodo que multiplica dos matrices y regresa la matriz resultante de dicha multiplicacion.
     * @param a Matriz M1.
     * @param b Matriz P.
     * @return  Matriz resultante.
     */
    public static double[][] multiplicacion(double[][] a, double[][] b) {
        /*
        Para multiplicar dos matrices el multiplicador y multiplicando deben tener la
        misma cantidad de valores en columnas y en renglones respectivamente.

        Por lo tanto, la matriz "a" debe tener n columnas y la matriz "b" debe tener
        n renglones.

        El resultado debera ser del mismo numero de renglones de la matriz "a" y del mismo
        numero de columnas de la matriz "b"
         */
        double[][] res = new double[a.length][b[0].length];

        for(int i = 0; i < a.length;i++) {  //RECORRE LAS FILAS DEL MULTIPLICADOR
            for(int j  = 0; j < b[0].length;j++) {  //RECORRE LAS COLUMNAS DEL MULTIPLICANDO
                for(int k = 0; k < a[0].length;k++) {   //RECORRE LAS COLUMNAS DEL MULTIPLICADOR
                    res[i][j] += a[i][k] * b[k][j];
                }

            }
        }
        return res;
    }

    /**
     * Metodo que regresa la matriz de traslacion
     * @param dx    Traslacion en x.
     * @param dy    Traslacion en y.
     * @return  Matriz de traslacion.
     */
    public static double[][] t(double dx, double dy) {
        return new double[][]{
                {1,0, dx},
                {0,1, dy},
                {0,0,  1}
        };
    }

    /**
     * Metodo que regresa la matriz de traslacion inversa.
     * @param dx    Traslacion en x.
     * @param dy    Traslacion en y.
     * @return  Matriz de traslacion inversa.
     */
    public static double[][] tInv(double dx, double dy) {
        return new double[][]{
                {1,0,-dx},
                {0,1,-dy},
                {0,0,  1}
        };
    }

    /**
     * Metodo que regresa la matriz de escalacion basada en el origen de las coordenadas.
     * @param sx    Escalacion en x.
     * @param sy    Escalacion en y.
     * @return  Matriz de escalacion.
     */
    public static double[][] s(double sx, double sy) {
        return new double[][]{
                {sx, 0,0},
                { 0,sy,0},
                { 0, 0,1}
        };
    }

    /**
     * Metodo que regresa la matriz de escalacion basada en un punto fijo.
     * @param xf    Traslacion en x.
     * @param yf    Traslacion en y.
     * @param sx    Escalacion en x.
     * @param sy    Escalacion en y.
     * @return  Matriz de escalacion en un punto fijo.
     */
    public static double[][] s(double xf, double yf, double sx, double sy) {
        return new double[][]{
                {sx, 0,xf*(1-sx)},  //xf*(1-sx)
                { 0,sy,yf*(1-sy)},  //yf*(1-sy)
                { 0, 0,        1}
        };
    }

    /**
     * Metodo que regresa la matriz de escalacion inversa basada en el origen de las coordenadas.
     * @param sx    Escalacion en x.
     * @param sy    Escalacion en y.
     * @return  Matriz de escalacion inversa.
     */
    public static double[][] sInv(double sx, double sy) {
        return new double[][]{
                {1/sx,   0,   0},
                {   0,1/sy,   0},
                {   0,   0,   1}
        };
    }

    /**
     * Metodo que regresa la matriz de rotacion basada en el origen de las coordenadas.
     * @param g Grados a rotar.
     * @return  Matriz de rotacion.
     */
    public static double[][] r(double g) {
        double rad = radianes(g);
        return new double[][]{
                {Math.cos(rad),-Math.sin(rad), 0},
                {Math.sin(rad), Math.cos(rad), 0},
                {            0,             0, 1}
        };
    }

    /**
     * Metodo que regresa la matriz de rotacion basada en un punto de rotacion.
     * @param xp    Punto de rotacion en x.
     * @param yp    Punto de rotacion en y.
     * @param g Grados a rotar.
     * @return  Matriz de rotacion basada en un punto de rotacion
     */
    public static double[][] r(double xp, double yp, double g) {
        double rad = radianes(g);
        //recordatorio: las variables yp se hicieron negativas
        return new double[][]{
                {Math.cos(rad),-Math.sin(rad),xp * (1-Math.cos(rad)) + yp * Math.sin(rad)},
                {Math.sin(rad), Math.cos(rad),yp * (1-Math.cos(rad)) - xp * Math.sin(rad)},
                {            0,             0,                                          1}
        };
    }

    /**
     * Metodo que regresa la matriz de rotacion inversa basada en el origen de las coordenadas.
     * @param g Grados a rotar.
     * @return  Matriz de rotacion inversa.
     */
    public static double[][] rInv(double g) {
        double rad = radianes(g);
        return new double[][]{
                { Math.cos(rad),Math.sin(rad),0},
                {-Math.sin(rad),Math.cos(rad),0},
                {             0,            0, 1}
        };
    }

    /**
     * Metodo que recibe la matriz de puntos homogenea y el renglon de las coordenadas que se desea
     * obtener (0 para x, 1 para y).
     * @param puntos    Matriz de puntos homogenea.
     * @param coord     0 para obtener las coordenadas x's, 1 para obtener las coordenadas y's.
     * @return  regresa un arreglo con las coordenadas bien sea de x o de y segun sea el caso, y el
     *          cual se utilizara para dibujar el objeto grafico.
     */
    public static int[] actualizaPuntos(double[][] puntos, int coord) {
        int[] res = new int[puntos[coord].length];
        for(int i = 0; i < puntos[coord].length;i++){
                res[i] = (int) Math.round(puntos[coord][i]);
        }
        return res;
    }


    /**
     * Metodo que regresa la matriz de reflexion de un objeto con respecto al eje de las x.
     * @return  Retorna la matriz de reflexion con respecto al eje de las x.
     */
    public static double[][] refX() {
        return new double[][]{
                {1, 0,0},
                {0,-1,0},
                {0, 0,1}
        };
    }

    /**
     * Metodo que regresa la matriz de reflexion de un objeto con respecto al eje de las y.
     * @return  Retorna la matriz de reflexion con respecto al eje de las y.
     */
    public static double[][] refY() {
        return new double[][]{
                {-1,0,0},
                { 0,1,0},
                { 0,0,1}
        };
    }

    /**
     * Metodo que regresa la matriz de reflexion de un objeto con respecto de un eje perpendicular
     * al plano xy y que pasa a traves del origen de las coordenadas.
     * @return  Regresa la matriz de reflexion con respecto un eje perpendicular al plano xy.
     */
    public static double[][] refOrigen() {
        return new double[][]{
                {-1, 0,0},
                { 0,-1,0},
                { 0, 0,1}
        };
    }

    /**
     * Metodo que regresa la matriz de reflexion de un objeto con respecto de la linea y = x.
     * @return  Regresa la matriz de reflexion con respecto a la linea y = x.
     */
    public static double[][] refYigualX() {
        return new double[][]{
                {0,1,0},
                {1,0,0},
                {0,0,1}
        };
    }

    /**
     * Metodo que regresa la matriz de reflexion de un objeto con respecto de la linea y = -x.
     * @return  Regresa la matriz de reflexion con respecto de la linea y = -x.
     */
    public static double[][] refYigualMenosX() {
        return new double[][]{
                { 0,-1,0},
                {-1, 0,0},
                { 0, 0,1}
        };
    }


    /**
     * Metodo que regresa la matriz de recorte (o inclinacion) de la direccion de x en relacion
     * con el eje de x.
     * @param shX   Punto de recorte en x.
     * @return  Regresa la matriz de recorte en direccion del punto shX.
     */
    public static double[][] cX(double shX) {
        return new double[][]{
                {1,shX,0},
                {0, 1 ,0},
                {0, 0 ,1}
        };
    }

    /**
     * Metodo que regresa la matriz de recorte (o inclinacion) de la direccion de x en relacion con
     * otras lineas de referencia.
     * @param yRef  Punto de referencia y.
     * @param shX   Punto de recorte en x.
     * @return  Regresa la matriz de recorte de la direccion de x en relacion con un punto en la linea y.
     */
    public static double[][] cXLinea(int yRef, double shX) {
        return new double[][]{
                {1,shX,-shX*yRef},
                {0, 1 ,    0    },
                {0, 0 ,    1    }
        };
    }

    /**
     * Metodo que regresa la matriz de recorte (o inclinacion) de la direccion de x en relacion con el
     * eje y.
     * @param shY   Punto de recorte en y.
     * @return  Regresa la matriz de recorte de la direccion de x en relacion con el eje y.
     */
    public static double[][] cY(double shY) {
        return new double[][]{
                { 1 ,0,0},
                {shY,1,0},
                { 0 ,0,1}
        };
    }

    /**
     * Metodo que regresa la matriz de recorte (o inclinacion) de la direccion de y en relacion con
     * la linea x = xref.
     * @param xRef  Punto de referencia x.
     * @param shY   Punto de recorte en y.
     * @return  Regresa la matriz de recorte de la direccion de y en relacion con un punto en la linea x.
     */
    public static double[][] cYLinea(int xRef, double shY) {
        return new double[][]{
                { 1 ,0,    0    },
                {shY,1,-shY*xRef},
                { 0 ,0,    1    }
        };
    }

    @Override
    public int[][] transladar(int[] x, int[] y, int tX, int tY) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] t = t(tX,-tY);
        double[][] traslacion = multiplicacion(t,matrizPts);

        int[] resX = actualizaPuntos(traslacion,0);
        int[] resY = actualizaPuntos(traslacion,1);

        return ajusteMatriz(resX,resY);
    }

    @Override
    public int[][] transladarInv(int[] x, int[] y, int tX, int tY) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] t = tInv(tX,-tY);
        double[][] traslacion = multiplicacion(t,matrizPts);

        int[] resX = actualizaPuntos(traslacion,0);
        int[] resY = actualizaPuntos(traslacion,1);

        return ajusteMatriz(resX,resY);
    }

    @Override
    public int[][] escalar(int[] x, int[] y, float sX, float sY) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] s = s(sX,sY);
        double[][] primeraEscalacion = multiplicacion(s,matrizPts);

        int[] resX = actualizaPuntos(primeraEscalacion,0);
        int[] resY = actualizaPuntos(primeraEscalacion,1);

        return ajusteMatriz(resX,resY);
    }

    @Override
    public int[][] escalarPuntoFijo(int[] x, int[] y, double tX, double tY, double sX, double sY) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] s = s(tX,tY,sX,sY);
        double[][] resCoord = multiplicacion(s,matrizPts);

        int[] resX = actualizaPuntos(resCoord,0);
        int[] resY = actualizaPuntos(resCoord,1);

        return new int[][] {
                resX,
                resY
        };
    }

    @Override
    public int[][] escalarInv(int[] x, int[] y, double sX, double sY) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] s = sInv(sX,sY);
        double[][] primeraEscalacion = multiplicacion(s,matrizPts);

        int[] resX = actualizaPuntos(primeraEscalacion,0);
        int[] resY = actualizaPuntos(primeraEscalacion,1);

        return ajusteMatriz(resX,resY);
    }

    @Override
    public int[][] rotar(int[] x, int[] y, double grados) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] matrizRot = r(grados);
        double[][] rotacion = multiplicacion(matrizRot,matrizPts);

        int[] resX = actualizaPuntos(rotacion,0);
        int[] resY = actualizaPuntos(rotacion,1);

        return ajusteMatriz(resX,resY);

    }

    @Override
    public int[][] rotarPuntoFijo(int[] x, int[] y, double tX, double tY, double grados) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] mtzTrans = r(tX,-tY,grados);

        double[][] rotacion = multiplicacion(mtzTrans,matrizPts);

        int[] resX = actualizaPuntos(rotacion,0);
        int[] resY = actualizaPuntos(rotacion,1);

        return ajusteMatriz(resX,resY);
    }

    @Override
    public int[][] rotarInv(int[] x, int[] y, double grados) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] matrizRot = rInv(grados);
        double[][] rotacion = multiplicacion(matrizRot,matrizPts);

        int[] resX = actualizaPuntos(rotacion,0);
        int[] resY = actualizaPuntos(rotacion,1);

        return ajusteMatriz(resX,resY);
    }

    @Override
    public int[][] reflejoX(int[] x, int[] y) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] res = multiplicacion(refX(),matrizPts);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        return new int[][]{
                resX,
                resY
        };
    }

    @Override
    public int[][] reflejoY(int[] x, int[] y) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] res = multiplicacion(refY(),matrizPts);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        return new int[][]{
                resX,
                resY
        };
    }

    @Override
    public int[][] reflejoOrigen(int[] x, int[] y) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] res = multiplicacion(refOrigen(),matrizPts);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        return new int[][]{
                resX,
                resY
        };
    }

    @Override
    public int[][] reflejoYigualX(int[] x, int[] y) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] res = multiplicacion(refYigualX(),matrizPts);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        return new int[][]{
                resX,
                resY
        };
    }

    @Override
    public int[][] reflejoYigualMenosX(int[] x, int[] y) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] res = multiplicacion(refYigualMenosX(),matrizPts);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        return new int[][] {
                resX,
                resY
        };
    }

    @Override
    public int[][] recorteDeXsobreX(int[] x, int[] y, float shX) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] res = multiplicacion(cX(shX),matrizPts);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        return ajusteMatriz(resX,resY);
    }

    @Override
    public int[][] recorteDeXsobreY(int[] x, int[] y, float shX, int refY) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] res = multiplicacion(cXLinea(refY,shX),matrizPts);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        return new int[][] {
                resX,
                resY
        };
    }

    @Override
    public int[][] recorteDeYsobreY(int[] x, int[] y, float shY) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] res = multiplicacion(cY(shY),matrizPts);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        return ajusteMatriz(resX,resY);
    }

    @Override
    public int[][] recorteDeYsobreX(int[] x, int[] y, float shY, int refX) {
        double[][] matrizPts = matrizPuntos(x,y);
        double[][] res = multiplicacion(cYLinea(refX,shY),matrizPts);

        int[] resX = actualizaPuntos(res,0);
        int[] resY = actualizaPuntos(res,1);

        return ajusteMatriz(resX,resY);
    }

    /**
     * Metodo que permite corregir las coordenadas de "x" y "y" cuando estas cambian por un
     * el uso de uno de los metodos de este bloque.
     * @param x Conjunto de coordenadas x.
     * @param y Conjunto de coordenadas y.
     * @return  Retorna una matriz de n x 2 renglones donde n es el numero de columnas.
     */
    public static int[][] ajusteMatriz(int[] x, int[] y){
        double[][] matrizPts = matrizPuntos(x,y);
        int[] resX = actualizaPuntos(matrizPts,0);
        int[] resY = actualizaPuntos(matrizPts,1);

        return new int[][]{
                resX,
                resY
        };
    }

}
