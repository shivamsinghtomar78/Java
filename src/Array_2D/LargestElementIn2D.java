package Array_2D;

import java.util.Scanner;

public class LargestElementIn2D {
    public static void main(String[] args) {
      //Q.Write a java program to find the largest element of a given 2D array of integers
      Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
      int m=sc.nextInt();
        System.out.print("Enter number of cols:");
        int n=sc.nextInt();
       int [][]arr= new int[m][n];

        int max=arr[0][0];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print("Enter value:");
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n ; j++) {
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.print(" largest value is "+max);
    }
}
