package array;

import java.util.Scanner;

public class practiceQ6 {
    public static void main(String[] args) {
       //Find the doublet in the array whose sum is equal to the given value x.(Two sum)
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a length of array:");
        int n=sc.nextInt();
        int[]arr= new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a value of element :");
            arr[i]=sc.nextInt();


        }
        System.out.print("Enter a number which sum need:");
        int x=sc.nextInt();


       //solution
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==x){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }


        }

    }
}
