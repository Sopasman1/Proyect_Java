/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyect_java.Lists;
 
/**
 *
 * @author Jezuz
 */
public class LinkedList {
     private Node head;
     
      public LinkedList() {
        head = null;
    }

    public void add(Node newNode) {
        // Si la lista está vacía, el nuevo nodo se convierte en la cabeza
        if (head == null) {
            head = newNode;
            return;
        }

        // Si el nuevo nodo tiene un valor menor que el head, se convierte en la nueva cabeza
        if (newNode.value < head.value) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Encontrar la posición correcta para el nuevo nodo
        Node current = head;
        while (current.next != null && current.next.value < newNode.value) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public void remove(int value) {
        if (head == null) {
            return;
        }

        // Si el nodo a eliminar es el head
        if (head.value == value) {
            head = head.next;
            return;
        }

        // Buscar el nodo a eliminar
        Node current = head;
        while (current.next != null) {
            if (current.next.value == value) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public boolean contains(int value) {
        Node current = head;

        // Verificar si la lista contiene el valor
        while (current != null) {
            if (current.value == value) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public int count() {
        int count = 0;
        Node current = head;

        // Contar el número de nodos en la lista
        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = head;

        // Construir una representación en cadena de la lista
        while (current != null) {
            result.append(current.toString()).append(" ");
            current = current.next;
        }

        return result.toString();
    }

    public Node getHead() {
        return head;
    }

    public void add(com.mycompany.proyect_java.Nodes.Node newNode) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Clase interna para representar un nodo
    public static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        @Override
        public String toString() {
            return Integer.toString(value);
        }
    }
}
