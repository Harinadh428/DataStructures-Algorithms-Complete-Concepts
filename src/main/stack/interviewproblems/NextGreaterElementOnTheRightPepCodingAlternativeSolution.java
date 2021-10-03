package main.stack.interviewproblems;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author harinadh dasari
 */
public class NextGreaterElementOnTheRightPepCodingAlternativeSolution {

    public static void main(String[] args) {
        int[] arr = {2, 5, 12, 3, 7, 2};
        Stack<Integer> stack = new Stack<>();
        int[] nge = new int[arr.length];

        stack.push(0);

        for (int i = 1; i < arr.length; i++) {

            while (stack.size() > 0 && arr[stack.peek()] <= arr[i]) {
                int pos = stack.peek();
                nge[pos] = arr[i];
                stack.pop();
            }
            stack.push(i);
        }

        while (stack.size() > 0) {
            nge[stack.peek()] = -1;
            stack.pop();
        }

        Arrays.stream(nge).forEach(e -> System.out.print(e + " "));
        System.out.println();
    }
}
