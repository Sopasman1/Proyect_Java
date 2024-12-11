/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyect_java.Graph;
import com.mycompany.proyect_java.Graph.Edge;
import com.mycompany.proyect_java.Graph.GraphNode;
/**
 *
 * @author Jezuz
 */
import java.util.*;
import java.util.ArrayList;
public class Graph {
    private List<GraphNode> nodes;
    private List<List<Edge>> adjacencyList;

    public Graph() {
        nodes = new ArrayList<>();
        adjacencyList = new ArrayList<>();
    }

    public void addNode(GraphNode newNode) {
        nodes.add(newNode);
        adjacencyList.add(new ArrayList<>());
    }

    public void addEdge(GraphNode fromNode, GraphNode toNode) {
        if (nodes.contains(fromNode) && nodes.contains(toNode)) {
            Edge newEdge = new Edge(toNode);
            fromNode.getNeighbors().add(newEdge);
            adjacencyList.get(nodes.indexOf(fromNode)).add(newEdge);
        }
    }

    public void addEdge(GraphNode fromNode, GraphNode toNode, int weight) {
        if (nodes.contains(fromNode) && nodes.contains(toNode)) {
            Edge newEdge = new Edge(toNode, weight);
            fromNode.getNeighbors().add(newEdge);
            adjacencyList.get(nodes.indexOf(fromNode)).add(newEdge);
        }
    }

    public void addNoDirectedEdge(GraphNode node1, GraphNode node2, int weight) {
        addEdge(node1, node2, weight);
        addEdge(node2, node1, weight);
    }

    public void addNoDirectedEdge(GraphNode node1, GraphNode node2) {
        addEdge(node1, node2);
        addEdge(node2, node1);
    }

    public void removeNode(GraphNode nodeToRemove) {
        if (nodes.contains(nodeToRemove)) {
            int index = nodes.indexOf(nodeToRemove);
            nodes.remove(index);
            adjacencyList.remove(index);

            // Remove edges to this node
            for (GraphNode node : nodes) {
                node.getNeighbors().removeIf(edge -> edge.getTo().equals(nodeToRemove));
            }

            // Remove edges in the adjacency list
            for (List<Edge> adjList : adjacencyList) {
                adjList.removeIf(edge -> edge.getTo().equals(nodeToRemove));
            }
        }
    }

    public void removeNoDirectedEdge(GraphNode node1, GraphNode node2) {
        removeEdge(node1, node2);
        removeEdge(node2, node1);
    }

    public void removeEdge(GraphNode fromNode, GraphNode toNode) {
        if (nodes.contains(fromNode) && nodes.contains(toNode)) {
            Edge edgeToRemove = fromNode.getNeighbors().stream()
                .filter(e -> e.getTo().equals(toNode))
                .findFirst()
                .orElse(null);

            if (edgeToRemove != null) {
                fromNode.getNeighbors().remove(edgeToRemove);
                adjacencyList.get(nodes.indexOf(fromNode)).remove(edgeToRemove);
            }
        }
    }

    public void removeGraph() {
        nodes.clear();
        adjacencyList.clear();
    }

    public String showAdjacencyList() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < nodes.size(); i++) {
            sb.append(nodes.get(i).getName()).append(": ");
            for (Edge edge : adjacencyList.get(i)) {
                sb.append(edge.getTo().getName()).append(", ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    public String showAdjacencyListWithWeights() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < nodes.size(); i++) {
            sb.append(nodes.get(i).getName()).append(": ");
            for (Edge edge : adjacencyList.get(i)) {
                sb.append(edge.getTo().getName()).append(" (").append(edge.getWeight()).append("), ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    public String dfs(GraphNode startNode) {
        if (startNode == null || !nodes.contains(startNode)) return "";

        List<GraphNode> visited = new ArrayList<>();
        StringBuilder result = new StringBuilder();

        dfsRecursive(startNode, visited, result);

        return result.toString();
    }

    private void dfsRecursive(GraphNode currentNode, List<GraphNode> visited, StringBuilder result) {
        visited.add(currentNode);

        if (result.length() > 0) {
            result.append(" → ");
        }
        result.append(currentNode.getName());

        for (Edge edge : currentNode.getNeighbors()) {
            GraphNode adjacentNode = edge.getTo();
            if (!visited.contains(adjacentNode)) {
                dfsRecursive(adjacentNode, visited, result);
            }
        }
    }

    public String dfsIterative(GraphNode startNode) {
        if (startNode == null || !nodes.contains(startNode)) return "";

        List<GraphNode> visited = new ArrayList<>();
        Stack<GraphNode> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        stack.push(startNode);

        while (!stack.isEmpty()) {
            GraphNode currentNode = stack.pop();

            if (!visited.contains(currentNode)) {
                if (result.length() > 0) {
                    result.append(" → ");
                }
                result.append(currentNode.getName());
                visited.add(currentNode);

                List<Edge> reversedEdges = new ArrayList<>(currentNode.getNeighbors());
                reversedEdges.sort((e1, e2) -> e2.getTo().getName().compareTo(e1.getTo().getName()));

                for (Edge edge : reversedEdges) {
                    GraphNode adjacentNode = edge.getTo();
                    if (!visited.contains(adjacentNode)) {
                        stack.push(adjacentNode);
                    }
                }
            }
        }

        return result.toString();
    }

    public String bfs(GraphNode startNode) {
        if (startNode == null || !nodes.contains(startNode)) return "";

        List<GraphNode> visited = new ArrayList<>();
        Queue<GraphNode> queue = new LinkedList<>();
        StringBuilder result = new StringBuilder();

        queue.offer(startNode);

        while (!queue.isEmpty()) {
            GraphNode currentNode = queue.poll();

            if (!visited.contains(currentNode)) {
                if (result.length() > 0) {
                    result.append(" → ");
                }
                result.append(currentNode.getName());
                visited.add(currentNode);

                for (Edge edge : currentNode.getNeighbors()) {
                    GraphNode adjacentNode = edge.getTo();
                    if (!visited.contains(adjacentNode) && !queue.contains(adjacentNode)) {
                        queue.offer(adjacentNode);
                    }
                }
            }
        }

        return result.toString();
    }
}
