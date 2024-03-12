package array_assignment_Questions;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        //Q.Count the number of triplets whose sum is equal to the given value x
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Inputting elements into the array.
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element in the array at " + i + ": ");
            arr[i] = sc.nextInt();
        }

    }
}
