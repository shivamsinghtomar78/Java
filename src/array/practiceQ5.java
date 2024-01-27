package array;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class practiceQ5 {
    public static void main(String[] args) {
        //Q.Find the second largestt element in the given array .
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a length of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a value of element at index " + i + " :");
            arr[i] = sc.nextInt();

        }
        int max = arr[0];
        int maxsec = 0;
        for (int i = 1; i < n; i++) {
            if (max < arr[i]) {
                maxsec=max;
                max = arr[i];
            }

        }
        System.out.println("the second largest element in the array is "+maxsec);


    }
}
