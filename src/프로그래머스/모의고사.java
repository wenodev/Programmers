package 프로그래머스;

import java.util.ArrayList;
import java.util.List;

public class 모의고사 {


    public static int[] solution(int[] answers){
        int[] answer = {};

        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        List<Integer> countList = new ArrayList<>(3);

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == person1[i%person1.length]){
                countList.set(0, countList.get(0) + 1);
            }else if(answers[i] == person1[i%person2.length]){
                countList.set(1, countList.get(1) + 1);
            }else if(answers[i] == person1[i%person3.length]){
                countList.set(2, countList.get(2

                ) + 1);
            }
        }

        for (int i = 0; i < count.length; i++) {
            System.out.println(count[i] + " ");
        }


        return answer;
    }

    public static void main(String[] args) {
        int[] answers = {1,2,3,4,5};
        solution(answers);
    }
}
