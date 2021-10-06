package main.stack.interviewproblems;

import java.util.Stack;

/**
 * @author harinadh dasari
 */

public class SlidingWindowMaximum {

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 1, 4, 2, 2, 7, 5, 23, 6};
        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        int k = 2;

        st.push(arr.length - 1);
        nge[arr.length - 1] = arr.length;

        for (int i = arr.length - 2; i >= 0; i--) {

            while (st.size() > 0 && arr[i] >= arr[st.peek()]) {
                st.pop();
            }

            if (st.size() == 0) {
                nge[i] = arr.length;
            } else {
                nge[i] = st.peek();
            }

            st.push(i);
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (int y : nge) {
            System.out.print(y + " ");
        }
        System.out.println();

        int j = 0;
        for (int i = 0; i <= arr.length - k; i++) {
            if (j < i) {
                j = i;
            }

            while (nge[j] < i + k) {
                j = nge[j];
            }
            System.out.print(arr[j] + " ");
        }
    }
}
