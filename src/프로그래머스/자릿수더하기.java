package 프로그래머스;

public class 자릿수더하기 {

    public int solution(int n) {
        int answer = 0;

        String number = String.valueOf(n);

        for (int i = 0; i < number.length(); i++) {
            answer += Character.getNumericValue(number.charAt(i));
        }

        return answer;
    }


}
