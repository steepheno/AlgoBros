package 몸풀기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2739_B5_104ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 9; i++) {
            sb.append(N).append(" ").append("*").append(" ").append(i).append(" ").append("=").append(" ").append(N * i).append("\n");
        }
        System.out.println(sb);
        br.close();

    }  // end main
}  // end class

/*
 * 구구단
 * N 입력받고 N단 출력
 */