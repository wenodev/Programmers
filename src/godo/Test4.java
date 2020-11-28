package godo;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static String solution(String cardNumber){

        List<Integer> lists = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < cardNumber.length(); i++) {
            lists.add(cardNumber.charAt(i) - '0');
        }

        if (lists.size() % 2 == 0){
            for (int i = 0; i < lists.size(); i += 2) {
                lists.set(i, lists.get(i) * 2);
            }
        }else{
            for (int i = 1; i < lists.size(); i+=2) {
                lists.set(i, lists.get(i) * 2);
            }
        }


        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i) >= 10){
                int temp = lists.get(i);
                lists.remove(i);
                String strTemp = String.valueOf(temp);
                lists.add(strTemp.charAt(0) - '0');
                lists.add(strTemp.charAt(1) - '0');
            }
        }

        for (int i = 0; i < lists.size(); i++) {
            sum += lists.get(i);
        }

        if (sum % 10 == 0){
            return "VALID";
        }else{
            return "INVALID";
        }

    }


    public static void main(String[] args) {
        String cardNumber = "21378";
        solution(cardNumber);

    }
}
