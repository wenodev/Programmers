package 프로그래머스.카카오겨울인턴십2019;

import java.util.ArrayList;
import java.util.List;

public class 크레인인형뽑기게임 {

    public static void Solution(int[][] board, int[] moves){
        int count = 0;
        List<Integer> basketList = new ArrayList<>();

        for (int i=0; i<moves.length; i++){

            int pickedItem = 0;

            for (int j=0; j< board.length; j++){
                if(board[j][moves[i]-1] != 0){
                    pickedItem = board[j][moves[i]-1];
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }

            if (pickedItem != 0){
                basketList.add(pickedItem);
            }

            if (basketList.size() >= 2 && basketList.get(basketList.size()-1) == basketList.get(basketList.size()-2)){
                basketList.remove(basketList.size()-1);
                basketList.remove(basketList.size()-1);
                count += 2;
            }


        }

        System.out.println(count);

    }


    public static void main(String[] args) {

        int[][] board = new int[][]{
                {0,0,0,0,0},
                {0,0,1,0,3},
                {0,2,5,0,1},
                {4,2,4,4,2},
                {3,5,1,3,1}
        };

        int[] moves = {1,5,3,5,1,2,1,4};

        Solution(board, moves);

    }

}
