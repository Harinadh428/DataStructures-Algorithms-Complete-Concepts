package main.stack.interviewproblems;

import jdk.dynalink.beans.StaticClass;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author harinadh dasari
 */
public class NextGreaterElementOnTheRightMyCode {

    public static void main(String[] args) {

        int[] arr = {2, 5, 9, 3, 1, 12, 6, 8, 7};
        int[] outputResult = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (stack.size() == 0) {
                stack.push(arr[i]);
                outputResult[i] = -1;
            } else if (stack.peek() < arr[i]) {
                while (stack.size() > 0 && stack.peek() < arr[i]) {
                    stack.pop();
                }
                if (stack.size() == 0) {
                    outputResult[i] = -1;
                    stack.push(arr[i]);
                } else {
                    outputResult[i] = stack.peek();
                    stack.push(arr[i]);
                }
            } else {
                outputResult[i] = stack.peek();
                stack.push(arr[i]);
            }
        }
        Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
        System.out.println();
        Arrays.stream(outputResult).forEach(e -> System.out.print(e + " "));
        System.out.println();
    }
}
