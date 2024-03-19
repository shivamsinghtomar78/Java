package strings;

import java.util.Scanner;
public class countTheNumberOfVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String:");
        String n=sc.nextLine();
        int m=n.length();
        int count =0;
        for (int i = 0; i <m ; i++) {
           if(n.charAt(i)=='a'|| n.charAt(i)=='e' || n.charAt(i)=='i' || n.charAt(i)=='o' || n.charAt(i)=='u' ||n.charAt(i)=='A' || n.charAt(i)=='E' ||n.charAt(i)=='I'
           || n.charAt(i)=='O' || n.charAt(i)=='U'  ){
               count ++;

           }
           }

        System.out.print("Number of vowels in the String is "+count );
    }
}
