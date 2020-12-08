package 프로그래머스.정렬;

import java.util.ArrayList;
import java.util.Collections;

public class K번째수 {

    public static int[] solution(int[] array, int[][] commands) {

        ArrayList<Integer> tempList = new ArrayList<>();
        ArrayList<Integer> answerList = new ArrayList<>();

        for (int i = 0; i < commands.length; i++) {

            for (int j = commands[i][0] - 1; j <= commands[i][1] - 1 ; j++) {
                tempList.add(array[j]);
            }
            Collections.sort(tempList);
            System.out.println(tempList);
            answerList.add(tempList.get(commands[i][2]-1));
            tempList.clear();
        }


        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3}};

        solution(array, commands);

    }
}
