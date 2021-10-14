package main.stack.interviewproblems;

import java.util.Stack;

/**
 * @author harinadh dasari
 */
public class MinimumStack1 {
    Stack<Integer> allData;
    Stack<Integer> minData;

    public MinimumStack1() {
        allData = new Stack<>();
        minData = new Stack<>();
    }

    public int size() {
        return allData.size();
    }

    public void push(int data) {
        allData.push(data);
        if (minData.size() == 0 || minData.peek() >= data) {
            minData.push(data);
        }
    }

    int pop() {
        if (allData.size() > 0 && minData.size() > 0 && allData.peek() == minData.peek()) {
            minData.pop();
            return allData.pop();
        } else if (allData.size() > 0 && minData.size() > 0 && allData.peek() != minData.peek()) {
            return allData.pop();
        } else if (allData.size() > 0 && minData.size() == 0) {
            return allData.pop();
        } else {
            return -1;
        }
    }

    public void display() {

        if (allData.size() == 0) {
            System.out.println("stack is empty");
        } else {
            allData.forEach(e -> System.out.print(e + " "));
            System.out.println();
        }
    }

    int top() {
        return allData.size() > 0 ? allData.peek() : -1;
    }

    int min() {
        return minData.size() > 0 ? minData.peek() : -1;
    }

    public static void main(String[] args) {

        MinimumStack1 stack = new MinimumStack1();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(5);
        stack.push(8);

        stack.display();
        System.out.println(stack.min());
    }

}
