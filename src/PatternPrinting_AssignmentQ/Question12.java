package PatternPrinting_AssignmentQ;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (i+j<n+1){
                    System.out.print(" "+" ");
                }

            }
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print(j+" ");


            }
            System.out.println();

        }
    }
}
