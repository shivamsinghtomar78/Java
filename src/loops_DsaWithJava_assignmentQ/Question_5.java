package loops_DsaWithJava_assignmentQ;
import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
    //Q.Write a Java program to generate and print the first 'n' terms of the Fibonacci series.
    Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int n=sc.nextInt();
        int t1=0,t2=1;
        for (int i = 1; i <=n ; i++) {
            System.out.print(t1+"+");
            int sum=t1+t2;
            t1=t2;
            t2=sum;

        }


        }

    }

