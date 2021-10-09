package main.stack.interviewproblems;

import java.util.Stack;

/**
 * @author harinadh dasari
 */
public class PostFixExpressionProblem {

    public static void main(String[] args) {
        String str = "264*8/+3-";
        Stack<Integer> vs = new Stack<>();
        Stack<String> is = new Stack<>();
        Stack<String> ps = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                int v2 = vs.pop();
                int v1 = vs.pop();
                int result = operation(v1, v2, ch);
                vs.push(result);

                String iVal2 = is.pop();
                String iVal1 = is.pop();
                String iResult = "(" + iVal1 + ch + iVal2 + ")";
                is.push(iResult);

                String pVal2 = ps.pop();
                String pVal1 = ps.pop();
                String pResult = ch + pVal1 + pVal2;
                ps.push(pResult);
            } else {
                vs.push(ch - '0');
                is.push(ch + "");
                ps.push(ch + " ");
            }
        }

        System.out.println(vs.pop());
        System.out.println(is.pop());
        System.out.println(ps.pop());
    }

    private static int operation(int v1, int v2, char ch) {
        if (ch == '+') {
            return v1 + v2;
        } else if (ch == '-') {
            return v1 - v2;
        } else if (ch == '*') {
            return v1 * v2;
        } else {
            return v1 / v2;
        }
    }
}
