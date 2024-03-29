/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.estructura.pilas.colas;

/**
 *
 * @author Usuario
 */
public class Tarea<T> {

    private int id;
    private T atributo;

    public Tarea() {
    }

    public Tarea(int id, T atributo) {
        this.id = id;
        this.atributo = atributo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public T getAtributo() {
        return atributo;
    }

    public void setAtributo(T atributo) {
        this.atributo = atributo;
    }

    @Override
    public String toString() {
        return "Tarea{" + "id=" + id + ", atributo=" + atributo + '}';
    }

}
