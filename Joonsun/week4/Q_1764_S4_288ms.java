package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q_1764_S4_288ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        Map<String, Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();  // 듣보잡 명단 저장용

        // 입력
        int N = Integer.parseInt(st.nextToken());  // 듣도 명단 수
        int M = Integer.parseInt(st.nextToken());  // 보도 명단 수

        // 듣도 명단 map에 입력
        for (int i = 0; i < N; i++) {
            String people = br.readLine();
            map.put(people, 1);
        }

        // 보도 명단 map에 입력하면서 중복 체크
        for (int i = 0; i < M; i++) {
            String people = br.readLine();
            map.put(people, map.getOrDefault(people, 0) + 1);

            // 중복 체크
            if (map.get(people) == 2) {
                result.add(people);
            }
        }

        // 사전 순 정렬
        Collections.sort(result);

        // 출력
        sb.append(result.size()).append("\n");

        for (String name : result) {
            sb.append(name).append("\n");
        }

        System.out.println(sb);
        br.close();

    }  // end main
}  // end class

/*
 * 듣도 명단 수 = N
 * 보도 명단 수 = M
 * 두 곳 모두에 포함되어 있다면 듣도보도
 * 듣도 명단, 보도 명단 각각에는 겹치는 이름 없음
 *
 * 이름은 20자 이하
 * N, M은 500,000 이하
 *
 * <출력>
 * 사전 순 정렬 (이걸 놓침)
 */