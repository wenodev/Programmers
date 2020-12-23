package 프로그래머스;

public class 자연수뒤집어배열로만들기 {


    public static int[] solution(long n) {

        String number = String.valueOf(n);
        int[] answer = new int[number.length()];
        int count = 0;

        for (int i = number.length()-1; i >= 0; i--) {
            answer[count++] = Character.getNumericValue(number.charAt(i));
        }
        return answer;
    }


    public static void main(String[] args) {
        solution(12345);
    }


}
