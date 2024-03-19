package strings;

import java.util.Scanner;

public class convert_int_Input_to_String {
    public static void main(String[] args) {
        //Q.Take integer input and convert it into a string
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter integer :");
        int n=sc.nextInt();
        String s="";
        s+=n;
        System.out.println(s);

    }
}
