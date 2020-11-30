package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 모의고사 {

    public static int[] solution(int[] answers){


        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        List<Integer> answersList = new ArrayList<>(Arrays.asList(0,0,0));
        List<Integer> countList = new ArrayList<>();


        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == person1[i%person1.length]){
                answersList.set(0,answersList.get(0) + 1);
            }
            if (answers[i] == person2[i%person2.length]){
                answersList.set(1,answersList.get(1) + 1);
            }
            if (answers[i] == person3[i%person3.length]){
                answersList.set(2,answersList.get(2) + 1);
            }
        }

        int max = Collections.max(answersList);

        for (int i = 0; i < answersList.size(); i++) {
            if (answersList.get(i) == max){
                countList.add(i+1);
            }
        }

        int[] answer = new int[countList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = countList.get(i);
        }


        // List to Array 스트림으로
//        list.stream().mapToInt(i->i.intValue()).toArray();

        return answer;
    }

    public static void main(String[] args) {
        int[] answers = {1,3,2,4,2};
        solution(answers);
    }
}
