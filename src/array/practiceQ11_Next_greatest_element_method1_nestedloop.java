package array;

public class practiceQ11_Next_greatest_element_method1_nestedloop {
    public static void main(String[] args) {
        // Q.Next greatest element .
        int []arr={12,8,41,37,2,49,16,28,21};
        int n=arr.length;
        int[]ans= new int[n];
        ans[n-1]=-1;
        for(int i=0;i<n-1;i++){
            int mx=Integer.MIN_VALUE;
            for(int j=i+1;j<n;j++){
                 mx=Math.max(mx,arr[j]);
            }
            ans[i]=mx;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        for(int ele:ans){
            System.out.print(ele+" ");
        }
        System.out.println();



    }
}
