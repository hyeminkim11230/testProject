package org.stack;

import java.util.Stack;

//주식 가격
public class stack_5 {
    public static void main(String[] args) {

    }

    private static int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n]; //가격이 떨어지지 않은 기간을 정할 배열

        //스택을 사용해 이전 가격과 현재가격을 비교
        Stack<Integer> stack = new Stack<>(); // 스택 생성
        stack.push(0);

        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty()&&prices[i]<prices[stack.peek()]){
                //가격이 떨어졌으므로 이전 가격의 기간 계산
                int j = stack.pop();
                answer[j] = i-j;

            }
            stack.push(i);
        }

        //스택에 남아 있는 가격들은 가격이 떨어지지 않은 경우
        while (!stack.isEmpty()) {
            int j=stack.pop();
            answer[j]=n-1-j;
        }

        return answer;

    }
}
