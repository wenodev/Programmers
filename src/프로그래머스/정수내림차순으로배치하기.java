package 프로그래머스;

import java.util.ArrayList;
import java.util.Collections;

public class 정수내림차순으로배치하기 {

    public static long solution(long n) {
        long answer = 0;

        String number = String.valueOf(n);
        ArrayList<Integer> arrayList = new ArrayList<>();
        char[] charNumbers = new char[number.length()];


        for (int i = 0; i < number.length(); i++) {
            arrayList.add(  Character.getNumericValue(number.charAt(i))  );
        }

        Collections.sort(arrayList, Collections.reverseOrder());

        for (int i = 0; i < number.length(); i++) {
            charNumbers[i] = Character.valueOf(arrayList.get(i));
        }

        for (int i = 0; i < charNumbers.length; i++) {
            charNumbers
        }
        

        System.out.println(arrayList);
        return answer;
    }

    public static void main(String[] args) {
        solution(118372);
    }

}
