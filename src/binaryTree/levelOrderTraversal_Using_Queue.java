package binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class levelOrderTraversal_Using_Queue {
    public static class  pair{
        Node node;
        int level;
        pair(Node node ,int level){
            this.node=node;
            this.level=level;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node a=new Node(1);// a is the root
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        Node h=new Node(8);
        Node i=new Node(9);
        // connecting
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.right=g; c.left=f;
        e.left=h; f.right=i;
        // BFS
        levelOrder(a);
    }
    private static void levelOrder(Node root){
        int prevLvl=0;
        Queue<pair> q=new LinkedList<>();
        if(root!=null) q.add( new pair(root,0));
        while(q.size()>0){
            pair front=q.remove();
            Node temp=front.node;
            int lvl=front.level;
            if(lvl!=prevLvl){
                System.out.println();
                prevLvl++;
            }
            System.out.print(temp.val+" ");
            if(temp.left!=null) q.add(new pair(temp.left,lvl+1));
            if(temp.right!=null) q.add(new pair(temp.right,lvl+1));
        }
    }
}
