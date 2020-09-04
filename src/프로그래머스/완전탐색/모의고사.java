package 프로그래머스.완전탐색;



public class 모의고사 {

    public static void main(String[] args) {
        int[] answers = {1,5,1};
        Solution(answers);

    }

    public static int[] Solution(int[] answers){
        int[] count = new int[]{0,0,0};

        int[] person1 = new int[]{1, 2, 3, 4, 5};
        int[] person2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};



        for(int i=0; i<answers.length; i++){
            if (answers[i] == person1[i%person1.length]){
                count[0]++;
            }
        }

        System.out.println(count[0]);




        return count;


    }
}
