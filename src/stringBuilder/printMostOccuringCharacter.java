package stringBuilder;

import java.util.Scanner;

public class printMostOccuringCharacter {
    public static void main(String[] args) {
        // Q.Given a string consisting of lowercase english alphabets .Print the character that is occuring most number of times.
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string :");
        String s=sc.next();
        int[]freq=new int[26];
        for (int i = 0; i <s.length() ; i++) {
            char ch=s.charAt(i);
            int idx =(int)ch-97;
            freq[idx]++;

         //   freq[(int)s.charAt(i)-97]++;//all three line in one line .
        }
        // finding maximum ...
        int maxFreq=-1;
        for (int i = 0; i <freq.length ; i++) {
            maxFreq=Math.max(maxFreq,freq[i]);

        }
        for (int i = 0; i <freq.length ; i++) {
             if(freq[i]==maxFreq){
                 char ch=(char)(i+97);
                 System.out.println(ch+" ");
             }
        }

    }
}
