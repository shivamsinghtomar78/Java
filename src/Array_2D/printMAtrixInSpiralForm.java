package Array_2D;

public class printMAtrixInSpiralForm {
    public static void print(int[][] arr) {
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
        //Q.Write a program to print the matrix in spiral form.
        int [][]arr={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        int m= arr.length;
        int n=arr[0].length;
        System.out.println("Original matrix");
        print(arr);
        //Spiral print
        int minR=0,maxR=m-1;
        int minC=0,maxC=n-1;
        while(minR<=maxR && minC<=maxC){
            // left to right 
            for (int i =minC; i <=maxC ; i++) {
                System.out.print(arr[minR][i]+" ");
            }
            minR++;
            //top to bottom
            if(minR>maxR || minC>maxC) break;
            for (int i =minR; i <=maxR ; i++) {
                System.out.print(arr[i][maxC]+" ");
                
            }
            maxC--;
            // right to left
            if(minR>maxR || minC>maxC) break;
            for (int i =maxC; i >=minC ; i--) {
                System.out.print(arr[maxR][i]+" ");
            }
            maxR--;
            // bottom to top
            if(minR>maxR || minC>maxC) break;
            for (int i =maxR; i >=minR ; i--) {
                System.out.print(arr[i][minC]+" ");

            }
            minC++;



        }



    }
}
