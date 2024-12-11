/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyect_java.SortingAlgorithms;

/**
 *
 * @author Jezuz
 */
import java.util.Arrays;
public class MergeAlgorithms {
     // Merge Sort (recursive)
    public static void mergeSort(int[] array, int left, int right, DisplayCallback displayCallback) throws InterruptedException {
        if (left < right) {
            int middle = (left + right) / 2;

            // Show division
            displayCallback.display(Arrays.copyOfRange(array, left, right + 1), "Dividing: " + left + " - " + right);

            // Recursively divide
            mergeSort(array, left, middle, displayCallback);
            mergeSort(array, middle + 1, right, displayCallback);

            // Merge the subarrays
            merge(array, left, middle, right, displayCallback);
        }
    }

    // Merge the two sorted subarrays
    private static void merge(int[] array, int left, int middle, int right, DisplayCallback displayCallback) throws InterruptedException {
        int[] leftArray = Arrays.copyOfRange(array, left, middle + 1);
        int[] rightArray = Arrays.copyOfRange(array, middle + 1, right + 1);

        int i = 0, j = 0, k = left;

        // Merge the arrays in order
        while (i < leftArray.length && j < rightArray.length) {
            array[k++] = (leftArray[i] <= rightArray[j]) ? leftArray[i++] : rightArray[j++];
            Thread.sleep(50); // Pause to simulate visual step
            displayCallback.display(array, "Merging...");
        }

        // Copy the remaining elements
        while (i < leftArray.length) {
            array[k++] = leftArray[i++];
            Thread.sleep(50);
            displayCallback.display(array, "Adding remaining elements from the left...");
        }

        while (j < rightArray.length) {
            array[k++] = rightArray[j++];
            Thread.sleep(50);
            displayCallback.display(array, "Adding remaining elements from the right...");
        }

        displayCallback.display(Arrays.copyOfRange(array, left, right + 1), "Merge completed: " + left + " - " + right);
    }

    // Direct Merge (Iterative)
    public static void directMerge(int[] array, DisplayCallback displayCallback) throws InterruptedException {
        int n = array.length;
        int[] temp = new int[n];

        for (int width = 1; width < n; width *= 2) {
            displayCallback.display(Arrays.copyOf(array, array.length), "Dividing with width = " + width);

            // Iterate over subarrays of size 2*width
            for (int i = 0; i < n; i += 2 * width) {
                int left = i;
                int middle = Math.min(i + width, n);
                int right = Math.min(i + 2 * width, n);

                int l = left, r = middle, k = left;

                // Merge the left and right subarrays into the temp array
                while (l < middle && r < right) {
                    temp[k++] = (array[l] <= array[r]) ? array[l++] : array[r++];
                }

                while (l < middle) {
                    temp[k++] = array[l++];
                }

                while (r < right) {
                    temp[k++] = array[r++];
                }

                // Copy the temp array back to the original array
                System.arraycopy(temp, left, array, left, right - left);
            }

            displayCallback.display(Arrays.copyOf(array, array.length), "Merge after width = " + width);
            Thread.sleep(200); // Pause to simulate visual step
        }
    }

    // Natural Merge Sort
    public static void naturalMerge(int[] array, DisplayCallback displayCallback) throws InterruptedException {
        boolean sorted = false;
        int[] temp = new int[array.length];

        while (!sorted) {
            sorted = true;
            int i = 0;
            displayCallback.display(array, "Dividing into subsequences");

            while (i < array.length) {
                int start = i;

                // Find the end of the first ordered sequence
                while (i < array.length - 1 && array[i] <= array[i + 1]) {
                    i++;
                }
                i++;

                int j = i;

                // Find the end of the second ordered sequence
                while (i < array.length - 1 && array[i] <= array[i + 1]) {
                    i++;
                }
                i++;

                if (j < array.length) {
                    mergeNatural(array, start, j, Math.min(i, array.length), temp);
                    sorted = false;
                }
            }

            System.arraycopy(temp, 0, array, 0, array.length);

            displayCallback.display(array, "Full merge");
            Thread.sleep(200); // Pause to simulate visual step
        }
    }

    // Helper function for Natural Merge
    private static void mergeNatural(int[] array, int left, int middle, int right, int[] temp) {
        int i = left, j = middle, k = left;
        while (i < middle && j < right) {
            temp[k++] = (array[i] <= array[j]) ? array[i++] : array[j++];
        }

        while (i < middle) temp[k++] = array[i++];
        while (j < right) temp[k++] = array[j++];
    }

    // Interface for display callback
    public interface DisplayCallback {
        void display(int[] array, String message);
    }
}
