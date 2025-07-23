package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Q_10866_S4_168ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        Deque<Integer> deque = new ArrayDeque<>();

        // 입력
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String str = st.nextToken();

            switch (str) {
                case "push_front":
                    int pf = Integer.parseInt(st.nextToken());
                    deque.addFirst(pf);
                    break;

                case "push_back":
                    int pb = Integer.parseInt(st.nextToken());
                    deque.addLast(pb);
                    break;

                case "pop_front":
                    if (deque.isEmpty()) {
                        sb.append(-1).append("\n");
                    }
                    else sb.append(deque.pollFirst()).append("\n");
                    break;

                case "pop_back":
                    if (deque.isEmpty()) {
                        sb.append(-1).append("\n");
                    }
                    else sb.append(deque.pollLast()).append("\n");
                    break;

                case "size":
                    sb.append(deque.size()).append("\n");
                    break;

                case "empty":
                    if (deque.isEmpty()) sb.append(1).append("\n");
                    else sb.append(0).append("\n");
                    break;

                case "front":
                    if (deque.isEmpty()) sb.append("-1").append("\n");
                    else sb.append(deque.peekFirst()).append("\n");
                    break;

                case "back":
                    if (deque.isEmpty()) sb.append("-1").append("\n");
                    else sb.append(deque.peekLast()).append("\n");
                    break;
            }


        }

        System.out.println(sb);
        br.close();

    }  // end main
}  // end class

/*
 * Deque 활용
 * 입력값에 따라 명령문 실행
 * 1 <= N <= 10,000
 * 주어지는 정수 범위 -> 1 ~ 100,000
 */