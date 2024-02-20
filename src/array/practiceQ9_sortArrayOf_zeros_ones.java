package array;

public class practiceQ9_sortArrayOf_zeros_ones {
    public static void main(String[] args) {
        //Q.sort the array of 0's and 1's.
        int []arr={1,0,0,1,1,0,0,0,1,0};
        int n=arr.length;
        int noOfzeroes=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==0){
                noOfzeroes++;

            }
        }
        for (int i= 0; i <noOfzeroes ; i++) {
            arr[i]=0;


        }
        for (int i = noOfzeroes; i <n ; i++) {
            arr[i]=1;

        }
        for (int i = 0; i <n; i++) {
            System.out.print(arr[i]+" ");

        }




    }
}
