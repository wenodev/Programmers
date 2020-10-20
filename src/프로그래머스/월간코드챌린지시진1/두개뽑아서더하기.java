package 프로그래머스.월간코드챌린지시진1;

import java.util.*;

public class 두개뽑아서더하기 {

    public static void Solution(int[] numbers){

        Set<Integer> integerSet = new HashSet<>();

        for (int i=0; i<numbers.length-1; i++){
            for (int j=i+1; j<numbers.length; j++){
                int temp = numbers[i] + numbers[j];
                integerSet.add(temp);
            }
        }

        List<Integer> integerList = new ArrayList<>(integerSet);
        Collections.sort(integerList);
        int[] answer = new int[integerList.size()];
        for (int i=0; i<answer.length; i++){
            answer[i] = integerList.get(i);
        }


        System.out.println(integerList);


    }


    public static void main(String[] args) {
        Solution(new int[]{1,5,23,15,100});
    }


}
