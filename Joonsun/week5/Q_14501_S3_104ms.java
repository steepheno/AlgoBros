package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_14501_S3_104ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 입력
        int N = Integer.parseInt(br.readLine());  // 남은 근무일수
        int[] time = new int[N];
        int[] pay = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            time[i] = Integer.parseInt(st.nextToken());  // 상담 소요시간
            pay[i] = Integer.parseInt(st.nextToken());  // 상담 수익
        }

        // 수익 계산
        int[] dp = new int[N + 1];

        for (int i = 0; i < N; i++) {
            if (i + time[i] <= N) {
                dp[i + time[i]] = Math.max(dp[i + time[i]], dp[i] + pay[i]);
            }
            dp[i + 1] = Math.max(dp[i + 1], dp[i]);
        }

        // 출력
        System.out.println(dp[N]);
        br.close();

    }  // end main
}  // end class

/*
 * 남은 근무일수 동안 최대의 수익을 내는 상담 일정 찾기
 * <입력>
 * 1 <= N <= 15  (남은 근무일수)
 * T_i -> 상담 소요시간
 * P_i -> 상담에 따른 수익
 */