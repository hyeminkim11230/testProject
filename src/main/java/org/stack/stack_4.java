package org.stack;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Stack;

//짝지어 제거하기
public class stack_4 {
    public static void main(String[] args) {

    }

    private static int solution(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<s.length();i++){
            char c = s.charAt(i);
            //스택이 비어있지 않고 현재 문자와 스택의 맨 위 문자가 같으면
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop(); //스택 맨 위 문자제거
            } else {
                stack.push(c); //스택에 현재 문자 추가
            }
        }
        return stack.isEmpty() ? 1 : 0; //스택이 비어있으면 1, 아님 0을 리턴
    }
}
