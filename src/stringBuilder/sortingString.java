package stringBuilder;

import java.util.Arrays;
import java.util.Scanner;

public class sortingString {
    public static void main(String[] args) {
        // string is immutable sorting is not possible but by using character array can be sort.
        Scanner sc=new Scanner(System.in);
       /* System.out.print("Enter a string :");
        String s=sc.nextLine();
        char [] ch= s.toCharArray();
        System.out.println();
        Arrays.sort(ch);
        for(char ele:ch){
            System.out.print(ele);
        }
        System.out.println();

      */
       //sorting in Stringbuilder
        System.out.print("Enter a stringbuilder:");
        StringBuilder sb=new StringBuilder(sc.nextLine());
        char [] arr=sb.toString().toCharArray();
        Arrays.sort(arr);
      
        for(char ele:arr){
            System.out.print(ele);
        }
        System.out.println();



    }
}
