package stringBuilder;

import java.util.Scanner;

public class inputInStringBuilder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String :");
        StringBuilder sb=new StringBuilder(sc.nextLine());
        System.out.println(sb);
    }
}
