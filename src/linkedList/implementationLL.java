package linkedList;
class SLL{// user defined data structure
   private Node head;
   private Node tail;
    int size;
    void insertAtEnd(int val){
        Node temp=new Node(val);
        if(head==null){
            head=temp;
            tail=temp;
        }
        else{
            tail.next=temp;
            tail=temp;
        }
        size++;
    }
    void display(){
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void size(){
        System.out.println("Length of Linked List is : "+size);
    }
    void insertAtStart(int val){
        Node temp=new Node(val);
        if(head==null){
            head=temp;
            tail=temp;
        }
        else{
             temp.next=head;
             head=temp;
        }
        size++;
    }
    void insert(int index,int val){
        if(index==0){
            insertAtStart(val);
            return;
        }
        if(index==size){
            insertAtEnd(val);
            return;
        }
        if(index>size){
            System.out.println("invalid index !!");
            return;
        }
        Node temp=new Node(val);
        Node x=head;
        for(int i=1;i<=index-1;i++){
            x=x.next;
        }
        //insertion
        temp.next=x.next;
        x.next=temp;
        size++;
    }

  }

public class implementationLL {
    public static void main(String[] args) {
        SLL list=new SLL();
//        list.size();
//        list.insertAtEnd(23);
//        list.insertAtEnd(28);
//        list.size();
//        list.display();
//        list.insertAtEnd(53);
//        list.insertAtEnd(69);
//        list.display();
//        list.size();
//        list.insertAtStart(23);
//        list.insertAtStart(28);
//        list.display();
//        list.size();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.display();
        list.insertAtStart(40);
        list.insertAtStart(50);
        list.display();
        list.insert(3,200);
        list.display();







    }
}
