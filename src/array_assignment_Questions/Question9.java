package array_assignment_Questions;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
      //Q. Find the difference between the sum of elements at even indices to the sum of elements at odd indices.
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of element in the array:");
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.print("Enter element in the array at "+i+" :");
            arr[i]=sc.nextInt();

        }
        int evSum=0;
        int odSum=0;
        for (int i = 0; i <n ; i++) {
            if(i%2==0){
                evSum=evSum+arr[i];

            } else if (i%2!=0) {
                odSum=odSum+arr[i];

            }

        }
        int sumDiff=evSum-odSum;
        System.out.print("Difference between sum of even indices to the sum of odd indices is "+sumDiff);


    }
}
