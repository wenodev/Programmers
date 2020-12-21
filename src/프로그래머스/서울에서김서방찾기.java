package 프로그래머스;

import java.util.Arrays;

public class 서울에서김서방찾기 {

    public static String solution(String[] seoul) {
        int x = Arrays.asList(seoul).indexOf("Kim");


        System.out.println(x);

        return "김서방은 "+ x + "에 있다";

    }


    public static void main(String[] args) {
        System.out.println(solution(new String[]{"Jane", "Kim"}));
    }

}
