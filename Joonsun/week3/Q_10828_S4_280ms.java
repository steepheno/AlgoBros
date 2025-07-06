package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q_10828_S4_280ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // Stack 선언
        Stack<Integer> stack = new Stack<>();

        // 입력
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String command = st.nextToken();
            int n;

            switch(command) {
                case "push":
                    n = Integer.parseInt(st.nextToken());
                    stack.push(n);
                    break;

                case "pop":
                    if (!stack.isEmpty()) {
                        System.out.println(stack.pop());
                    }
                    else System.out.println(-1);
                    break;

                case "size":
                    System.out.println(stack.size());
                    break;

                case "empty":
                    if (stack.empty()) {
                        System.out.println(1);
                    }
                    else System.out.println(0);
                    break;

                case "top":
                    if (stack.isEmpty()) {
                        System.out.println(-1);
                    }
                    else System.out.println(stack.peek());
                    break;
            }
        }

        br.close();

    }  // end main
}  // end class

/*
 * Stack 활용해서 입력 조건에 맞는 출력값 생성하기
 * push, pop, size, empty, top 5개 명령어
 * 1 <= N <= 100,000
 */