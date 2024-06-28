package stack;

import java.util.Stack;

public class displayStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        for (int i = 1; i <=9 ; i++) {
            st.push(i);

        }
         while(!st.isEmpty()){
             System.out.print(st.pop()+" ");

         }
    }
    }

