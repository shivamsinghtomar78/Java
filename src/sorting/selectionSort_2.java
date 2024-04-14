package sorting;

public class selectionSort_2 {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr = {10, -4, 20, 1, -6, -8};
        int n = arr.length;
        System.out.print("Unsorted array: ");
        print(arr);
        // selection sorting
        for (int i = 0; i <n-1 ; i++) {
            int min = Integer.MAX_VALUE;
            int index = -1;
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }
            swap(arr,i,index);
        }
        System.out.print("Sorted array: ");
        print(arr);

    }
}
