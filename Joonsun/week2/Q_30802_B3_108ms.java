package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_30802_B3_108ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // 참가자 수
        int N = Integer.parseInt(br.readLine());

        // 티셔츠 사이즈별 신청자 수
        int[] size = new int[6];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 6; i++) {
            size[i] = Integer.parseInt(st.nextToken());
        }

        // 펜 신청
        st = new StringTokenizer(br.readLine(), " ");
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        // 티셔츠 묶음
        int shirtsCnt = 0;
        for (int i = 0; i < 6; i++) {
            if (size[i] == 0) {
                continue;
            }
            else if (size[i] % T == 0) {
                shirtsCnt += size[i] / T;
            }
            else {
                shirtsCnt += size[i] / T + 1;
            }
        }

        // 펜 묶음
        int penSet = N / P;
        int penCnt = N % P;

        // 출력
        sb.append(shirtsCnt).append("\n").append(penSet).append(" ").append(penCnt);

        System.out.println(sb);
        br.close();

    }  // end main
}  // end class

/*
 * 참가자들에게 티셔츠 1장, 펜 1자루가 들어 있는 웰컴키트 나눠줄 예정
 * 티셔츠(6종류) -> S, M, L, XL, XXL, XXXL / 같은 사이즈의 T장 묶음으로만 주문 가능
 * 펜(1종류) -> 묶음 or 낱개 주문 가능
 * 총 N명 참가
 * 티셔츠는 남아도 되지만 부족하면 안 되며, 신청한 사이즈대로 나눠줌
 * 펜은 남거나 부족해서도 안 되며, 참가자 수만큼 준비되어야 함
 *
 * <입력>
 * N (1 ~ 10억)
 * 사이즈별 신청자 수
 * T P  (2 <= T, P <= 10억)
 *
 * <출력>
 * 티셔츠 -> T장씩 몇 묶음?
 * 펜 -> P자루씩 몇 묶음?
 */