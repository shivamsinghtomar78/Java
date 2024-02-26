package pattern_Printing;

import java.util.Scanner;

public class square_In_alphabet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Write a number of alphabet :");
        int n=sc.nextInt();

         char[]arr=new char[n];
         arr[0]='A';
        arr[1]='B';
        arr[2]='C';
        arr[3]='D';

        for (int i=1;i<=n;i++){// column
            for(int j=0;j<n;j++){//rows
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }

    }
}
