package 라인테스트;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        int[] ball = {1, 2, 3, 4, 5, 6};
        int[] order = {6, 2, 5, 1, 4, 3};

        Solution(ball, order);
    }

    private static void Solution(int[] ball, int[] order) {

        int p1 = 0;
        int p2 = order.length-1;
        int[] answer = new int[order.length];
        List<Integer> tempList = new ArrayList<>();


        int i=0;
        while(i < order.length){


            for(int j=0; j<tempList.size(); j++){
                if (order[i] == tempList.get(j)){
                    answer[i] = tempList.get(j);
                    tempList.remove(j);
                    i++;
                }
            }


            if(order[i] == ball[p1]){
                answer[i] = order[i];
                i++;
                p1++;
            }else if(order[i] == ball[p2]){
                answer[i] = order[i];
                i++;
                p2--;
            }else{
                tempList.add(ball[i]);
            }
        }

        for(int num : answer){
            System.out.println("num : " + num);
        }


    }
}
