package conditionals_DsaWithJava;

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        //Q.Write a Java program to find and print the greatest of three numbers entered by the user.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first value :");
        int x=sc.nextInt();
        System.out.print("Enter a second value :");
        int y=sc.nextInt();
        System.out.print("Enter a third value :");
        int z=sc.nextInt();
        if(x>y && x>z){
            System.out.print(x+" is a greatest number of three numbers ");

        } else if (y>x && y>z) {
            System.out.println(y+" is a greatest number of three numbers");


        }else{
            System.out.println(z+" is a greatest number of three numbers");
        }
    }

    }

