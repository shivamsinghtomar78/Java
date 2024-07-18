package binaryTree;

public class traversal_9 {
    public static void main(String[] args) {
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
        System.out.print("preorder: ");
      preorder(a);
        System.out.println();
        System.out.print("inorder: ");
        inorder(a);
        System.out.println();
        System.out.print("postorder: ");
        postorder(a);
    }
    private static void  preorder(Node root){
        if(root==null) return ; // Base case
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);

    }
    private static void  inorder(Node root){
        if(root==null) return ; // Base case
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);

    }


    private static void  postorder(Node root){
        if(root==null) return ; // Base case
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");

    }
}
