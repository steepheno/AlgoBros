package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q_2108_S2_672ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        HashMap<Integer, Integer> map = new HashMap<>();

        // 입력
        int N = Integer.parseInt(br.readLine());
        int[] input = new int[N];

        // 최댓값 & 최솟값 찾기
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < input.length; i++) {
            input[i] = Integer.parseInt(br.readLine());
            sum += input[i];
            min = Math.min(min, input[i]);
            max = Math.max(max, input[i]);

            map.put(input[i], map.getOrDefault(input[i], 0) + 1);
        }

        // 정렬
        Arrays.sort(input);

        // 평균
        long avg = Math.round((double) sum / N);
        sb.append(avg).append("\n");

        // 중앙값
        int median = input[N / 2];
        sb.append(median).append("\n");

        // 최빈값
        int mode = 0;
        for (int num : map.values()) {
            mode = Math.max(mode, num);
        }

        List<Integer> modeList = new ArrayList<>();
        for (Integer key : map.keySet()) {
            if (map.get(key) == mode) {
                modeList.add(key);
            }
        }

        Collections.sort(modeList);

        if (modeList.size() == 1) {
            sb.append(modeList.get(0)).append("\n");
        }
        else {
            sb.append(modeList.get(1)).append("\n");
        }

        // 범위
        int range = max - min;
        sb.append(range);

        // 출력
        System.out.println(sb);
        br.close();

    }  // end main
}  // end class

/*
 * 입력값 개수 N이 주어지면 (1 <= N <= 500,000)
 * N개의 숫자에 대해 산술 평균, 중앙값, 최빈값, 범위 구하기
 *
 * <출력 조건>
 * 산술평균 - 소수 첫째 자리에서 반올림
 * 최빈값 - 여러 개가 있을 경우, 2번째로 작은 값 출력
 */