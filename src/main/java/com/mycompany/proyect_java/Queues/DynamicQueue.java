/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyect_java.Queues;
import com.mycompany.proyect_java.Nodes.Node;
/**
 *
 * @author Jezuz
 */
public class DynamicQueue {
     private Node front; // Nodo al frente de la cola
    private Node rear;  // Nodo al final de la cola
    private int count;  // Número de elementos en la cola

    public DynamicQueue() {
        front = null;
        rear = null;
        count = 0;
    }

    // Método para agregar un número a la cola
    public void enqueue(int number) {
        Node newNode = new Node(number);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }

        count++;
    }

    // Método para eliminar y devolver el número al frente de la cola
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("The Queue is empty.");
        }

        int data = front.getValue();
        front = front.getNext();

        if (front == null) {
            rear = null; // La cola queda vacía
        }

        count--;
        return data;
    }

    // Método para ver el número al frente de la cola sin eliminarlo
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("The Queue is empty.");
        }

        return front.getValue();
    }

    // Método para verificar si la cola está vacía
    public boolean isEmpty() {
        return front == null;
    }

    // Método para obtener el tamaño de la cola
    public int size() {
        return count;
    }
}
