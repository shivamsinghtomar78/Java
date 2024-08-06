package Heaps;
class minHeap{
    int[]arr;
    int size;
    minHeap(int capacity){
        arr=new int[capacity];
        size=0;
    }
    public void add(int num) throws Exception{
        if(size==arr.length){
            throw new Exception("Heap is full!!");
        }
        arr[size++]=num;
        upheapify(size-1);
    }
    public void upheapify(int idx){
        if(idx==0) return;
        int parent=(idx-1)/2;
        if(arr[idx]<arr[parent]){
            swap(idx,parent);
            upheapify(parent);
        }
    }
    public int size(){
        return size;
    }
    public void swap(int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    public int peek() throws Exception {
        if(size==0){
            throw new Exception("Heap is Empty!!");
        }
        return arr[0];
    }
    public int remove() throws Exception{
        if(size==0){
            throw new Exception("Heap is Empty!!");
        }
        int peek=arr[0];
        swap(0,size-1);
        size--;
        downHeapify(0);
        return peek;
    }
    public void downHeapify(int i){
        if(i>size) return;
        int lc=2*i+1;
        int rc=2*i+2;
        if(lc>=size) return;
        int minidx=i;
        if(arr[minidx]>arr[lc])  minidx=lc;
        if(lc>=size) return;
        if(arr[minidx]>arr[rc])  minidx=rc;
        if(i==minidx) return;
        swap(i,minidx);
        downHeapify(minidx);
    }
}


public class minHeapImplementationArray {
    public static void main(String[] args) throws Exception {
        minHeap pq=new minHeap(10);
        System.out.println(pq.peek());
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        System.out.println(pq.size());
        pq.add(5);
        pq.add(6);
        pq.add(7);

        pq.add(8);
        System.out.println(pq.size());
    }
}

