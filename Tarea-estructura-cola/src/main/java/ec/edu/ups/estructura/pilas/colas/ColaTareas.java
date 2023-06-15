/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.estructura.pilas.colas;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Usuario
 */
public class ColaTareas<T> {

    private Queue<Tarea<T>> colaTareas;

    public ColaTareas() {
        colaTareas = new LinkedList<>();
    }

    public ColaTareas(Queue<Tarea<T>> colaTareas) {
        colaTareas = new LinkedList<>();
    }

    public void agregarTarea(Tarea<T> tarea) {
        colaTareas.offer(tarea);
    }

    public Tarea<T> procesarTarea() {
        return colaTareas.poll();
    }

    public boolean estaVaci() {
        return colaTareas.isEmpty();
    }

    @Override
    public String toString() {
        return "ColaTareas{" + "colaTareas=" + colaTareas + '}';
    }

}
