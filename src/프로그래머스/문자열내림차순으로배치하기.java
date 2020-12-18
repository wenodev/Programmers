package 프로그래머스;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 문자열내림차순으로배치하기 {

    public static String solution(String s) {

//        List<Integer> levelList = new ArrayList<>();
//        char[] charArr = new char[s.length()];
//
//        for (int i = 0; i < s.length(); i++) {
//            levelList.add(Integer.valueOf(s.charAt(i)));
//        }
//        Collections.reverse(levelList);
//
//        for (int i = 0; i < levelList.size(); i++) {
//            charArr[i] = (char) Integer.parseInt(levelList.get(i).toString());
//        }
//
//
//        String answer = String.valueOf(charArr);
//
//        System.out.println(answer);
//
//        return answer;

//        char[] sol = s.toCharArray();
//        Arrays.sort(sol);
//        return new StringBuilder(new String(sol)).reverse().toString();

        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        String answer = new StringBuilder(new String(charArr)).reverse().toString();

        return answer;
    }

    public static void main(String[] args) {
        String s = "Zbcdefg";
        System.out.println(solution(s));
    }


}
