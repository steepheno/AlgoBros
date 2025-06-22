package 몸풀기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_1152_B2_236ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        System.out.println(st.countTokens());

        br.close();

    }  // end main
}  // end class

/*
<시행착오>
.trim() 처리를 하면 " "는 예외처리 하지만,
빈 문자열 ""은 처리하지 못하여 1을 셈
따라서 단어의 개수가 무조건 공백보다 1개 많지 않음

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine().trim();
    System.out.println(str.length());

    int blank = 0;

    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == ' ') {
            blank++;
        }
    }
    System.out.println(blank + 1);
 */