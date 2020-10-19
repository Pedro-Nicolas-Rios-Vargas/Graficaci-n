/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 5
Fecha: 24/Septiembre/2020
 */
package practicas.pract5;

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

import static graficos.Circunferencia.*;

public class DibujoParte2 extends JFrame{

    public DibujoParte2(){
        setTitle("Practica 5. Parte 2");
        setSize(800,700);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    private void circulos(Graphics g){
        circuloGeneral(110,150,100,g);
        circuloIncremental(410,150,100,g);
        circuloBresenham(110,450,100,g);
        g.setColor(Color.RED);
        g.drawOval(310,350,200,200);
    }

    @Override
    public void paint(Graphics g){
        circulos(g);
    }
}
