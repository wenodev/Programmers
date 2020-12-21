package 프로그래머스;

public class 시저암호 {

    public static String solution(String s, int n) {
        String answer = "";
        char[] arrChar = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))){
                arrChar[i] = (char) ((s.charAt(i) - 'a' + n) % 26 + 'a');
            }else if(Character.isUpperCase(s.charAt(i))){
                arrChar[i] = (char) ((s.charAt(i) - 'A' + n) % 26 + 'A');
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
