/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyect_java.Queues;
import com.mycompany.proyect_java.Nodes.DoubleNode;
/**
 *
 * @author Jezuz
 */
import java.util.ArrayList;
import java.util.List;

public class DoubleEndedDynamicQueue {
     private DoubleNode front;  // Frente de la cola
    private DoubleNode back;   // Final de la cola
    private int size;          // Tamaño de la cola

    public DoubleEndedDynamicQueue() {
        front = null;
        back = null;
        size = 0;
    }

    // Agregar un elemento al frente de la cola
    public void insertFront(int value) {
        DoubleNode newNode = new DoubleNode(value);

        if (isEmpty()) {
            front = back = newNode;  // Si la cola está vacía, el nuevo nodo es tanto el frente como el final
        } else {
            newNode.setNext(front);
            front.setPrev(newNode);
            front = newNode;
        }

        size++;
    }

    // Agregar un elemento al final de la cola
    public void insertRear(int value) {
        DoubleNode newNode = new DoubleNode(value);

        if (isEmpty()) {
            front = back = newNode;  // Si la cola está vacía, el nuevo nodo es tanto el frente como el final
        } else {
            newNode.setPrev(back);
            back.setNext(newNode);
            back = newNode;
        }

        size++;
    }

    // Eliminar un elemento del frente de la cola
    public int deleteFront() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }

        int frontValue = front.getValue();
        front = front.getNext();

        if (front != null) {
            front.setPrev(null);
        } else {
            back = null;  // Si la cola queda vacía, el final también debe ser nulo
        }

        size--;
        return frontValue;
    }

    // Eliminar un elemento del final de la cola
    public int deleteRear() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }

        int backValue = back.getValue();
        back = back.getPrev();

        if (back != null) {
            back.setNext(null);
        } else {
            front = null;  // Si la cola queda vacía, el frente también debe ser nulo
        }

        size--;
        return backValue;
    }

    // Ver el elemento del frente de la cola sin eliminarlo
    public int getFront() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }

        return front.getValue();
    }

    // Ver el elemento del final de la cola sin eliminarlo
    public int getRear() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }

        return back.getValue();
    }

    // Obtener el tamaño de la cola
    public int size() {
        return size;
    }

    // Verificar si la cola está vacía
    public boolean isEmpty() {
        return size == 0;
    }

    // Obtener todos los elementos de la cola en una lista
    public List<Integer> getQueueElements() {
        List<Integer> elements = new ArrayList<>();
        DoubleNode current = front;

        while (current != null) {
            elements.add(current.getValue());
            current = current.getNext();
        }

        return elements;
    }
    
    
    
}
