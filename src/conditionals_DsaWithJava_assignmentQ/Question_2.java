package conditionals_DsaWithJava_assignmentQ;


import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        //Q. Create a Java method to find and print the absolute value of an integer without using the built-in Math.abs() function.

        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number :");
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Absolute number is "+(-1)*n);


        }else{
            System.out.println("Absolute number is "+n);
        }
    }


    }

