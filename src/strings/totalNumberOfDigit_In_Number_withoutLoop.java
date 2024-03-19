package strings;

import java.util.Scanner;

public class totalNumberOfDigit_In_Number_withoutLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number :");
        int n=sc.nextInt();
        String s=n+"";
        String p=Integer.toString(n);
        System.out.println(s.length());
        System.out.println(p.length());
    }
}
