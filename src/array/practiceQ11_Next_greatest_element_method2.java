package array;

public class practiceQ11_Next_greatest_element_method2 {
    public static void main(String[] args) {
        // Q.Next greatest element .my method
        int []arr={12,8,41,60,37,2,49,16,28,21};
        int n=arr.length;
         int [] ans=new int[n];
          ans[n-1]=-1;
          int k=0;
        for (int i = 0; i <n-1 ; i++) {
            int max=arr[k];
            for (int j=1+i;j<n;j++){
                if(arr[j]>max){
                    max=arr[j];

                }

            }

            ans[i]=max;

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
