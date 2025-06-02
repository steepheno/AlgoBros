package 몸풀기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_2525_B3_104ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // 현재 시간 입력
        st = new StringTokenizer(br.readLine(), " ");

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 요리 소요시간 입력
        int time = Integer.parseInt(br.readLine());

        // 출력 시간 최초 계산
        int time_h = h + (time / 60);
        int time_m = m + (time % 60);

        if ((time_m) >= 60) {
            time_h += time_m / 60;
            time_m %= 60;
        }

        // 자정 넘어갈 때 시간 처리
        if (time_h >= 24) {
            time_h %= 24;
        }

        sb.append(time_h).append(" ").append(time_m);
        System.out.println(sb);

        br.close();

    }  // end main
}  // end class

/*
 * h(시간): 0 <= h <= 23
 * m(분): 0 <= m <= 59
 *
*/

/* 실패 사례 */
//        if ((m + time) < 60) {
//            sb.append(h).append(" ").append(m + time);
//        }
//        else if ((m + time == 60)) {
//            sb.append(h + 1).append(" ").append(0);
//        }
//        else {
//            if ((time % 60) + time < 60) {
//                sb.append(h + (time / 60)).append(" ").append((time % 60) + time);
//            }
//        }
