/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyect_java.Queues;

/**
 *
 * @author Jezuz
 */
public class StaticQueue {
     private int[] elements; // Array para almacenar elementos de la cola
    private int front;      // Índice del primer elemento de la cola
    private int rear;       // Índice del último elemento de la cola
    private int count;      // Número de elementos en la cola
    private int capacity;   // Capacidad máxima de la cola

    // Constructor
    public StaticQueue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than 0.");
        }

        this.capacity = capacity;
        this.elements = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.count = 0;
    }

    // Método para agregar un número a la cola
    public void enqueue(int number) {
        if (isFull()) {
            throw new IllegalStateException("The queue is full.");
        }

        rear = (rear + 1) % capacity; // Mover el índice trasero de manera circular
        elements[rear] = number;
        count++;
    }

    // Método para eliminar y devolver el número al frente de la cola
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("The queue is empty.");
        }

        int number = elements[front];
        front = (front + 1) % capacity; // Mover el índice frontal de manera circular
        count--;
        return number;
    }

    // Método para ver el número al frente de la cola sin eliminarlo
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("The queue is empty.");
        }

        return elements[front];
    }

    // Método para verificar si la cola está vacía
    public boolean isEmpty() {
        return count == 0;
    }

    // Método para verificar si la cola está llena
    public boolean isFull() {
        return count == capacity;
    }

    // Método para obtener el tamaño de la cola
    public int size() {
        return count;
    }

    // Método para obtener la capacidad de la cola
    public int getCapacity() {
        return capacity;
    }
}
