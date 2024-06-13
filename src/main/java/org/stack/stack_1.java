package org.stack;

import java.util.ArrayDeque;

//괄호 만들기
public class stack_1 {
    public static void main(String[] args) {

    }

    private boolean solution1(String s){
        ArrayDeque<Character> stack = new ArrayDeque<>();

        char[] a = s.toCharArray();
        for (char c : a) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty() || stack.pop() == c) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
