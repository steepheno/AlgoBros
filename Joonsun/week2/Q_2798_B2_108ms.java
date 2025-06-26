package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_2798_B2_108ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // N, M 입력
        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());  // 카드의 개수
        int M = Integer.parseInt(st.nextToken());  // 합계

        // 카드 숫자 입력
        int[] cards = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cards);

        // 조합 탐색
        int sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    int temp = cards[i] + cards[j] + cards[k];
                    if (temp > sum && temp <= M) {
                        sum = temp;
                    }
                }
            }
        }
        System.out.println(sum);


    }  // end main
}  // end class

/*
 * N장의 카드를 숫자가 보이도록 놓는다
 * 카드 3장을 뽑아서 숫자를 더한다.
 * 숫자의 합은 딜러가 외친 숫자 M 이하이면서 M과 가장 가까운 숫자이다
 * 합계 출력
 *
 * 3 <= N <= 100
 * 10 <= M <= 300,000
 */