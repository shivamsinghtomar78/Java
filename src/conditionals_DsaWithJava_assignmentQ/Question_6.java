package conditionals_DsaWithJava_assignmentQ;

import java.util.Scanner;

public class Question_6 {
    public static void main(String[] args) {
      //  Create a Java function that takes three integer parameters representing the sides of a triangle and prints whether it's equilateral, isosceles, or scalene

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a first side of triangle :");
        int x=sc.nextInt();
        System.out.print("Enter a second side of triangle :");
        int y=sc.nextInt();
        System.out.print("Enter a third side of triangle :");
         int z=sc.nextInt();
         if(x==y && y==z && z==x){
             System.out.print("This is an equilateral triangle");

         } else if (x==y || y==z || z==x) {
             System.out.print("This is an isosceles triangle ");

         }else{
             System.out.println("This is a scalene triangle ");
         }


    }
}
