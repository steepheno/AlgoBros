package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_1018_S4_124ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 입력
        st = new StringTokenizer(br.readLine(), " ");
        int row = Integer.parseInt(st.nextToken());  // N
        int col = Integer.parseInt(st.nextToken());  // M

        // 체스판 생성
        String[] inputBoard = new String[row];  // 입력값으로 만들 판
        String[] Wboard = new String[8];  // Wboard[0][0] = W인 보드
        String[] Bboard = new String[8];  // Bboard[0][0] = B인 보드

        // inputBoard에 입력값 저장
        for (int i = 0; i < row; i++) {
            inputBoard[i] = br.readLine();
        }

        // Wboard 생성
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                Wboard[i] = "WBWBWBWB";
            }
            else {
                Wboard[i] = "BWBWBWBW";
            }
        }

        // Bboard 생성
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                Bboard[i] = "BWBWBWBW";
            }
            else {
                Bboard[i] = "WBWBWBWB";
            }
        }

        // 보드 비교
        int min = 64;  // 다시 칠해야 하는 최대 횟수

        for (int i = 0; i < row - 7; i++) {
            for (int j = 0; j < col - 7; j++) {
                int Wcnt = 0;
                int Bcnt = 0;
                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {
                        if (Wboard[k].charAt(l) != inputBoard[k + i].charAt(l + j)) {
                            Wcnt++;
                        }
                        if (Bboard[k].charAt(l) != inputBoard[k + i].charAt(l + j)) {
                            Bcnt++;
                        }
                    }
                }
                min = Math.min(min, Math.min(Wcnt, Bcnt));
            }
        }
        System.out.println(min);
        br.close();

    }  // end main
}  // end class

/*
 * 다시 칠해야 하는 체스판 칸 수의 최솟값 구하기
 * 검정색(B)과 흰색(W)이 번갈아가며 나와야 함
 * 8 <= N, M <= 50
 */