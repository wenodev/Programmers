package 카카오테스트;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) {
        String new_id = "...!@BaT#*..y.abcdefghijklm";
        Solution(new_id);


    }

    public static void Solution(String new_id){
        String answer;
        answer = new_id.toLowerCase();


        answer = answer.replaceAll("^[^0-9a-z-_.]*$", "");


        answer = answer.replace("..", ".");







        System.out.println(answer);
    }



}
