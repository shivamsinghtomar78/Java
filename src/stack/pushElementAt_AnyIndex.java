package stack;

import java.util.Stack;

public class pushElementAt_AnyIndex {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        for (int i = 1; i <10 ; i++) {
            st.push(i);
        }
        System.out.println("Original Stack: "+st);
      int element=0;
      int position=2;//position from top
      Stack<Integer> temp=new Stack<>();
      while(st.size()>position){
          temp.push(st.pop());
      }
      st.push(element);
      while (!temp.isEmpty()){
          st.push(temp.pop());
      }
        System.out.println("Modified stack"+st);



    }
}
