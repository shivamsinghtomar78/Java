package Basic_dsaWithJava_assignmentQ;

public class Question_6 {

        public static void main(String[] args) {
            // Q.Write a Java program that uses boolean variables and relational operators to compare two numbers.
            //Print whether the numbers are equal, not equal, greater, or less.

            // Initialize variables
            int a = 10;
            int b = 5;

            // Compare numbers
            boolean isEqual = (a == b);
            boolean isNotEqual = (a != b);
            boolean isGreater = (a > b);
            boolean isLess = (a < b);

            // Print results
            System.out.println("Are the numbers equal? " + isEqual);
            System.out.println("Are the numbers not equal? " + isNotEqual);
            System.out.println("Is the first number greater than the second? " + isGreater);
            System.out.println("Is the first number less than the second? " + isLess);
        }
    }

