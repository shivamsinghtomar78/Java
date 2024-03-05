package Array_2D;

public class TransposeOfMatrixAndStoreInNewMatrix {
    public static void main(String[] args) {
        int [][]arr={{1,2},{3,4},{5,6}};
        int m=arr.length;
        int n=arr[0].length;
        System.out.println("Real matrix...");
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(arr[i][j]+" ");


            }
            System.out.println();

        }
        int [][]transpose=new int[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                transpose[i][j]=arr[j][i];


            }
            System.out.println();

        }
        System.out.println("Transpose matrix....");


        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                System.out.print(transpose[i][j]+" ");



            }
            System.out.println();

        }




    }
}
