package godo;

public class Test1 {

    public static int solution(int[] goods){

       int answer = 0;
       int sum = 0;

        for (int i = 0; i < goods.length; i++) {

            if (goods[i] >= 50){
                answer += goods[i] - 10;
            }else{
                sum += goods[i];
            }
        }

        if (sum >= 50){
            answer += sum-10;
        }else{
            answer += sum;
        }

        return answer;

    }


    public static void main(String[] args) {
        int[] goods = {49,49,49};
        solution(goods);
    }
}
