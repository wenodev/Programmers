package 프로그래머스.해시;

import java.util.HashMap;
import java.util.Map;

public class 완주하지못한선수 {

    public static void solution(String[] participant, String[] completion){
        Map<String, Integer> memberMap = new HashMap<>();
        String answer = "";


        /*
        - 주석 코드를 아래의 코드로 줄여서 사용할 수 있음
        - Map의 getOrDefault 활용하기
         */

//        for (int i = 0; i < participant.length; i++) {
//            if (!memberMap.containsKey(participant[i])){
//                memberMap.put(participant[i], 1);
//            }else{
//                memberMap.put(participant[i], memberMap.get(participant[i]) + 1);
//            }
//        }

        for (String person : participant){
            memberMap.put(person, memberMap.getOrDefault(person, 0) + 1);
        }


        for (int i = 0; i < completion.length; i++) {
            memberMap.put(completion[i], memberMap.get(completion[i]) - 1 );
        }

        /*
        keySet을 활용하면코드를 줄일 수 있다.
        */

//        for (Map.Entry<String, Integer> entry : memberMap.entrySet()){
//            if(entry.getValue() == 1){
//                answer = entry.getKey();
//            }
//        }

        for (String key : memberMap.keySet()){
            if (memberMap.get(key) != 0){
                answer = key;
            }
        }


        System.out.println(answer);

    }


    public static void main(String[] args) {
        String[] participant = new String[]{"leo", "kiki", "eden"};
        String[] completion = new String[]{"eden", "kiki"};

        solution(participant, completion);

    }

}
