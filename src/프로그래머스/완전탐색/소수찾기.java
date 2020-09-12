package 프로그래머스.완전탐색;

public class 소수찾기 {
    public static void main(String[] args) {
        String numbers = "17";
        Solution(numbers);
    }

    public static boolean isPrime(int num) {
        boolean result = true;
        for(int i = 2; i < num; i++) {
            if( num%i == 0) {
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }

    public static void Solution(String numbers) {



    }

}
