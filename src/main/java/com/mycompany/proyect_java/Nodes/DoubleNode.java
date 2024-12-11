/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyect_java.Nodes;

/**
 *
 * @author Jezuz
 */
public class DoubleNode {
    private int value;
    private DoubleNode next;
    private DoubleNode prev;

    // Constructor por defecto
    public DoubleNode() {
        this.value = 0;
        this.next = null;
        this.prev = null;
    }

    // Constructor con valor inicial
    public DoubleNode(int value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    // Getters y Setters
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    public DoubleNode getPrev() {
        return prev;
    }

    public void setPrev(DoubleNode prev) {
        this.prev = prev;
    }

    // Método toString
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
