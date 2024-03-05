package Array_2D;

public class toAddTwoMatrices {
    public static void main(String[] args) {
      int [][]arr1={{45,50,10},{50,12,14},{80,90,70}};
        int [][]arr2={{40,51,12},{60,32,24},{90,80,60}};
        int [][]arr3=new int[3][3];
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j < 3; j++) {
                arr3[i][j]=arr1[i][j]+arr2[i][j];


            }

        }
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(arr3[i][j]+" ");

            }
            System.out.println();

        }
    }
}
