/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyect_java.Queues;

/**
 *
 * @author Jezuz
 */
import java.util.ArrayList;
import java.util.List;

public class DoubleEndedStaticQueue {
     private int[] array;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public DoubleEndedStaticQueue(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }

    // Verifica si la cola está vacía
    public boolean isEmpty() {
        return size == 0;
    }

    // Verifica si la cola está llena
    public boolean isFull() {
        return size == capacity;
    }

    // Inserta un elemento en el frente de la cola
    public void insertFront(int value) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full.");
        }

        // Mover todos los elementos una posición hacia atrás
        for (int i = size - 1; i >= 0; i--) {
            array[i + 1] = array[i];
        }

        // Insertar el valor al frente
        array[0] = value;

        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % capacity;
        size++;
    }

    // Inserta un elemento en el final de la cola
    public void insertRear(int value) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full.");
        }

        if (rear == -1) { // Si la cola está vacía
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % capacity; // Mover el índice del final hacia adelante
        }

        array[rear] = value;
        size++;
    }

    // Elimina un elemento del frente de la cola
    public int deleteFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty.");
            return -1;
        }

        int value = array[front];
        if (front == rear) { // Si hay un solo elemento
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity; // Mover el índice del frente hacia adelante
        }

        size--;
        return value;
    }

    // Elimina un elemento del final de la cola
    public int deleteRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty.");
            return -1;
        }

        int value = array[rear];
        if (front == rear) { // Si hay un solo elemento
            front = -1;
            rear = -1;
        } else {
            rear = (rear - 1 + capacity) % capacity; // Mover el índice del final hacia atrás
        }

        size--;
        return value;
    }

    // Ver el valor en el frente sin eliminarlo
    public int getFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty.");
            return -1;
        }
        return array[front];
    }

    // Ver el valor en el final sin eliminarlo
    public int getRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty.");
            return -1;
        }
        return array[rear];
    }

    // Obtener el tamaño actual de la cola
    public int size() {
        return size;
    }

    // Obtener todos los elementos de la cola
    public List<Integer> getQueueElements() {
        List<Integer> elements = new ArrayList<>();

        if (front != -1) {
            for (int i = front; i <= rear; i++) {
                elements.add(array[i]);
            }
        }

        return elements;
    }
}
