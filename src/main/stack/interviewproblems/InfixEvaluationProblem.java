package main.stack.interviewproblems;

import java.util.Objects;
import java.util.Stack;

/**
 * @author harinadh dasari
 */
public class InfixEvaluationProblem {

    public static void main(String[] args) {

        String str = "2+(5-3*6/2)";
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                operators.push(ch);
            } else if (Character.isDigit(ch)) {
                operands.push(ch - '0');
            } else if (ch == ')') {
                while (operators.size() > 0 && operators.peek() != '(') {
                    char operator = operators.pop();
                    int val1 = operands.pop();
                    int val2 = operands.pop();

                    int result = operation(val1, val2, operator)
                            ;
                    operands.push(result);
                }
                operators.pop();

            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (operators.size() > 0 && operators.peek() != '(' && precedence(ch) <= precedence(operators.peek())) {

                    char operator = operators.pop();
                    int val1 = operands.pop();
                    int val2 = operands.pop();
                    int result = operation(val1, val2, operator);
                    operands.push(result);
                }
                operators.push(ch);
            }
        }
        while (operators.size() != 0) {
            char operator = operators.pop();
            int val1 = operands.pop();
            int val2 = operands.pop();

            int result = operation(val1, val2, operator);
            operands.push(result);
        }

        System.out.println(operands.peek());
    }

    public static int operation(int val1, int val2, char operator) {

        if (operator == '-') {
            return val2 - val1;
        } else if (operator == '+') {
            return val2 + val1;
        } else if (operator == '*') {
            return val2 * val1;
        } else {
            return val2 / val1;
        }
    }

    public static int precedence(char operator) {

        if (Objects.equals(operator, '+')) {
            return 1;
        } else if (Objects.equals(operator, '-')) {
            return 1;
        } else if (Objects.equals(operator, '*')) {
            return 2;
        } else {
            return 2;
        }
    }
}
