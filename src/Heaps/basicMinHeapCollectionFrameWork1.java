package Heaps;

import java.util.PriorityQueue;

public class basicMinHeapCollectionFrameWork1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(2);
        System.out.println(pq+" "+pq.peek());
        pq.add(10);
        System.out.println(pq+" "+pq.peek());
        pq.add(1);
        System.out.println(pq+" "+pq.peek());
        pq.remove();
        System.out.println(pq+" "+pq.peek());
        pq.add(0);
        System.out.println(pq+" "+pq.peek());
        pq.remove();
        System.out.println(pq+" "+pq.peek());
    }


}
