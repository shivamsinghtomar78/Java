package binaryTree;
class Node{
     int val;
     Node left;
     Node right;
     Node(int val){
        this.val=val;
    }
}

public class nodeOfTree_1 {
    public static void main(String[] args) {
        Node a=new Node(1);// a is the root
        Node b=new Node(4);
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
//        a.left=null;// Then only right of the root
//        // accessing
//        System.out.println(e.val);
//        System.out.println(a.left.right.val);

        //changing value
//        e.val=90;
//        System.out.println(e.val);
//        System.out.println(a.left.right.val);
//        // changing value using root
//        a.left.right.val=80;
//        System.out.println(e.val);
//        System.out.println(a.left.right.val);

        display(a);
        //1.Ensure base case
        //2.Print root's val
        //3.Recursion will print Left Subtree(lst) and Right subtree(rst)



    }
    private static void display(Node root){
        if(root==null) return;//Base case
        System.out.print (root.val+" ");// self
        display(root.left);// Left Subtree
        display(root.right);// Right Subtree

    }
}
