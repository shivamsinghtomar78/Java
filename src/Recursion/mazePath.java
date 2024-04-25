package Recursion;


import java.util.Scanner;

public class mazePath {
    public static int maze(int row,int col,int m,int n){
        if(row==m || col==n) return 1;
        if(row>m || col>n) return 0;
        int rightways=maze(row,col+1,m,n);
        int downways=maze(row+1,col,m,n);
        return rightways+downways;


    }
    public static void main(String[] args) {
      //Q.Given a m*n grid you have to reach from top left corner to bottom right corner .You can go either down or right at a time .Find the no.of paths .
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        System.out.print("Enter m:");
        int m=sc.nextInt();
        System.out.println("Number of paths is "+maze(1,1,m,n));




    }
}
