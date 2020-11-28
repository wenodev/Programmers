package 구름;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class 스택 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = br.readLine();
//        System.out.println("Hello Goorm! Your input is " + input);

        int max = Integer.parseInt(br.readLine());
        List<Integer> stackList = new LinkedList<>();

        


        for (int i = 0; i < max; i++) {
            int control = Integer.parseInt(br.readLine());

            switch (control){
                case 0 :
                    int num = Integer.parseInt(br.readLine());
                    stackList.add(num);
                    break;
                case 1:
                    if (stackList.size() >= 1) stackList.remove(stackList.size()-1);
                    break;
                default:
                    i = max;
                    break;
            }
        }

        for (int num : stackList){
            System.out.print(num + " ");
        }


    }
}
