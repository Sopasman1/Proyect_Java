/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyect_java.Queues;
/**
 *
 * @author Jezuz
 */
public class CircularQueue {
      private int[] array;
    private int front;
    private int rear;
    private int count;
    private final int capacity;

    // Constructor para inicializar la cola circular con un tamaño determinado
    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.count = 0;
    }

    // Método para agregar un elemento al final de la cola
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("The Queue is full.");
            return;
        }

        rear = (rear + 1) % capacity; // Mover el índice rear de forma circular
        array[rear] = value;
        count++;
    }

    // Método para eliminar un elemento del frente de la cola
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("The Queue is empty.");
        }

        int dequeuedValue = array[front];
        front = (front + 1) % capacity; // Mover el índice front de forma circular
        count--;
        return dequeuedValue;
    }

    // Método para ver el valor del frente de la cola sin eliminarlo
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("The Queue is empty.");
        }

        return array[front];
    }

    // Método para obtener el número de elementos en la cola
    public int size() {
        return count;
    }

    // Método para verificar si la cola está vacía
    public boolean isEmpty() {
        return count == 0;
    }

    // Método para verificar si la cola está llena
    public boolean isFull() {
        return count == capacity;
    }

    // Método para obtener la capacidad de la cola
    public int getCapacity() {
        return capacity;
    }
}
