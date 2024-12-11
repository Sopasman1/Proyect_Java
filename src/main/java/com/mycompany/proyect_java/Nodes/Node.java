/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyect_java.Nodes;

/**
 *
 * @author Jezuz
 */
public class Node {
    private int value;
    private Node next;

    // Constructor por defecto
    public Node() {
        this.value = 0;
        this.next = null;
    }

    // Constructor con valor inicial
    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    // Getters y Setters
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    // Método toString
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
