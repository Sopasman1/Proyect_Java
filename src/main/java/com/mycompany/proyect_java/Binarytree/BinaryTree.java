/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyect_java.Binarytree;

/**
 *
 * @author Jezuz
 */
public class BinaryTree {
    public class Node {
        public Node left;
        public Node right;
        public Integer value;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }

        public Node() {
            this.value = null;
            this.left = null;
            this.right = null;
        }

        // Insertar un valor en el árbol binario
        public void insert(int value) {
            if (this.value == null) {
                this.value = value;
                return;
            }

            if (value < this.value) {
                if (left == null) {
                    left = new Node(value);
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null) {
                    right = new Node(value);
                } else {
                    right.insert(value);
                }
            }
        }

        // Buscar un nodo con un valor específico
        public Node search(int value) {
            if (this.value == null) return null;

            if (this.value == value) return this;

            if (value < this.value) {
                if (left != null) return left.search(value);
                else return null;
            } else {
                if (right != null) return right.search(value);
                else return null;
            }
        }

        // Eliminar un nodo con un valor específico
        public Node delete(Node root, int value) {
            if (root == null) return null;

            if (value < root.value) {
                root.left = delete(root.left, value);
            } else if (value > root.value) {
                root.right = delete(root.right, value);
            } else {
                // Caso 1: Nodo sin hijos
                if (root.left == null && root.right == null) {
                    return null;
                }
                // Caso 2: Nodo con un solo hijo
                else if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                }
                // Caso 3: Nodo con dos hijos
                else {
                    Node minNode = findMin(root.right);
                    root.value = minNode.value;
                    root.right = delete(root.right, minNode.value);
                }
            }

            return root;
        }

        // Encontrar el nodo con el valor mínimo en el subárbol derecho
        private Node findMin(Node node) {
            while (node != null && node.left != null) {
                node = node.left;
            }
            return node;
        }

        // Obtener información sobre un nodo
        public String getNodeInfo(Node node, String action) {
            if (node == null) {
                return "Node with value not found.";
            }

            int height = getNodeHeight(node);

            boolean isLeaf = node.left == null && node.right == null;

            String leafStatus = isLeaf ? "is a leaf node" : "is not a leaf node";

            return String.format("The %s Node with value %d was found at the height %d and %s.", action, node.value, height, leafStatus);
        }

        // Obtener la altura de un nodo
        public int getNodeHeight(Node node) {
            if (this == null) return 0;

            int height = 1;
            if (value == node.value) return height;

            if (node.value < value) {
                if (left != null) {
                    if (left.value.equals(node.value)) {
                        return height + 1;
                    }
                    int temp = left.getNodeHeight(node);
                    return height + temp;
                } else return 0;
            } else {
                if (right != null) {
                    if (right.value.equals(node.value)) {
                        return height + 1;
                    }
                    return height + right.getNodeHeight(node);
                } else return 0;
            }
        }

        // Contar los nodos del árbol
        public int countNodes() {
            int count = 1;
            if (left != null) {
                count += left.countNodes();
            }
            if (right != null) {
                count += right.countNodes();
            }
            return count;
        }

        // Obtener la altura del árbol
        public int getHeight() {
            if (this == null) return 0;

            int leftHeight = (left != null) ? left.getHeight() : 0;
            int rightHeight = (right != null) ? right.getHeight() : 0;

            return Math.max(leftHeight, rightHeight) + 1;
        }

        // Mostrar información del árbol
        public void treeInfo() {
            int height = getHeight();
            int nodeCount = countNodes();
            int levels = height;

            System.out.println("Tree Information:\nNodes: " + nodeCount + "\nHeight: " + height + "\nLevels: " + levels);
        }
    }
}
