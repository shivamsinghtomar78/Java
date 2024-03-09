package PatternPrinting_AssignmentQ;

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");

        int n=sc.nextInt();
        int p=1;


        int m=2;
        for (int i =1 ; i <=2*n-1 ; i++) {
            if(i<=(2*n-1)/2 +1){
                System.out.print(i+" ");

            } else if (i>(2*n-1)/2 +1) {
                System.out.print((i-m)+" ");
                m+=2;
            }
        }
        System.out.println();
        n--;
        for (int i = 1; i <=n; i++) {

            for (int j = 1; j <=n+1-i ; j++) {
                System.out.print(j+" ");
                p=j;


            }
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print(" "+" ");


            }
            for (int j = 1; j<=n+1-i ; j++) {
                System.out.print(p+" ");
                p--;



            }
            System.out.println();
        }

    }
}
