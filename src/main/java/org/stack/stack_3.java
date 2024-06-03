package org.stack;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

//괄호 회전하기
public class stack_3 {
    public static void main(String[] args) {

    }

    private static int solution(String s) {
        //괄호 정보를 저장함 , 코드를 간결하게
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        int n = s.length();
        s += s;
        int answer = 0;

        A:for (int i = 0; i < n; i++) {
            ArrayDeque<Character> stack = new ArrayDeque<>();

            for (int j = 0; j < i + n; j++) {
                char c = s.charAt(j);
                //해시맵 안에 해당 키가 없다면 열리는 관호
                if (!map.containsKey(c)) {
                    stack.push(c);
                } else {
                    if (stack.isEmpty() || !stack.pop().equals((map.get(c))))
                        continue A;
                }
            }

            if (stack.isEmpty())
                answer++;


        }
        return answer;

    }
}
