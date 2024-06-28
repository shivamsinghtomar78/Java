package singly_Circular_LinkedList;
class ListNode{
int val;
ListNode next;
ListNode(int val){
    this.val=val;
}
}
class Node{
    ListNode head;
    ListNode tail;
    void display(){
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

}


public class implementation {
    public static void main(String[] args) {
        Node list=new Node();
       


    }
}
