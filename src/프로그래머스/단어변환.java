package 프로그래머스;

import java.util.LinkedList;
import java.util.Queue;

public class 단어변환 {

    static class Node {
        String next;
        int edge;

        public Node(String next, int edge) {
            this.next = next;
            this.edge = edge;
        }
    }

    static boolean isNext(String str1, String str2) {
        int cnt = 0;
        for (int i=0; i<str2.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                cnt++;
                if (cnt > 1){
                    return false;
                }
            }
        }

        return true;
    }


    //git test


    public static int solution(String begin, String target, String[] words) {
        int n = words.length;
        int ans = 0;

        Queue<Node> q = new LinkedList<>();


        boolean[] visit = new boolean[n];
        q.add(new Node(begin, 0));

        while(!q.isEmpty()) {
            Node cur = q.poll();
            System.out.println("cur : " + cur.next);
            if (cur.next.equals(target)) {
                ans = cur.edge;
                break;
            }

            for (int i=0; i<n; i++) {
                if (!visit[i] && isNext(cur.next, words[i])) {
                    visit[i] = true;
                    q.add(new Node(words[i], cur.edge + 1));
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};

        System.out.println(solution(begin, target, words));

    }


}
