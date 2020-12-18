package 프로그래머스;

public class 문자열내p와y개수 {


    public static boolean solution(String s) {

        s = s.toLowerCase();

        int[] count = new int[2];

        for (int i = 0; i < s.length(); i++) {

            if ('p' == s.charAt(i)){
                count[0]++;
            }else if('y' == s.charAt(i)){
                count[1]++;
            }
        }

        if (count[0] == count[1] && count[0] != 0 )
            return true;
        else
            return false;


    }

    public static void main(String[] args) {

        String s = "pPoooyY";
        solution(s);
    }
}
