package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_2563_S5_108ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 도화지 초기화
        boolean[][] paper = new boolean[100][100];  // 아무것도 칠하지 않은 도화지

        // 입력
        int N = Integer.parseInt(br.readLine());  // 색칠할 색종이 개수

        int loop = 0;
        while (loop < N) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            // 색종이 색칠하기
            for (int i = x; i < x + 10; i++) {
                for (int j = y; j < y + 10; j++) {
                    paper[i][j] = true;
                }
            }
            loop++;  // 다음 색종이 색칠하는 과정으로 넘어가기 위한 변수값 증가
        }

        // 결과 출력
        int square = 0;

        // 색종이 넓이 계산
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (paper[i][j]) {
                    square++;
                }
            }
        }

        System.out.println(square);
        br.close();

    }  // end main
}  // end class

/*
 * 색종이를 색칠할 100 * 100 도화지 boolean 형태로 생성 (전혀 색칠되지 않았다는 의미)
 * 색종이를 붙일 좌표값 입력받고 해당되는 영역을 true로 변경
 * 겹치더라도 true로 칠해짐
 *
 * 'true의 개수 == 넓이'이므로 결과 출력
 */