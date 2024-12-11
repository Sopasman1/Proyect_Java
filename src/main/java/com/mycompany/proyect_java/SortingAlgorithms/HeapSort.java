/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyect_java.SortingAlgorithms;

/**
 *
 * @author Jezuz
 */
public class HeapSort {
     public static void sort(int[] array, DisplayCallback displayCallback) throws InterruptedException {
        int n = array.length;

        // Construir el heap (reordenar el arreglo)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i, displayCallback);
        }

        // Extraer elementos del heap uno por uno
        for (int i = n - 1; i > 0; i--) {
            // Mover la raíz actual al final
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            displayCallback.display(array, 0, i);
            Thread.sleep(500); // Pausa para visualizar el intercambio

            // Aplicar Heapify al subárbol reducido
            heapify(array, i, 0, displayCallback);
        }

        displayCallback.display(array, -1, -1); // Visualización final
    }

    private static void heapify(int[] array, int n, int i, DisplayCallback displayCallback) throws InterruptedException {
        int largest = i; // Inicializar el nodo más grande como raíz
        int left = 2 * i + 1; // Hijo izquierdo
        int right = 2 * i + 2; // Hijo derecho

        // Comparar hijo izquierdo con la raíz
        if (left < n && array[left] > array[largest]) {
            displayCallback.display(array, i, left);
            Thread.sleep(500); // Pausa para visualizar la comparación
            largest = left;
        }

        // Comparar hijo derecho con la raíz
        if (right < n && array[right] > array[largest]) {
            displayCallback.display(array, i, right);
            Thread.sleep(500); // Pausa para visualizar la comparación
            largest = right;
        }

        // Si el nodo más grande no es la raíz
        if (largest != i) {
            // Realizar el intercambio
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            displayCallback.display(array, i, largest);
            Thread.sleep(500); // Pausa para visualizar el intercambio

            // Aplicar Heapify recursivamente
            heapify(array, n, largest, displayCallback);
        }
    }

    // Interfaz para el callback de visualización
    public interface DisplayCallback {
        void display(int[] array, int index1, int index2);
    }
}
