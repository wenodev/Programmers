package 프로그래머스.해시;

import java.util.HashMap;
import java.util.Map;

public class 완주하지못한선수 {

    public static void solution(String[] participant, String[] completion){
        Map<String, Integer> memberMap = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            if (!memberMap.containsKey(participant[i])){
                memberMap.put(participant[i], 1);
            }else{
                memberMap.put(participant[i], memberMap.get(participant[i]) + 1);
            }
        }
// 진행중
        System.out.println(memberMap);



    }


    public static void main(String[] args) {
        String[] participant = new String[]{"leo", "kiki", "eden"};
        String[] completion = new String[]{"eden", "kiki"};

        solution(participant, completion);

    }

}
