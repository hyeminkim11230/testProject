package org.hash;

import java.util.HashMap;
import java.util.HashSet;

public class hash_3 {

    public static void main(String[] args) {
        String[] participant = {"eden","kiki","leo"};
        String[] completion = {"kiki","eden"};
        System.out.println(solution(participant,completion));
    }

    private static String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String string : completion) {
            hashMap.put(string, hashMap.getOrDefault(string,0)+1);
        }

        for (String string : participant) {
            if(hashMap.getOrDefault(string,0)==0){
                return string;
            }
            hashMap.put(string, hashMap.get(string) -1 );
        }
        return null;
    }

}
