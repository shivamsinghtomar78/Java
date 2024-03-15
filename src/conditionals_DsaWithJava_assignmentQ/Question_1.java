package conditionals_DsaWithJava_assignmentQ;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        //Q. Write a Java function that takes an integer as input and prints "Even" if the number is even and "Odd" if it's odd

        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number :");

        int  n=sc.nextInt();
        if(n%2==0){
            System.out.print(n+" is an even number ");

        }else{
            System.out.print(n+" is an odd number ");
        }
    }
}
