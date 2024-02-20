package array;

public class sortTheArrayOf_zeroes_ones_twoes_DutchFlagAlgorithm {
    public static void main(String[] args) {
       //sort the array of 0's ,1's and 2's (dutch flag algorithm)
        // method -1
        int []arr={0,1,2,0,1,2,1,2,0,0  };
        int n=arr.length;
        int noOfzero=0;
        int noOfOnes=0;
        int noOfTwoes=0;
        for (int i = 0; i <n ; i++) {
            if(arr[i]==0){
                noOfzero++;
            } else if (arr[i]==1) {
                noOfOnes++;

            } else if (arr[i]==2) {
                noOfTwoes++;

            }



        }
        for(int j=0;j<noOfzero;j++){
            arr[j]=0;
        }
        for (int k =noOfzero; k <noOfzero+noOfOnes ; k++) {
            arr[k]=1;

        }
        for (int m =noOfOnes+noOfzero; m <n ; m++) {
            arr[m]=2;

        }
        for(int ele:arr){
            System.out.print(ele+" ");

        }


    }
}
