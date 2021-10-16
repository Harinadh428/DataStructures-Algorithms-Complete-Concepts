package main.queue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author harinadh dasari
 */
public class QueueToStackPushEfficient {

    private Queue<Integer> mainQueue;
    private Queue<Integer> helperQueue;

    public QueueToStackPushEfficient() {
        mainQueue = new ArrayDeque<>();
        helperQueue = new ArrayDeque<>();
    }

    public void push(int data) {
        mainQueue.add(data);
    }

    public int size() {
        return mainQueue.size();
    }

    public int pop() {
        if (size() == 0) {
            return -1;
        } else if (mainQueue.size() == 1) {
            return mainQueue.remove();
        } else {
            int popValue = 0;
            while (mainQueue.size() > 1) {
                helperQueue.add(mainQueue.remove());
            }
            popValue = mainQueue.remove();

            while (helperQueue.size() > 0) {
                mainQueue.add(helperQueue.remove());
            }

            return popValue;
        }
    }

    public int top() {
        if (size() == 0) {
            return -1;
        } else {
            int topValue = 0;
            if (mainQueue.size() == 1) {
                return mainQueue.peek();
            }
            while (mainQueue.size() > 1) {
                helperQueue.add(mainQueue.remove());
            }
            topValue = mainQueue.peek();
            helperQueue.add(mainQueue.remove());

            while (helperQueue.size() > 0) {
                mainQueue.add(helperQueue.remove());
            }
            return topValue;
        }
    }

    public static void main(String[] args) {
        QueueToStackPushEfficient queue = new QueueToStackPushEfficient();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);

        System.out.println(queue.top());
        System.out.println(queue.size());
        System.out.println(queue.pop());
        System.out.println(queue.size());
    }
}