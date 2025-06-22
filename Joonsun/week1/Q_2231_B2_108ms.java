package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2231_B2_108ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 자연수 N 입력
        int N = Integer.parseInt(br.readLine());
        int size = String.valueOf(N).length();  // N의 자릿수 저장
        int start = N - (9 * size);  // N의 생성자가 될 수 있는 최소 숫자 (반복 시작점)

        int answer = 0;  // 생성자

        for (int i = start; i < N; i++) {
            int sum = i;  // 생성자 판별을 위한 초기화
            int k = i;    // 자릿수 합

            while (k > 0) {
                sum += k % 10;  // 자릿수 합치는 공식
                k /= 10;  // 다음 자릿수 더하기 위한 k값 갱신
            }

            if (sum == N) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);

    }  // end main
}  // end class
