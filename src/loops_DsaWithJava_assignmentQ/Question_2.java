package loops_DsaWithJava_assignmentQ;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        //Q. Write a Java program to print a multiplication table for a given number 'n'
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int n=sc.nextInt();
        for (int i = 1; i <=n*10; i++) {
            if(i%n==0){

                System.out.println(i);
            }

        }
    }
}
