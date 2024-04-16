package basicJava_Q;

import java.util.ArrayList;
import java.util.Arrays;

public class duplicateRemoveInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,4};
        Arrays.sort(arr);
        int n=arr.length;
        ArrayList<Integer>list= new ArrayList<>();
        for (int i = 0; i <n-1 ; i++) {
            if(arr[i]!=arr[i+1]) {
                list.add(arr[i]);
            }
        }
         for(int ele:list){
             System.out.print(ele+" ");
         }


    }
}
