package array_assignment_Questions;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Inputting elements into the array.
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element in the array at " + i + ": ");
            arr[i] = sc.nextInt();
        }

        // Input the value of x
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();

        int count = 0;

        // Fix the first element and find other two using two-pointer approach
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == x) {
                    // Found triplet
                    count++;
                    left++;
                    right--;
                } else if (sum < x)
                    left++;
                else
                    right--;
            }
        }

        System.out.println("Number of triplets whose sum is equal to " + x + ": " + count);
    }
}
