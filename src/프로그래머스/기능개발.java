package 프로그래머스;

import java.util.ArrayList;
import java.util.List;

public class 기능개발 {
    public static void main(String[] args) {
//        int[] progresses = {93,30,55};
//        int[] speeds = {1,30,5};

        int[] progresses = {55, 93, 30, 55};
        int[] speeds = {5, 1, 30, 5};
        Solution(progresses, speeds);
    }

    public static void Solution(int[] progresses, int[] speeds) {

        int[] middle = new int[progresses.length];
        List<Integer> arrayAnswer = new ArrayList<>();


        for (int i = 0; i < progresses.length; i++) {
            int temp = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] != 0) {
                temp++;
            }
            middle[i] = temp;
        }

        for (int i = 0; i < middle.length; i++) {

            for (int j = i + 1; j < middle.length; j++) {


                if (j == middle.length - 1) {
                    break;
                }


                if (middle[i] < middle[j]) {
                    System.out.println("i : " + i);
                    System.out.println("j : " + j);
                    arrayAnswer.add(j - i);
                    i = j - 1;
                    break;
                }



            }

        }


        System.out.println("==========");
        for (int num : arrayAnswer) {
            System.out.println(num);
        }


        int sum = 0;
        for (int i = 0; i < arrayAnswer.size(); i++) {
            sum += arrayAnswer.get(i);
        }

        if (sum != middle.length) {
            arrayAnswer.add(middle.length - sum);
        }

        int[] answer = new int[arrayAnswer.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrayAnswer.get(i);
        }


        System.out.println("==========");
        for (int num : answer) {
            System.out.println(num);
        }


    }


}
