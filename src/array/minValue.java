package array;

public class minValue {
    public static void main(String[] args) {
        int[] arr = {54, 11, 28, 47, 91, 63};
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int j = 0; j < n; j++) {
            if (arr[j] < min) {
                min = arr[j];
                index = j;
            }
        }
        System.out.println("minimum value is " + min + " in the index of " + index);
    }
}
