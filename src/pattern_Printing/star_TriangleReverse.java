package pattern_Printing;

public class star_TriangleReverse {
    public static void main(String[] args) {
        for (int i = 0; i <4 ; i++) {
            for (int j = 4-i; j>=1 ; j--) {
                System.out.print("*"+" ");

            }
            System.out.println();

        }

    }
}
