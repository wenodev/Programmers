package godo;

import java.util.*;

public class Test3 {
    public static int solution(String s, int n){

        Map<Character, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);

            if (map.containsKey(temp)){
                map.put(temp, map.get(temp) + 1);
            }else{
                map.put(temp, 1);
            }
        }

        for(Integer num : map.values()){
            list.add(num);
        }

        Collections.sort(list);

        while (n>0){
            if (n <= list.get(0)){
                int temp = list.get(list.size()-1);
                list.set(list.size()-1, list.get(list.size()-1)-n);
                n = n - temp;
            }else{
                n = n - list.get(0);
                list.remove(0);
            }
        }

        list.remove((Integer)0);

        if (list.size() == 1){
            return 0;
        }else{
            return Collections.max(list) - Collections.min(list);
        }

    }

    public static void main(String[] args) {
        String s = "aaaabbbbcccccccdddd";
        int n = 2;
        System.out.println(solution(s, n));

    }
}
