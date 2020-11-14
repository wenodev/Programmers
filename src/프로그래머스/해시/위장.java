package 프로그래머스.해시;

import java.util.HashMap;
import java.util.Map;

public class 위장 {


    public static int solution(String[][] clothes ){
        int answer = 1;

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {

            if (!map.containsKey(clothes[i][1])){
                map.put(clothes[i][1], 1);
            }else{
                map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
            }
        }

        //keySet 사용
        for (String key : map.keySet()){
            answer *= map.get(key) + 1;
        }


        // 마지막 경우의 수
        return answer-1;
    }

    public static void main(String[] args) {

        String[][] clothes = {
                {"crow_mask", "face"},
                {"blue_sunglasses", "face"},
                {"smoky_makeup", "face"}
        };
        System.out.println(solution(clothes));
    }

}
