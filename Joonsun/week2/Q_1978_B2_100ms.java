package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_1978_B2_100ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int cnt = 0;

        // 입력
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            int inputValue = Integer.parseInt(st.nextToken());

            // 소수 처리 함수
            if (isPrime(inputValue)) {
                cnt++;
            };
        }  // end Test Case
        System.out.println(cnt);

        br.close();

    }  // end main

    public static boolean isPrime(int inputValue) {
        // 1 처리 (소수 X)
        if (inputValue == 1) {
            return false;
        }

        // 2 처리 (소수 O)
        if (inputValue == 2) {
            return true;
        }

        // 나머지 inputValue 처리
        for (int i = 2; i < inputValue; i++) {
            if (inputValue % i == 0) {
                return false;
            }
        }
        return true;
    }
}  // end class

/*
 * 주어진 N개의 숫자 중 소수의 개수는?
 * N <= 100
 *
 * <소수>
 * 1과 자기 자신만을 약수로 갖는 숫자
 */