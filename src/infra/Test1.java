package infra;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {
        String s = "abac";
        Solution(s);

    }

    public static void Solution(String s) {
        List<String> answerList = new ArrayList<>();

        for(int i=0; i<s.length(); i++){
            String temp = String.valueOf(s.charAt(i));
            answerList.add(temp);
        }





    }

    }
