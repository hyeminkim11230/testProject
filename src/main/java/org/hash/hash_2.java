package org.hash;

import java.util.HashMap;
import java.util.HashSet;

public class hash_2 {

    public static void main(String[] args) {
        int[] arr = {5,2,3,4,8};
        int target= 6;
        System.out.println(solution(arr,target));
    }

    private static boolean solution(int[] arr, int target) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i : arr) {
            if (hashSet.contains(target - i)) {
                return true;
            }
            hashSet.add(i);
        }

        return false;
    }

}
