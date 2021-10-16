package main.queue;

import java.util.Stack;

/**
 * @author harinadh dasari
 */
public class StackToQueueAddEfficient {
    Stack<Integer> main;
    Stack<Integer> helper;

    public StackToQueueAddEfficient() {
        main = new Stack<>();
        helper = new Stack<>();
    }

    public void push(int data) {
        main.add(data);
    }

    public int peek() {
        if (main.size() == 0) {
            return -1;
        } else {
            while (main.size() > 0) {
                helper.push(main.pop());
            }
            int val= helper.peek();
            while (helper.size() > 0) {
                main.push(helper.pop());
            }
            return val;
        }
    }

    public int pop() {
        if (main.size() == 0) {
            return -1;
        } else {
            while (main.size() > 0) {
                helper.push(main.pop());
            }

            int retval = helper.pop();

            while (helper.size() > 0) {
                main.push(helper.pop());
            }

            return retval;
        }
    }

    public int size() {

        return main.size();
    }

    public static void main(String[] args) {
        StackToQueueAddEfficient sq = new StackToQueueAddEfficient();
        sq.push(10);
        sq.push(20);
        sq.push(30);
        sq.push(40);
        sq.push(50);
        sq.push(100);

        System.out.println(sq.size());
        System.out.println(sq.peek());
        System.out.println(sq.pop());
        System.out.println(sq.size());
        sq.pop();
        sq.pop();
        System.out.println(sq.pop());
    }
}
