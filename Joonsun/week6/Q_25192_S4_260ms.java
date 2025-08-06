package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Q_25192_S4_260ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<String> set = new HashSet<>();

        // 입력
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;  // 곰곰티콘 사용 횟수

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if (str.equals("ENTER")) {
                set.clear();  // 새로운 사람 들어옴 -> 기존에 인사한 사람들 목록 초기화
            }
            else {
                if (set.contains(str)) {  // 이미 인사한 사람의 채팅이면
                    continue;  // 곰곰티콘 사용한 것이 아니므로 건너뜀
                }
                set.add(str);  // 곰곰티콘으로 인사한 사람들 아이디 추가
                cnt++;
            }
        }

        System.out.println(cnt);
        br.close();

    }  // end main
}  // end class

/*
 * ENTER가 입력되면 새로운 사람이 들어옴
 * 그럼 1번씩 곰곰이로 인사하는 채팅을 침
 * 다음 ENTER가 나오기 전까지 똑같은 사람이 친 채팅은 인사하는 채팅이 아닌 일반 채팅
 *
 * 첫 번째 주어지는 입력은 무조건 ENTER
 * 채팅방의 기록 수 : 1 <= N <= 100,000
 * 유저 닉네임 길이 : 1 ~ 20
 */