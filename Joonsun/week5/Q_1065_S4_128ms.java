package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_1065_S4_128ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /* 입력 */
        int N = Integer.parseInt(br.readLine());

        /* 한수 찾기 */
        int hansu = 0;

        // 1. 한자리 숫자와 두자리 숫자는 모두 한수
        if (N < 100) {
            hansu = N;
        }

        else if (N == 1000) {
            hansu = 144;
        }

        // 2. 세자리 숫자 -> 계산 필요
        else {
            hansu = 99;
            int i = 100;
            int[] arr = new int[3];

            while (i <= N) {
                // 각 자릿수 arr 배열에 저장
                arr[0] = i / 100;
                arr[1] = (i % 100) / 10;
                arr[2] = (i % 100) % 10;

                if (arr[2] - arr[1] == arr[1] - arr[0]) {
                    hansu++;
                }
                i++;
            }
        }

        System.out.println(hansu);
        br.close();

    }  // end main
}  // end class

/*
 * <한수>
 * 각 자릿수가 등차수열로 이루어진 숫자
 *
 * 1 ~ 1000 사이의 N이 주어졌을 때
 * 1 이상 N 이하인 한수의 개수?
 */