package sorting;

public class SelectionSort{
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, -4, 20, 1, -6, -8};
        int n = arr.length;
        System.out.print("Unsorted array: ");
        print(arr);

        // Selection sort loop
        for (int i = 0; i < n - 1; i++) {
            int min = arr[i];
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }
            // Swap arr[i] and arr[index]
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        System.out.print("Sorted array: ");
        print(arr);
    }
}

