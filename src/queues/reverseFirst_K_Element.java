package queues;

import java.util.*;


public class reverseFirst_K_Element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of element: ");
        int n=sc.nextInt();
        System.out.print("Enter number of element to be reverse: ");
        int k=sc.nextInt();
        Queue<Integer> q=new LinkedList<>();
        Queue<Integer> r=new LinkedList<>();
        for (int i = 1; i <=n ; i++) {
            q.add(i);
        }
        System.out.println("List"+q);
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<k;i++){
            st.add(q.remove());
        }
        while(!q.isEmpty()){
            r.add(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        while(!r.isEmpty()){
            q.add(r.remove());
        }
        System.out.println("List After k element reversed:");
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}
