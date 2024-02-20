package array;

public class practiceQ8_rotateArray {
    public static void main(String[] args) {
        //Q.Rotate the given array 'a' by k steps,where k is non-negative.
        //Note: k can greater than n as well where n is the size of array 'a'

        class Solution {
            public void reverse(int[]nums,int i,int j){
                while(i<=j){


                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    i++;
                    j--;
                }
            }
            public void rotate(int[] nums, int k) {
                int n=nums.length;
                k=k%n;
                int[]arr=new int[n];
                reverse(nums,0,n-k-1);
                reverse(nums,n-k,n-1);
                reverse(nums,0,n-1);


            }
        }
    }
}
