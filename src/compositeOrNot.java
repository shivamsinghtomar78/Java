import java.util.Scanner;

public class compositeOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println( "enter a number :");
        int n=sc.nextInt();

        for (int i = 2; i <=n-1; i++) {
            if(n%i==0){
                System.out.println("composite number");
                break;

            }


        }

        }


    }
