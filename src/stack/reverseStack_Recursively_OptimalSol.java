package stack;
import java.util.Stack;

public class reverseStack_Recursively_OptimalSol{
    public static void reverse(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }
        int temp = st.pop();
        reverse(st);
        insertAtBottom(st, temp);
    }

    private static void insertAtBottom(Stack<Integer> st, int item) {
        if (st.isEmpty()) {
            st.push(item);
            return;
        }
        int temp = st.pop();
        insertAtBottom(st, item);
        st.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        for (int i = 1; i < 10; i++) {
            st.push(i);
        }
        System.out.println("Original Stack: " + st);
        reverse(st);
        System.out.println("Reversed Stack: " + st);
    }
}

