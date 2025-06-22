package 몸풀기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_2675_B2_92ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            // 입력값
            st = new StringTokenizer(br.readLine(), " ");
            int R = Integer.parseInt(st.nextToken());  // 반복 횟수
            String S = st.nextToken();

            // 출력
            for (int j = 0; j < S.length(); j++) {
                int roop = R;  // 하나의 문자열 반복 출력할 횟수
                while (roop > 0) {
                    sb.append(S.charAt(j));
                    roop--;
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);
        br.close();

    }  // end main
}  // end class

/*
 * 문자열 S 입력받고, R번 반복 출력
 * 새 문자열 P를 만든다
 * 1 <= T <= 1000
 * 1 <= R <= 8
 * 1 <= S.length <= 20
 */