package 프로그래머스.스택큐;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 기능개발 {


    public static int[] solution(int[] progresses, int[] speeds){

        ArrayList<Integer> list = new ArrayList<>();

        int temp = 0;
        for (int i = 0; i < progresses.length; i++) {
            int current = (100 - progresses[i]) / speeds[i];
            if (temp < current) {
                temp = current;
                list.add(1);
            } else list.set(list.size() - 1, list.get(list.size() - 1) + 1);
        }

        System.out.println(list);

        return new int[5];



    }

    public static void main(String[] args) {
        int[] progresses = new int[]{95, 90, 99, 99, 80, 99};
        int[] speeds = new int[]{1, 1, 1, 1, 1, 1};
        solution(progresses, speeds);
    }

}
