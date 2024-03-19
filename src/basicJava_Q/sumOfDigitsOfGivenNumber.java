package basicJava_Q;

import java.util.Scanner;

public class sumOfDigitsOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number :");
        int n=sc.nextInt();
        int sum=0;
        int x;
        while(n!=0){
            x=n%10;
            sum=sum+x;
            n=n/10;


        }
        System.out.println("sum of digits of a given number is "+sum);
    }
}
