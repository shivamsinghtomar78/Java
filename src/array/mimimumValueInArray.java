package array;

public class mimimumValueInArray {
    public static void main(String[] args) {
        int []arr={12,8,41,37,-2,49,16,28,21};
        int min= arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println("The minimum value of the array is "+min);


    }
}
