package array;

public class practiceQ10_Merge_two_sorted_arrays {
    public static void main(String[] args) {
        // Q.merge two sorted arrays in one array.
        int[] a = {11, 33, 42, 71,99,104};
        int[] b = {26, 54, 69, 81,98};
        int n = a.length;
        int m = b.length;
        int[] c = new int[m+n];
        int i=0,j=0,k=0;
        //Merging
        while(i<n && j<m){
            if(a[i]<=b[j]){
                c[k]=a[i];
                i++;
                k++;
            }
            else {
               c[k]=b[j];
               j++;
               k++;
            }
        }
        if(j==m){ //  now take elements from a only
            while(i<n){
                c[k]=a[i];
                i++;
                k++;
            }
        }
        for(int ele:c){
            System.out.print(ele+" ");
        }
        }
    }


