package sorting;

import java.util.Arrays;

public class builtInSort {
    public static void main(String[] args) {
        int []arr={7,1,2,8,-4};
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();

    }
}
