package array_assignment_Questions;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        // Q.calculate the product of all the elements in the given array.
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of element in array:");
        int n=sc.nextInt();
        int product=1;
        int[]arr=new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.print("enter element:");
            arr[i]=sc.nextInt();


        }
        for (int i = 0; i <n ; i++) {
            product=product*arr[i];


        }
        System.out.print("The product of the all element of array is "+product);

    }
}
