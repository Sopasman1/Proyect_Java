/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyect_java.SortingAlgorithms;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author Jezuz
 */
public class BubbleSort {
     public static void sort(int[] arr, DisplayCallback displayCallback) throws InterruptedException {
        int n = arr.length;
        int temp;
        boolean swapped;

        // Recorre el arreglo para realizar las comparaciones e intercambios
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                // Incrementa el contador de comparaciones
                // Mostrar los números que se están comparando
                displayCallback.display(arr, j, j + 1);

                // Esperar para mostrar la comparación
                TimeUnit.MILLISECONDS.sleep(400);

                if (arr[j] > arr[j + 1]) {
                    // Intercambiar los elementos
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true; // Incrementa el contador de intercambios

                    // Mostrar los números después de intercambiarlos
                    displayCallback.display(arr, j, j + 1);
                    TimeUnit.MILLISECONDS.sleep(400);
                }
            }

            // Si no se hicieron intercambios, el arreglo está ordenado
            if (!swapped) {
                break;
            }
        }
    }

    // Interfaz para el callback de visualización
    public interface DisplayCallback {
        void display(int[] arr, int index1, int index2);
    }
}
