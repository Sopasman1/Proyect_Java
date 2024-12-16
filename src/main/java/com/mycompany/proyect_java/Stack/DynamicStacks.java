/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyect_java.Stack;

/**
 *
 * @author Jezuz
 */
public class DynamicStacks {
    private Node top; // Nodo en el tope de la pila

    // Constructor
    public DynamicStacks() {
        top = null;
    }

    public void push(com.mycompany.proyect_java.Nodes.Node newNode) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Clase interna para representar un nodo de la pila
    private static class Node {
        int data; // Valor del nodo (puedes cambiar el tipo según tus necesidades)
        Node next; // Referencia al siguiente nodo

        // Constructor del nodo
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Método para insertar un elemento en la pila
    public void push(int data) {
        Node newNode = new Node(data); // Crear un nuevo nodo
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    // Método para eliminar y devolver el elemento en el tope de la pila
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        int data = top.data; // Obtener el valor del nodo en el tope
        top = top.next;      // Actualizar el tope al siguiente nodo
        return data;
    }

    // Método para devolver el elemento en el tope de la pila sin eliminarlo
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return top.data;
    }

    // Método para verificar si la pila está vacía
    public boolean isEmpty() {
        return top == null;
    }

    // Método para obtener el tamaño de la pila
    public int size() {
        int count = 0;
        Node current = top;

        // Recorre la pila desde el tope hasta el final
        while (current != null) {
            count++;
            current = current.next; // Avanza al siguiente nodo
        }

        return count; // Devuelve el número total de elementos
    }
}
