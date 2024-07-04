package binarSearch;

public class firstAndLastPositionOfNumber {
    public static void main(String[] args) {
        int []ans ={-1,-1};
        int []arr={10,10,20,20,20,20,20,30,30,40,50};
        int n=arr.length;
        int target =21;
        // first check if element is present
        int lo=0; int hi=n-1;
        boolean flag=false;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==target){
                flag=true;
                break;
            } else if (arr[mid]>target) {
                hi=mid-1;

            } else if (arr[mid]<target) {
                lo=mid+1;

            }
        }
        if(flag==false) System.out.println("Element not present ");



        // finding lower bound
         lo=0;hi=n-1;
        int lb=n;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>=target){
                lb=Math.min(lb,mid);
                hi=mid-1;
            }else lo=mid +1;
        }
        ans[0]=lb;

        // finding upper bound
         lo=0;hi=n-1;
        int ub=n;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>target){
                ub=Math.min(ub,mid);
                hi=mid-1;
            }else lo=mid +1;
        }
        ans[1]=ub-1;
       for(int ele :ans){
           System.out.print(ele +" ");
       }



    }
}
