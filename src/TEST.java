import java.util.HashMap;
import java.util.Map;

public class TEST {

    public static void main(String[] args) {

        String[] arr1 = {"aaa", "bbb", "ccc", "aaa"};

        Map<String, Integer> map = new HashMap<>();

        for (String a : arr1){
            map.put(a, map.getOrDefault(a, 0) + 2);
        }

        System.out.println(map);


    }

}
