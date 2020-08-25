package 프로그래머스;

import java.util.Stack;

public class 주식가격 {

    public static void main(String[] args) {
        int[] prices = {9,1,2,6,3,7,5,7,3,2,1,1,3};
//        int[] prices = {1,2,3,2,3};

        solution(prices);
    }

    public static void solution(int[] prices) {

        int[] answer = new int[prices.length];

        for(int i=0; i<prices.length; i++){
            for(int j=i+1; j<prices.length; j++){

                if (prices[i] > prices[j]){
                    answer[i] = j-i;
                    break;
                }
            }
            if(answer[i] == 0){
                answer[i] = prices.length - i - 1;
            }
        }

        for(int num : answer){
            System.out.println(num);
        }

    }
}
