package stack;
import java.util.Stack;

public class pushElementAt_Bottom_optimalSol {
    public static void pushAtBottom(Stack<Integer> st, int element) {
        if (st.isEmpty()) {
            st.push(element);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, element);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        for (int i = 1; i <= 9; i++) {
            st.push(i);
        }
        System.out.println("Original Stack: " + st);

        pushAtBottom(st, 0);

        System.out.println("Modified Stack: " + st);

    }
}
