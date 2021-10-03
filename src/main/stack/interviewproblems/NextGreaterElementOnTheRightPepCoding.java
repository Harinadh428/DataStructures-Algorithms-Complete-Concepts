package main.stack.interviewproblems;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author harinadh dasari
 */
public class NextGreaterElementOnTheRightPepCoding {

    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 3, 1, 12, 6, 8, 7};

        int[] nge = solve(arr);

        Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
        System.out.println();
        Arrays.stream(nge).forEach(e -> System.out.print(e + " "));
        System.out.println();
    }

    private static int[] solve(int[] arr) {
        int[] nge = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        stack.push(arr[arr.length - 1]);
        nge[arr.length - 1] = -1;

        for (int i = arr.length - 2; i >= 0; i--) {

            while (stack.size() > 0 && stack.peek() <= arr[i]) {
                stack.pop();
            }

            if (stack.size() == 0) {
                nge[i] = -1;
            } else {
                nge[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return nge;
    }
}
