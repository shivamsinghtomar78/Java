package basicJava_Q;

import java.util.Scanner;

public class apMethod2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a n :");
        int n=sc.nextInt();
        int ap=4;
        for(int i=1;i<=n;i++){
            System.out.println(ap);
            ap=3+ap;


        }

    }
}
