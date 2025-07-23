package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2839_S4_128ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;  // 필요한 봉지 개수

        // 필요한 봉지 개수 세기
        while (N > 0) {
            // 5의 배수인 경우 (5kg 봉지만 사용)
            if (N % 5 == 0) {
                cnt += N / 5;
                break;
            }

            // 5kg로 넣다가 3kg에도 넣어서 배달하는 경우
            else {
                N -= 3;
                cnt++;
            }

            if (N < 0) {
                cnt = -1;
            }
        }

        System.out.println(cnt);
        br.close();

    }  // end main
}  // end class

/*
 * 설탕 공장에서 설탕 배달
 * 3kg, 5kg 봉지가 있으며, 정확하게 배달해야 함
 * 그 때 필요한 봉지 개수를 출력
 * 배달 불가 시 -1 출력
 */