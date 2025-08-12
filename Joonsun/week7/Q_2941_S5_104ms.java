package 구현;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2941_S5_104ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력
        String str = br.readLine();
        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            // dz= 처리
            if (i + 2 < str.length() && str.charAt(i) == 'd' && str.charAt(i + 1) == 'z' && str.charAt(i + 2) == '=') {
                cnt++;
                i += 2;
                continue;
            }

            // c- 처리
            if (i + 1 < str.length() && str.charAt(i) == 'c' && str.charAt(i + 1) == '-') {
                cnt++;
                i++;
                continue;
            }

            // c= 처리
            if (i + 1 < str.length() && str.charAt(i) == 'c' && str.charAt(i + 1) == '=') {
                cnt++;
                i++;
                continue;
            }

            // d- 처리
            if (i + 1 < str.length() && str.charAt(i) == 'd' && str.charAt(i + 1) == '-') {
                cnt++;
                i++;
                continue;
            }

            // lj 처리
            if (i + 1 < str.length() && str.charAt(i) == 'l' && str.charAt(i + 1) == 'j') {
                cnt++;
                i++;
                continue;
            }

            // nj 처리
            if (i + 1 < str.length() && str.charAt(i) == 'n' && str.charAt(i + 1) == 'j') {
                cnt++;
                i++;
                continue;
            }

            // s= 처리
            if (i + 1 < str.length() && str.charAt(i) == 's' && str.charAt(i + 1) == '=') {
                cnt++;
                i++;
                continue;
            }

            // z= 처리
            if (i + 1 < str.length() && str.charAt(i) == 'z' && str.charAt(i + 1) == '=') {
                cnt++;
                i++;
                continue;
            }

            cnt++;
        }

        System.out.println(cnt);
        br.close();

    }  // end main
}  // end class

/*
 * 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 개수 세기
 * 주어진 단어는 최대 100글자
 * 다음 알파벳들은 1개로 세야 함
 * c=
 * c-
 * dz=
 * d-
 * lj
 * nj
 * s=
 * z=
 */