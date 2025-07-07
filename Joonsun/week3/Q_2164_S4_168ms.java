package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Q_2164_S4_168ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 원소 추가
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        // 연산 시작
        while (queue.size() > 1) {
            queue.poll();  // 가장 앞에 있는 원소 제거
            queue.offer(queue.poll());  // 가장 앞에 있는 원소 추가
        }
        System.out.println(queue.poll());


    }  // end main
}  // end class

/*
 * N장의 카드가 주어짐
 * 1) 맨 윗 장 카드 버림
 * 2) 그 다음 카드를 맨 아래로
 * 3) 카드가 1장 남을 때까지 반복
 *
 * 1 <= N <= 500,000
 */