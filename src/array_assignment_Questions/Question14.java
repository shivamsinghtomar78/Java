package array_assignment_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
   //Q.You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m
        //and n, representing the number of elements in nums1 and nums2 respectively
        // Merge nums1 and nums2 into a single array sorted in non-decreasing order
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in the array one : ");
        int m = sc.nextInt();
        int[] arr1 = new int[m];


        // Inputting elements into the array.

        for (int i = 0; i < m; i++) {
            System.out.print("Enter element in the array at " + i + ": ");
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter number of elements in the array two: ");
        int n=sc.nextInt();
        int []arr2=new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element in the array at " + i + ": ");
            arr2[i] = sc.nextInt();
        }
        int []newarr=new int[n+m];
        for (int i = 0; i <m ; i++) {
            newarr[i]=arr1[i];

        }
        for (int i = 0; i <n ; i++) {
            newarr[i+m]=arr2[i];

        }
        Arrays.sort(newarr);
        System.out.println("Merged sorted array :");
        for(int num:newarr){
            System.out.print(num+" ");
        }



    }
}
