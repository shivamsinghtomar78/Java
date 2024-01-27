package array;

public class practiceQ1 {
    public static void main(String[] args) {
        // Q.predict the output
        int[]num=new int[26];
        num[0]=100;
        num[25]=200;
        int temp=num[25];
        num[25]=num[0];
        num[0]=temp;
        System.out.print(num[0]+" "+num[25]);
    }
}
