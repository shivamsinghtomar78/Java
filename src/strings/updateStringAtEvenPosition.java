package strings;

import java.util.Scanner;

public class updateStringAtEvenPosition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string :");
        String s=sc.nextLine();
        String m="";

        for (int i = 0; i < s.length(); i++) {
        if(i%2==0){
            m=m+'a';

        }else {
            m+=s.charAt(i);
        }
        }
        System.out.println(m);

    }
}
