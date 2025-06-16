package 몸풀기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_3052_B2_108ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 결과값 저장할 배열 생성
        int[] rest = new int[10];  // 연산 결과 저장 배열
        boolean[] flag = new boolean[42];  // 등장 여부 체크 배열

        // 나머지 연산 결과 입력
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            rest[i] = num % 42;
        }

        // 등장 여부 체크
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            if (!flag[rest[i]]) {
                flag[rest[i]] = true;
                cnt++;
            }
            else {
                continue;
            }
        }

        System.out.println(cnt);
        br.close();

    }  // end main
}  // end class

/*
 * 숫자 10개 입력받고
 * 42로 나눈 나머지들 중 서로 다른 개수를 찾는다.
 */