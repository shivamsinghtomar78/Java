package advance_Sorting;

import java.util.Scanner;

public class Kth_largest_Element {
    static int ans;
    public static void swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    public static void print(int[]arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static int partition(int[]arr,int lo,int hi){
        int pivot=arr[lo];
        int pivotIdx=lo;
        int smallerCount=0;
        for (int i = lo+1; i <=hi ; i++) {
            if(arr[i]<=pivot) smallerCount++;
        }
        int correctIdx=pivotIdx+smallerCount;
        swap(arr,pivotIdx,correctIdx);
        //partition
        int i=lo;
        int j=hi;
        while(i<correctIdx && j>correctIdx){
            if(arr[i]<=pivot) i++;
            else if (arr[j]>pivot) j--;
            else if(arr[i]>pivot && arr[j]<=pivot){
                swap(arr,i,j);
            }
        }
        return correctIdx;
    }
    public static void quickselect(int[]arr,int lo,int hi,int k){
        if(lo>=hi) return ;
        if(lo==hi){
            if(lo==k-1) ans=arr[lo];
            return;

        }
        int idx=partition(arr, lo, hi);
        if(idx==k-1){
            ans=arr[idx];
            return;
        }
        if(k-1<idx) quickselect(arr, lo, idx-1,k);
        else quickselect(arr, idx+1, hi,k);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr={40,50,60,100,90,30,20,10,70,80};
        int n=arr.length;
        System.out.print("Enter value of k: ");
        int k=sc.nextInt();
        ans=-1;
        System.out.println("Original array");
        print(arr);
        quickselect(arr,0,n-1,n-k+1);
        System.out.print(k+"th largest number is ");
        System.out.println(ans);


    }
}

