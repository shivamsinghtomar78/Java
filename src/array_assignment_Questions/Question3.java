package array_assignment_Questions;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        //Find the minimum value out of all element in the array.
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of the element in the array:");
        int n=sc.nextInt();
        int[] arr=new int[n];

        for (int i = 0; i <n ; i++) {
            System.out.print("Enter element in the array at the index "+i+" :");
            arr[i]=sc.nextInt();

        }
        int min=arr[0];
        for (int i = 0; i < n; i++) {
            if(arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println("minimum value out of the all element in the array "+min);
    }
}
