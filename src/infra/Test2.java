package infra;

public class Test2 {

    public static void main(String[] args) {
        int N = 19, K = 3, A = 4, B = 2;
        Solution(N,K,A,B);
    }

    public static void Solution(int N, int K, int A, int B) {

        int Bcount=0;
        int Acount=0;
        int result=0;

        while(N != 1){

            if(N < K){
                Acount += N-1;
                break;
            }

            while(N%K != 0){
                N--;
                Acount++;
            }
            if( ((N-1)*A) < B){
                Acount += N-1;
                break;
            }else{
                N = N/K;
                Bcount++;
            }
        }

        result = (Acount*A) + (Bcount*B);



    }


}
