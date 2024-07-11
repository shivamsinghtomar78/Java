package binaryTree;

public class product_Of_Non_Zero_Nodes_4 {
    public static void main(String[] args) {
        Node a=new Node(1);// a is the root
        Node b=new Node(0);
        Node c=new Node(3);
        Node d=new Node(0);
        Node e=new Node(6);
        Node f=new Node(5);
        Node g=new Node(0);
        Node h=new Node(20);
        // connecting
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.right=f; c.left=g;
        e.right=h;
        int ans=product(a);
        System.out.println("Product of Non-Zero Nodes: "+ans);
    }
    private static int product(Node root){
        if(root==null) return 1;
        int a= product(root.left);
        int b= product(root.right);
        if (root.val == 0) {
            return a * b;
        }
        return root.val*a*b;
    }
}
