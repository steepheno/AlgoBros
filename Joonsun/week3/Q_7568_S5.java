package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_7568_S5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // 입력
        int N = Integer.parseInt(br.readLine());
        int[][] physical = new int[N][N];  // 덩치
        int[] rank = new int[N];    // 순위 저장

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            physical[0][i] = Integer.parseInt(st.nextToken());  // 몸무게
            physical[1][i] = Integer.parseInt(st.nextToken());  // 키
        }

        // 비교
        for (int i = 0; i < N; i++) {
            int bigger = 0;
            for (int j = 0; j < N; j++) {
                // 자기 자신과의 비교는 skip
                if (i == j) continue;

                // 덩치 비교
                if (physical[0][i] < physical[0][j] && physical[1][i] < physical[1][j]) {
                    bigger++;  // 나보다 덩치 크면 순위 +1
                }
            }
            rank[i] = bigger + 1;
            sb.append(rank[i]).append(" ");
        }

        System.out.println(sb);
        br.close();

    }  // end main
}  // end class

/*
 * 키와 몸무게로 덩치 판별
 * x = 몸무게, y = 키
 * 몸무게, 키 모두 다른 사람보다 커야 덩치가 크다고 말할 수 있음
 * 둘 중 하나만 크면 판별 불가, 공동 순위 매김
 *
 * <입력>
 * 2 <= N <= 50
 * 10 <= x, y <= 200
 *
 * <출력>
 * 각 Test case를 순위로
 */