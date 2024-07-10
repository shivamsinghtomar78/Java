package queues;
import java.util.*;
public class reverseTheQueue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        for (int i = 1; i <=5 ; i++) {
            q.add(i);
        }

        System.out.println();
        Stack<Integer> st=new Stack<>();
        while(!q.isEmpty()){
            st.add(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        System.out.print("Reversed list:  ");
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }


    }
}
