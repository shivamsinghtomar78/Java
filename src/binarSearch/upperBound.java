package binarSearch;

public class upperBound {
    public static void main(String[] args) {
        int []arr={10,23,46,89,91,97,107,140,264};
        int n=arr.length;
        int target=91;
        int lo=0,hi=n-1;
        int ub=n;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>target){
                ub=Math.min(ub,mid);
                hi=mid-1;
            }else lo=mid +1;
        }
        System.out.println("upper bound  of target is "+ub);
    }
}
