package ArrayList_2D;
import java.util.ArrayList;
import java.util.List;

public class generatePascalTriangle {
    public static void main(String[] args) {
        //Q.Given an integer 'numRows', generate pascal's triangle.
        List<List<Integer>> ans = new ArrayList<>();
        int n = ans.size();
        for (int i = 0; i < n; i++) {
            List<Integer> l = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                l.add(1);

            }
            ans.add(l);

        }
        for (int i =2; i < n; i++)
            for (int j = 1; j <= i - 1; j++) {
                ans.get(i).set(j,ans.get(i-1).get(j)+ans.get(i-1).get(j-1));

            }

    }
}
