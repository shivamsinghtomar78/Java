package array;

public class maxValue {
    public static void main(String[] args) {
        int []arr={54,11,28,47,91,63};
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int index=-1;
        for (int j = 0; j <n ; j++) {
            if(arr[j]>max){
                max=arr[j];
                index=j;
            }
        }
        System.out.println("maximum value is "+max+" in the index of "+index);
        
    }
}
