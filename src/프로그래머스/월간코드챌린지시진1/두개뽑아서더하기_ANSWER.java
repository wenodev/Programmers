package 프로그래머스.월간코드챌린지시진1;

import java.util.*;

public class 두개뽑아서더하기_ANSWER {


    public static void Solution(int[] numbers){

        Set<Integer> integerSet = new HashSet<>();

        for (int i=0; i<numbers.length-1; i++){
            for (int j=i+1; j<numbers.length; j++){
                int temp = numbers[i] + numbers[j];
                integerSet.add(temp);
            }
        }

        int[] answer = new int[integerSet.size()];

        //꼭 기억하기!!!
        answer = integerSet.stream().sorted().mapToInt(Integer::intValue).toArray();
        


    }


    public static void main(String[] args) {
        Solution(new int[]{1,5,23,15,100});
    }

}
