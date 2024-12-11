/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyect_java.Graph;
import com.mycompany.proyect_java.Graph.GraphNode;
/**
 *
 * @author Jezuz
 */
import java.util.*;
import java.util.ArrayList;
public class Edge {
    
     private GraphNode to;  // Nodo al que apunta el borde
    private int weight;    // Peso del borde

    // Constructor que inicializa el borde con un nodo destino y un peso
    public Edge(GraphNode to, int weight) {
        this.to = to;
        this.weight = weight;
    }

    // Constructor que inicializa el borde con un nodo destino, sin peso (por defecto el peso sería 0)
    public Edge(GraphNode to) {
        this.to = to;
        this.weight = 0;  // Si no se proporciona un peso, el peso por defecto será 0
    }

    // Getter para el nodo de destino
    public GraphNode getTo() {
        return to;
    }

    // Setter para el nodo de destino
    public void setTo(GraphNode to) {
        this.to = to;
    }

    // Getter para el peso
    public int getWeight() {
        return weight;
    }

    // Setter para el peso
    public void setWeight(int weight) {
        this.weight = weight;
    }
}
