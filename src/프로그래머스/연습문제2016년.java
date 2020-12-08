package 프로그래머스;

public class 연습문제2016년 {

    public static String solution(int a, int b) {

        int[] monthNumber = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] days = {"FRI","SAT", "SUN","MON","TUE","WED","THU"};
        int sum = 0;

        for (int i = 0; i < a-1; i++) {
            sum += monthNumber[i];
        }
        sum += b - 1;



        String answer = days[sum%7];

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(1, 5));
    }
}
