package queues;

import java.util.ArrayDeque;
import java.util.Queue;

public class displayQueue {
    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        //rear->5 4 3 2 1->front
        Queue<Integer> helper=new ArrayDeque<>();
        System.out.println("helper: "+helper);
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            helper.add(q.remove());
        }
        System.out.println();
        System.out.println("q: "+q);
        System.out.println("helper: "+helper);
        while(!helper.isEmpty()){
            q.add(helper.remove());
        }
        System.out.println("q: "+q);
    }
}
