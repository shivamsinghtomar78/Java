package advance_Sorting;

public class inversionCount {
    static int count ;
    public static void print(int[]arr){
        for(int ele:arr){
            System.out.print(ele+" ");

        }
        System.out.println();
    }
    public static void inversion(int []a,int[]b){
        int i=0;
        int j=0;
        while(i<a.length && j<b.length ){
            if(a[i]>b[j]){
                count+=(a.length-i);
                j++;
            }
            else i++;

        }
    }
    public static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j <b.length){
            if(a[i]<=b[j]) c[k++]=a[i++];
            else c[k++]=b[j++];
        }
        while(j<b.length) c[k++]=b[j++];
        while(i<a.length) c[k++]=a[i++];
    }
    public static void mergesort(int[]arr){
        int n=arr.length;
        if(n==1) return;
        //create two of n/2 size each
        int []a=new int[n/2];
        int []b=new int[n-n/2];
        //copy pasting
        for (int i = 0; i <n/2 ; i++) {
            a[i]=arr[i];
        }
        for (int i = 0; i <n-n/2 ; i++) {
            b[i]=arr[i+n/2];
        }
        //magic
        mergesort(a);
        mergesort(b);
        // count inversion
        inversion(a,b);
        //merge these a and b
        merge(a,b,arr);
        a=null; b=null;
    }
    public static void main(String[] args) {
        int []arr={109,33,89,27,68,10,70};
        System.out.println("Original Array");
        print(arr);
        mergesort(arr);
        System.out.println("Sorted Array");
        print(arr);
        System.out.print("Number of inversion :");
        System.out.println(count);


    }
}
