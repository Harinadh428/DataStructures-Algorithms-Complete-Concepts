package main.stack.interviewproblems;

import java.util.Stack;

/**
 * @author harinadh dasari
 */
public class CelebrityProblem {

    public static void main(String[] args) {
        int[][] arr = {
                {0, 0, 1, 0},
                {1, 0, 1, 0},
                {0, 0, 0, 0},
                {0, 1, 1, 0}
        };

        findCelebrity(arr);
    }

    private static void findCelebrity(int[][] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(i);
        }

        while (stack.size() >= 2) {
            int i = stack.pop();
            int j = stack.pop();

            if (arr[i][j] == 1) {
                //if i knows j that means i is not a celebrity
                stack.push(j);
            } else {
                //if i don't no j means j is not a celebrity
                stack.push(i);
            }
        }

        int potentialCelebrity = stack.pop();

        for (int i = 0; i < arr.length; i++) {
            if (i != potentialCelebrity) {
                if (arr[i][potentialCelebrity] == 0 || arr[potentialCelebrity][i] == 1) {
                    //if any i doesn't know about potential celebrity
                    //if potential celebrity knows any i that means our potential celebrity is not a celebrity
                    System.out.println("no celebrity exist");
                    return;
                }
            }
        }
        System.out.println(potentialCelebrity);
    }
}
