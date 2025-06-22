package 몸풀기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_10818_B2_476ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // 입력값 처리
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 최댓값, 최솟값 담을 변수 생성
        int maxValue = -987654321;
        int minValue = 987654321;

        // 값 찾기
        for (int i = 0; i < arr.length; i++) {
            // 최댓값
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
            // 최솟값
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        sb.append(minValue).append(" ").append(maxValue);
        System.out.println(sb);

        br.close();

    }  // end main
}  // end class
