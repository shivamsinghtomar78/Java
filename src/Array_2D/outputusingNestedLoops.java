package Array_2D;

import java.util.Scanner;

public class outputusingNestedLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][3];

        int m=arr.length;// no.of rows/lines
        System.out.println(m);
        int p=arr[0].length;// no. of cols
        System.out.println(p);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("enter element :");
                int n = sc.nextInt();
                arr[i][j] = n;

            }


        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+" ");


            }
            System.out.println();
        }
    }
}
