package stack;

public class nextGreaterElement {
    public static void main(String[] args) {
        int []arr={1,3,2,1,8,6,3,4};
        int n=arr.length;
        int []ans=new int[arr.length];

//         iterative method
//        for(int i=0;i<n;i++){
//            ans[i]=-1;
//            for (int j =i+1; j <n ; j++) {
//                if(arr[j]>arr[i]){
//                    ans[i]=arr[j];
//                    break;
//                }
//                else ans[i]=-1;
//            }
//        }
        for(int ele:ans){
            System.out.print(ele+" ");
        }
    }
}
 