package 프로그래머스;

public class 시저암호 {

    public static String solution(String s, int n) {
        String answer = "";
        int temp;
        int sum;
        char[] arrChar = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            temp = s.charAt(i);

            if (temp>= 97 && temp <= 122){
                sum = temp + n;
                if (sum >= 123){
                    arrChar[i] = (char) (sum - 122 + 96);
                }else{
                    arrChar[i] = (char) sum;
                }
            }else if(temp>= 65 && temp <= 90){
                sum = temp + n;
                if (sum >= 91){
                    arrChar[i] = (char) (sum - 90 + 64);
                }else{
                    arrChar[i] = (char) sum;
                }
            }else{
                arrChar[i] = s.charAt(i);
            }
        }

        answer = String.valueOf(arrChar);

        return answer;
    }

    public static void main(String[] args) {
        String s = "a B z";
        int n = 4;
        System.out.println(solution(s, n));
    }
}
