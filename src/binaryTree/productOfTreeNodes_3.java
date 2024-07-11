package binaryTree;

public class productOfTreeNodes_3 {
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
        int ans=product(a);
        System.out.println("Product: "+ans);
    }
    private static int product(Node root){
        if(root==null) return 1;
        return root.val*product(root.left)*product(root.right);
    }
}
