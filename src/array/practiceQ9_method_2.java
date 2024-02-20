package array;

public class practiceQ9_method_2 {
    public static void main(String[] args) {
        //Q.sort the array of 0's and 1's.
        int []arr={1,0,0,1,1,0,0,0,1,0};
        int n=arr.length;
        //method-2-> one pass soln
        int i=0,j=n-1;
        while(i<j) {
            if (arr[i] == 0) {
                i++;
            }
            if (arr[j] == 0) {
                j--;
            }
            if(i>j) break;
            if (arr[i] == 1 && arr[j] == 0) {
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
        for (int ele:arr) {
            System.out.print(ele+" ");


        }



        }

    }

