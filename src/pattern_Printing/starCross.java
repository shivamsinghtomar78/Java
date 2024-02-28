package pattern_Printing;

import java.util.Scanner;

public class starCross {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        int m=n;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n; j++) {
                if(j==i || j==m){
                    System.out.print("*"+" ");

                }else{
                    System.out.print(" "+" ");
                }
            }
            m=m-1;
            System.out.println();


        }
    }
}
