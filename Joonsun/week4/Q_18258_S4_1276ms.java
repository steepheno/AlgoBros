package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Q_18258_S4_1276ms {
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
                    else sb.append(deque.getFirst()).append("\n");
                    break;

                case "back":
                    if (deque.isEmpty()) {
                        sb.append(-1).append("\n");
                    }
                    else sb.append(deque.getLast()).append("\n");
                    break;
            }
        }

        System.out.println(sb);
        br.close();

    }  // end main
}  // end class
