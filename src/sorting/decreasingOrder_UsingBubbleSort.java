package sorting;

public class decreasingOrder_UsingBubbleSort {
    public static void print(int[]arr){
        for(int ele :arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[]arr={3,1,2,5,4};
        int n=arr.length;
        System.out.print("original array:");
        print(arr);
        for (int i = 0; i <n-1 ; i++) {
            for (int j = 0; j <n-1-i ; j++) {
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }

        }
        System.out.print("in decreasing order array:");
        print(arr);
    }
}
