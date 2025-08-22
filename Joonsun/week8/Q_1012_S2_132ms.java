package DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_1012_S2_132ms {
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static int row;
    static int col;
    static int product;
    static int ans;

    static int[][] ground;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // 입력
        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++) {
            // 입력
            st = new StringTokenizer(br.readLine(), " ");
            col = Integer.parseInt(st.nextToken());      // 밭 가로 (열)
            row = Integer.parseInt(st.nextToken());      // 밭 세로 (행)
            product = Integer.parseInt(st.nextToken());  // 심어진 배추 개수
            ans = 0;

            // 밭
            ground = new int[row][col];
            visited = new boolean[row][col];

            // 배추 심기
            for (int j = 0; j < product; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                int y = Integer.parseInt(st.nextToken());
                int x = Integer.parseInt(st.nextToken());
                ground[x][y] = 1;
            }

            // 탐색
            for (int r = 0; r < row; r++) {
                for (int c = 0; c < col; c++) {
                    if (!visited[r][c] && ground[r][c] == 1) {
                        dfs(r, c);
                        ans++;
                    }
                }
            }
            sb.append(ans).append("\n");
        }

        System.out.println(sb);
        br.close();

    }  // end main

    public static void dfs(int x, int y) {
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int nr = x + dr[i];
            int nc = y + dc[i];

            // 범위 벗어나면 건너뜀
            if (nr < 0 || nc < 0 || nr >= row || nc >= col) continue;

            // 방문쳌
            if (!visited[nr][nc] && ground[nr][nc] == 1) {
                dfs(nr, nc);
            }
        }
    }
}  // end class
