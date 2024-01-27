package array;

import java.util.Scanner;

public class TakingInputArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size:");
        int n=sc.nextInt();
        int[]arr=new int[n];
        for (int i = 0; i <n; i++) {
            System.out.print("enter a value :");
            arr[i]=sc.nextInt();


        }
        for (int i = 0; i <n; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
