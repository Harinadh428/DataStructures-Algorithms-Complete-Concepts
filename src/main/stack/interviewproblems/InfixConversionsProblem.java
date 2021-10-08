package main.stack.interviewproblems;

import java.util.Stack;

/**
 * @author harinadh dasari
 */
public class InfixConversionsProblem {

    public static void main(String[] args) {
        String str = "2+3+(2-3*6/2)+4";

        Stack<String> preFix = new Stack<>();
        Stack<String> postFix = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                operators.push(ch);
            } else if (ch == ')') {
                while (operators.size() > 0 && operators.peek() != '(') {
                    handleStackCalculation(operators, preFix, postFix);
                }
            } else if (ch >= '0' && ch <= '9' ||
                    ch >= 'a' && ch <= 'z' ||
                    ch >= 'A' && ch <= 'Z') {
                preFix.push(ch + "");
                postFix.push(ch + "");
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (operators.size() > 0 && operators.peek() != '(' && precedence(ch) <= precedence(operators.peek())) {
                    handleStackCalculation(operators, preFix, postFix);
                }
                operators.push(ch);
            }
        }
        while (operators.size() != 0) {
            handleStackCalculation(operators, preFix, postFix);
        }
        System.out.println("PreFix :" + preFix.pop());
        System.out.println("PostFix :" + postFix.pop());
    }

    private static void handleStackCalculation(Stack<Character> operators, Stack<String> preFix, Stack<String> postFix) {
        char c = operators.pop();
        if (preFix.size() > 1 && postFix.size() > 1) {
            String postVal2 = postFix.pop();
            String postVal1 = postFix.pop();
            postFix.push(postVal1 + postVal2 + c);

            String preVal2 = preFix.pop();
            String preVal1 = preFix.pop();
            preFix.push(c + preVal1 + preVal2);
        }
    }

    public static int precedence(char operator) {

        if (operator == '+' || operator == '-') {
            return 1;
        } else if (operator == '*' || operator == '/') {
            return 2;
        } else {
            return 0;
        }
    }
}
