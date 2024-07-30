package basicJava_Q;

public class reverseDigit {
    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reverseDigits(number));
    }
    public static int reverseDigits(int num) {
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return reversedNum;
    }
}
