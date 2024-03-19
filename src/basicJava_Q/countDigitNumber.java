package basicJava_Q;

import java.util.Scanner;

public class countDigitNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number :");
        int n=sc.nextInt();
        int cout=0;
        while(n!=0){
            n=n/10;
            cout++;
        }
        System.out.println("the count of digits of given number is "+cout);

    }
}