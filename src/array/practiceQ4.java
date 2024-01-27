package array;

import java.util.Arrays;
import java.util.Scanner;

public class practiceQ4 {
    public static void main(String[] args) {
        // Q.Find the maximum value out of all the element in the array.
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a length of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a value of the element at index "+i +" :");
            arr[i] = sc.nextInt();

        }
        int max=arr[0];
        for (int i = 1; i <n ; i++) {
            if(max<arr[i]){
                max=arr[i];

            }

        }
        System.out.println("the maximum value out of all the element is "+max);

    }

}
