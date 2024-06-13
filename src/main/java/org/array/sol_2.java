package org.array;

import java.util.Arrays;
import java.util.HashSet;

public class sol_2 {
    public static void main(String[] args) {
        int[] arr= {5,1,3,4,2,2,7};
        System.out.println(Arrays.toString(solution2(arr)));
    }

//    모의 테스트
    public static int[] solution2(int[] numbers){
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                set.add(numbers[i]+numbers[j]);
            }
        }
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}