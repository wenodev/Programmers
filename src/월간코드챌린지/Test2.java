//package 월간코드챌린지;
//
//public class Test2 {
//    public static void main(String[] args) {
//        Solution(5);
//    }
//
//    private static void Solution(int n) {
//
//        int sum = 0;
//        int[][] twoArray = new int[n][];
//        for(int i=1; i<=n; i++ ){
//            twoArray[i-1] = new int[i];
//            sum += twoArray[i-1].length;
//        }
//
//        System.out.println("sum : " + sum);
//
//        for (int num=0; num<sum; num++){
//            twoArray[0][0]
//            twoArray[1][0]
//            twoArray[2][0]
//            twoArray[3][0]
//            twoArray[4][0]
//            twoArray[4][1]
//            twoArray[4][2]
//            twoArray[4][3]
//            twoArray[4][4]
//            twoArray[3][3]
//            twoArray[2][2]
//            twoArray[1][1]
//            twoArray[2][1]
//            twoArray[3][1]
//        }
//
//        int i=0;
//        int j=0;
//        int num = 1;
//        int count = 1;
//
//        while (i < n) {
//            twoArray[i][j] = num;
//            i++; num++;
//        }
//        while (j < n ){
//            twoArray[i][j] = num;
//            j++; num++;
//        }
//
//        while (i >= count){
//            i--; j--;
//            twoArray[i][j] = num;
//            num++;
//            count++;
//        }
//
//
//
//
//    }
//}
