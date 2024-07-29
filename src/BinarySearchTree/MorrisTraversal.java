package BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class MorrisTraversal {
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
        List<Integer> ans=new ArrayList<>();
        TreeNode curr=d;
        while(curr!=null){
            if(curr.left!=null){
                TreeNode pred=curr.left;
                while(pred.right!=null && pred.right!=curr) pred=pred.right;

                if(pred.right==null){//link
                    pred.right=curr;
                    curr=curr.left;
                }
                else{//pred.right=curr:unlink
                    pred.right=null;
                    ans.add(curr.val);
                    curr=curr.right;

                }
            }
            else{
                ans.add(curr.val);
                curr=curr.right;
            }
        }
        int n=ans.size();
        for(int i=0;i<n;i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
