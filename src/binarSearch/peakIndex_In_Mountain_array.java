package binarSearch;

public class peakIndex_In_Mountain_array {
    public static void main(String[] args) {
        int []arr={10,20,30,40,50,40,30,20,10};
        int n=arr.length;
        int lo=1,hi=n-2;
        boolean flag=false;
        int mid=0;
        while(lo<=hi){
             mid=lo+(hi-lo)/2;
            if(arr[mid]>arr[mid-1] &&arr[mid]>arr[mid+1] ) {
               flag=true;
               break;
            }
            else if(arr[mid]>arr[mid-1] &&arr[mid]<arr[mid+1] ){
                lo=mid+1;
            } else if (arr[mid]<arr[mid-1] &&arr[mid]>arr[mid+1]) {
                hi=mid -1;


            }

        }
        if(flag==true) System.out.print("Peak index is "+mid);


    }
}
