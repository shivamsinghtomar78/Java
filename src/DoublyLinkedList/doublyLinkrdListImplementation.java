package DoublyLinkedList;

class DNode{
    int val;
    DNode next;
    DNode prev;
    DNode(int val){
        this.val=val;
    }

}
class DLL{
    DNode head;
    DNode tail;
    int size;
    void display(){
        DNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void insertionAtTail(int val){
        DNode temp=new DNode(val);
        if(size==0) head=tail=temp;
        else {
            tail.next=temp;
            temp.prev=tail;
            tail=temp;
        }
        size++;
    }
   void insertAtHead(int val){
        DNode temp=new DNode(val);
        if(size==0) head=tail=temp;
        else{
            temp.next=head;
            head.prev=temp;
            head=temp;
        }
        size++;
   }
   void insert(int idx,int val){
      if(idx==0){
          insertAtHead(val);
          return;
      }
      if(idx==size){
          insertionAtTail(val);
          return ;
      }
      if(idx>size || idx<0){
          System.out.println("Invalid Index!!");
          return ;
      }
      DNode temp=new DNode(val);
      DNode x=head;
      for(int i=1;i<=idx-1;i++){
           x=x.next;
      }
      DNode y=x.next;
      x.next=temp;
      temp.prev=x;
      y.prev=temp;
      temp.next=y;

      size++;

   }
   void deleteHead(){
        if(size==0) throw new Error("List is empty");
        head=head.next;
        head.prev=null;
        size--;
   }
   void deleteTail(){
        if(size==0) throw new Error ("List is Empty");
        tail=tail.prev;
        tail.next=null;
        size--;
   }
   void delete(int idx){
        if(idx==0){
            deleteHead();
            return;
        }
       if(idx==size-1){
           deleteTail();
           return;
       }
         if(idx<0 || idx>=size){
             throw new Error ("Invalid index");
         }
        DNode temp=head;
         for(int i=1;i<=idx-1;i++){
             temp=temp.next;
         }
         temp.next=temp.next.next;
         temp=temp.next;
         temp.prev=temp.prev.prev;
         size--;
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
        DLL list=new DLL();
        list.insertionAtTail(10);
        list.insertionAtTail(20);
        list.insertionAtTail(30);
        list.insertionAtTail(40);
        list.display();
        list.insertAtHead(50);
        list.display();
        list.insert(2,100);
        list.display();







    }
}
