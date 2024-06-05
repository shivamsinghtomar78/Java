package linkedList;
class SLL{// user defined data structure
   private Node head;
   private Node tail;
    int size;
    void insertAtEnd(int val){// inserting element at the end
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
            insertAtStart(val);// Insert at the start
            return;
        }
        if(index==size){
            insertAtEnd(val);// insert at the end
            return;
        }
        if(index>size || index<0){
            System.out.println("invalid index !!");// invalid index
            return;
        }
        Node temp=new Node(val);// create a new node with the given value
        Node x=head;//start from the head
        for(int i=1;i<=index-1;i++){// traverse to the node just before the index
            x=x.next;
        }
        //insertion the new node
        temp.next=x.next;
        x.next=temp;
        size++;//increase the size of the list
    }
    int get(int idx){
        if(idx==size-1) return tail.val;
        if(idx>=size || idx<0) {
             throw new Error("Index out of bounds ");
        }
        Node temp=head;
        for (int i = 1; i <=idx ; i++) {
            temp=temp.next;

        }
        return temp.val;
    }
    void set(int idx,int val){
        if(idx==size-1){// update value of the last node (tail)
             tail.val=val;
             return;//no need to continue
        }
        if(idx>=size || idx<0) {//check if the index is out of bounds
            throw new Error("Index out of bound ");
        }
        Node temp=head;
        for (int i = 1; i <=idx ; i++) {//start traversal from the head
            temp=temp.next;

        }
        temp.val=val;//Update the value of the node at the specified index
    }
    void deleteAtHead(){
        if(head==null) {//check if the lsit empty
            throw new Error("List is empty yarr ");
        }
        head=head.next;//Move the head pointer to the next node
        size--;// Decrease the size of the list
    }
    void delete(int idx){
        if(idx==0){//check if the index is the first index
            deleteAtHead();
            return;
        }
        if(head==null) {//check if the lsit is empty
            throw new Error("List is empty yarr ");
        }
        if(idx<0 || idx>=size) {//check if the index is out bound
            throw new Error("invalid index !!");
        }
        //traverse the lsit to the node just before the one to be deleted
        Node temp=head ;
        for (int i =1; i <=idx-1; i++) {
            temp=temp.next;
        }
        //update tail pointer if the node to be deleted is the one before the tail
        if(temp.next==tail)
            tail=temp;
        //skip the node to be deleted by updated pointers
        temp.next=temp.next.next;
     size--;//decrease the size of the lsit
    }

  }

public class implementationLL {
    public static void main(String[] args) {
        SLL list=new SLL();
        list.size();
        list.insertAtEnd(23);
        list.insertAtEnd(53);
        list.insertAtEnd(69);
        list.display();
        list.size();
        list.insertAtStart(23);
        list.insertAtStart(28);
        list.display();
        list.size();
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
