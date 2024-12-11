/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyect_java.Lists;

/**
 *
 * @author Jezuz
 */
public class DoublyCircularLinkedList {
     private DoubleNode head;

    public DoublyCircularLinkedList() {
        head = null;
    }

    public void add(DoubleNode newNode) {
        // Si la lista está vacía
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
            return;
        }

        // Insertar un nodo al inicio
        if (newNode.value < head.value) {
            newNode.next = head;
            newNode.prev = head.prev;
            head.prev.next = newNode; // Actualizar el "next" del último nodo
            head.prev = newNode; // Actualizar el "prev" del head
            head = newNode; // Actualizar el head
            return;
        }

        // Insertar un nodo al final
        if (newNode.value > head.prev.value) {
            newNode.next = head; // El siguiente del nuevo nodo apunta al head
            newNode.prev = head.prev;
            head.prev.next = newNode; // Actualizar el "next" del último nodo
            head.prev = newNode; // Actualizar el "prev" del head
            return;
        }

        // Encontrar la posición correcta para insertar
        DoubleNode current = head;

        while (current.next != head && current.next.value < newNode.value) {
            current = current.next;
        }

        // Insertar el nuevo nodo en la posición encontrada
        newNode.next = current.next;
        newNode.prev = current;

        current.next.prev = newNode; // Actualizar el "prev" del siguiente nodo
        current.next = newNode; // Enlazar el nodo actual con el nuevo nodo
    }

    public void remove(int value) {
        if (head == null) {
            return;
        }

        // Si solo hay un nodo en la lista
        if (head.next == head) {
            if (head.value == value) {
                head = null; // La lista queda vacía
            }
            return;
        }

        // Eliminación al inicio
        if (head.value == value) {
            head.prev.next = head.next; // Actualizar el "next" del último nodo
            head.next.prev = head.prev; // Actualizar el "prev" del segundo nodo
            head = head.next; // Actualizar el head
            return;
        }

        // Eliminación al final
        if (head.prev.value == value) {
            head.prev = head.prev.prev; // Actualizar el "prev" del último nodo
            head.prev.next = head; // Actualizar el "next" del nuevo último nodo
            return;
        }

        // Eliminación de un nodo intermedio
        DoubleNode current = head;
        while (current.next != head && current.value != value) {
            current = current.next;
        }

        // Si se encuentra el nodo con el valor
        if (current.value == value) {
            current.prev.next = current.next; // Actualizar el "next" del nodo anterior
            current.next.prev = current.prev; // Actualizar el "prev" del nodo siguiente
        }
    }

    public boolean contains(int value) {
        if (head == null) {
            return false;
        }

        DoubleNode current = head;
        do {
            if (current.value == value) {
                return true;
            }
            current = current.next;
        } while (current != head);

        return false;
    }

    public int count() {
        if (head == null) {
            return 0;
        }

        int count = 0;
        DoubleNode current = head;
        do {
            count++;
            current = current.next;
        } while (current != head);

        return count;
    }

    @Override
    public String toString() {
        if (head == null) {
            return "The doubly circular linked list is void";
        }

        StringBuilder result = new StringBuilder();
        DoubleNode current = head;

        do {
            result.append(current.toString()).append(" "); // Llamar al `toString` del nodo
            current = current.next; // Avanzar al siguiente nodo
        } while (current != head);

        return result.toString();
    }

    public DoubleNode getHead() {
        return head;
    }

    // Clase interna para representar un nodo doblemente enlazado
    public static class DoubleNode {
        int value;
        DoubleNode next;
        DoubleNode prev;

        public DoubleNode(int value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }

        @Override
        public String toString() {
            return Integer.toString(value);
        }
    }
}
