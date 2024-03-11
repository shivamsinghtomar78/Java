package array_assignment_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        //Q.Wap to find the smallest missing positive element in the sorted array.(take the array as input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of element in the array:");
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.print("Enter element in the array at "+i+" :");
            arr[i]=sc.nextInt();
        }
        int missingnumb=1;
        Arrays.sort(arr);
        for (int num:arr) {
            if(num==missingnumb){
                missingnumb++;
            }

        }
        System.out.println("The smallest missing number is "+missingnumb);




    }
}
