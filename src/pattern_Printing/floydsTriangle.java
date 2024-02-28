package pattern_Printing;

import java.util.Scanner;

public class floydsTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        int sum=1;

        for (int i = 1; i <=n ; i++) {
            

            for (int j = 1; j <=i ; j++) {
                System.out.print(sum+" ");
                sum=sum+1;

            }

            System.out.println();

        }
    }
}
