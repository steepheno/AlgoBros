package DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q_2606_S3_100ms {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 입력
        int N = Integer.parseInt(br.readLine());  // 컴퓨터 수
        int conn = Integer.parseInt(br.readLine());  // 직접 연결되어 있는 컴퓨터 수

        // 그래프 생성
        graph = new ArrayList[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        // 그래프 값(컴퓨터 번호) 입력
        for (int i = 0; i < conn; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 연결
            graph[a].add(b);
            graph[b].add(a);
        }

        // 방문쳌
        visited = new boolean[N + 1];
        dfs(1);

        System.out.println(cnt - 1);  // 1번 컴퓨터 제외
        br.close();

    }  // end main

    public static void dfs(int n) {
        // 현재 노드
        visited[n] = true;
        cnt++;

        // 다음 노드 탐색 (재귀)
        for (int nextNode : graph[n]) {
            if (!visited[nextNode]) {
                dfs(nextNode);
            }
        }
    }
}  // end class
