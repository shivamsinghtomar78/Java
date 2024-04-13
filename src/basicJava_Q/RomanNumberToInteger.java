package basicJava_Q;
import java.util.ArrayList;
import java.util.Scanner;


public class RomanNumberToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roman number: ");
        String s = sc.next();
        int[] roman = new int[128];
        roman['I'] = 1;
        roman['V'] = 5;
        roman['X'] = 10;
        roman['L'] = 50;
        roman['C'] = 100;
        roman['D'] = 500;
        roman['M'] = 1000;
        int ans = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (roman[s.charAt(i)] < roman[s.charAt(i + 1)]) {
                ans -= roman[s.charAt(i)];
            } else {
                ans += roman[s.charAt(i)];
            }
        }
        ans += roman[s.charAt(s.length() - 1)]; // add the value of the last Roman numeral
        System.out.println(ans);


        ArrayList<Integer>arr4=new ArrayList<>();
    }
}

