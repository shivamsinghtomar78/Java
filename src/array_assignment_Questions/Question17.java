package array_assignment_Questions;

import java.util.HashMap;
import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        // Q.Find the first non-repeating element in the array.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Inputting elements into the array.
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element in the array at " + i + ": ");
            arr[i] = sc.nextInt();
        }

        // HashMap to store the frequency of each element
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each element in the array
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Iterate through the array to find the first non-repeating element
        int firstNonRepeatingElement = -1; // Initialize to -1 if there's no non-repeating element
        for (int num : arr) {
            if (frequencyMap.get(num) == 1) {
                firstNonRepeatingElement = num;
                break; // Found the first non-repeating element, exit the loop
            }
        }

        if (firstNonRepeatingElement != -1) {
            System.out.println("First non-repeating element: " + firstNonRepeatingElement);
        } else {
            System.out.println("No non-repeating element found in the array.");
        }
    }
}
