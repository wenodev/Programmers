package 프로그래머스;

public class 이상한문자만들기 {


    public static String solution(String s) {

        String[] strArr = s.split(" ");
        StringBuilder[] result = new StringBuilder[strArr.length];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr[i].length(); j++) {
                if (j%2 != 0){
                    result[i].append( Character.toUpperCase(strArr[i].charAt(j)) );
                }else{
                    result[i].append( Character.toLowerCase(strArr[i].charAt(j)) );
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            sb.append(result[i]).append(" ");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
    }

}
