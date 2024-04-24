package Recursion;

import java.util.Scanner;

public class stair_path {
    public static int stair(int n){
        if(n<=2) return n;

        return  stair(n-1)+stair(n-2);
    }
    public static void main(String[] args) {
      //Q.Find no. of ways to reach nth stair if 1 or 2 jump at a time is allowed
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        System.out.println(stair(n));

    }
}

