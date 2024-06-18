package org.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class hash_5 {
    //채팅
    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi","Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        System.out.println(Arrays.toString(solution(record)));
    }

    private static String[] solution(String[] record) {
        // enter/leave메시지를 저장할 해시맵 생성
        HashMap<String, String> msg = new HashMap<>();
        msg.put("Enter","님이 들어왔습니다");
        msg.put("Leave","님이 나갔습니다");

        HashMap<String,String> uid = new HashMap<>();

        //record의 각 줄을 하나씩 처리
        for (String s : record) {
            String[] cmd = s.split(" ");
            if (cmd.length == 3) {
                uid.put(cmd[1], cmd[2]);
            }
        }
        //답을 저장할 answer list생성
        ArrayList<String> answer = new ArrayList<>();

        for (String s : record) {
            String[] cmd = s.split( " ");

            if(msg.containsKey(cmd[0])){
                answer.add(uid.get(cmd[1]) + msg.get(cmd[0]));
            }
        }

        return answer.toArray(new String[0]);

    }

}
