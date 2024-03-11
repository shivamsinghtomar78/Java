package array_assignment_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        // WAP to find the largest three elements in the array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of element in the array:");
        int n = sc.nextInt();
        if (n < 3) {
            System.out.println("Array should have at least 3 elements.");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter element in the array at " + i + " :");
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int first = arr[n - 1];
            int second = arr[n - 2];
            int third = arr[n - 3];
            System.out.print("The largest three elements in the array is " + first + " " + second + " " + third);


        }


    }
}

