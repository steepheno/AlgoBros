package 몸풀기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_8958_B2_116ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int score = 0;
            String str = br.readLine();
            int bonus = 1;  // 연속 정답 시 누적 증가량

            // 정답 여부 탐색
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'O') {
                    score += bonus;
                    bonus++;
                }
                else {
                    bonus = 1;
                }
            }
            sb.append(score).append("\n");
        }
        System.out.println(sb);
        br.close();

    }  // end main
}  // end class
