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
public class Pila {
    private LinkedList<Tarea> pila;

    public Pila() {
        pila = new LinkedList<>();
    }

    public void push(Tarea tarea) {
        pila.push(tarea);
    }

    public Tarea pop() {
        if (!pila.isEmpty()) {
            return pila.pop();
        } else {
            return null;
        }
    }

    public void mostrarTareas() {
        for (Tarea tarea : pila) {
            System.out.println("Nombre: " + tarea.nombre);
            System.out.println("Descripción: " + tarea.descripcion + "\n");
        }
    }
}
