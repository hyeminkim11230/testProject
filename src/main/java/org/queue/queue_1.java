package org.queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

//기능 개발
public class queue_1 {
    public static void main(String[] args) {
        int[] progresses = {93,30,55};
        int[] speeds = {1,30,5};
        System.out.println(Arrays.toString(solution(progresses, speeds))); ;
    }
    private static int[] solution(int[] progresses, int[] speeds) {
        ArrayDeque<Integer> answer = new ArrayDeque<>();

        int n = progresses.length;
        //각 작업의 배포가능일 계산
        int[] daysLeft = new int[n];
        for (int i = 0; i < n; i++) {
            //Math.ceil() 소수점을 올림 연산하는 메서드
            daysLeft[i] =(int) Math.ceil((100.0 - progresses[i])/speeds[i]);
        }

        int count = 0; //배포될 작업의 수 카운트
        int maxDay = daysLeft[0]; // 현재 배포될 작업 중 가장 늦게 배포될 작업의 가능일

        for (int i = 0; i < n; i++) {
            if (daysLeft[i] <= maxDay) { //배포 가능일이 가장 늦은 배포일보다 빠르면
                count++;
            }
            else{ // 배포 예정일이 기준 배포일보다 늦으면
                answer.add(count);
                count=1;
                maxDay = daysLeft[i];
            }
        }

        answer.add(count); //마지막으로 카운트된 작업들을 함께 배포
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
