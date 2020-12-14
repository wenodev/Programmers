package 프로그래머스;

import java.util.ArrayList;

public class 삼진법뒤집기 {

    public static int solution(int n) {
        int answer = 0;
        ArrayList<Integer> lists = new ArrayList<>();


        // 진법 변환 코드!!!
        while(n >= 1) {
            lists.add(n % 3);
            n = n / 3;
        }


        System.out.println(lists);

        for (int i = 0 ; i < lists.size(); i++) {
            answer += Math.pow(3, lists.size()-i-1) * lists.get(i);
        }

        return answer;
    }


    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));
    }
}
