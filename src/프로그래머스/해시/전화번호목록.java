package 프로그래머스.해시;

import java.util.*;

public class 전화번호목록 {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
//        String[] phone_book = {"123","456","789"};
//        String[] phone_book = {"12","123","1235","567","88"};

        System.out.println(Solution(phone_book));
    }

    public static boolean Solution(String[] phone_book) {

        /*
        - 코드의 효율성을 위해 바로 return 하는 함수를 항상 고려해야함
        - 접두사 문제는 startsWith 고려하기
        */

        for (int i = 0; i < phone_book.length-1; i++) {
            for (int j= i+1; j < phone_book.length; j++){
                if (phone_book[i].startsWith(phone_book[j])) return false;
                if (phone_book[j].startsWith(phone_book[i])) return false;
            }
        }
        return true;

    }
}
