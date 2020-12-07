package 프로그래머스.완전탐색;

public class 네트워크3 {
    boolean visited[];
    int[][] data;

    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];
        data = computers;

        for(int i=0; i<n; i++) {
            if(!visited[i]) {
                answer++;
                dfs(i);
            }
        }
        return answer;
    }

    void dfs(int index) {
        if(visited[index]) {return;}
        visited[index] = true;

        for(int i=0; i<data[index].length; i++) {
            if(data[index][i] == 1) {
                dfs(i);
            }
        }

    }

    public static void main(String[] args) {

    }
}
