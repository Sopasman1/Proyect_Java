/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyect_java.Graph;
import com.mycompany.proyect_java.Graph.Edge;
/**
 *
 * @author Jezuz
 */
import java.util.*;
import java.util.ArrayList;
public class GraphNode {
    private String name;
    private List<Edge> neighbors;

    // Constructor
    public GraphNode(String name) {
        this.name = name;
        this.neighbors = new ArrayList<>();
    }

    // Getter para el nombre del nodo
    public String getName() {
        return name;
    }

    // Setter para el nombre del nodo
    public void setName(String name) {
        this.name = name;
    }

    // Getter para los vecinos (aristas) del nodo
    public List<Edge> getNeighbors() {
        return neighbors;
    }

    // Método para agregar un vecino al nodo
    public void addNeighbor(Edge edge) {
        this.neighbors.add(edge);
    }

    // Método para eliminar un vecino
    public void removeNeighbor(Edge edge) {
        this.neighbors.remove(edge);
    }
}
