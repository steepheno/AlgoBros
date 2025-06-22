package 몸풀기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_10250_B3_112ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int H = Integer.parseInt(st.nextToken());  // 층 수
            int W = Integer.parseInt(st.nextToken());  // 한 층에 있는 방 개수
            int N = Integer.parseInt(st.nextToken());  // n번째 손님

            // 층 결정
            int floor = (N % H == 0) ? H : N % H;
            sb.append(floor);

            // 호수 결정
            int room = (N % H == 0) ? N / H : (N / H) + 1;

            // 호수가 10보다 작으면 0 추가
            if (room < 10) {
                sb.append(0).append(room).append("\n");
            }
            else {
                sb.append(room).append("\n");
            }
        }

        System.out.println(sb);
        br.close();

    }  // end main
}  // end class

/*
 * 정문으로부터 걸어서 가장 짧은 거리에 있는 방 선호
 * 걷는 거리가 같다면 아래층 방 선호
 * 301호 > 102호 & 2101호 > 102호 (걷는 거리 짧으니까)
 * T = Test case 수
 * H = 호텔 층 수
 * W = 각 층의 방 수
 * N = n번째 손님
 *
 * 1 <= H, W <= 99
 * 1 <= N <= H * W
 */