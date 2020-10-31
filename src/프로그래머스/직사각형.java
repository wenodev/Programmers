package 프로그래머스;

import java.util.*;

public class 직사각형 {

    public static void main(String[] args) {

        int[][] v = new int[][]{
                {1, 4}, {3, 4}, {3, 10}
        };

//        System.out.println(Arrays.toString(solution(v)));
        Arrays.toString(solution(v));

    }

    public static int[] solution(int[][] v){

        int[] answer = new int[2];

        List<Integer> integerList = new ArrayList<>();
        Map<Integer, Integer> integerMap = new HashMap<>();

        for (int i = 0; i < v.length; i++) {
            integerList.add(v[i][0]);
        }

        for (int i = 0; i < integerList.size(); i++) {
            if (integerMap.containsKey(integerList.get(i))){
                integerMap.put(integerMap.get(i), integerMap.get(integerList.get(i)) + 1);
            }else{
                integerMap.put(integerList.get(i), 0);
            }
        }



        return answer;
    }


}
