package Recursion;

import java.util.Scanner;

public class tSumFrom_1_to_n_returnTYpe {
    public static int sum(int n){
   if(n==1 || n==0) return 1;
   return n+sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n:");
        int n=sc.nextInt();
        System.out.println( sum(n));
    }
}
