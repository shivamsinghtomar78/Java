package Recursion;

import java.util.Scanner;

public class fibonacci_Series_print {
    public static void print(int a,int b,int n){
        if(n==0) return ;
        int c=a+b;
        System.out.println(c);
        print(b,c,n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0,b=1;
        System.out.print("Enter number of element in series:");
        int n=sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        print(a,b,n-2);
    }
}
