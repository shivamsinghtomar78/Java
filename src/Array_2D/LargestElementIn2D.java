package Array_2D;

import java.util.Scanner;

public class LargestElementIn2D {
    public static void main(String[] args) {
      //Q.Write a java program to find the largest element of a given 2D array of integers
      Scanner sc=new Scanner(System.in);
       int [][]arr= new int[4][4];

        int max=arr[0][0];
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                System.out.print("Enter value:");
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        System.out.print(" largest value is "+max);
    }
}
