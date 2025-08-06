package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q_17219_S4_592ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        HashMap<String, String> map = new HashMap<>();

        // 입력
        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            map.put(st.nextToken(), st.nextToken());
        }

        // 결과 출력
        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            if (map.containsKey(str)) {
                sb.append(map.get(str)).append("\n");
            }
        }

        System.out.println(sb);
        br.close();

    }  // end main
}  // end class

/*
 * 비밀번호 찾기
 * N개의 사이트와 비밀번호가 주어짐
 * N+2번째 줄부터 M개의 사이트가 주어지며, 이에 해당되는 비밀번호 출력
 * 1 <= N <= 100,000
 * 1 <= M <= 100,000
 */