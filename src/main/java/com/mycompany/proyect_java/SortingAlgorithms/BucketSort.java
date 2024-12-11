/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyect_java.SortingAlgorithms;

/**
 *
 * @author Jezuz
 */
import java.util.*;
public class BucketSort {
    public static void sort(int[] array, DisplayCallback displayCallback) throws InterruptedException {
        int n = array.length;
        if (n <= 1) return;

        int minValue = Arrays.stream(array).min().getAsInt();
        int maxValue = Arrays.stream(array).max().getAsInt();
        int bucketCount = n;

        // Crear los "buckets" vacíos
        List<int[]> buckets = new ArrayList<>(bucketCount);
        for (int i = 0; i < bucketCount; i++) {
            buckets.add(new int[0]);
        }

        // Distribuir los elementos en los "buckets"
        displayCallback.display(array, "Distribuyendo los elementos en los buckets...");
        for (int i = 0; i < n; i++) {
            int bucketIndex = (array[i] - minValue) * (bucketCount - 1) / (maxValue - minValue);
            buckets.set(bucketIndex, concat(buckets.get(bucketIndex), array[i]));
        }

        // Mostrar los buckets con su rango, incluyendo los vacíos
        for (int i = 0; i < bucketCount; i++) {
            if (buckets.get(i).length > 0) {
                int[] bucket = buckets.get(i);
                int bucketMin = Arrays.stream(bucket).min().getAsInt();
                int bucketMax = Arrays.stream(bucket).max().getAsInt();
                displayCallback.display(bucket, String.format("Bucket %d: Rango: [%d, %d] - Elementos: %s", i + 1, bucketMin, bucketMax, Arrays.toString(bucket)));
            } else {
                displayCallback.display(new int[0], "Bucket " + (i + 1) + ": Vacío");
            }
        }

        // Ordenar los "buckets" individualmente usando InsertionSort
        for (int i = 0; i < bucketCount; i++) {
            insertionSort(buckets.get(i), displayCallback);
        }

        // Concatenar los resultados
        int index = 0;
        for (int[] bucket : buckets) {
            for (int item : bucket) {
                array[index++] = item;
            }
        }

        // Mostrar el arreglo final
        displayCallback.display(array, "Arreglo final ordenado: " + Arrays.toString(array));
    }

    // Método InsertionSort para ordenar cada bucket
    private static void insertionSort(int[] array, DisplayCallback displayCallback) throws InterruptedException {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;

            // Mostrar el arreglo después de cada paso de InsertionSort
            displayCallback.display(array, "Paso de InsertionSort: " + Arrays.toString(array));
            Thread.sleep(500); // Añadir una pequeña demora para visualizar los pasos
        }
    }

    // Método para concatenar un nuevo elemento en un arreglo existente
    private static int[] concat(int[] array, int element) {
        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[array.length] = element;
        return newArray;
    }

    // Interfaz para el callback de visualización
    public interface DisplayCallback {
        void display(int[] array, String message);
    }
}
