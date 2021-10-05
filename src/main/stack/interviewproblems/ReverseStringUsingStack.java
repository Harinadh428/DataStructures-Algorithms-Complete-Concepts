package main.stack.interviewproblems;

import java.util.Stack;

/**
 * @author harinadh dasari
 */
public class ReverseStringUsingStack {
    public static void main(String[] args) {
        String str = "hello world";
        Stack stack = new Stack();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        while(stack.size()>0){
            System.out.print(stack.pop()+" ");
        }
    }
}
