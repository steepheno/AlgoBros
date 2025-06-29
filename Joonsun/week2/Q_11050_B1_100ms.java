package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_11050_B1_재귀_100ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int ans = factorial(N) / (factorial(K) * factorial(N - K));

        System.out.println(ans);
        br.close();

    }  // end main

    private static int factorial(int n) {
        // 기저 조건
        if (n < 1) return 1;

        // 재귀
        return n * factorial(n - 1);
    }
}  //  end class

/*
 * 이항계수 계산
 * 1 <= N <= 10
 * 0 <= K <= N
 */