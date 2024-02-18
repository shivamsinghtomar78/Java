package array;

import java.util.Arrays;

public class copyOfarray {
    public static void main(String[] args) {
        int[]arr={30,10,40,23,89,34};
        for(int ele:arr){
            System.out.print(ele +" ");

        }
        System.out.println();
        int[]brr=Arrays.copyOf(arr,arr.length);
        for(int x:brr){
            System.out.print(x+" ");

        }

    }


}
