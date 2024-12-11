/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyect_java.SortingAlgorithms;

/**
 *
 * @author Jezuz
 */
public class ShellSort {
    public static void sort(int[] array, DisplayCallback displayCallback) throws InterruptedException {
        int n = array.length;

        // Start with a large gap and reduce it in each iteration
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Sort subarrays with the current gap
            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j;

                // Show the current element and the one it's being compared with
                displayCallback.display(array, i, i - gap);
                Thread.sleep(500); // Pause to visualize the comparison

                // Shift the elements of the subarray to the right
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];

                    // Show the movement of elements
                    displayCallback.display(array, j, j - gap);
                    Thread.sleep(500); // Pause to visualize the movement
                }

                // Insert the element into its correct position
                array[j] = temp;

                // Show the insertion of the element
                displayCallback.display(array, j, i);
                Thread.sleep(500); // Pause to visualize the insertion
            }
        }

        displayCallback.display(array, -1, -1); // Final visualization
    }

    // Interface for the display callback
    public interface DisplayCallback {
        void display(int[] array, int i, int j);
    }
}
