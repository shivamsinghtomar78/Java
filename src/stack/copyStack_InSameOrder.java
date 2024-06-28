package stack;

import java.util.Stack;

public class copyStack_InSameOrder {
    public static Stack<Integer> copyStack(Stack<Integer> original) {
        Stack<Integer> temp = new Stack<>();
        Stack<Integer> copy = new Stack<>();

        // Step 1: Copy from original to temp, reversing the order
        while (!original.isEmpty()) {
            temp.push(original.pop());
        }

        // Step 2: Copy from temp back to original and to copy, restoring the order
        while (!temp.isEmpty()) {
            int element = temp.pop();
            original.push(element);
            copy.push(element);
        }

        return copy;
    }
    public static void main(String[] args) {
//        Stack<Integer> st=new Stack<>();
//        st.push(1);
//        st.push(2);
//        st.push(3);
//        st.push(4);
//        st.push(5);
//        st.push(6);
//        st.push(7);
//        st.push(8);
//        st.push(9);
//        System.out.println("Orginal Stack: "+st);
//
//        Stack< Integer> copy=new Stack<>();
//        Stack<Integer> reverse=new Stack<>();
//        while(!st.isEmpty()){
//            reverse.push(st.pop());
//        }
//        while(!reverse.isEmpty()){
//            copy.push(reverse.pop());
//        }
//        System.out.println("Copy stack: "+copy);

            Stack<Integer> st = new Stack<>();
            st.push(1); st.push(2); st.push(3); st.push(4); st.push(5);

            System.out.println("Original Stack: " + st);
            Stack<Integer> copy = copyStack(st);
            System.out.println("Copied Stack: " + copy);
            System.out.println("Original Stack after copying: " + st);



    }
}
