package class2;

import java.io.*;
import java.util.StringTokenizer;

public class Q_2609_B1_104ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // 입력
        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 최대공약수
        int gcd = 1;
        if (Math.max(N, M) % Math.min(N, M) == 0) {
            gcd = Math.min(N, M);
        }
        else {
            for (int i = 2; i < Math.max(N, M); i++) {
                if (N % i == 0 && M % i == 0) {
                    gcd = i;
                }
            }
        }

        // 최소공배수
        int lcm = (N * M) / gcd;


        sb.append(gcd).append("\n").append(lcm);
        System.out.println(sb);

        br.close();

    }  // end main
}  // end class

/*
 * 2개의 자연수를 입력받아서
 * 최대공약수, 최소공배수 출력
 * 10,000 이하의 두 자연수
 */