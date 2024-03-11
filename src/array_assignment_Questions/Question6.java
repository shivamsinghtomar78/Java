package array_assignment_Questions;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
     //Q.Count the number of elements strictly greater than x.
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of element in the array:");
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.print("Enter element in the array at "+i+" :");
            arr[i]=sc.nextInt();


        }
        System.out.print("Enter number which count :");
        int m=sc.nextInt();
        int p=0;
        for (int i = 0; i <n ; i++) {
            if(arr[i]>m){
                p++;
            }
        }
        System.out.print(p+" number is greater than "+m);

    }
}
