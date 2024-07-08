package queues;

public class circularQueueArray {
    public static class Cqa{
        int front =-1;
        int rear=-1;
        int size=0;
        int []arr=new int[100];
        public void add(int val) throws  Exception{
            if(size==arr.length){
                throw new Exception("Queue is full");
            }
            else if(size==0){
                rear=front=0;
                arr[0]=val;
            }
            else if(rear<arr.length-1){
                arr[++rear]=val;
            }
            else if(rear==arr.length-1){
                rear=0;
                arr[0]=val;
            }
            size++;
        }
        public int remove() throws Exception{
           if(size==0){
              throw new Exception("Queue is Empty");
           }
           else{
               int val=arr[front];
               if(front==arr.length-1) front=0;
               else front++;
               return val;
           }
        }
        public int peek() throws Exception{
            if(size==0){
                throw new Exception("Queue is empty");
            }
           else return arr[front];
        }
        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
        public void display(){
           if(size==0){
               System.out.println("Queue is Empty!");
               return;
           }
           else if(front<=rear){
               for (int i =front ; i <=rear ; i++) {
                   System.out.println(arr[i]+" ");
               }
           }
           else{
               for (int i =front; i <arr.length ; i++) {
                   System.out.println(arr[i]+" ");
               }
               for (int i =0; i <=rear ; i++) {
                   System.out.println(arr[i]+" ");
               }
           }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {

    }
}
