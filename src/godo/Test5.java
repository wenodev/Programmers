package godo;

public class Test5 {
    public static int solution(int[] votes){

        int count = 0;

        if (votes.length <= 1){
            return 0;
        }

        while(true){
            if (max(votes) == 0) break;
            votes[max(votes)]--;
            votes[0]++;
            count++;
        }

        return count;
    }

    public static int max(int[] votes){

        int max = votes[0];
        int maxIndex = 0;

        for (int i = 0; i < votes.length; i++) {
            if (max <= votes[i]){
                maxIndex = i;
                max = votes[i];
            }
        }
        return maxIndex;
    }


    public static void main(String[] args) {
        int[] votes = {5,10,7,3,8};
        solution(votes);
    }
}
