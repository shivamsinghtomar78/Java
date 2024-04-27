package Array_2D;
public class transposeOfMatrix {
    public static void main(String[] args) {
         //Transpose of matrix
        int [][]arr={{1,2},{3,4},{5,6}};
        int m=arr.length;
        int n=arr[0].length;
        System.out.println("Real matrix ");
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(arr[i][j]+" ");


            }
            System.out.println();
        }
        System.out.println("Transpose  matrix ");
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                System.out.print(arr[j][i]+" ");


            }
            System.out.println();
        }


    }
}
