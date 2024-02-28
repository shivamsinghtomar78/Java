package pattern_Printing;

public class alphabetTriangle {
    public static void main(String[] args) {
      char[]arr={'A','B','C','D'};

        for (int i = 1; i <=4 ; i++) {
            for (int j =0 ; j <i ; j++) {
                System.out.print(arr[j]+" ");

            }
            System.out.println();

        }
    }
}
