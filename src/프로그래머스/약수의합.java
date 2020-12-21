package 프로그래머스;


import java.util.ArrayList;

public class 약수의합 {


    public int solution(int n) {
        int answer = 0;

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) list.add(i);
        }

        for (Integer num : list){
            answer += num;
        }

        return answer;
    }


    public static void main(String[] args) {

    }

}
