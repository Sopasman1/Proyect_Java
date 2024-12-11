/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyect_java.Lists;

/**
 *
 * @author Jezuz
 */
public class CircularLinkedList {
    private Node head;

    public CircularLinkedList() {
        head = null;
    }

    public void add(Node newNode) {
        // Lista vacía
        if (head == null) {
            head = newNode;
            head.next = head;
        }
        // Si el valor es menor que el head, el nuevo nodo será el nuevo head
        else if (newNode.value < head.value) {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            newNode.next = head;
            current.next = newNode;
            head = newNode;
        }
        // Buscar la posición correcta en la lista
        else {
            Node current = head;

            while (current.next != head && current.next.value < newNode.value) {
                current = current.next;
            }
            // Verificar si el valor ya existe
            if (current.next.value == newNode.value) {
                return;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void remove(int value) {
        if (head == null) {
            System.out.println("The list is empty, no nodes to remove.");
            return;
        }

        Node current = head;

        // Si el head es el valor a eliminar
        if (head.value == value) {
            if (head.next == head) {
                head = null;
            } else {
                while (current.next != head) {
                    current = current.next;
                }

                head = head.next;
                current.next = head;
            }
            System.out.println("Value removed successfully.");
            return;
        }

        // El nodo a eliminar no es el head
        current = head;

        while (current.next != head) {
            if (current.next.value == value) {
                current.next = current.next.next;
                System.out.println("Value removed successfully.");
                return;
            }

            current = current.next;
        }

        System.out.println("Value not found.");
    }

    public int count() {
        if (head == null) {
            return 0;
        }
        int count = 1;
        Node current = head;
        while (current.next != head) {
            count++;
            current = current.next;
        }
        return count;
    }

    public boolean contains(int value) {
        if (head == null) {
            return false;
        }
        Node current = head;
        while (current.next != head) {
            if (current.value == value) {
                return true;
            }
            current = current.next;
        }
        return current.value == value;
    }

    public Node getHead() {
        return head;
    }

    // Clase interna para representar un nodo
    public static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
}
