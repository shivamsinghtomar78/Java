package singly_Circular_LinkedList;


public class print_List {
    public static void print(ListNode head){
        if(head==null) return;
       ListNode temp=head;
        System.out.print(temp.val+" ");
        temp=temp.next;
       while(temp!=head){
           System.out.print(temp.val+" ");
           temp=temp.next;
       }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(3);
        ListNode d=new ListNode(4);
        ListNode e=new ListNode(5);
        ListNode f=new ListNode(6);
        ListNode g=new ListNode(7);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        g.next=a;
        print(a);

    }
}
