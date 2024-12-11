/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyect_java.SortingAlgorithms;

/**
 *
 * @author Jezuz
 */
public class CountingSort {
    public static void sort(int[] array, DisplayCallback displayCallback) throws InterruptedException {
        int n = array.length;
        if (n <= 1) return;

        // Encontrar el valor mínimo y máximo en el arreglo
        int minValue = findMinValue(array);
        int maxValue = findMaxValue(array);

        // Crear el arreglo de conteo
        int[] countArray = new int[maxValue - minValue + 1];

        // Contar las ocurrencias de cada número
        for (int i = 0; i < n; i++) {
            countArray[array[i] - minValue]++;
        }

        // Reconstruir el arreglo ordenado a partir del conteo
        int index = 0;
        for (int i = 0; i < countArray.length; i++) {
            while (countArray[i] > 0) {
                array[index++] = i + minValue;

                // Mostrar el arreglo en su estado actual
                displayCallback.display(array, "Ordenando: ");
                Thread.sleep(500); // Añadir una pequeña demora para visualizar los pasos

                countArray[i]--;
            }
        }

        // Mostrar el arreglo final ordenado
        displayCallback.display(array, "Arreglo ordenado: ");
    }

    // Método para encontrar el valor mínimo
    private static int findMinValue(int[] array) {
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    // Método para encontrar el valor máximo
    private static int findMaxValue(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    // Interfaz para el callback de visualización
    public interface DisplayCallback {
        void display(int[] array, String message);
    }
}
