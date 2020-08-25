package 프로그래머스;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 미완료
public class 더맵게 {
    public static void main(String[] args) {

        int[] scoville = new int[]{1, 2, 3, 4, 10, 11, 12, 13, 14, 16};
        int K = 1000;

//        int[] scoville = new int[]{1, 2, 3, 9, 10, 12};
//        int K = 7;

        Solution(scoville, K);

    }

    public static int Solution(int[] scoville, int K) {
        int answer = 0;


        //array -> List변환환
        List<Integer> intList = new ArrayList<>();
        for(int num : scoville){
            intList.add(num);
        }

        Collections.sort(intList);


        while(true){
            Collections.sort(intList);

            //출력
            intList.forEach(num -> {
                System.out.print(num + " ");
            });
            System.out.println();


            //리스트의 모든 값이
            if(intList.get(0) >= K){
                break;
            }

            if(intList.size() < 2){
                answer = -1;
                break;
            }

            int line = intList.get(0) + (intList.get(1)*2);
            intList.add(line);
            intList.remove(0);
            intList.remove(0);
            answer++;
        }

        System.out.println(answer);
        return answer;
    }
}