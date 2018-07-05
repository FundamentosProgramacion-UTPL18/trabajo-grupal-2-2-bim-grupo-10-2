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
public class Estudiantes { //creamos  todos los atributos de la clase

    String nombre;
    String apellido;
    int edad;
    double calificacion1;
    double calificacion2;
    double promedio;

    public void Imprimir_reporte() { // creamos metodo para imprimir el reporte de cada estuiante
        System.out.printf("*********************\n");
        System.out.printf("%s %s\n", nombre, apellido);
        System.out.printf("Edad - %d\n", edad);
        System.out.printf("calificacion 1: %.2f\nCalificacion 2: %.2f\n", calificacion1, calificacion2);
        promedio = (calificacion1 + calificacion2) / 2; // proceso para sacar el promemdio de las calificaciones
        System.out.printf("Promedio: %.2f\n", promedio);

    }
}