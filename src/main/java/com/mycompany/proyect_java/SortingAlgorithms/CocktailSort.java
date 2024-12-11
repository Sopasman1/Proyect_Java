/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyect_java.SortingAlgorithms;

/**
 *
 * @author Jezuz
 */
public class CocktailSort {
    public static void sort(int[] array, DisplayCallback displayCallback) throws InterruptedException {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;

            // Recorrido de izquierda a derecha
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    displayCallback.display(array, i, i + 1);  // Resaltamos los números que estamos intercambiando
                    Thread.sleep(500);  // Pausa para visualizar el intercambio

                    // Intercambio
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    swapped = true;
                }
            }

            // Recorrido de derecha a izquierda
            for (int i = n - 2; i >= 0; i--) {
                if (array[i] > array[i + 1]) {
                    displayCallback.display(array, i, i + 1);  // Resaltamos los números que estamos intercambiando
                    Thread.sleep(500);  // Pausa para visualizar el intercambio

                    // Intercambio
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    swapped = true;
                }
            }

            n--;  // Reducir el tamaño de la zona no ordenada
        } while (swapped);

        displayCallback.display(array, -1, -1);  // Visualización final
    }

    // Interfaz para el callback de visualización
    public interface DisplayCallback {
        void display(int[] array, int index1, int index2);
    }
}
