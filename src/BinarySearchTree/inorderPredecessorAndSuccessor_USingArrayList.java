package BinarySearchTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
    }
}

public class inorderPredecessorAndSuccessor_USingArrayList {
    public static void main(String[] args) {
        TreeNode a=new TreeNode(20);
        TreeNode b=new TreeNode(30);
        TreeNode c=new TreeNode(40);
        TreeNode d=new TreeNode(50);
        TreeNode e=new TreeNode(60);
        TreeNode f=new TreeNode(70);
        TreeNode g=new TreeNode(80);
        d.left=b;
        d.right=f;
        b.left=a;
        b.right=c;
        f.right=g;
        f.left=e;
         // using ArrayList
        List<Integer> arr=new ArrayList<>();
        inorder(d,arr);
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter target value: ");
        int target=sc.nextInt();
        int n=arr.size();
        int idx=-1;
        for(int i=0;i<n;i++){
            if(arr.get(i)==target){
                idx=i;
                break;
            }
        }
        if (idx == -1) {
            System.out.println("Target value not found in the tree.");
        } else if (n == 1) {
            System.out.println("Tree has only one node. No predecessor or successor.");
        } else if (idx == 0) {
            System.out.println("Target is the first node. No predecessor.");
            System.out.println("Successor of " + target + " is " + arr.get(idx + 1));
        } else if (idx == n - 1) {
            System.out.println("Target is the last node. No successor.");
            System.out.println("Predecessor of " + target + " is " + arr.get(idx - 1));
        } else {
            System.out.println("Predecessor of " + target + " is " + arr.get(idx - 1));
            System.out.println("Successor of " + target + " is " + arr.get(idx + 1));
        }
    }
    public static void inorder(TreeNode root, List<Integer> arr){
        if(root==null) return;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);

    }
}

