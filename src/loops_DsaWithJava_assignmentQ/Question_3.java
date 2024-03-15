package loops_DsaWithJava_assignmentQ;

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        //Q. Write a Java program to find the GCD (Greatest Common Divisor) of two numbers using a loop.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number :");
        int x = sc.nextInt();
        System.out.print("Enter a second number :");
        int y = sc.nextInt();
        int i;
        int n=1;
        for ( i = 1; i<x; i++) {
            if(x%i==0 && y%i==0  ){
                n=i;



            }


            }
        System.out.println(n+" greatest common divisor of two numbers ");



        }


    }

