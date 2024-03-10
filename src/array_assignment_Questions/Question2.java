package array_assignment_Questions;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        //Q.Find the second largest element in the given array in one pass.

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of element in the array:");
        int n=sc.nextInt();

        int[]arr=new int[n];
        int max=arr[0];
        int smax=arr[1];
        for (int i = 0; i <n ; i++) {
            System.out.print("Enter element of the array:");
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }
           else if (arr[i]>smax && arr[i]!=max) {
                smax=arr[i];
            }
        }
        System.out.println("second largest element in the array "+smax);

    }
}
