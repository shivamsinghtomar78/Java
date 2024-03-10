package array_assignment_Questions;

import java.util.ArrayList;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        //Q.Wap to find the duplicate element from the given array of elements.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value of element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> duplicates = new ArrayList<>();
        boolean ifPresent = false;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j] && !duplicates.contains(arr[i])) {
                    duplicates.add(arr[i]);
                    ifPresent = true;
                }
            }
        }

        if (ifPresent) {
            System.out.println("Duplicate elements in the array: " + duplicates);
        } else {
            System.out.println("No duplicate elements present in the array");
        }
    }
}
