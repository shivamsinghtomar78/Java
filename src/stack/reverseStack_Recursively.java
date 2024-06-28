package stack;

import java.util.Stack;

public class reverseStack_Recursively {
    public static void rev(Stack<Integer> st,Stack<Integer> reverse){
        if(st.isEmpty()) return ;
         reverse.push(st.pop());
         rev(st,reverse);

    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        for(int i=1;i<10;i++){
            st.push(i);
        }
        System.out.println("Original Stack: "+st);
        Stack<Integer> reverse=new Stack<>();
          rev(st,reverse);
        System.out.println("Modified Stack: "+reverse);
    }
}
