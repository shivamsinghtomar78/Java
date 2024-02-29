package pattern_Printing;

import java.util.Scanner;

public class numberTriangleFlippedVertically_method2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            int m=1;
            for (int j =1; j <=n-i ; j++) {
                System.out.print(" "+" ");
            }
            for (int j =1; j <=i ; j++) {
                System.out.print(m+" ");
                m=m+1;
            }
            System.out.println();
        }
    }
}
