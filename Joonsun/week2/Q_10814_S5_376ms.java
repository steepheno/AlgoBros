package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_10814_S5_376ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        // 입력되는 나이 범위
        StringBuilder[] arr = new StringBuilder[201];  // 1~200 인덱스만 사용

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new StringBuilder();
        }

        // arr[age]번째에 순서대로 나이와 이름 이어붙이기
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            // 카운팅 정렬
            arr[age].append(age).append(" ").append(name).append("\n");
        }

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (StringBuilder ans : arr) {
            sb.append(ans);
        }

        System.out.println(sb);
        br.close();

    }  // end main
}  // end class

/*
 * N명의 회원 정보 정렬하기
 * 나이 - 이름 순서로 입력받음
 * 나이 순서로 오름차순 정렬, 나이 같으면 가입한 순서로
 * 입력 순서 = 가입 순서
 * 1 <= N <= 100,000
 * 1 <= 나이 <= 200
 */