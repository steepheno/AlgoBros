package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2292_B2_100ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        int N = Integer.parseInt(br.readLine());

        int cnt = 1;  // 통과하는 방 개수
        int sum = 1;  // 반복문 제어할 누적합 변수

        while (sum < N) {
            sum += 6 * cnt;
            cnt++;
        }

        System.out.println(cnt);
        br.close();

    }  // end main
}  // end class
