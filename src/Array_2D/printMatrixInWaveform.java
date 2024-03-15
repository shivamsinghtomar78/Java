package Array_2D;

public class printMatrixInWaveform {
    public static void print(int[][] arr) {
        //Q.write a program to rotate the matrix by 90 degrees clockwise.
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");


            }
            System.out.println();

        }
        System.out.println();
    }

    public static void main(String[] args) {
      //Q.Write a program to print the matrix in wave form .
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int m = arr.length;
        print(arr);
    }
}
