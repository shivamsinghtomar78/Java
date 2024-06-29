package stack;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

class Node {
    ListNode head;
    ListNode tail;
    int size;

    class arrayStack {
        private int maxSize;
        private int[] stackArray;
        private int top;

        public arrayStack(int size) {
            maxSize = size;
            stackArray = new int[maxSize];
            top = -1;
        }

        public void push(int value) {
            if (top < maxSize - 1) {
                stackArray[++top] = value;
            } else {
                System.out.println("Stack is full. Cannot push " + value);
            }
        }

        public int pop() {
            if (top >= 0) {
                return stackArray[top--];
            } else {
                System.out.println("Stack is empty.");
                return -1;
            }
        }

        public int peek() {
            if (top >= 0) {
                return stackArray[top];
            } else {
                System.out.println("Stack is empty.");
                return -1;
            }
        }

        public boolean isEmpty() {
            return (top == -1);
        }

        public boolean isFull() {
            return (top == maxSize - 1);
        }
    }

    public Node() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void push(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        int val = head.val;
        head = head.next;
        size--;
        if (isEmpty()) {
            tail = null;
        }
        return val;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return head.val;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}

public class linkedListStack {
    public static void main(String[] args) {

    }
}
