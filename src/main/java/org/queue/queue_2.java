package org.queue;

import java.util.ArrayDeque;

public class queue_2 {
    public static void main(String[] args) {
        System.out.println(solution(5,2)); ;
    }
    private static int solution(int N, int K) {
        //1부터 N까지의 번호를 deque에 추가
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            deque.addLast(i);
        }

        //deque에 하나의 요소가 남을 때까지 반복
        while (deque.size() > 1) {
            //K번째 요소를 찾기 위해 앞에서부터 제거하고 뒤에 추가
            for (int i = 0; i < K - 1; i++) {
                deque.addLast(deque.pollFirst());
            }
            deque.pollFirst(); //K번째 요소 제거
        }

        return deque.pollFirst(); //마지막으로 남은 요소 반환
    }
}
