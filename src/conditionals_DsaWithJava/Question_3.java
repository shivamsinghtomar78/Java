package conditionals_DsaWithJava;

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        //Q. Design a Java program that calculates and prints whether a transaction results in a profit, loss, or break-
        //even based on the cost price and selling price
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a cost price :");
        double x=sc.nextDouble();
        System.out.print("Enter a selling price :");
        double y=sc.nextDouble();
        if(x<y){
            System.out.print("profit is "+(y-x));
        }else{
            System.out.println("loss is "+(x-y));
        }
    }
}
