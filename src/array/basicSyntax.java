package array;

import java.util.Scanner;

public class basicSyntax {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int[]arr=new int[5];
         arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
