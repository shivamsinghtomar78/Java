package PatternPrinting_AssignmentQ;

public class Question6 {
    public static void main(String[] args) {
        int m=6;
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=m ; j++) {
                 if(i==2 ||i==3){
                     System.out.print("*"+" ");
                     m=2;
                 }else{
                     System.out.print("*"+" ");
                 }
            }
            m=6;
            System.out.println();

        }
    }
}
