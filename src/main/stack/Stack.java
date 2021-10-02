package main.stack;

/**
 * @author harinadh dasari
 */
public class Stack {

    private int[] stack;
    private int top = -1;

    public Stack(int initialSize) {
        stack = new int[initialSize];
    }

    public void push(int data) {
        if (stack.length-1 == top) {
            System.out.println("Stack is full");
        } else {
            stack[++top] = data;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            return stack[top--];
        }
        return 0;
    }

    public void isEmpty() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }

    public void isFull() {
        if (top == stack.length-1) {
            System.out.println("Stack is full");
        } else {
            System.out.println("Stack is not full");
        }
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }


    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.isEmpty();
        stack.isFull();
        stack.push(60);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
    }
}
