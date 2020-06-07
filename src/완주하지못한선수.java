import java.util.HashMap;
import java.util.Map;

public class 완주하지못한선수 {

    public static void main(String[] args) {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa","filipa","marina",  "nikola"};

        solution(participant, completion);
    }

    public static String solution(String[] participant, String[] completion) {
        final String[] result = {""};
        Map<String , Integer> resultMap = new HashMap<>();

        for(int i=0; i<participant.length; i++){

            if(resultMap.containsKey(participant[i])){
                int tempNumber = resultMap.get(participant[i]);
                resultMap.put(participant[i], tempNumber+1);
            }else{
                resultMap.put(participant[i], 1);
            }
        }

        for(int i=0; i<completion.length; i++){
            int tempNumber = resultMap.get(completion[i]);
            resultMap.put(completion[i], tempNumber-1);
        }

        System.out.println(resultMap);

        resultMap.forEach((key, value) -> {
            if(value == 1){
                result[0] = key;
            }
        });

        return result[0];


    }
}