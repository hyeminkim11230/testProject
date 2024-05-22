package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class sol_1 {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
//        ArrayList<Integer> list1 = new ArrayList<>();
//        //리스트의 맨끝에 데이터 추가
//        list1.add(1);
//
//        ArrayList<Integer> list2 = new ArrayList<>();
//        list2.add(1);
//
//        ArrayList<Integer> list3 = new ArrayList<>();
//        list3.add(1);
//        //sout + tab
//        System.out.println(list3.get(1));
//
//        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,4,5,3));
//        System.out.println(list1.size());
//        System.out.println(list4.isEmpty());
//        Collections.sort(list4);
//        System.out.println(list4);

//        ArrayList<Integer>
        int[] arr = {4,1,2,3,5};
        System.out.println(Arrays.toString(solution1(arr)));
        System.out.println(Arrays.toString(solution2(arr)));

    }
    public static int[] solution1(int[] arrayList){
        Arrays.sort(arrayList);
//        int[] arr = arrayList;
//        int tmp;
//        for(int i=0;i<arr.length;i++){
//           if(arr[i]>arr[i+1]){
//               tmp=arr[i];
//               arr[i]=arr[i+1];
//               arr[i+1]=tmp;
//           }else{
//              break;
//           }
//        }
        return arrayList;
    }

    public static int[] solution2(int[] arrayList){
        //중복값 제거
        Integer[] result = Arrays.stream(arrayList).boxed().distinct().toArray(Integer[]::new);
        //내림차순
        Arrays.sort(result,Collections.reverseOrder());
        //int형 배열로 변경 후 반환
        return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
    }
}