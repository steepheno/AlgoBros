package 몸풀기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_1008_B5_104ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), " ");

        double A = Integer.parseInt(st.nextToken());
        double B = Integer.parseInt(st.nextToken());

        System.out.println(A / B);

        br.close();

    }  // end main
}  // end class

/*
* 0 < A, B < 10
* Java의 double형 타입 복습하기
*/