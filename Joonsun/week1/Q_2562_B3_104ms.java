package 몸풀기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_2562_B3_104ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // 정수 배열 만들고 입력받기
        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 최댓값 찾기
        int arrMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arrMax) {
                arrMax = arr[i];
            }
        }

        // 인덱스 찾기
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arrMax) {
                idx = i + 1;
                break;
            }
        }
        sb.append(arrMax).append("\n").append(idx);

        System.out.println(sb);
        br.close();

    }  // end main
}  // end class
