package main.queue;

import java.util.Stack;

/**
 * @author harinadh dasari
 */
public class StackToQueueRemoveEfficient {

    private Stack<Integer> mainStack;
    private Stack<Integer> helperStack;

    public StackToQueueRemoveEfficient() {
        mainStack = new Stack<>();
        helperStack = new Stack<>();
    }

    public void push(int data) {
        if (mainStack.size() == 0) {
            mainStack.push(data);
        } else {
            while (mainStack.size() > 0) {
                helperStack.push(mainStack.pop());
            }
            mainStack.push(data);
            while (helperStack.size() > 0) {
                mainStack.push(helperStack.pop());
            }
        }
    }

    public int remove() {
        if (size() == 0) {
            return -1;
        } else {
            return mainStack.pop();
        }
    }

    public int top() {
        if (mainStack.size() == 0) {
            return -1;
        } else {
            return mainStack.peek();
        }
    }

    public int size() {
        return mainStack.size();
    }

    public static void main(String[] args) {
        StackToQueueRemoveEfficient sq = new StackToQueueRemoveEfficient();
        sq.push(10);
        sq.push(20);
        sq.push(30);
        sq.push(40);
        sq.push(50);

        System.out.println(sq.size());
        System.out.println(sq.remove());
        System.out.println(sq.size());
        System.out.println(sq.top());
        System.out.println(sq.size());
        sq.push(100);
        System.out.println(sq.size());
        System.out.println(sq.top());
    }
}
