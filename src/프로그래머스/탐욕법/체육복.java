package 프로그래머스.탐욕법;

public class 체육복 {

    public static int solution(int n, int[] lost, int[] reserve){

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j] && lost[i] != 0){
                    lost[i]=0;
                    reserve[j]=0;
                }
            }
        }


        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i]+1 == reserve[j] && lost[i] != 0){
                    lost[i]=0;
                    reserve[j]=0;
                    break;
                }else if(lost[i]-1 == reserve[j] && reserve[j] != 0){
                    lost[i]=0;
                    reserve[j]=0;
                    break;
                }
            }
        }

        int count = 0;

        for (int i = 0; i < lost.length; i++) {
            if (lost[i] != 0) count++;
        }

        return n-count;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] lost = {0};
        int[] reserve ={1,2,3};

        System.out.println(solution(n, lost, reserve));
    }
}
