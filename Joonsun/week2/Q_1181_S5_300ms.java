package class2;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Q_1181_S5_300ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];  // 입력받은 문자열 저장 배열

        // 입력
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        // 정렬
        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String s1, String s2) {
                // 단어 길이가 같으면
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                else {
                    return s1.length() - s2.length();
                }
            }
        });

        sb.append(arr[0]).append("\n");

        // 중복되지 않는 단어만 출력
        for (int i = 1; i < N; i++) {
            if (!arr[i].equals(arr[i - 1])) {
                sb.append(arr[i]).append("\n");
            }
        }

        System.out.println(sb);
        br.close();

    }  // end main
}  // end class

/*
 * 소문자로 이루어진 N개의 단어를 다음 조건에 따라 정렬
 * 1) 길이가 짧은 것부터
 * 2) 길이가 같으면 사전 순으로
 * 3) 중복되는 단어는 1개만 남기고 제거
 *
 * 1 <= N <= 20,000
 * 문자열 길이는 50 이하
 */