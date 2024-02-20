package array;

public class practiceQ11_Next_greatest_element_method3_mostEfficientMethod {
    public static void main(String[] args) {
        //Q.Next greatest element.
        int []arr={12,8,60 ,37,2,49,16,28,21};
        int n=arr.length;
        int[]ans=new int[n];
        ans[n-1]=-1;
        //Method -3:optimised
        int nge=arr[n-1];
        for(int i=n-2;i>=0;i--){
            ans[i]=nge;
            nge=Math.max(nge,arr[i]);
        }
        for(int ele:arr){
            System.out.print(ele+" ");

        }
        System.out.println();
        for(int ele:ans){
            System.out.print(ele+" ");


        }

    }
}
