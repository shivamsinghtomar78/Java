package pattern_Printing;

import java.util.Scanner;

public class numberBridge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        int m=n+1;

        for (int i=1;i<=2*n-1;i++){
            System.out.print(i+" ");

        }
        System.out.println();
        n--;
        for (int i = 1; i<=n ; i++) {
            for (int j = 1; j <=n+1-i ; j++) {//number
                System.out.print(j+" ");

            }

            for (int j = 1; j <=2*i-1 ; j++) {//space
                System.out.print(" "+" ");
            }
            for (int j =m; j <=n+m-i ; j++) {//number
                System.out.print(j+" ");
            }
            m+=1;
            System.out.println();


        }
    }
}
