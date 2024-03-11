package array_assignment_Questions;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of element in the array:");
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.print("Enter element in the array at "+i+" :");
            arr[i]=sc.nextInt();


        }
    }
}
