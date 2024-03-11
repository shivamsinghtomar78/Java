package array_assignment_Questions;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        //Q. Check if the given array is sorted or not
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of element in the array:");
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.print("Enter element in the array at "+i+" :");
            arr[i]=sc.nextInt();
        }
       boolean isSorted=true;
        for (int i = 0; i <n-1 ; i++) {
            for (int j = i+1; j <n ; j++) {
                if(arr[i]>arr[j]) {
                    isSorted = false;
                    break;
                }
            }
        }
         if(isSorted==true){
             System.out.print("Array is sorted..");
         } else if (isSorted==false) {
             System.out.print("Array is not sorted..");

         }


    }
}
