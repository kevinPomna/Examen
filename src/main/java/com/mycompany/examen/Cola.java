/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

import java.util.LinkedList;

/**
 *
 * @author kevin
 */
public class Cola {
    private LinkedList<Tarea> cola;

    public Cola() {
        cola = new LinkedList<>();
    }

    public void enqueue(Tarea tarea) {
        cola.addLast(tarea);
    }

    public Tarea dequeue() {
        if (!cola.isEmpty()) {
            return cola.removeFirst();
        } else {
            return null;
        }
    }

    public void mostrarTareas() {
        for (Tarea tarea : cola) {
            System.out.println("Nombre: " + tarea.nombre);
            System.out.println("Descripción: " + tarea.descripcion + "\n");
        }
    }
}
