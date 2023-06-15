/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.ups.estructura.pilas.colas;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class MainPilasColas {

    public static void main(String[] args) {

        ColaTareas<String> colaTareas = new ColaTareas<>();
        ColaTareas<Integer> colasTareasInt = new ColaTareas<>();
        ColaTareas<String[]> colaTareasArreglo = new ColaTareas<>();
        ColaTareas<int[]> colaTareasArregloEnteros = new ColaTareas<>();

        PilaTareas<Integer> pilasTarea = new PilaTareas<>();
        PilaTareas<String> pilasTareastring = new PilaTareas<>();
        PilaTareas<String[]> pilasTareaarreglo = new PilaTareas<>();
        PilaTareas<int[]> pilasTareaarregloenteros = new PilaTareas<>();
        PilaTareas<ColaTareas> pilasTareaColas = new PilaTareas<>();

        pilasTareaColas.agregarTarea(new Tarea(111, 111));
        System.out.println("COLAS");
        System.out.println("COLAS STRINGS");

        colaTareas.agregarTarea(new Tarea(1, "Tarea 1"));
        colaTareas.agregarTarea(new Tarea(2, "Tarea 2"));
        colaTareas.agregarTarea(new Tarea(3, "Tarea 3"));
        colaTareas.agregarTarea(new Tarea(4, "Tarea 4"));
        colaTareas.agregarTarea(new Tarea(5, "Tarea 5"));

        while (!colaTareas.estaVaci()) {
            Tarea<String> tareaProcesada = colaTareas.procesarTarea();

            System.out.println("Procesando tarea de la cola: \n\t Sale--->" + tareaProcesada.getId() + tareaProcesada.getAtributo());
        }

        System.out.println("COLAS ENTEROS");
        colasTareasInt.agregarTarea(new Tarea(6, 6));
        colasTareasInt.agregarTarea(new Tarea(7, 7));
        colasTareasInt.agregarTarea(new Tarea(8, 8));
        colasTareasInt.agregarTarea(new Tarea(9, 9));
        colasTareasInt.agregarTarea(new Tarea(10, 10));

        while (!colasTareasInt.estaVaci()) {
            Tarea<Integer> tareapro = colasTareasInt.procesarTarea();

            System.out.println("Procesando tarea de la cola: \n\t Sale---------->" + tareapro.getId() + tareapro.getAtributo());
        }

        System.out.println("COLAS ARREGLOS STRINGS");
        colaTareasArreglo.agregarTarea(new Tarea(11, new String[]{"a", "b", "c"}));
        colaTareasArreglo.agregarTarea(new Tarea(12, new String[]{"d", "e", "f"}));
        colaTareasArreglo.agregarTarea(new Tarea(13, new String[]{"g", "h", "i"}));

        while (!colaTareasArreglo.estaVaci()) {
            Tarea<String[]> tareaproc = colaTareasArreglo.procesarTarea();

            System.out.println("Procesando tarea de la cola: \n\t Sale---------->" + tareaproc.getId() + Arrays.toString(tareaproc.getAtributo()));
        }

        System.out.println("COLAS ARREGLOS ENTEROS");
        colaTareasArregloEnteros.agregarTarea(new Tarea(1, new int[]{12, 23}));
        colaTareasArregloEnteros.agregarTarea(new Tarea(2, new int[]{45, 65}));
        colaTareasArregloEnteros.agregarTarea(new Tarea(3, new int[]{77, 88}));

        while (!colaTareasArregloEnteros.estaVaci()) {
            Tarea<int[]> tareaproce = colaTareasArregloEnteros.procesarTarea();

            System.out.println("Procesando tarea de la cola: \n\t Sale--->" + tareaproce.getId() + Arrays.toString(tareaproce.getAtributo()));
        }

        System.out.println("PILAS");
        System.out.println("PILAS ENTEROS");
        //Insercion de tareas a la pila
        pilasTarea.agregarTarea(new Tarea(1, 1));
        pilasTarea.agregarTarea(new Tarea(2, 2));
        pilasTarea.agregarTarea(new Tarea(3, 3));
        pilasTarea.agregarTarea(new Tarea(4, 4));
        pilasTarea.agregarTarea(new Tarea(5, 5));

        while (!pilasTarea.estaVaci()) {
            Tarea<Integer> tare = pilasTarea.procesarTarea();

            System.out.println("Procesando tarea de la cola: \n\t Sale--->" + tare.getId() + tare.getAtributo());
        }

        System.out.println("PILAS  STRINGS");
        pilasTareastring.agregarTarea(new Tarea(1, "S1------"));
        pilasTareastring.agregarTarea(new Tarea(2, "s2------"));
        pilasTareastring.agregarTarea(new Tarea(3, "s3------"));

        while (!pilasTareastring.estaVaci()) {
            Tarea<String> tarea = pilasTareastring.procesarTarea();

            System.out.println("Procesando tarea de la cola: \n\t Sale--->" + tarea.getId() + tarea.getAtributo());
        }

        System.out.println("PILAS ARREGLO STRINGS");
        pilasTareaarreglo.agregarTarea(new Tarea(1, new String[]{"x", "y"}));
        pilasTareaarreglo.agregarTarea(new Tarea(2, new String[]{"z", "a"}));
        pilasTareaarreglo.agregarTarea(new Tarea(3, new String[]{"c", "x"}));

        while (!pilasTareaarreglo.estaVaci()) {
            Tarea<String[]> tarea1 = pilasTareaarreglo.procesarTarea();

            System.out.println("Procesando tarea de la cola: \n\t Sale--->" + tarea1.getId() + Arrays.toString(tarea1.getAtributo()));
        }

        System.out.println("PILAS ARREGLO ENTEROS");
        pilasTareaarregloenteros.agregarTarea(new Tarea(1, new int[]{77, 88}));
        pilasTareaarregloenteros.agregarTarea(new Tarea(2, new int[]{99, 00}));
        pilasTareaarregloenteros.agregarTarea(new Tarea(3, new int[]{11, 22}));

        while (!pilasTareaarregloenteros.estaVaci()) {
            Tarea<int[]> tarea2 = pilasTareaarregloenteros.procesarTarea();

            System.out.println("Procesando tarea de la cola: \n\t Sale--->" + tarea2.getId() + Arrays.toString(tarea2.getAtributo()));
        }

        pilasTareaColas.agregarTarea(new Tarea(1, colaTareas));

        while (!pilasTareaColas.estaVaci()) {
            Tarea<ColaTareas> tarea3 = pilasTareaColas.procesarTarea();

            System.out.println("Procesando tarea de la cola: \n\t Sale--->" + tarea3.getId() + tarea3.getAtributo());
        }
    }
}
