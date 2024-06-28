package stack;

import java.util.Stack;

public class pushElementAt_Bottom {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        for(int i=1;i<=9;i++){
            st.push(i);
        }
        System.out.println("Original Stack: "+st);

        Stack<Integer> temp=new Stack<>();
        while(!st.isEmpty()){
            temp.push(st.pop());
        }
        temp.push(0);
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
        System.out.println("Modified Stack: "+st);



    }
}

