/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyect_java.SortingAlgorithms;

/**
 *
 * @author Jezuz
 */
public class GnomeSort {
     public static void sort(int[] array, DisplayCallback displayCallback) throws InterruptedException {
        int n = array.length;
        int index = 0;

        while (index < n) {
            // Mostrar los números que estamos comparando
            displayCallback.display(array, index, index - 1);
            Thread.sleep(500); // Pausa para visualizar la comparación

            if (index == 0 || array[index] >= array[index - 1]) {
                index++;
            } else {
                // Realizar el intercambio
                int temp = array[index];
                array[index] = array[index - 1];
                array[index - 1] = temp;

                // Mostrar los números después del intercambio
                displayCallback.display(array, index, index - 1);
                Thread.sleep(500); // Pausa para visualizar el intercambio

                index--; // Retroceder índice
            }
        }

        displayCallback.display(array, -1, -1); // Visualización final
    }

    // Interfaz para el callback de visualización
    public interface DisplayCallback {
        void display(int[] array, int index1, int index2);
    }
}
