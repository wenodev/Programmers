package infra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test3 {

    public static void main(String[] args) {
        int N = 5;
        int[] array = {2, 3, 9, 4, 5};
        Solution(N, array);
    }

    public static void Solution(int N, int[] array) {

        int count = 0;
        List<Integer> answerList = new ArrayList<>();


        for (int i = 0; i < array.length; i++) {

            if (array[i] < array[i + 1]) {
                count++;
            } else {
                if (array[i] < array[i + 2]) {
                    i++;
                    count++;
                } else {
                    answerList.add(count);
                    count = 0;
                    break;
                }
            }
        }

        System.out.println(Collections.max(answerList));


    }

}
