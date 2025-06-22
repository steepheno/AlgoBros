package 몸풀기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_1330_B5_104ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 숫자 입력
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        // A와 B 대소 비교
        if (A > B) {
            sb.append(">");
        }
        else if (A < B) {
            sb.append("<");
        }
        else {
            sb.append("==");
        }

        System.out.println(sb);
        br.close();

    }  // end main
}  // end class

/*
 * A와 B 대소 비교
 * -10000 <= A, B <= 10000
 */