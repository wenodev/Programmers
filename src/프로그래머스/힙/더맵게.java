package 프로그래머스.힙;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 더맵게 {
    public static void main(String[] args) {

        int[] scoville = new int[]{1, 2, 3, 9, 10, 12};
        int K = 7;

        System.out.println(Solution(scoville, K));
    }

    public static int Solution(int[] scoville, int K) {

        int answer = 0;
        int temp = 0;

        List<Integer> scovilleList = new ArrayList<>();
        for(int num : scoville){
            scovilleList.add(num);
        }

        for(int num : scovilleList){
            System.out.print(num + " ");
        }
        System.out.println();

        for(int i=0; i<scovilleList.size(); i++){

            if (scovilleList.get(0) >= K){
                break;
            }

            temp = scovilleList.remove(0) + (scovilleList.remove(0)*2);
            for(int j=0; j<scovilleList.size(); j++){
                if(temp < scovilleList.get(j)){
                    scovilleList.add(j,temp);
                    break;
                }
            }
            answer++;
        }

        System.out.println("K : " + K);
        System.out.println("섞은 회수 : " + answer);
        System.out.print("scovilleList : ");
        for (int i : scovilleList){
            System.out.print(i + " ");
        }
        System.out.println();


        if (scovilleList.size() == 1){
            if(K > scovilleList.get(0)){
                answer = -1;
                return answer;
            }
        }



        return answer;
    }
}