package 쿠팡;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {
        solution(10);
    }

    public static void solution(int N){

        int fixNumber = N;

        List<Integer> integerList = new ArrayList<>();
        int[] number = new int[8];
        int[] max = new int[]{1,1,1,1,1,1,1,1};


        int answer1 = 0;
        int answer2 = 0;

        int[] answer = new int[2];



        for (int i=2; i<10; i++){

            System.out.println("===========");

            while(true){
                int num1 = N/i;
                int num2 = N%i;
                System.out.println("i : " + i );
                System.out.println("num1 : " + num1);
                System.out.println("num2 : " + num2);
                N = N/i;
                integerList.add(num2);
                if (N == 0) break;
            }



            for (int j=0; j<integerList.size(); j++){
                if (integerList.get(j) != 0){
                    max[i-2] *= integerList.get(j);
                }
            }

            System.out.println(i + " " + integerList + " " + max[i-2]);
            integerList.clear();

            N = fixNumber;

        }

        for (int i=0; i<max.length; i++){

            if(answer2 < max[i]){
                answer2 = max[i];
                answer1 = i;
            }
        }

        System.out.println("================");
        System.out.println("answer1 : " + answer1);
        System.out.println("answer2 : " + answer2);



    }

}
