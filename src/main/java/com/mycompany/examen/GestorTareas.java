/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class GestorTareas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pila pilaTareas = new Pila();
        Cola colaTareas = new Cola();
        ListaEnlazada listaTareas = new ListaEnlazada();

        boolean continuar = true;
        System.out.println("---------------------------------");
        System.out.println("---Bienvenidos al gestor de tareas---");
        while (continuar) {
            System.out.println("¿Deseas agregar una tarea pendiente? (S/N)");
            String opcion = scanner.nextLine();

            if (opcion.equalsIgnoreCase("S")) {
                System.out.print("Ingrese el nombre de la tarea: ");
                String nombre = scanner.nextLine();
                System.out.print("Ingrese la descripción de la tarea: ");
                String descripcion = scanner.nextLine();

                pilaTareas.push(new Tarea(nombre, descripcion));
                colaTareas.enqueue(new Tarea(nombre, descripcion));
                listaTareas.agregarTarea(nombre, descripcion);
            } else if (opcion.equalsIgnoreCase("N")) {
                continuar = false;
            } else {
                System.out.println("Opción inválida. Por favor, ingrese S o N.");
            }
        }

        System.out.println("=== Gestor de Tareas - 'Pila' ===");
        System.out.println("Lista de tareas pendientes:");
        pilaTareas.mostrarTareas();

        System.out.println("\n=== Gestor de Tareas - 'Cola' ===");
        System.out.println("Lista de tareas pendientes:");
        colaTareas.mostrarTareas();

        System.out.println("\n=== Gestor de Tareas - 'Lista Enlazada' ===");
        System.out.println("Lista de tareas pendientes:");
        listaTareas.mostrarTareas();
    }

}
