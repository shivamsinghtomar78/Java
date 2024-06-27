package DoublyLinkedList;

class DNode{
    int val;
    DNode next;
    DNode prev;
    DNode(int val){
        this.val=val;
    }

}

public class doublyLinkrdListImplementation {
    public static void print(DNode head){
        DNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void printReverseOrder(DNode tail){
        DNode temp=tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    public static void display(DNode node){
        DNode temp=node;
        while(temp.prev!=null){
            temp=temp.prev;
        }
        // now temp is at head
        print(temp);
    }
    public static void main(String[] args) {
        DNode a=new DNode(10);
        DNode b=new DNode(20);
        DNode c=new DNode(30);
        DNode d=new DNode(40);
        a.next=b; b.prev=a;
        b.next=c; c.prev=b;
        c.next=d; d.prev=c;
        print (a);// print start to end
        printReverseOrder(d);// print from end to start
        display(c);// print whole list from start to end when node point in random position







    }
}
