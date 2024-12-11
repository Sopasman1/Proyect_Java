/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyect_java.SortingAlgorithms;

/**
 *
 * @author Jezuz
 */
public class CombSort {
    public static void sort(int[] array, DisplayCallback displayCallback) throws InterruptedException {
        int gap = array.length;
        final double shrinkFactor = 1.3;
        boolean swapped = true;

        while (gap > 1 || swapped) {
            // Reduce el gap según el factor de reducción
            gap = (int) (gap / shrinkFactor);
            if (gap < 1) {
                gap = 1;
            }

            swapped = false;

            // Compara los elementos con el gap actual
            for (int i = 0; i < array.length - gap; i++) {
                // Mostrar comparación entre los elementos con el gap
                displayCallback.display(array, i, i + gap);
                Thread.sleep(500); // Pausa para visualizar la comparación

                if (array[i] > array[i + gap]) {
                    // Intercambiar los elementos si están fuera de orden
                    int temp = array[i];
                    array[i] = array[i + gap];
                    array[i + gap] = temp;

                    // Mostrar el intercambio
                    displayCallback.display(array, i, i + gap);
                    Thread.sleep(500); // Pausa para visualizar el intercambio

                    swapped = true;
                }
            }
        }

        // Visualización final después de ordenar
        displayCallback.display(array, -1, -1); // Indica que el proceso ha terminado
    }

    // Interfaz para el callback de visualización
    public interface DisplayCallback {
        void display(int[] array, int index1, int index2);
    }
}
