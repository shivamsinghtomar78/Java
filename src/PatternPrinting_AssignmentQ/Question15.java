package PatternPrinting_AssignmentQ;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();

        for (int i = 1; i <=2*n-1 ; i++) {
            System.out.print((char)(64+i) +" ");


        }
        System.out.println();
        n--;
        for (int i = 1; i <=n; i++) {
            int m=0;
            for (int j = 1; j <=n+1-i ; j++) {
                System.out.print((char)(64+j)+" ");
                m++;

            }
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print(" "+" ");


            }
            for (int j = 1; j<=n+1-i ; j++) {
                System.out.print((char)(64+(2*i-1)+j+m)+" ");



                }
            System.out.println();
            }



        }

    }

