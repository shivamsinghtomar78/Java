package loops_DsaWithJava;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
     //Q.Write a Java program to calculate the sum of natural numbers up to a given positive integer 'n'
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int n=sc.nextInt();
        int sum=0;
        for (int i = 1; i <=n ; i++) {
            sum+=i;


        }
        System.out.println("the sum of natural numbers upto "+n+" is "+sum);
    }
}
