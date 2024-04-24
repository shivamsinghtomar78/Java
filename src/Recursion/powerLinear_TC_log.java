package Recursion;

import java.util.Scanner;

public class powerLinear_TC_log {///time complexity O(log(b))
    public static int pow (int a,int b){
        if(b==0) return 1;
        int ans=pow(a,b/2);
        if(b%2==0) return  ans*ans;
        else return  ans*ans*a;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base:");
        int a=sc.nextInt();
        System.out.print("Enter power:");
        int b=sc.nextInt();
        System.out.println(a+" raised to the power "+b+" is "+pow(a,b));
    }
}
