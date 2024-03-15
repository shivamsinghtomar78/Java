package conditionals_DsaWithJava_assignmentQ;

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        //Q. Implement a Java function to determine if a given year is a leap year or not. Print "Leap Year" if true,otherwise print "Not a Leap Year.
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a year :");
        int n=sc.nextInt();
        if(n%4==0){
            System.out.print(n+" is a leap year ");

        }else{
            System.out.println(n+" is not a leap year");

        }
    }
}
