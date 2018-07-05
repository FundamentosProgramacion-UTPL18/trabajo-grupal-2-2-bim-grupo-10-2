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
        String[] nombres = {"José", "María", "Ana", "Paul", "David"}; // Agregando valores cadena a la lista -- 
        String[] apellidos = {"Yaguana", "Benitez", "Gaviria", "Davila", "Andrade"};
        int[] edades = {20, 19, 20, 19, 25}; // Agregando vaores enteros a la lista --
        double[] c1 = {9.1, 10, 8, 7, 9.1}; // Agregando valores decimales a la lista --
        double[] c2 = {6.1, 5, 10, 7.2, 4.1};
        Estudiantes[] estudiantes1 = new Estudiantes[nombres.length]; // se crea objeto  estudiantes 1 (lista)
        for (int i = 0; i < estudiantes1.length; i++) { // funcion para recorre desde 0 hasta el valor de la  lista estudiantes 1 
            Estudiantes e = new Estudiantes(); // Se crea objeto  esrudiantes (clase)
            e.nombre = nombres[i]; // se agrega la variable e cada dato de la lista  
            e.apellido = apellidos[i];
            e.edad = edades[i];
            e.calificacion1 = c1[i];
            e.calificacion2 = c2[i];
            estudiantes1[i] = e;
        }
        for (int i = 0; i < estudiantes1.length; i++) { //funcion para recorrer desde 0 hsta el valor de la lista estudiantes
            estudiantes1[i].Imprimir_reporte(); // llamamos al método imprimir por cada elemento de la lista 
        }
        System.out.printf("*********************\n");
    }

}
