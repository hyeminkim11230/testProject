package org.stack;

import java.util.Stack;

//10진수를 2진수로 변환하기
public class stack_2 {
    public static void main(String[] args) {

    }

    private static String solution2(int decimal){
        Stack<Integer> stack = new Stack<>();

        while (decimal > 0) {
            int remainder = decimal % 2;
            stack.push(remainder);
            decimal /=2;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }

}
