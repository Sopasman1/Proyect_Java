/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyect_java.SortingAlgorithms;

/**
 *
 * @author Jezuz
 */
public class SelectionSort {
     public static void sort(int[] array, DisplayCallback displayCallback) throws InterruptedException {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Visualize the start of a new iteration with the current minimum index
            displayCallback.display(array, i, minIndex);
            Thread.sleep(500); // Pause to visualize

            for (int j = i + 1; j < n; j++) {
                // Show comparison between the current element and the minimum
                displayCallback.display(array, j, minIndex);
                Thread.sleep(500); // Pause to visualize the comparison

                if (array[j] < array[minIndex]) {
                    minIndex = j;

                    // Visualize the new minimum index
                    displayCallback.display(array, j, minIndex);
                    Thread.sleep(500); // Pause to visualize the change in the minimum index
                }
            }

            // Swap the minimum element with the current element
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;

                // Visualize the swap
                displayCallback.display(array, i, minIndex);
                Thread.sleep(500); // Pause to observe the swap
            }
        }

        displayCallback.display(array, -1, -1); // Final visualization
    }

    // Interface for the display callback
    public interface DisplayCallback {
        void display(int[] array, int i, int j);
    }
}
