package sorting;

public class problem1 {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
     // Q.Given an array with N distinct element ,convert the given array to form to a where all element are in the range from 0 to N-1 .The order of element is the same , 0is the place d in the place of the smallest element ,1is the placed for the second smallest element ,N-1 is placed for the largest element .
     int []arr={54,11,28,47,91,63};
     int n=arr.length;
        System.out.print("original array : ");
        print(arr);

        int x=0;
        for (int i = 0; i < n; i++) {
             int min=Integer.MAX_VALUE;
             int index=-1;
            for (int j = 0; j <n ; j++) {
                if(arr[j]<min && arr[j]>0){
                    min=arr[j];
                    index=j;
                }
            }
            arr[index]=x;
            x--;
        }

        for (int i = 0; i <n ; i++) {
            arr[i]=arr[i]*(-1);

        }
        System.out.print("transformd array  : ");
        print(arr);


    }
}
