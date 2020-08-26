package 프로그래머스.해시;

public class 전화번호목록 {
    public static void main(String[] args) {
//        String[] phone_book = {"119", "97674223", "1195524421"};
        String[] phone_book = {"123","456","789"};
//        String[] phone_book = {"12","123","1235","567","88"};

        System.out.println(Solution(phone_book));
    }

    public static boolean Solution(String[] phone_book) {
        boolean answer = true;

        loop:
        for(int i=0; i<phone_book.length; i++){
            System.out.print(i + " ");
            for (int j=i+1; j<phone_book.length; j++){
                int temp = phone_book[j].indexOf(phone_book[i]);
                if (temp == 0){

                    answer = false;
                    break loop;
                }
            }

        }

        return answer;

    }
}
