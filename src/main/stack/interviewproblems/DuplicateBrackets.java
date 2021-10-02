package main.stack.interviewproblems;

import java.util.Stack;

/**
 * @author harinadh dasari
 */
public class DuplicateBrackets {

    public static void main(String[] args) {


        String str = "(((a+b))+(c+d))";
        char[] ch = str.toCharArray();
        System.out.println(checkDuplicateBrackets(ch));
    }

    private static boolean checkDuplicateBrackets(char[] ch) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ')') {
                if (stack.peek() == '(') {
                    return true;
                } else {
                    while (stack.peek() != '(') {
                        stack.pop();
                    }
                    stack.pop();
                }
            } else {
                stack.push(ch[i]);
            }
        }
        return false;
    }
}

