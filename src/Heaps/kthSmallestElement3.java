package Heaps;

import java.util.PriorityQueue;
import java.util.Scanner;

public class kthSmallestElement3 {
    public static void main(String[] args) {
        int[] arr={10,2,8,3,-6,-2,9,-12};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter kth element:");
        int k=sc.nextInt();
        // minHeap
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int ele:arr){
            pq.add(ele);
        }
        for(int i=0;i<k-1;i++){
            pq.remove();
        }
        System.out.println(pq.peek());
    }
}
