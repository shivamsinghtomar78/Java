package stringBuilder;

import java.util.Scanner;

public class toggleAllTheCharacter {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.print("Enter string :");
        StringBuilder sb=new StringBuilder(sc.nextLine());
        int n=sb.length();
        for (int i = 0; i <n ; i++) {// capital
            char ch =sb.charAt(i); // convert in charcter
            int ascii=(int)ch;// convert charcter into integer
            if(ascii>=65 && ascii<=90){
                ascii+=32;
                ch=(char)ascii;// convert integer into character
                sb.setCharAt(i,ch);
            } else if (ascii>=97 &&ascii<=122) {// small
                ascii-=32;
                ch=(char) ascii;// convert integer into character
                sb.setCharAt(i,ch);

            }


        }
        System.out.println(sb);


    }
}
