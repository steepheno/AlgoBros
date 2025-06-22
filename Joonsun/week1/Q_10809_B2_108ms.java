package 몸풀기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_10809_B2_108ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        // 정답 출력할 배열 생성 및 초기화
        int[] wordIdx = new int[26];
        for (int i = 0; i < wordIdx.length; i++) {
            wordIdx[i] = -1;
        }

        // 각 알파벳이 처음 등장하는 위치 저장
        for (int i = 0; i < str.length(); i++) {
            if (wordIdx[str.charAt(i) - 97] > -1) {
                continue;
            }
            else {
                wordIdx[str.charAt(i) - 97] = i;
            }
        }

        // 출력
        for (int i = 0; i < 25; i++) {
            sb.append(wordIdx[i]).append(" ");
        }
        sb.append(wordIdx[25]);
        System.out.println(sb);

        br.close();

    }  // end main
}  // end class
