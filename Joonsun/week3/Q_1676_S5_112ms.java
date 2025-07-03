package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_1676_S5_112ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        int N = Integer.parseInt(br.readLine());

        // 0 개수 세기
        // 5의 배수일 때 +1씩 증가
        // 25의 배수일 때는 2개씩 증가
        int cnt = 0;
        while (N >= 5) {
            cnt += N / 5;
            N /= 5;
        }

        System.out.println(cnt);
        br.close();

    }  // end main
}  // end class

/*
 * N! 계산해서 0의 개수 구하기
 * 0 <= N <= 500
 */