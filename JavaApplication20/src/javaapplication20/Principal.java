/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

/**
 *
 * @author User
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nombres = {"José", "María", "Ana", "Paul", "David"};
        String[] apellidos = {"Yaguana", "Benitez", "Gaviria", "Davila", "Andrade"};
        int[] edades = {20, 19, 20, 19, 25};
        double[] c1 = {9.1, 10, 8, 7, 9.1};
        double[] c2 = {6.1, 5, 10, 7.2, 4.1};
        Estudiantes[] estudiantes1 = new Estudiantes[nombres.length];
        for (int i = 0; i < estudiantes1.length; i++) {
            Estudiantes e=new Estudiantes();
            e.nombre=nombres[i];
            e.apellido=apellidos[i];
            e.edad=edades[i];
            e.calificacion1=c1[i];
            e.calificacion2=c2[i];
            estudiantes1[i]=e;
        }
        for (int i = 0; i < estudiantes1.length; i++) {
            estudiantes1[i].Imprimir_reporte();
        }
        System.out.printf("*********************\n");
    }

}
