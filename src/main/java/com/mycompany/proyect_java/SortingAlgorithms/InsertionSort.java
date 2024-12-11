/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyect_java.SortingAlgorithms;

/**
 *
 * @author Jezuz
 */
public class InsertionSort {
    public static void sort(int[] array, DisplayCallback displayCallback) throws InterruptedException {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            // Visualizar la comparación inicial
            displayCallback.display(array, i, j);
            Thread.sleep(500); // Pausa para observar

            // Mover los elementos del array que son mayores que la clave
            // a una posición adelante de su posición actual
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];

                // Visualizar el movimiento
                displayCallback.display(array, j, j + 1);
                Thread.sleep(500); // Pausa para observar

                j--;
            }
            array[j + 1] = key;

            // Visualizar la inserción del elemento
            displayCallback.display(array, j + 1, i);
            Thread.sleep(500); // Pausa para observar
        }

        displayCallback.display(array, -1, -1); // Visualización final
    }

    // Interfaz para el callback de visualización
    public interface DisplayCallback {
        void display(int[] array, int index1, int index2);
    }
}
