package 프로그래머스;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 모의고사 {

    //git test 0629

    public static void main(String[] args) {
        int[] answers = {1,5,1};
        Solution(answers);

    }

    public static int[] Solution(int[] answers){


        List<Integer> resultArray = new ArrayList<>();

        int[] firstArray = {1,2,3,4,5};
        int[] secondArray = {2,1,2,3,2,4,2,5};
        int[] thirdArray = {3,3,1,1,2,2,4,4,5,5};

        int[] count = new int[3];

        for(int i=0; i<answers.length; i++){
            System.out.println(firstArray[i%firstArray.length]);
            if(firstArray[i%firstArray.length] == answers[i]){
                count[0]++;
            }
        }

        for(int i=0; i<answers.length; i++){
            if(secondArray[i%firstArray.length] == answers[i]){
                count[1]++;
            }
        }

        for(int i=0; i<answers.length; i++){
            if(thirdArray[i%firstArray.length] == answers[i]){
                count[2]++;
            }
        }



        List<Integer> answerList = new ArrayList<>();
        answerList.add(count[0]);
        answerList.add(count[1]);
        answerList.add(count[2]);

        Collections.sort(answerList);


        for(int i=0; i<3; i++){
            if(answerList.get(2) == count[i]){
                resultArray.add(i+1);
            }
        }


        int[] answer = new int[resultArray.size()];

        for(int i=0; i<answer.length; i++){
            answer[i] = resultArray.get(i);
        }

        for(int i=0; i<answer.length; i++){
            System.out.println("answer : " + answer[i]);
        }



        return answer;


    }
}
