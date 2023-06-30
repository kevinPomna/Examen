/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

/**
 *
 * @author kevin
 */
public class Nodo {

    Tarea tarea;
    Nodo siguiente;
    Nodo anterior;
    

    public Nodo(Tarea tarea) {
        this.tarea = tarea;
        this.siguiente = null;
        this.anterior = null;
    }
}


