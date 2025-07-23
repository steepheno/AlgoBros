package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Q_10816_S4_1056ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        Map<Integer, Integer> map = new HashMap<>();

        // 입력
        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 비교할 카드 개수
        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
             int target = Integer.parseInt(st.nextToken());
             sb.append(map.getOrDefault(target, 0)).append(" ");
        }

        System.out.println(sb);
        br.close();

    }  // end main
}  // end class

/*
 * 4번재 줄에 적힌 숫자카드 각각을 상근이는 몇 장씩 갖고 있는지 출력
 *
 * <입력>
 * 상근이가 갖고 있는 카드 수 (N)
 * 상근이가 갖고 있는 카드에 적힌 숫자
 * 비교 대상 카드 수 (M)
 * 비교 대상 카드에 적힌 숫자
 *
 * 1 <= N <= 500,000
 * 1 <= M <= 500,000
 * -10,000,000 <= 카드에 적힌 숫자 범위 <= 10,000,000
 */