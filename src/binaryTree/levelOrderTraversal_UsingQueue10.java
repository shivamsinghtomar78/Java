package binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class levelOrderTraversal_UsingQueue10 {
    public static void main(String[] args) {
        Node a=new Node(1);// a is the root
        Node b=new Node(41);
        Node c=new Node(3);
        Node d=new Node(2);
        Node e=new Node(6);
        Node f=new Node(5);
        Node g=new Node(10);
        Node h=new Node(20);
        // connecting
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.right=f; c.left=g;
        e.right=h;
        /// BFS
         levelorder(a);
        System.out.println();
    }
    private static void levelorder(Node root){
        Queue<Node> q=new LinkedList<>();
        if(root!=null) q.add(root);
        while(q.size()>0){
            Node front=q.remove();
            System.out.print(front.val+" ");
           if(front.left!=null) q.add(front.left);
           if(front.right!=null) q.add(front.right);


        }

    }
}
