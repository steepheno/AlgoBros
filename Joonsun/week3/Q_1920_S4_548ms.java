package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Q_1920_S4_548ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // 입력 - N과 배열 A
        int N = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>();

        // A 배열 값 채우기
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        // M 입력
        int M = Integer.parseInt(br.readLine());

        // 값 비교
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (set.contains(num)) sb.append(1).append("\n");
            else sb.append(0).append("\n");
        }

        // 출력
        System.out.println(sb);
        br.close();

    }  // end main
}  // end class

/*
 * N이 주어지고, 그 다음줄에 A의 원소들이 N개만큼 주어짐
 * M이 주어지면, 그 다음줄에 M개의 숫자들이 주어짐
 * M개의 숫자들이 A에 있는지 확인
 * 있으면 1, 없으면 0 출력
 *
 * 1 <= N <= 100,000
 * 1 <= M <= 100,000
 * 2^(-31) <= 모든 정수 <= 2^(31)
 */