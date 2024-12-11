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
public class RadixSort {
    // MSD (Most Significant Digit) Sort
    public static class RadixMSDSort {

        public static void sort(int[] numbers, DisplayCallback displayCallback, MessageCallback messageCallback) throws InterruptedException {
            if (numbers == null || numbers.length == 0) return;

            int maxNumber = Arrays.stream(numbers).max().orElse(0);
            int maxDigits = Integer.toString(maxNumber).length();

            sortRecursive(numbers, 0, numbers.length - 1, (int) Math.pow(10, maxDigits - 1), displayCallback, messageCallback);
        }

        private static void sortRecursive(int[] numbers, int low, int high, int divisor, DisplayCallback displayCallback, MessageCallback messageCallback) throws InterruptedException {
            if (low >= high || divisor == 0) return;

            // Progress message
            String digitName = getDigitName(divisor);
            messageCallback.displayMessage("Sorting by " + digitName + "...");

            // Create buckets for digits (0-9)
            List<Integer>[] buckets = new List[10];
            for (int i = 0; i < 10; i++) buckets[i] = new ArrayList<>();

            // Distribute numbers into buckets based on current digit
            for (int i = low; i <= high; i++) {
                int bucketIndex = (numbers[i] / divisor) % 10;
                buckets[bucketIndex].add(numbers[i]);
            }

            // Rebuild the array from the buckets
            int index = low;
            for (List<Integer> bucket : buckets) {
                for (int number : bucket) {
                    numbers[index++] = number;
                }
            }

            // Display current state of the array
            displayCallback.display(numbers);
            Thread.sleep(1000); // Pause for observation

            // Recursively sort each bucket
            index = low;
            for (List<Integer> bucket : buckets) {
                if (bucket.size() > 1) {
                    sortRecursive(numbers, index, index + bucket.size() - 1, divisor / 10, displayCallback, messageCallback);
                }
                index += bucket.size();
            }
        }

        private static String getDigitName(int divisor) {
            if (divisor >= 100) return "hundreds";
            if (divisor == 10) return "tens";
            if (divisor == 1) return "ones";
            return "digit order " + divisor;
        }
    }

    // LSD (Least Significant Digit) Sort
    public static class RadixLSDSort {

        public static void sort(int[] numbers, DisplayCallback displayCallback, MessageCallback messageCallback) throws InterruptedException {
            if (numbers == null || numbers.length == 0) return;

            int maxNumber = Arrays.stream(numbers).max().orElse(0);
            int maxDigits = Integer.toString(maxNumber).length();

            int divisor = 1;

            for (int i = 0; i < maxDigits; i++) {
                // Message for current step
                String digitName = getDigitName(divisor);
                messageCallback.displayMessage("Sorting by " + digitName + "...");

                // Create buckets for digits (0-9)
                List<Integer>[] buckets = new List[10];
                for (int j = 0; j < 10; j++) buckets[j] = new ArrayList<>();

                // Distribute numbers into buckets based on current digit
                for (int number : numbers) {
                    int bucketIndex = (number / divisor) % 10;
                    buckets[bucketIndex].add(number);
                }

                // Rebuild the array from the buckets
                int index = 0;
                for (List<Integer> bucket : buckets) {
                    for (int number : bucket) {
                        numbers[index++] = number;
                    }
                }

                // Display the current state of the array
                displayCallback.display(numbers);
                Thread.sleep(1000); // Pause for observation

                // Move to the next digit
                divisor *= 10;
            }

            messageCallback.displayMessage("Sorting complete.");
        }

        private static String getDigitName(int divisor) {
            if (divisor >= 100) return "hundreds";
            if (divisor == 10) return "tens";
            if (divisor == 1) return "ones";
            return "digit order " + divisor;
        }
    }

    // Interface for displaying the array state
    public interface DisplayCallback {
        void display(int[] array);
    }

    // Interface for displaying progress messages
    public interface MessageCallback {
        void displayMessage(String message);
    }
}
