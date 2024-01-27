package array;

import java.util.Scanner;

public class practiceQ2 {
    public static void main(String[] args) {
        // Q.calculate the sum of all the element in the given array.
        Scanner sc=new Scanner(System.in);

        System.out.print("enter a length of array:");
        int n=sc.nextInt();
        int[]arr=new int[n];
        int sum=0;
        for (int i = 0; i < n; i++) {
            System.out.print("enter a element of array :");
            arr[i]=sc.nextInt();



        }
        for (int i = 0; i <n ; i++) {

            sum=arr[i]+sum;

        }
        System.out.println("the sum of all element of array is "+sum);
    }
}
