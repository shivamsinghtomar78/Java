package Recursion;

import java.util.Scanner;

public class factorial_Using_Recursion {
    public static int fact(int n){
        if(n==1) return 1;
      return n*fact(n-1);
    }
    public static void main(String[] args) {
        //Q.Make a function which calculate the factorial of n using recursion.
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        System.out.println("factorial of "+n+" is "+fact(n));
    }
}
