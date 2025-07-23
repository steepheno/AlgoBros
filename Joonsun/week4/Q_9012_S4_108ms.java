package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_9012_S4_108ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 입력
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int left = 0;
            int right = 0;
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '(') {
                    left++;
                }
                else right++;

                // 여는 괄호 개수가 닫는 괄호 개수보다 작아진다면 무조건 No
                if (left < right) {
                    break;
                }
            }
            if (left == right) sb.append("YES").append("\n");
            else sb.append("NO").append("\n");
        }

        System.out.println(sb);
        br.close();

    }  // end main
}  // end class

/*
 * 괄호 문자열이 잘 완성되는지 판별
 * 잘 되어 있다면(VPS) YES 출력
 * 그렇지 않다면 NO 출력
 * 괄호 문자열 길이는 2 ~ 50
 */