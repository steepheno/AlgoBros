package 몸풀기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_2884_B3_104ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 0시일 때
        if (H == 0 && M < 45) {
            H = 23;
            M += 15;
            sb.append(H).append(" ").append(M);
        }
        else if (H == 0 && M > 45) {
            M -= 45;
            sb.append(H).append(" ").append(M);
        }
        // 그 외 시간
        else if (H > 0 && M < 45) {
            H -= 1;
            M += 15;
            sb.append(H).append(" ").append(M);
        }
        else {
            M -= 45;
            sb.append(H).append(" ").append(M);
        }

        System.out.println(sb);
        br.close();

    }  // end main
}  // end class

/*
 * H(시간): 0 ~ 23
 * M(분): 0 ~ 59
 */