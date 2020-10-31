package 프로그래머스.wintercoding2020;

import java.sql.SQLOutput;
import java.util.Arrays;

public class TEST1 {

    public static void main(String[] args) {

        String encrypted_text = "qyyigoptvfb";
        String key ="abcdefghijk";
        int rotation = 3;

        solution(encrypted_text, key, rotation);
    }

    public static void solution(String encrypted_text, String key, int rotation){

        int[] keyValue = new int[key.length()];
        char[] chars = new char[encrypted_text.length()];

        for (int i = 0; i < key.length(); i++) {
            keyValue[i] = (int) key.charAt(i) - 96;
        }

        for (int i = 0; i < encrypted_text.length(); i++) {
            chars[i] = encrypted_text.charAt(i);
        }

        System.out.println(Arrays.toString(chars));


        for (int i = 0; i < 3; i++) {
            char temp = chars[0];
            for (int j=0; j<=chars.length-2; j++){
                chars[j] = chars[j+1];
            }
            chars[chars.length-1] = temp;

            System.out.println(Arrays.toString(chars));
        }


        for (int i = 0; i < chars.length; i++) {
            int temp = (int) chars[i] - keyValue[i];
            if (temp < 97){
                temp = 127 + 97 - temp;
            }
            if (temp > 122){
                temp = 96 + temp - 122;
            }


            chars[i] = (char) temp;
        }

        System.out.println((int) 'a');
        System.out.println((int) 'z');


        System.out.println(Arrays.toString(chars));
//
//
//        for (int i = 0; i < 3; i++) {
//            char temp = chars[chars.length-1];
//            for (int j=chars.length-1; j>=1; j--){
//                chars[j] = chars[j-1];
//            }
//            chars[0] = temp;
//        }
//
//        System.out.println(Arrays.toString(chars));


    }

}
