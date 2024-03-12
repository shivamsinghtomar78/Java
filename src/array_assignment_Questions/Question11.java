package array_assignment_Questions;

import java.util.Scanner;


public class Question11 {
    public static void main(String[] args) {
// Find the unique number in a given Array where all the elements are being repeated twice with one value
//being unique
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Inputting elements into the array.
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element in the array at " + i + ": ");
            arr[i] = sc.nextInt();
        }

        int unique = 0;
        boolean isUnique = false;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
                if (count > 1) {
                    break; // No need to continue if the count exceeds 1
                }
            }
            if (count == 1) {
                isUnique = true;
                unique = arr[i];
                break; // Once unique element is found, no need to continue searching
            }
        }
        if (isUnique) {
            System.out.println("The unique number is " + unique);
        } else {
            System.out.println("There is no unique number.");
        }

        sc.close();
    }
}
