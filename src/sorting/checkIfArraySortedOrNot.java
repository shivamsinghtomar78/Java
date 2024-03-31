package sorting;

public class checkIfArraySortedOrNot {
    public static void main(String[] args) {
      int[]arr={1,7,8,9,12};
      int n= arr.length;
      boolean flag =true;
        for (int i = 0; i <n-1 ; i++) {
            if(arr[i]>arr[i+1]){
               flag=false;

            }
        }
        if(flag){
            System.out.print("Array is sorted ..");
        }else {
            System.out.print("Array is not sorted..");
        }
    }
}
