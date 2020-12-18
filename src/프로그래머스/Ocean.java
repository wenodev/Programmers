package 프로그래머스;

public class Ocean {

    static void find(int[][] ocean, boolean[][] visited, int[] start) {
        int n1 = start[0];
        int n2 = start[1];
        visited[n1][n2] = true;

        if (n1 <= 3 && ocean[n1+1][n2] == 1 && !visited[n1+1][n2]){
            start[0] = n1+1;
            start[1] = n2;
            find(ocean, visited, start);
        }else if (n1 >= 1 && ocean[n1-1][n2] == 1 && !visited[n1-1][n2]){
            start[0] = n1-1;
            start[1] = n2;
            find(ocean, visited, start);
        } else if (n2 <= 3 && ocean[n1][n2+1] == 1 && !visited[n1][n2+1]){
            start[0] = n1;
            start[1] = n2+1;
            find(ocean, visited, start);
        }else if (n2 >= 1 && ocean[n1][n2-1] == 1 && !visited[n1][n2-1]){
            start[0] = n1;
            start[1] = n2-1;
            find(ocean, visited, start);
        }
    }

    public static int solution(int[][] ocean) {
        int answer = 0;
        int[] start = new int[2];

        boolean[][] visited = new boolean[ocean.length][ocean[0].length];

        for (int i = 0; i < ocean.length; i++) {
            for (int j = 0; j < ocean[0].length; j++) {
                if (ocean[i][j] == 1 && !visited[i][j]){
                    start[0] = i;
                    start[1] = j;
                    find(ocean, visited, start);
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] ocean = {
                {1, 1, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 1, 0, 0, 0},
                {1, 1, 0, 0, 1}
        };
        
        System.out.println(solution(ocean));

    }
}
