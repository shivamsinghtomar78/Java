package linkedList;

public class shallowCopyOfANode {
    public static void main(String[] args) {
        Node a=new Node(100);
        System.out.println(a.val);
        Node temp=a;// shallow copy
//      Node temp=new Node(100);// deep copy
        temp.val=69;
        System.out.println(a.val);

    }
}
