package binarSearch;

public class square_Root {
    public static void main(String[] args) {
        int  x=16;
        int lo=0,hi=x;
        boolean flag=false;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(mid*mid==x) {
                flag=true;
                System.out.println("square root of given number is "+mid);
                break;

            }else if(mid*mid>x) {
                hi=mid-1;
            }else if(mid*mid<x){
                lo=mid+1;
            }
        }
       if(flag==false) System.out.println("square root of given number is "+hi);
    }
}
