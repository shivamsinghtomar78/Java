package array;

import java.util.Scanner;

public class practiceQ {
    public static void main(String[] args){
        //Q.given an array of marks of students ,if the marks of any student is less than 35 print its roll number .[roll number here refers to the index of the array]
        Scanner sc=new Scanner(System.in);
        System.out.print("enter lenghth of the class:");
        int n=sc.nextInt();
        int[]arr=new int[n];
        for (int i = 0; i <arr.length ; i++) {
            System.out.print("enter a marks :");
            arr[i]=sc.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 35) {

                System.out.println("roll number is "+i);
            }

        }


    }
}
