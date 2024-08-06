package Heaps;

import java.io.PipedReader;
import java.util.*;

public class kthSmallestElement_OptimalSol4 {
    public static void main(String[] args) {
        int[] arr={10,2,8,3,-6,-2,9,-12};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter kth element:");
        int k=sc.nextInt();
        //maxHeap
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for (int ele:arr) {
            pq.add(ele);
            if(pq.size()>k) pq.remove();


        }
        System.out.println(pq.peek());
    }

}
