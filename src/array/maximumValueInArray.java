package array;

public class maximumValueInArray {
    public static void main(String[] args) {
        int a[]={50,30,40,20,60,100};
        int max=a[0];
        for (int i = 1; i <a.length ; i++) {
            if(a[i]>max){
                max=a[i];
            }


        }
        System.out.println("Maximum value of array is "+max);

    }
}
