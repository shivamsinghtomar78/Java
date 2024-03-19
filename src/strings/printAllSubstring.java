package strings;

import java.util.Scanner;

public class printAllSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your String :");
        String n=sc.nextLine();
        int m=n.length();
        for (int i = 0; i <m ; i++) {
            for (int j =i+1; j <=m ; j++) {
                System.out.print(n.substring(i,j)+" ");


            }
            System.out.println();

        }

    }
}
