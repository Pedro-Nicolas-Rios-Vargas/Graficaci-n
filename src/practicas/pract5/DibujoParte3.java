/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 5
Fecha: 25/Septiembre/2020
 */

package practicas.pract5;

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

import static graficos.Linea.*;
import static graficos.Circunferencia.*;

public class DibujoParte3 extends JFrame{

    public DibujoParte3(){
        setTitle("Practica 5. Parte 3");
        setSize(1000,700);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public void dibujarGusano(Graphics g){

        g.setColor(new Color(65,203,0));
        rellenarCirculo(75,125,50,g);
        g.setColor(Color.BLACK);
        circuloBresenham(75,125,50,g);

        g.setColor(new Color(65,203,0));
        rellenarCirculo(125,100,50,g);
        g.setColor(Color.BLACK);
        circuloBresenham(125,100,50,g);

        g.setColor(new Color(65,203,0));
        rellenarCirculo(175,125,50,g);
        g.setColor(Color.BLACK);
        circuloBresenham(175,125,50,g);

        g.setColor(new Color(65,203,0));
        rellenarCirculo(225,100,50,g);
        g.setColor(Color.BLACK);
        circuloBresenham(225,100,50,g);

        g.setColor(new Color(65,203,0));
        rellenarCirculo(275,125,50,g);
        g.setColor(Color.BLACK);
        circuloBresenham(275,125,50,g);

        g.setColor(new Color(65,203,0));
        rellenarCirculo(325,100,50,g);
        g.setColor(Color.BLACK);
        circuloBresenham(325,100,50,g);

        rellenarCirculo(300,95,7,g);
        rellenarCirculo(350,95,7,g);

    }

    public void dibujarOso(Graphics g){
        //EXTERIOR OREJA
        g.setColor(new Color(120,74,0));
        rellenarCirculo(150,310,30,g);  // IZQUIERDA
        rellenarCirculo(250,310,30,g);  // DERECHA

        //INTERIOR OREJA
        g.setColor(new Color(221,151,38));
        rellenarCirculo(150,313,20,g);  // IZQUIERDA
        rellenarCirculo(250,313,20,g);  // DERECHA

        //CARA
        g.setColor(new Color(120,74,0));
        rellenarCirculo(200,400,100,g); // PRINCIPAL

        g.setColor(new Color(197,171,129));
        rellenarCirculo(200,400,30,g);  // CENTRAL

        //OJOS
        g.setColor(Color.BLACK);
        rellenarCirculo(165,375,15,g);  // IZQUIERDO
        rellenarCirculo(235,375,15,g);  // DERECHO

        //BOCA
        g.setColor(new Color(230,42,89));
        rellenarCirculo(200,416,8,g);
        //NARIZ
        g.setColor(Color.BLACK);
        rellenarCirculo(200,395,10,g);
    }

    public void dibujarEmoticon(Graphics g){
        //CARA
        g.setColor(new Color(239,195,42));
        rellenarCirculo(500,400,100,g);
        //OJOS
        g.setColor(new Color(157,122,0));
        rellenarCirculo(470,385,15,g);  // IZQUIERDO
        rellenarCirculo(530,385,15,g);  // DERECHO
        //BOCA
        dibujarLinea(470,425,530,425,5,g);
    }

    public void dibujarGato(Graphics g){
        //OREJAS
        g.setColor(new Color(251,188,38));
        for(int i = 0; i<=50;i++){
            dibujarLinea(739+i,325,775,250,g);  // IZQUIERDA
            dibujarLinea(811+i,325,825,250,g);  // DERECHA
        }
        //OREJAS INTERIOR
        g.setColor(new Color(180, 134, 8));
        for(int i = 0; i<=38;i++){
            dibujarLinea(745+i,325,775,265,g);  // IZQUIERDA
            dibujarLinea(817+i,325,825,265,g);  // DERECHA
        }

        /*
        rellenarCirculo(150,310,30,g);  // IZQUIERDA
        rellenarCirculo(250,310,30,g);  // DERECHA

         */
        //CARA
        g.setColor(new Color(251,188,38));
        rellenarCirculo(800,400,100,g); // PRINCIPAL
        //CACHETES
        g.setColor(new Color(253, 228, 167, 255));
        rellenarCirculo(780,408,20,g);  // IZQUIERDO
        rellenarCirculo(820,408,20,g);  // DERECHO

        //BIGOTES
        g.setColor(new Color(108, 76, 0));
        //IZQUIERDOS
        dibujarLinea(775,401,730,390,3,g);
        dibujarLinea(770,408,730,408,3,g);
        dibujarLinea(775,415,730,426,3,g);
        //DERECHOS
        dibujarLinea(825,401,870,390,3,g);
        dibujarLinea(830,408,870,408,3,g);
        dibujarLinea(825,415,870,426,3,g);

        //OJOS
        g.setColor(Color.BLACK);
        rellenarCirculo(765,375,15,g);  // IZQUIERDO
        rellenarCirculo(835,375,15,g);  // DERECHO

        //BOCA
        //dibujarLinea(770,425,830,425,5,g);
        //NARIZ
        g.setColor(new Color(230,42,89));
        rellenarCirculo(800,395,10,g);
    }

    public void paint(Graphics g){
        dibujarGusano(g);
        dibujarOso(g);
        dibujarEmoticon(g);
        dibujarGato(g);
    }
}
