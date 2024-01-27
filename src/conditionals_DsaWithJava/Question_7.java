package conditionals_DsaWithJava;

import java.util.Scanner;

public class Question_7 {
    public static void main(String[] args) {
        //Q. Develop a Java program to find and print the least of three numbers using nested if-else statements

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a first number :");
        int x=sc.nextInt();
        System.out.print("Enter a second number :");
        int y=sc.nextInt();
        System.out.print("Enter a third number :");
        int z=sc.nextInt();
        if(x<y && x<z){
            System.out.println(x+" is a least number of three numbers ");

        } else if (y<x && y<z) {
            System.out.println(y+" is a least number of three numbers");


        }else {
            System.out.println(z+" is a least number of three numbers  ");
        }
    }
}
