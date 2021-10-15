package main.stack.interviewproblems;

import java.util.Stack;

/**
 * @author harinadh dasari
 */
public class MinStack2ConstantSpaceAndTime {
    Stack<Integer> stack;
    int min;

    public MinStack2ConstantSpaceAndTime() {
        stack = new Stack<>();
        min = 0;
    }

    public void push(int data) {
        if (size() == 0) {
            min = data;
            stack.push(data);
        } else {
            if (data >= min) {
                stack.push(data);
            } else {
                int result = data + (data - min);
                stack.push(result); // etection , for storing a fake value
                min = data; //original value stored in min
            }
        }
    }

    private int top() {
        if (size() == 0) {
            return -1;
        } else {
            if (stack.peek() >= min) {
                return stack.peek();
            } else {
                return min;
                // why it's min , when we are stored in stack as fake value so it will become less than
                //original value , now by comparing the above, we detected , now instead of fake we are
                // returning the original min value
            }
        }
    }

    public int pop() {
        if (size() == 0) {
            return -1;
        } else {

            if (stack.peek() > min) {
                return stack.pop();
            } else {
                int originalMin = min;
                min = 2 * min - stack.pop();
                return originalMin;
            }
        }
    }

    public int size() {
        return stack.size();
    }

    public int min() {
        if (size() == 0) {
            return -1;
        } else {
            return min;
        }
    }

    public static void main(String[] args) {
        MinStack2ConstantSpaceAndTime stack = new MinStack2ConstantSpaceAndTime();
        stack.push(8);
        stack.push(30);
        stack.push(2);
        stack.push(20);
        stack.push(1);
        System.out.println(stack.min);
        stack.pop();
        System.out.println(stack.min);
    }
}
