package 프로그래머스.wintercoding2020;

import java.util.*;

public class TEST2 {

    public static void main(String[] args) {

        int n = 6;
        int array[][] = new int[][]{{1,3,1},{3,5,0},{5,4,0},{2,5,0}};

        solution(n, array);

    }

    public static void solution(int n, int[][] delivery){

        String answer;

        Set<Integer> integerSet = new HashSet<>();

        List<Integer> okList = new ArrayList<>();
        List<Integer> noList = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        List<Integer> totalList = new ArrayList<>();

        for (int i = 0; i < delivery.length; i++) {
            if (delivery[i][2] == 1){
                integerSet.add(delivery[i][0]);
                integerSet.add(delivery[i][1]);
            }
        }

        okList.addAll(integerSet);

        for (int i = 0; i < delivery.length; i++) {
            if (delivery[i][2] == 0){
                if (okList.contains(delivery[i][0])){
                    noList.add(delivery[i][1]);
                }else if (okList.contains(delivery[i][1])){
                    noList.add(delivery[i][0]);
                }
            }
        }

        totalList.addAll(okList);
        totalList.addAll(noList);

        for (int i = 0; i < n; i++) {
            if (!totalList.contains(i+1)){
                tempList.add(i+1);
            }
        }



        char[] chars = new char[n];
        for (int i = 0; i < n; i++) {
            for(int num : okList){
                if ((num-1) == i){
                    chars[i] = 'O';
                }
            }
            for (int num : noList){
                if ((num-1) == i){
                    chars[i] = 'X';
                }
            }
            for (int num : tempList){
                if ((num-1) == i){
                    chars[i] = '?';
                }
            }
        }

        answer = String.valueOf(chars);

    }


}
