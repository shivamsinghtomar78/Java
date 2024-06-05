package sorting;

public class bubbleSort_3 {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        //bubble sort optimize
        int[] arr = {5, 8, 1, -3, 8, 10};
        int n = arr.length;
        print(arr);
        //bubble sort-2
        for (int x = 0; x < n - 1; x++) {
            boolean flag=true;
            for (int i = 0; i < n - 1-x ; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag =false;
                }
            }
            //check if this pass has sorted or not
            if(flag==true) break;
        }
        print(arr);
    }
}
