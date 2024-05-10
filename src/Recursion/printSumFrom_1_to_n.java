package Recursion;

import java.util.Scanner;

public class printSumFrom_1_to_n {
    public static void sum(int n,int sum){
        if(n==0){
            System.out.println("sum of first n number is "+sum);
            return ;
        }
        sum(n-1,sum+n);// call and work
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n:");
        int n=sc.nextInt();
        sum(n,0);
    }
}
