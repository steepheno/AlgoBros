package 몸풀기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_10869_B5_108ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // 입력
        st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        // 출력
        sb.append(A+B).append("\n").append(A-B).append("\n").append(A*B)
                .append("\n").append(A/B).append("\n").append(A%B).append("\n");

        System.out.println(sb);
    }  // end main
}  // end class
