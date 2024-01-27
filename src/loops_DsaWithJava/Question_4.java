package loops_DsaWithJava;

import java.util.Scanner;

public class Question_4 {
    public static void main(String[] args) {
        //Q. Write a Java program to check if a given string is a palindrome or not using a loop
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string :");
        String str=sc.next();
        String reversedstr="";
        for (int i =str.length()-1; i>=0 ; i--) {
            reversedstr=reversedstr+str.charAt(i);


        }if(str.equals(reversedstr)){
            System.out.println(str +" is a palindrome !!");

        }else{
            System.out.println(str+" is not a palindrome !!");

        }



    }
}
