package array;

import java.util.Scanner;

public class practiceQ3_linearSearch {
    public static void main(String[] args) {
        //Q.find the element 'x' in the array .take array and x as input.
        Scanner sc=new Scanner(System.in);
        System.out.print("enter target element:");
        int x=sc.nextInt();
        int[]arr={25,32,41,56,48,63,12,33,44,57};
         boolean flag=false;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==x){
                flag=true;
                break;
            }

        }
        if(flag==true){
            System.out.print(x+" is found in the array ");

        }
        else{
            System.out.println(x+" is not found in the array");
        }
    }
}
