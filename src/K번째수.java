import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;

public class K번째수 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {
                {2, 5, 3}, {4, 4, 1}, {1, 7, 3}
        };
        Solution(array, commands);
    }

    public static void Solution(int[] array, int[][] commands) {

        System.out.println(array.length);
        System.out.println(commands.length);

        List<Integer> resultArray = new ArrayList<>();
        int[] result = new int[commands.length];


        for(int i=0; i<commands.length; i++){
            int start = commands[i][0] - 1;
            int last = commands[i][1] - 1;
            int point = commands[i][2] - 1;

            for(int j=start; j<=last; j++){
                resultArray.add(array[j]);
            }

            Collections.sort(resultArray);

            result[i] = resultArray.get(point);
            resultArray.clear();
        }

        System.out.println("결과");
        for(int num : result){
            System.out.print(num + " ");
        }









    }



}
