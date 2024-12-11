/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyect_java.SortingAlgorithms;

/**
 *
 * @author Jezuz
 */
public class QuickSort {
     public static void sort(int[] array, int low, int high, DisplayCallback displayCallback) throws InterruptedException {
        if (low < high) {
            // Find the pivot
            int pivotIndex = partition(array, low, high, displayCallback);

            // Visualize the current partition
            displayCallback.display(array, low, high);
            Thread.sleep(500); // Pause to visualize the partition

            // Recursively sort the sublists
            sort(array, low, pivotIndex - 1, displayCallback);
            sort(array, pivotIndex + 1, high, displayCallback);
        }
    }

    private static int partition(int[] array, int low, int high, DisplayCallback displayCallback) throws InterruptedException {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            // Show the comparison between array[j] and the pivot
            displayCallback.display(array, j, high);
            Thread.sleep(500); // Pause to visualize the comparison

            if (array[j] <= pivot) {
                i++;
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

                // Show the swap
                displayCallback.display(array, i, j);
                Thread.sleep(500); // Pause to visualize the swap
            }
        }

        // Place the pivot in its correct position
        int pivotIndex = i + 1;
        int tempPivot = array[pivotIndex];
        array[pivotIndex] = array[high];
        array[high] = tempPivot;

        // Show the pivot placement
        displayCallback.display(array, pivotIndex, high);
        Thread.sleep(500); // Pause to visualize the pivot swap

        return pivotIndex;
    }

    // Interface for the display callback
    public interface DisplayCallback {
        void display(int[] array, int i, int j);
    }
}
