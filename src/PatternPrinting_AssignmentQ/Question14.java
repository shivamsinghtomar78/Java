package PatternPrinting_AssignmentQ;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();

        char startChar = 'A';

        for (int i = 0; i < n; i++) {
            // Print spaces
            for (int j = 0; j < n-1-i; j++) {
                System.out.print(" "+" ");
            }

            // Print characters in decreasing order
            for (int j = i; j >= 0; j--) {
                System.out.print((char) (startChar + j) + " ");
            }

            // Print characters in increasing order
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (startChar + j) + " ");
            }

            System.out.println();
        }
    }
}

