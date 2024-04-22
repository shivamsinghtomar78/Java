package Recursion;

import java.util.Scanner;

public class print_1_to_n {
    public  static void print(int x,int n){
        if(x>n) return;
        System.out.println(x);
        print(x+1,n);

    }
    public static void main(String[] args) {
        //Q.print 1 to n.
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        print(1,n);
    }
    }

