package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_1193_S5_100ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 입력
        int N = Integer.parseInt(br.readLine());
        int line = 1;

        // 몇 번째 대각선에 속하는지 탐색
        while (N > line) {
            N -= line;
            line++;
        }

        // 짝수 번째 대각선이면
        if (line % 2 == 0) {
            // 좌하 -> 우상 방향 대각선
            sb.append(N).append("/").append(line - N + 1);
        }

        // 홀수 번째 대각선이면
        else {
            sb.append(line - N + 1).append("/").append(N);
        }

        System.out.println(sb);
        br.close();

    }  // end main
}  // end class

/*
 * 분수 찾기
 * 처음 주어지는 입력값 범위 : 1 ~ 1천만
 *
 * 몇 번째 대각선인지에 따라 규칙이 다름
 * 홀수 번째 -> 위 ~ 아래
 * 짝수 번째 ->
 */