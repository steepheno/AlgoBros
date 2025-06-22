package 몸풀기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

    public class Q_10952_B5_112ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if (A == 0 && B == 0)
                break;

            sb.append(A + B).append("\n");
        }

        System.out.println(sb);
        br.close();

    }  // end main
}  // end class

/*
 * A + B 구하기
 * 0 < A, B < 10
 * 마지막 입력값은 0 0
 */