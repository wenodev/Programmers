package 프로그래머스;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class 문자열내마음대로정렬하기 {

    static class Custom{
        String str;
        int level;

        public Custom(String str, int level) {
            this.str = str;
            this.level = level;
        }

        public String getStr() {
            return str;
        }

        public void setStr(String str) {
            this.str = str;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }


    }


    public static String[] solution(String[] strings, int n) {


        List<Custom> list = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {
            list.add(new Custom(strings[i], strings[i].charAt(n)));
        }

        Comparator<Custom> comparator = new Comparator<Custom>() {
            @Override
            public int compare(Custom o1, Custom o2) {

                if (o1.getLevel() == o2.getLevel()){
                    return o1.getStr().compareTo(o2.getStr()); // 사전순 정렬
                }

                return o1.getLevel() - o2.getLevel();
            }
        };

        Collections.sort(list, comparator);

        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).getStr();
        }

        return answer;
    }


    public static void main(String[] args) {

        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;

        solution(strings, n);

    }

}
