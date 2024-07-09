package queues;


import java.util.Deque;
import java.util.LinkedList;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq=new LinkedList<>();
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq);
        dq.addLast(5);
        System.out.println(dq);
        dq.remove();
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addFirst(3);
        dq.addFirst(4);
        System.out.println(dq);
        System.out.println(dq.size());
       int p= dq.removeLast();
        System.out.println(p);
    }
}
