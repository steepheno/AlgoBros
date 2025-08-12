package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Q_15828_S4_372ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Queue<Integer> queue = new ArrayDeque<>();

        // 입력
        int N = Integer.parseInt(br.readLine());

        int input = -2;  // 입력값 종류가 아닌 정수로 임시 초기화
        while (input != -1) {
            input = Integer.parseInt(br.readLine());
            int size = queue.size();

            // 입력에 0이 들어왔으면 패킷 처리 완료
            if (input == 0) {
                queue.poll();
            }

            // 입력에 -1이 들어오면 반복문 탈출
            else if (input == -1) break;

            // 큐가 가득 차지 않았고, 입력에 -1, 0이 아닌 값이 들어왔을 때
            else if (queue.size() < N && input > 0) {
                queue.add(input);
            }
        }

        // 결과 출력
        if (queue.isEmpty()) {
            sb.append("empty");  // 큐가 비어 있다면 empty 출력
        }
        else {
            while (!queue.isEmpty()) {
                sb.append(queue.poll()).append(" ");
            }
        }

        System.out.println(sb);
        br.close();

    }  // end of main
}  // end of class

/*
 * 라우터 크기가 주어짐 (1 <= N <= 10만)
 * 정보의 수: 1 ~ 20만
 * 0이 들어오면 라우터가 패킷 하나를 처리함
 * -1은 입력의 끝을 의미
 * 버퍼가 비어있을 때는 입력이 0으로 들어오지 않음
 *
 * 라우터에 남아 있는 패킷을 공백을 이용하여 순서대로 출력
 * 비어 있다면 empty 출력
 */
