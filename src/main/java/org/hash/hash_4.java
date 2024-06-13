package org.hash;

import java.util.HashMap;

public class hash_4 {
    //할인 행사
    public static void main(String[] args) {
        String[] want = {"banana","apple","rice","pork","pot"};
        int[] number ={3,2,2,2,1};
        String[] discount = {"chicken","apple","apple","banana","rice","apple","pork","apple"};
        System.out.println(solution(want,number,discount));
    }

    private static int solution(String[] want, int[] number, String[] discount) {

        HashMap<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i],number[i]);
        }
        int answer=0;

        for (int i = 0; i < discount.length - 9; i++) {

            HashMap<String,Integer> discount10d = new HashMap<>();

            for (int j = i; j < i + 10; j++) {
                if (wantMap.containsKey(discount[i])) {
                    discount10d.put(discount[j],discount10d.getOrDefault(discount[j],0)+1);
                }
            }

            if(discount10d.equals(wantMap))
                answer++;

        }
        return answer;

    }

}
