package main.stack.interviewproblems;

import java.util.Objects;
import java.util.Stack;

/**
 * @author harinadh dasari
 */
public class BalancedBrackets {

    public static void main(String[] args) {
        String str = "[(a+b)+{(c+d)*(e/f)}]";
        System.out.println(isBalancedBrackets(str));
    }

    private static boolean isBalancedBrackets(String str) {
        Stack<Character> stack = new Stack<>();
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {

            if (Objects.equals(ch[i], '[') || Objects.equals(ch[i], '(') ||
                    Objects.equals(ch[i], '{')) {
                stack.push(ch[i]);
            } else if (Objects.equals(ch[i], ']')) {
                boolean val = handleClosing(stack, '[');
                if (!val) {
                    System.out.println(val);
                    return false;
                }
            } else if (Objects.equals(ch[i], '}')) {
                boolean val = handleClosing(stack, '{');
                if (!val) {
                    System.out.println(val);
                    return false;
                }
            } else if (Objects.equals(ch[i], ')')) {
                boolean val = handleClosing(stack, '(');
                if (!val) {
                    System.out.println(val);
                    return false;
                }
            }
        }
        return stack.size() == 0;
    }

    public static boolean handleClosing(Stack stack, Character correspondingOpeningCharacter) {
        if (stack.size() == 0) {
            return false;
        } else if (stack.peek() != correspondingOpeningCharacter) {
            return false;
        } else {
            stack.pop();
            return true;
        }
    }
}
