package array_assignment_Questions;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        //Q. If an array arr contains n elements, then check if the given array is a palindrome or not
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Inputting elements into the array.
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element in the array at " + i + ": ");
            arr[i] = sc.nextInt();
        }
        boolean isPalindrome=true;

        for (int i = 0; i < n; i++) {
            if(arr[i]!=arr[n-1-i]){
                isPalindrome=false;
                break;

            }


        }
        if(isPalindrome){
            System.out.print("Array is  a palindrome");
        }else{
            System.out.print("Array is not a palindrome");
        }
    }
}
