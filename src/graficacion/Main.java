/*
Alumno: Pedro Nicolas Rios Vargas
Actividad: Practica 10
Fecha: 30/Octubre/2020
 */

package graficacion;

import practicas.pract8.FramePractica8;
import practicas.pract10.*;
import practicas.pract10.parte5.*;
import practicas.pract10.parte6.*;
/**
 * La clase <code>Main</code> es la encargada de llamar a las diferentes actividades
 * y/o practicas para ser ejecutadas.
 *
 * @author Pedro Nicolas Rios Vargas
 */
public class Main {

    public static void main(String[] args){
        new FramePractica8(new Parte2(true), "Practica 10 Parte 2");
        new FramePractica8(new Parte4(true),"Practica 10 Parte 4");
        new FramePractica8(new Parte5_1(true),"Practica 10 Parte 5.1");
        new FramePractica8(new Parte5_2(true),"Practica 10 Parte 5.2");
        new FramePractica8(new Parte5_3(true),"Practica 10 Parte 5.3");
        new FramePractica8(new Parte6_1(true),"Practica 10 Parte 6.1");
        new FramePractica8(new Parte6_2(true),"Practica 10 Parte 6.2");
        new FramePractica8(new Parte6_3(true),"Practica 10 Parte 6.3");
    }
}
