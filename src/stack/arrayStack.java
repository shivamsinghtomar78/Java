package stack;
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
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        top++;
        stackArray[top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
        int value = stackArray[top];
        top--;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        // Create a new stack with capacity of 5
        arrayStack stack = new arrayStack(5);

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Push some elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Peek at the top element
        System.out.println("Top element: " + stack.peek());

        // Pop an element
        System.out.println("Popped: " + stack.pop());

        // Push more elements
        stack.push(50);
        stack.push(60);

        // Try to push when the stack is full
        stack.push(70);

        // Pop all elements
        System.out.println("Popping all elements:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        // Try to pop when the stack is empty
        stack.pop();

        // Check if the stack is empty again
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}


