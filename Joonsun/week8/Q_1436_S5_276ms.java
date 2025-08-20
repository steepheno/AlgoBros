package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_1436_S5_276ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        int N = Integer.parseInt(br.readLine());

        int num = 666;
        int cnt = 1;

        while (cnt != N) {
            num++;
            if (String.valueOf(num).contains("666")) {
                cnt++;
            }
        }

        System.out.println(num);
        br.close();

    }  // end main
}  // end class

/*
 * 종말의 수 : 6이 적어도 3번 연속으로 들어가는 수
 * N번째 영화 제목에 들어가는 종말의 수 구하기
 * 1 <= N <= 10,000
 */