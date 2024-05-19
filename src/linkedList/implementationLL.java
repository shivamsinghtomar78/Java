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
        if(index>size || index<0){
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
    int get(int idx){
        if(idx==size-1) return tail.val;
        if(idx>=size || idx<0) {
             throw new Error("yarr error aa gya ");
        }
        Node temp=head;
        for (int i = 1; i <=idx ; i++) {
            temp=temp.next;

        }
        return temp.val;
    }
    void set(int idx,int val){
        if(idx==size-1){
             tail.val=val;
        }
        if(idx>=size || idx<0) {
            throw new Error("yarr error aa gya ");
        }
        Node temp=head;
        for (int i = 1; i <=idx ; i++) {
            temp=temp.next;

        }
        temp.val=val;
    }
    void deleteAtHead(){
        if(head==null) throw new Error("List is empty yarr ");
        head=head.next;
        size--;
    }
    void delete(int idx){
        if(idx==0){
            deleteAtHead();
            return;
        }
        if(head==null) throw new Error("List is empty yarr ");
        if(idx<0 || idx>=size) {
            throw new Error("invalid index !!");
        }
        Node temp=head ;
        for (int i =1; i <=idx-1; i++) {
            temp=temp.next;
        }
        if(temp.next==tail) tail=temp;
        temp.next=temp.next.next;
     size--;
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
        System.out.println(list.get(3));
        list.display();
        list.set(2,500);
        list.display();
        list.deleteAtHead();
        list.display();
        list.delete(3);
        list.display();
        list.size();

    }
}
