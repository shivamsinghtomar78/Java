package Basic_dsaWithJava_assignmentQ;

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        // Q.Write a Java program to calculate the area of a circle and the simple interest. Take necessary inputs
        //from the user.
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a radius of circle:");
        double r=sc.nextDouble();
        double area =3.14*r*r;
        System.out.println("the area of circle "+area);


    }
}
