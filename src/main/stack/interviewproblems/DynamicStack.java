package main.stack.interviewproblems;

/**
 * @author harinadh dasari
 */
public class DynamicStack {
    private int[] stack;
    private int top;

    public DynamicStack(int size) {
        stack = new int[size];
        top = -1;
    }

    public void push(int data) {
        if (stack.length == top) {
            increaseCapacity();
        } else {
            stack[++top] = data;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("stack is empty");
        }
        return stack[top--];
    }

    public int peek() {
        System.out.println(stack[top]);
        return stack[top];
    }

    private void increaseCapacity() {
        int newSize = stack.length * 2;
        int[] newStack = new int[newSize];

        for (int i = 0; i < stack.length; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
    }

    public void display() {
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        DynamicStack st = new DynamicStack(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        st.display();
        st.pop();
        st.display();
        st.peek();
        st.display();
    }
}
