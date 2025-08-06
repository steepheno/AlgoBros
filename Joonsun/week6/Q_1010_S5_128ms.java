package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_1010_S5_128ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());  // 서쪽, 0 < N <= M < 30
            int m = Integer.parseInt(st.nextToken());  // 동쪽, 0 < N <= M < 30

            result = combination(m, n);
            sb.append(result).append("\n");

        }  // end of Testcase
        System.out.print(sb);
        br.close();

    }  // end of main

    public static int combination(int m, int n) {
        // DP 테이블 생성
        int[][] dp = new int[m + 1][n + 1];

        // 기저 조건 (mC0 = 1, mCm = 1)
        for (int i = 0; i <= m; i++) {
            dp[i][0] = 1;  // iC0 = 1
            if (i <= n) {
                dp[i][i] = 1;
            }
        }

        // DP 점화식
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= Math.min(i, n); j++) {
                if (i == j) {
                    dp[i][j] = 1;
                }
                else {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                }
            }
        }

        return dp[m][n];
    }
}  // end of class
