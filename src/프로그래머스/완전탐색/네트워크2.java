package 프로그래머스.완전탐색;

import java.util.ArrayList;
import java.util.List;

public class 네트워크2 {
    static boolean[] visit;
    static List<Integer>[] list;
    static int free, group;

    public int solution(int n, int[][] computers) {
        list = new List[n];
        visit = new boolean[n];

        for (int i=0; i<n; i++)
            list[i] = new ArrayList<>();

        for (int i=0; i<n; i++) {
            int cnt = 0;
            for (int j=0; j<n; j++) {
                if (i != j && computers[i][j] == 1)
                    list[i].add(j);
                if (computers[i][j] == 1) cnt++;
            }
            if (cnt == 1) {
                visit[i] = true;
                free++;
            }
        }

        for (int i=0; i<n; i++) {
            if (!visit[i]) {
                dfs(i);
                group++;
            }
        }

        return free + group;
    }

    static void dfs(int com) {
        visit[com] = true;
        for (int i : list[com])
            if (!visit[i]) dfs(i);
    }

    public static void main(String[] args) {

    }

}
