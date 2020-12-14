package 프로그래머스;

import java.util.ArrayList;
import java.util.List;

public class 가운데글자가져오기 {

    public static String solution(String s) {
        String answer = "";
        int temp;
        List<Character> lists = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        if (s.length()%2 == 0){
            temp = s.length()/2;
            lists.add(s.charAt(temp-1));
            lists.add(s.charAt(temp));
        }else{
            temp = s.length()/2;
            lists.add(s.charAt(temp));
        }

        for (int i = 0; i < lists.size(); i++) {
            stringBuilder.append(lists.get(i));
        }

        answer = String.valueOf(stringBuilder);


        return answer;
    }


    public static void main(String[] args) {
        String s = "qwer";
        System.out.println(solution(s));
    }
}
