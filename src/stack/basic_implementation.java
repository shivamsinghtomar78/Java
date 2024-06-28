package stack;


import java.util.Stack;

public class basic_implementation {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(5);
        st.push(10);
        st.push(20);
        st.push(50);

        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.size());
        st.push(50);
        System.out.println(st.isEmpty());
        // to access first element inserted in stack
        while(st.size()>1){
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st.size());


    }
}
