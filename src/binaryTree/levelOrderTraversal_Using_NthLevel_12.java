package binaryTree;

import java.util.Scanner;

public class levelOrderTraversal_Using_NthLevel_12 {
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node a = new Node(1);// a is the root
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);
        // connecting
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = g;
        c.left = f;
        e.left = h;
        f.right = i;

        //DFS
        int m = levels(a);
        for (int x = 0; x <= m; x++) {
            n = x;
            nThLevel(a, 0);
            System.out.println();
        }
        System.out.println("reverse order: ");
        for (int x = 0; x <= m; x++) {
            n = x;
            reverseNThLevel(a, 0);
            System.out.println();
        }
    }

    private static void nThLevel(Node root, int level) {
        if (root == null) return;
        if (level == n) System.out.print(root.val + " ");
        nThLevel(root.left, level + 1);
        nThLevel(root.right, level + 1);


    }

    private static void reverseNThLevel(Node root, int level) {
        if (root == null) return;
        if (level == n) System.out.print(root.val + " ");
        reverseNThLevel(root.right, level + 1);
        reverseNThLevel(root.left, level + 1);

    }

    private static int levels(Node root) {
        if (root == null) return 0;
        int a = levels(root.left);
        int b = levels(root.right);
        return 1 + Math.max(a, b);
    }




}
