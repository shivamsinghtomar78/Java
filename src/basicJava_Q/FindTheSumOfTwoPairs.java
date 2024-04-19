package basicJava_Q;

import java.util.Scanner;

class FindTheSumOfTwoPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 4, 4, 5, 5, 5, 6, 6, 7, 7, 7};
        int n = arr.length;
        System.out.print("Enter the number whose sum to find: ");
        int k = sc.nextInt();
        int i = 0, j = n - 1;
        int noK = 0;
        while (i < j) {
            if (arr[i] + arr[j] == k) {
                noK++;
                i++;
                j--;
            } else if (arr[i] + arr[j] < k) {
                i++;
            } else {
                j--;
            }
        }
        if (noK == 0)
            System.out.print("There is no pair whose sum is equal to " + k);
        else
            System.out.println("Number of pairs with sum " + k + ": " + noK);

    }
}
