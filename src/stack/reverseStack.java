package stack;

import java.util.Stack;

public class reverseStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.push(9);
        // original stack
        System.out.println(st);
       Stack<Integer> reverse=new Stack<>();

       while(!st.isEmpty()){

           reverse.push(st.pop());
       }
       // Reverse stack
        System.out.println(reverse);




    }

}
