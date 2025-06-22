package 몸풀기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2438_B5_104ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 입력
        int N = Integer.parseInt(br.readLine());

        // 별찍기
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb);
        br.close();

    }  // end main
}  // end class

/*
 * 별찍기 1단계 문제 (기본형)
 * for문 2개 사용
 * 1 <= N <= 100
 */