package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q_11866_S4_140ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Queue<Integer> queue = new ArrayDeque<>();

        // 입력
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        sb.append("<");

        // 원소 삽입
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        int cnt = 0;  // 몇 번째 원소인지 세는 용도
        while (queue.size() > 1) {
            int first = queue.poll();
            cnt++;

            if (cnt % K == 0) {  // 3번째마다 poll() 수행하는 주기 체크
                sb.append(first).append(", ");
            }
            else queue.add(first);
        }

        sb.append(queue.poll()).append(">");

        // 결과
        System.out.println(sb);
        br.close();

    }  // end main
}  // end class

/*
 * 1 <= K <= N <= 1,000
 * <요세푸스 순열>
 * 큐에 N만큼 원소를 삽입
 * 1) 맨 앞에 있는 원소를 빼서 그대로 맨 뒤로 삽입 (2번 반복)
 * 2) 이후 가장 앞에 있는 원소를 빼면서 값 출력 (3번째 턴에서)
 * 3) 큐에 원소가 1개 남을 때까지 1, 2번 반복
 *
 * 1개 원소가 남았다면 반복문 탈출, queue.poll() 수행 후 종료
 * 출력 조건에 맞게 > 붙여야 함
 */