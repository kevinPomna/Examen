/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;

/**
 *
 * @author kevin
 */
public class ListaEnlazada {

    private Nodo inicio;
    private Nodo fin;

    public ListaEnlazada() {
        inicio = null;
        fin = null;
    }

    public void agregarTarea(String nombre, String descripcion) {
        Tarea tarea = new Tarea(nombre, descripcion);
        Nodo nodo = new Nodo(tarea);
        if (inicio == null) {
            inicio = nodo;
            fin = nodo;
        } else {
            nodo.anterior = fin;
            fin.siguiente = nodo;
            fin = nodo;
        }
    }
    
    public boolean eliminarTarea(String nombre) {
        Nodo actual = inicio;
        while (actual != null) {
            if (actual.tarea.nombre.equals(nombre)) {
                if (actual.anterior != null) {
                    actual.anterior.siguiente = actual.siguiente;
                } else {
                    inicio = actual.siguiente;
                }

                if (actual.siguiente != null) {
                    actual.siguiente.anterior = actual.anterior;
                } else {
                    fin = actual.anterior;
                }

                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    public void mostrarTareas() {
        Nodo actual = inicio;
        while (actual != null) {
            System.out.println("Nombre: " + actual.tarea.nombre);
            System.out.println("Descripción: " + actual.tarea.descripcion + "\n");
            actual = actual.siguiente;
        }
    }
}
