package class2;

import java.io.*;

public class Q_1259_B1_96ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String N = br.readLine();  // 숫자 입력

            // 탈출 조건
            if (N.equals("0")) break;

            // 출력
            StringBuilder sb = new StringBuilder(N);
            String reverse = sb.reverse().toString();

            if (N.equals(reverse)) {
                bw.write("yes\n");
            }
            else {
                bw.write("no\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();


    }  // end main
}  // end class

/*
 * 대칭이 되는 숫자는 팰린드롬 수
 * 무의미한 0은 올 수 없음
 * 입력받는 수 N이라 하면, 1 <= N <= 99999
 * 입력에 0이 들어오면 반복문 종료
 */
