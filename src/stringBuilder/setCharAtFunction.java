package stringBuilder;

import java.util.Scanner;

public class setCharAtFunction {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter string :");
         StringBuilder sb=new StringBuilder(sc.nextLine());
        System.out.println(sb);
        sb.setCharAt(1,'a');
        System.out.println(sb);
    }
}
