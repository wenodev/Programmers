package 라인테스트;

public class Test2 {
    public static void main(String[] args) {
        int n = 73425;
        Solution(n);
    }

    private static void Solution(int n) {
        Integer N = n;
        String number = N.toString();
        System.out.println(number);
        int count = 0;
        String front = "";
        String back = "";
        int frontNumber = 0;
        int backNumber = 0;
        int tempNumber = 0;
        int ccc=0;

        while(number.length() != 1){

            count = number.length()/2;

            front = number.substring(0,count);
            back = number.substring(count);

            frontNumber = Integer.parseInt(front);
            backNumber = Integer.parseInt(back);

            tempNumber = frontNumber + backNumber;
            number = Integer.toString(tempNumber);

            ccc++;
            System.out.println("ccc : " + ccc);
            System.out.println("front : " + front);
            System.out.println("back : " + back);
            System.out.println("number : " + number);

        }


//        System.out.println("ccc : " + ccc);
//        System.out.println("number : " + number);

    }
}
