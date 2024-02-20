package array;

public class sortTheArrayOf_zeroes_ones_twoes_DutchFlagAlgorithm_method2 {
    public static void main(String[] args) {
        //sort the array of 0's ,1's and 2's (dutch flag algorithm)
        // method -2
        //3-pointer approach
        int []arr={0,1,2,0,1,2,1,2,0,0  };
        int n=arr.length;
        int mid =0,hi=n-1,lo=0;
        while(mid<=hi){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[lo];
                arr[lo]=temp;
                lo++;
                mid++;

            }else if (arr[mid]==1){
                mid++;
            }else {
                int temp=arr[mid];
                arr[mid]=arr[hi];
                arr[hi]=temp;
                hi--;

            }

        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");


        }


    }
}
