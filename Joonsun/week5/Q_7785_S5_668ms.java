package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q_7785_S5_668ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        Set<String> set = new HashSet<>();

        // 입력
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            String commute = st.nextToken();

            // 출근 상태 == enter이면 배열에 추가
            if (commute.equals("enter")) {
                set.add(name);
            }

            // 퇴근 상태 체크
            if (commute.equals("leave")) {
                set.remove(name);
            }

        }

        // 정렬
        ArrayList<String> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());

        // 출력
        for (String name : list) {
            sb.append(name).append("\n");
        }

        System.out.println(sb);
        br.close();

    }  // end main
}  // end class

/*
 * 회사에 출입하는 사람들이 기록됨
 * 현재 회사에 있는 사람 이름을 사전 역순으로 출력
 * 출/퇴근 로그 수 n
 * 2 < n < 1,000,000
 */