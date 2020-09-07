package 프로그래머스.완전탐색;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 모의고사 {

    public static void main(String[] args) {
        int[] answers = {3,3,2};
        Solution(answers);
    }

    public static int[] Solution(int[] answers){
        int[] person1 = new int[]{1, 2, 3, 4, 5};
        int[] person2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        List<Integer> answerList = new ArrayList<>(Arrays.asList(0,0,0));
        List<Integer> countList = new ArrayList<>();

        for(int i=0; i<answers.length; i++){
            if (answers[i] == person1[i%person1.length]){
                answerList.set(0, answerList.get(0)+1);
            }
        }

        for(int i=0; i<answers.length; i++){
            if (answers[i] == person2[i%person2.length]){
                answerList.set(1, answerList.get(1)+1);
            }
        }

        for(int i=0; i<answers.length; i++){
            if (answers[i] == person3[i%person3.length]){
                answerList.set(2, answerList.get(2)+1);
            }
        }

        int maxNum = Collections.max(answerList);

        for(int i=0; i<answerList.size(); i++){
            if (answerList.get(i) == maxNum){
                countList.add(i+1);
            }
        }

        int[] answer = new int[countList.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = countList.get(i);
        }

        return answer;

    }
}
