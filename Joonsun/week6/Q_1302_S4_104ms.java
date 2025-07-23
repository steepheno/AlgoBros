package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Q_1302_S4_104ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap<>();

        // 입력
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            String title = br.readLine();

            // 이미 map에 있는 key라면
            if (map.containsKey(title)) {
                map.put(title, map.get(title) + 1);  // value만 1 추가
            }

            else {
                map.put(title, 1);
            }
        }

        // 출력
        ArrayList<String> titleList = new ArrayList<>();
        int maxValue = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int val = entry.getValue();

            // 가장 많이 팔린 책 등장 시
            if (val > maxValue) {
                maxValue = val;     // 최댓값 갱신
                titleList.clear();  // List 초기화
                titleList.add(entry.getKey());  // 새로운 key를 List에 추가
            }

            // 가장 많이 팔린 책 재등장 시
            else if (val == maxValue) {
                titleList.add(entry.getKey());  // List에 key 추가
            }
        }

        // 리스트 사전 순 정렬 후 출력
        if (titleList.size() > 1) {  // 공동 1등이 있다면
            Collections.sort(titleList);  // 사전 순 정렬
        }

        System.out.println(titleList.get(0));
        br.close();

    }  // end main
}  // end class

/*
 * 오늘 하루동안 팔린 책의 수 N을 입력받고
 * 가장 많이 팔린 책 제목을 출력
 * 가장 많이 팔린 책이 여러 개라면 사전 순 정렬했을 때 1번인 제목 출력
 *
 * 1 <= N <= 1,000
 * 책 제목은 50자 이하의 문자열 (알파벳 소문자)
 */