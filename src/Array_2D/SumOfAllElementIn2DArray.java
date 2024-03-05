package Array_2D;

import java.util.Scanner;

public class SumOfAllElementIn2DArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][]arr=new int[4][2];
        int sum=0;
        for (int i = 0; i <4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Enter value:");
                arr[i][j]=sc.nextInt();
                
                
            }
            
        }
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <2 ; j++) {
                sum=arr[i][j]+sum;


            }
            
        }
        System.out.print("Sum of the all element of 2D array is "+sum);

        
    }
}
