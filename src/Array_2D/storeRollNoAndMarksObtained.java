package Array_2D;


import java.util.Scanner;

public class storeRollNoAndMarksObtained {
    public static void main(String[] args) {
        //Q.Write program to store roll number and marks obtained by 4 students side by side in a matrix
        Scanner sc=new Scanner(System.in);
        int [][]arr=new int[4][2];
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <2 ; j++) {
                System.out.print("Enter value:");
                arr[i][j]=sc.nextInt();

            }

        }
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();

        }






    }
}
