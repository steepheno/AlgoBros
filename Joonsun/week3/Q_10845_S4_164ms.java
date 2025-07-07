package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Q_10845_S4_164ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        Deque<Integer> deque = new ArrayDeque<>();

        // 입력
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String command = st.nextToken();

            switch (command) {
                case "push":
                    int n = Integer.parseInt(st.nextToken());
                    deque.add(n);
                    break;

                case "pop":
                    if (deque.isEmpty()) {
                        sb.append(-1).append("\n");
                    }
                    else sb.append(deque.poll()).append("\n");
                    break;

                case "size":
                    sb.append(deque.size()).append("\n");
                    break;

                case "empty":
                    if (deque.isEmpty()) {
                        sb.append(1).append("\n");
                    }
                    else sb.append(0).append("\n");
                    break;

                case "front":
                    if (deque.isEmpty()) {
                        sb.append(-1).append("\n");
                    }
                    else sb.append(deque.peekFirst()).append("\n");
                    break;

                case "back":
                    if (deque.isEmpty()) {
                        sb.append(-1).append("\n");
                    }
                    else sb.append(deque.peekLast()).append("\n");
                    break;
            }
        }  // end for

        System.out.println(sb);
        br.close();

    }  // end main
}  // end class

/*
 * Queue 자료구조를 만들어서 입력에 따른 결과값 출력하기
 * 입력에는 push, pop, size, empty, front, back 5가지 경우가 있음
 * 1 <= N <= 10,000
 */