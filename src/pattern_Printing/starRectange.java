package pattern_Printing;

import java.util.Scanner;

public class starRectange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number column in rectangle:");
        int n=sc.nextInt();
        System.out.print("Enter a number of rows in rectangle :");
        int m=sc.nextInt();
   for (int i=1;i<=n;i++){// column
           for(int j=1;j<=m;j++){//rows
               System.out.print(i+" ");
           }
          System.out.println();
      }

    }
}
