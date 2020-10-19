/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 4
Fecha: 22/Septiembre/2020
 */

package practicas.pract4;

import javax.swing.JFrame;
import java.awt.*;

import static graficos.Pixel.dibujarPixel;

public class DibujoParteB extends JFrame{

    public DibujoParteB(){
        setTitle("Parte b");
        setSize(800,700);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    private void itcgSiglas(Graphics g){
        //lineas horizontales
        int grosor = 3;
        for(int x=15;x<=40;x+=grosor){
            dibujarPixel(x, 45,grosor, g);            //I SUPERIOR
            dibujarPixel(x, 110,grosor, g);           //I INFERIOR
            dibujarPixel(x+35, 45,grosor, g);      //T
            dibujarPixel(x+70, 45,grosor, g);      //C SUPERIOR
            dibujarPixel(x+70, 110,grosor, g);     //C INFERIOR
            dibujarPixel(x+105, 45,grosor, g);     //G SUPERIOR
            dibujarPixel(x+105, 110,grosor, g);    //G INFERIOR
            if(x>=28)
                dibujarPixel(x+105,77,grosor,g);   //G CORTO

        }

        //hacer lineas verticales
        for(int y=45;y<=110;y+=grosor){
            dibujarPixel(28,y,grosor, g);      //I
            dibujarPixel(63,y,grosor, g);      //T
            dibujarPixel(85,y,grosor, g);      //C
            dibujarPixel(120,y,grosor, g);     //G LARGO
            if(y > 77)
                dibujarPixel(145,y,grosor, g); //G CORTO

        }
    }

    private void cuadradoRayado(Graphics g){
        //Lineas horizontales
        for(int x=220;x<=285;x++){
            //Perimetro
            dibujarPixel(x,45,g);
            dibujarPixel(x,110,g);

            //Interior
            dibujarPixel(x,78,g);
        }

        //Lineas verticales
        for(int y=45;y<=110;y++){
            //Perimetro
            dibujarPixel(220,y,g);
            dibujarPixel(285,y,g);

            //Interior
            dibujarPixel(253,y,g);
        }
        //
        float aux = 0;
        for(int x=220;x<=285;x++){
            //diagonales 45°
            dibujarPixel(x,x-175,g);
            dibujarPixel(x, 110-(x-220),g);

            //diagonales descendentes angulos 22.5°
            dibujarPixel((x+16)-((int) aux),x-175,g);
            dibujarPixel(x,(x-159)-((int) aux),g);

            //diagonales ascendentes angulos -22.5°
            dibujarPixel(x,110-((x-205)-((int) aux)), g);
            dibujarPixel((x+16)-((int) aux), 110-(x-220), g);
            aux+=32f/65f;

        }

    }

    private void funcionEscalon(Graphics g){
        for(int x=400; x<=425;x++){
            //Lineas horizontal
            dibujarPixel(x,105,g);
            dibujarPixel(x+25,55,g);
            dibujarPixel(x+50,105,g);
            dibujarPixel(x+75,55,g);
        }
        //Lineas verticales
        for(int y=55;y<=105;y++){
            dibujarPixel(425,y,g);
            dibujarPixel(450,y,g);
            dibujarPixel(475,y,g);
        }
    }

    private void casa(Graphics g){
        //Lineas horizontales
        for(int x=550;x<=600;x++){
            dibujarPixel(x,75,g);
            dibujarPixel(x, 140,g);

            if(x>=585) {
                //puerta
                dibujarPixel(x-5, 106, g);
                dibujarPixel(x-5, 136, g);
                //ventana
                dibujarPixel(x-30, 106,g); //Marco superior
                dibujarPixel(x-30,116,g); //Marco inferior
                dibujarPixel(x-30, 111,g);//Marco interior
            }

            //manija
            if(x>597){
                dibujarPixel(x-8, 121,g);
                dibujarPixel(x-8, 124,g);
            }

            //diagonales
            if(x>=575) {
                dibujarPixel(x-25, 75 - (x - 575), g); //diagonal ascendente
                dibujarPixel(x, 50 + (x - 575), g);
            }
        }
        //Lineas verticales
        for(int y=75;y<=140;y++){
            dibujarPixel(550,y,g);
            dibujarPixel(600,y,g);

            //puerta
            if(y>=110){
                dibujarPixel(580, y-4,g);
                dibujarPixel(595,y-4,g);
            }

            //ventana
            if(y>=130){
                dibujarPixel(555, y-24,g);  //Marco izquierdo
                dibujarPixel(562, y-24,g);  //Marco interno
                dibujarPixel(570, y-24,g);  //Marco derecho
            }

            //manija
            if(y>=137){
                dibujarPixel(589, y-16,g);
                dibujarPixel(592, y-16,g);
            }
        }

        //techo
        int freeSpaceHeight = 0;
        int fillHeight = 0;
        for(int x=575;x<600;x++){
            fillHeight = freeSpaceHeight;
            while(fillHeight>=1){
                dibujarPixel(x-24,75-fillHeight,Color.BLUE,g);
                dibujarPixel((x)-fillHeight,75-fillHeight, Color.ORANGE,g);
                fillHeight--;
            }
            freeSpaceHeight++;
        }
    }

    public void paint(Graphics g){
        itcgSiglas(g);
        cuadradoRayado(g);
        funcionEscalon(g);
        casa(g);
    }
}
