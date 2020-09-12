package 월간코드챌린지;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test1 {
    public static void main(String[] args) {

        int[] numbers = {100,2,1,6,11,45,22,33};
        Solution(numbers);
    }

    private static int[] Solution(int[] numbers) {


        Set<Integer> treeSet = new TreeSet<>();

        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                System.out.println("i : " + i + " j : " + j);
                treeSet.add(numbers[i]+numbers[j]);
            }
        }


        int[] answer = new int[treeSet.size()];

        Iterator<Integer> iterator = treeSet.iterator();
        int count=0;
        while(iterator.hasNext()){
            answer[count] = iterator.next();
            count++;
        }


        return answer;


    }
}
