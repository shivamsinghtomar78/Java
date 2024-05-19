package linkedList;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
    }
public class ListNodeClass {
    public static void print(Node head){
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void displayRecursive(Node head){
         if(head==null) return ;// base case
        System.out.print(head.val+" ");
        displayRecursive(head.next);
    }
//public static void displayRecursive(Node head){// this print reverse form
//    if(head==null) return ;// base case
//
//    displayRecursive(head.next);
//    System.out.print(head.val+" ");
//}
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        Node f=new Node(60);
        a.next=b;// linking => a->b  => 10->20
        b.next=c;// linking => b->c  => 10->20->30
        c.next=d;// linking => c->d  => 10->20->30->40
        d.next=e;// linking => d->e  => 10->20->30->40->50
        e.next=f;// linking => e->f  => 10->20->30->40->50->65
        print(a);
        displayRecursive(a);
//        System.out.println(a.val);
//        System.out.println(a.next.val);
//        System.out.println(a.next.next.val);
//        System.out.println(a.next.next.next.val);
//        System.out.println(a.next.next.next.next.val);





    }

}
