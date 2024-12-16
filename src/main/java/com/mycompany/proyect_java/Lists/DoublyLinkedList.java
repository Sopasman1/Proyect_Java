/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyect_java.Lists;

/**
 *
 * @author Jezuz
 */
public class DoublyLinkedList {
    private DoubleNode head;

    public DoublyLinkedList() {
        head = null;
    }

    public void add(DoubleNode newNode) {
        // Insertar al inicio si la lista está vacía o el nuevo valor es menor que el del head
        if (head == null || head.value >= newNode.value) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
        } else {
            DoubleNode current = head;
            // Recorrer hasta encontrar la posición correcta para insertar
            while (current.next != null && current.next.value < newNode.value) {
                current = current.next;
            }

            newNode.next = current.next;
            if (current.next != null) {
                current.next.prev = newNode;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    public void remove(int value) {
        if (head == null) {
            return;
        }

        // Si el nodo a eliminar es el head
        if (head.value == value) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        DoubleNode current = head;
        // Recorrer hasta encontrar el nodo con el valor a eliminar
        while (current.next != null) {
            if (current.next.value == value) {
                current.next = current.next.next;
                if (current.next != null) {
                    current.next.prev = current;
                }
                return;
            }
            current = current.next;
        }
    }

    public int count() {
        int count = 0;
        DoubleNode current = head;

        // Contar los nodos en la lista
        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    public boolean contains(int value) {
        DoubleNode current = head;

        // Verificar si un nodo con el valor dado existe en la lista
        while (current != null) {
            if (current.value == value) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public DoubleNode getHead() {
        return head;
    }

    public void add(com.mycompany.proyect_java.Nodes.DoubleNode newDoubleNode) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
