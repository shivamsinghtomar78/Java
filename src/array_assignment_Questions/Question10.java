package array_assignment_Questions;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        //Q. Given an array of integers, change the value of all odd indexed elements to its second multiple and
        //increment all even indexed values by 10

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of element in the array:");
        int n=sc.nextInt();
        int []arr=new int[n];
        //Inputting elements into the array.
        for (int i = 0; i <n ; i++) {
            System.out.print("Enter element in the array at "+i+" :");
            arr[i]=sc.nextInt();
        }
        // applying transformations
        for (int i = 0; i <n ; i++) {
            if(i%2==0){
                arr[i]=arr[i]+10;
            } else if (i%2!=0) {
                arr[i]=arr[i]*2;

            }
        }
        //Displaying transformed array
        System.out.print("transformed array : ");
        for(int num:arr){
            System.out.print(num+" ");

        }

    }
}
