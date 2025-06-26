package class2;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_1546_B1_116ms {
    static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // 입력
        int N = Integer.parseInt(br.readLine());  // 과목 수
        st = new StringTokenizer(br.readLine(), " ");
        int[] scores = new int[N];

        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }

        // 현재 점수 중 최댓값 저장
        Arrays.sort(scores);
        M = scores[N - 1];

        // 새로운 점수 저장
        float[] newScoreArr = new float[N];
        for (int i = 0; i < N; i++) {
            newScoreArr[i] = newScore(scores[i]);
        }

        // 평균 계산
        float sum = 0;
        float divN = newScoreArr.length;  // 평균 계산을 위한 N (자료형 변환)
        for (int i = 0; i < N; i++) {
            sum += newScoreArr[i];
        }

        bw.write(String.valueOf(sum / divN));

        bw.flush();
        bw.close();
        br.close();

    }  // end main

    static float newScore(int score) {
        return (float) score / M * 100;
    }
}  // end class

/*
 * 점수 조작한 평균 구하기
 * 응시 과목 수 = N (1~1000)
 * 최고 점수 = M
 * 0 <= 점수 <= 100
 * 조작 방법 -> 현재점수 / M * 100
 */