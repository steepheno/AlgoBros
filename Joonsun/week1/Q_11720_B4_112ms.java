package 몸풀기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_11720_B4_112ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int[] arr = new int[str.length()];

        // 합 계산
        int sum = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = str.charAt(i) - '0';
            sum += arr[i];
        }
        System.out.println(sum);

    }  // end main
}  // end class
