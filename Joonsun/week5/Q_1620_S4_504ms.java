package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q_1620_S4_504ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // 입력
        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 포켓몬 이름 저장
        HashMap<Integer, String> strMap = new HashMap<>();
        HashMap<String, Integer> intMap = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            strMap.put(i, name);
            intMap.put(name, i);
        }

        // 포켓몬 출력
        for (int i = 0; i < M; i++) {
            String name = br.readLine();

            // 포켓몬 이름 or 번호 판별
            if (49 <= name.charAt(0) && name.charAt(0) <= 57) {  // 아스키 코드 판별 -> '1' == 49, '9' == 57
                sb.append(strMap.get(Integer.parseInt(name))).append("\n");
            }
            else {
                sb.append(intMap.get(name)).append("\n");
            }
        }

        // 출력
        System.out.println(sb);
        br.close();

    }  // end main
}  // end class

/*
 * <포켓몬 맞히기>
 * 숫자가 들어오면 해당 포켓몬 이름을,
 * 이름이 들어오면 해당 포켓몬 숫자를 출력
 *
 * 해시맵에 N개의 포켓몬 정보 저장  (1 <= N, M <= 100,000)
 * 맞혀야 하는 M개의 포켓몬 정보에 따라 탐색 후 출력
 * 이름 길이: 2 ~ 20
 */

/*
 * <시행착오> - Map 하나만 생성해서 for문으로 찾으려 했음
 * // 입력 부분 생략
        // 포켓몬 이름 저장
        HashMap<Integer, String> map = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            map.put(i, name);
        }

        // 포켓몬 출력
        for (int i = 0; i < M; i++) {
            String input = br.readLine();

        }

        // 출력 부분 생략
 */