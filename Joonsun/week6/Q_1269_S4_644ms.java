package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Q_1269_S4_644ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        // 입력
        st = new StringTokenizer(br.readLine(), " ");
        int cntA = Integer.parseInt(st.nextToken());
        int cntB = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < cntA; i++) {
            int n = Integer.parseInt(st.nextToken());
            setA.add(n);
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < cntB; i++) {
            int n = Integer.parseInt(st.nextToken());
            setB.add(n);
        }

        int ans = 0;  // 정답 출력할 변수

        // A - B
        for (int i : setA) {
            if (!setB.contains(i)) {
                ans++;
            }
        }

        // B - A
        for (int i : setB) {
            if (!setA.contains(i)) {
                ans++;
            }
        }

        // 출력
        System.out.println(ans);
        br.close();

    }  // end main
}  //  end class

/*
 * 두 집합 A, B에 대하여
 * 대칭 차집합 원소 개수 구하기
 *
 * 각 집합의 원소 개수는 20만 이하
 * 모든 원소의 합은 1억 이하
 */