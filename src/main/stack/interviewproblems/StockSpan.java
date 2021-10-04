package main.stack.interviewproblems;

import java.util.Stack;

/**
 * @author harinadh dasari
 */
public class StockSpan {
    //Algorithm works based on pop answer and push
    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 4, 7};
        int[] stockSPan = stackSpan(arr);

        for (int x : stockSPan) {
            System.out.print(x + " ");
        }
    }

    private static int[] stackSpan(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] span = new int[arr.length];

        stack.push(0);
        span[0] = 1;

        for (int i = 1; i < arr.length; i++) {
            while (stack.size() > 0 && arr[stack.peek()] < arr[i]) {
                stack.pop();
            }

            if (stack.size() == 0) {
                span[i] = i + 1;
            } else {
                stack.push(i);
                span[i] = i - stack.peek();
            }
            stack.push(i);
        }
        return span;
    }
}
