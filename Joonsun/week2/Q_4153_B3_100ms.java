package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_4153_B3_100ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // 입력값 저장할 배열
        int[] arr = new int[3];

        while (true) {
            // 각 변 길이 입력
            st = new StringTokenizer(br.readLine(), " ");
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());

            // 배열 오름차순 정렬
            Arrays.sort(arr);

            // 종료 조건
            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0)
                break;

            // 출력
            if (arr[2] * arr[2] == arr[0] * arr[0] + arr[1] * arr[1]) {
                sb.append("right").append("\n");
            }
            else {
                sb.append("wrong").append("\n");
            }
        }
        System.out.println(sb);
        br.close();

    }  // end main
}  // end class
