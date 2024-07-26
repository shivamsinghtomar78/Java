package array;

public class practiceQ7 {
    public static void main(String[] args) {
        //Q.Write a program to reverse the array without using any extra array.(method 1)
        int[]arr={10,20,30,40,50,60,70};
        int n=arr.length;
        System.out.print("Original Array: ");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
       //reverse
        for (int i = 0; i <n/2 ; i++) {
            int j=n-1-i;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;


        }
        System.out.print("Modified array: ");
        for(int ele:arr){
            System.out.print(ele+" ");

        }
        System.out.println();

    }

}
