package 프로그래머스;

public class 가운데글자가져오기2 {

    public static String solution(String s) {

        int length = s.length();
        int mid = length/2;

        return length%2 == 0 ? s.substring(mid-1, mid+1) : s.substring(mid, mid+1);
    }


        public static void main(String[] args) {
        String s = "qwer";
        System.out.println(solution(s));
    }
}
