package Recursion;

public class printElementOfArray_Using_recursion {
    public static void Arr( int i,int[]arr){
         if(i==arr.length) return;
        System.out.print(arr[i]+" ");
        Arr(i+1,arr);
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9,10};
        Arr(0,arr);
    }
}
