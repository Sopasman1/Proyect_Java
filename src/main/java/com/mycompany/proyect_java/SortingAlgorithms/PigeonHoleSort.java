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
public class PigeonHoleSort {
     public static void sort(int[] numbers, DisplayCallback displayCallback) throws InterruptedException {
        if (numbers == null || numbers.length == 0)
            return;

        // Find the minimum and maximum in the array
        int min = Arrays.stream(numbers).min().getAsInt();
        int max = Arrays.stream(numbers).max().getAsInt();
        int range = max - min + 1;

        // Create "pigeonholes" (spaces)
        int[] holes = new int[range];

        // Put the elements in their respective "pigeonholes"
        for (int number : numbers) {
            holes[number - min]++;
            Thread.sleep(500); // Simulating the process (optional)
            displayCallback.display(numbers); // Show the current state
        }

        // Reconstruct the array from the "pigeonholes"
        int index = 0;
        for (int i = 0; i < range; i++) {
            while (holes[i]-- > 0) {
                numbers[index++] = i + min;
                Thread.sleep(500); // Simulating the process (optional)
                displayCallback.display(numbers); // Show the current state
            }
        }
    }

    // Interface for the display callback
    public interface DisplayCallback {
        void display(int[] array);
    }
}
