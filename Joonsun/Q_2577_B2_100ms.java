package 몸풀기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_2577_B2_100ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // 숫자 3개 입력
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        // 크기 10인 배열 생성 -> 등장한 숫자 횟수 기록용
        int[] arr = new int[10];

        // 연산한 숫자를 String으로 저장하기
        String numToStr = String.valueOf(A * B * C);

        for (int i = 0; i < numToStr.length(); i++) {
            arr[numToStr.charAt(i) - '0']++;
        }

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append("\n");
        }

        System.out.println(sb);
        br.close();

    }  // end main
}  // end class
