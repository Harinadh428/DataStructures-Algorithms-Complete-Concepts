package main.queue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author harinadh dasari
 */
public class QueueToStackPopEfficientProblem {
    private Queue<Integer> mainQueue;
    private Queue<Integer> helperQueue;

    public QueueToStackPopEfficientProblem() {
        mainQueue = new ArrayDeque<>();
        helperQueue = new ArrayDeque<>();
    }

    public void push(int data) {
        if (size() == 0) {
            mainQueue.add(data);
        } else {
            while (mainQueue.size() > 0) {
                helperQueue.add(mainQueue.remove());
            }
            mainQueue.add(data);
            while (helperQueue.size() > 0) {
                mainQueue.add(helperQueue.remove());
            }
        }
    }

    public int pop() {
        if (size() == 0) {
            System.out.println("queue is empty");
            return -1;
        } else {
            return mainQueue.remove();
        }
    }

    public int top() {
        if (size() == 0) {
            System.out.println("queue is empty");
            return -1;
        } else {
            return mainQueue.peek();
        }
    }

    public int size() {
        return mainQueue.size();
    }

    public static void main(String[] args) {
        QueueToStackPopEfficientProblem qStack = new QueueToStackPopEfficientProblem();
        qStack.push(10);
        qStack.push(20);
        qStack.push(30);
        qStack.push(40);
        qStack.push(50);
        System.out.println(qStack.size());

        System.out.println(qStack.pop());

        System.out.println(qStack.top());
    }
}
